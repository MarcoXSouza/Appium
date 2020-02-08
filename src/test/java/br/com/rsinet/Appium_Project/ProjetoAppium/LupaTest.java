package br.com.rsinet.Appium_Project.ProjetoAppium;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.Appium_Project.ScreenObject.LupaScreen;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import br.com.rsinet.Appium_Project.utilitys.Report;
import io.appium.java_client.android.AndroidDriver;

public class LupaTest {
	private static AndroidDriver<WebElement> driver;
	private static ExtentReports extent;
	private static ExtentTest logger;

	@BeforeTest
	public void IniciaReport() {
		extent = Report.setExtent("Advantage App", "testes");

	}

	@AfterTest
	public void finalizaReport() {
		Report.fechaRelatorio(extent);

	}

	@BeforeMethod
	public void iniciaApp() throws Exception {
		driver = DriverFactory.iniciaDriver();
	}

	@AfterMethod
	public void fechaApp(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		DriverFactory.fechaDriver();
	}


	@Test
	public void LupaSucesso() {
		logger = Report.criaRelatorio("LupaSucesso");
		LupaScreen.clicaLupa(driver).click();
		LupaScreen.clicaLupa(driver).sendKeys(Constantes.produto);
		LupaScreen.pesquisar(driver).click();
		LupaScreen.clicaItem(driver).click();
		Assert.assertTrue(LupaScreen.validaProduto(driver).equals(Constantes.produto));

	}

	@Test
	public void LupaFalha() {
		logger = Report.criaRelatorio("LupaFalha");

		LupaScreen.clicaLupa(driver).click();
		LupaScreen.clicaLupa(driver).sendKeys("bicicleta");
		LupaScreen.pesquisar(driver).click();
		Assert.assertFalse(LupaScreen.produtoInexistente(driver).equals("bicicleta"));

	}

}
