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

import br.com.rsinet.Appium_Project.ScreenObject.BuscaScreen;
import br.com.rsinet.Appium_Project.ScreenObject.LogInScreen;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import br.com.rsinet.Appium_Project.utilitys.Report;
import io.appium.java_client.android.AndroidDriver;

public class BuscaTest {

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
	public void BuscaSucesso() {
		logger = Report.criaRelatorio("BuscaSucesso");
		LogInScreen.scrollAndClick(driver, "LAPTOPS");
		LogInScreen.scrollAndClick(driver, "HP CHROMEBOOK 14 G1(ENERGY STAR)");
		Assert.assertTrue(BuscaScreen.verificaItem(driver).equals("HP CHROMEBOOK 14 G1(ENERGY STAR)"));
	}

	@Test
	public void BuscaFalha() {
		logger = Report.criaRelatorio("BuscaFalha");
		
		LogInScreen.clicaOpcoes(driver).click();
		LogInScreen.clicaLogIn(driver).click();
		LogInScreen.userName(driver).sendKeys("martos");
		LogInScreen.password(driver).sendKeys("aBc123");
		LogInScreen.fazLogin(driver).click();
		LogInScreen.scrollAndClick(driver, "LAPTOPS");
		LogInScreen.scrollAndClick(driver, "HP CHROMEBOOK 14 G1(ENERGY STAR)");
		BuscaScreen.quantidade(driver).click();
		BuscaScreen.adcQuantidade(driver).click();
		BuscaScreen.adcQuantidade(driver).sendKeys("20");
		BuscaScreen.aplicar(driver).click();
		BuscaScreen.adicionarAoCarrinho(driver).click();
		Assert.assertFalse(BuscaScreen.confereCarrinho(driver).equals("120"));

	}

}
