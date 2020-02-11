package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

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

import br.com.rsinet.Appium_Project.ScreenObject.CadastroScreen;
import br.com.rsinet.Appium_Project.ScreenObject.LogInScreen;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import br.com.rsinet.Appium_Project.utilitys.ExcelData;
import br.com.rsinet.Appium_Project.utilitys.ExcelUtils;
import br.com.rsinet.Appium_Project.utilitys.Report;
import io.appium.java_client.android.AndroidDriver;

public class CadastroTest {

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
		ExcelUtils.setExcelFile(Constantes.file, "Planilha1");
	}

	@AfterMethod
	public void fechaApp(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		DriverFactory.fechaDriver();
	}

	@Test
	public void CadastroSucesso() throws MalformedURLException, InterruptedException {
		logger = Report.criaRelatorio("CadastroSucesso");
		LogInScreen.clicaOpcoes(driver).click();
		LogInScreen.clicaLogIn(driver).click();
		CadastroScreen.clicaNovaConta(driver).click();

		CadastroScreen.nome(driver).click();
		CadastroScreen.nome(driver).sendKeys("QWERe4r3");//ExcelData.nome

		CadastroScreen.email(driver).click();
		CadastroScreen.email(driver).sendKeys(ExcelData.email);

		CadastroScreen.senha(driver).click();
		CadastroScreen.senha(driver).sendKeys(ExcelData.senha);

		CadastroScreen.confirmarSenha(driver).click();
		CadastroScreen.confirmarSenha(driver).sendKeys(ExcelData.senha);

		CadastroScreen.primeiroNome(driver).click();
		CadastroScreen.primeiroNome(driver).sendKeys("MArcos");

		CadastroScreen.ultimoNome(driver).click();
		CadastroScreen.ultimoNome(driver).sendKeys(ExcelData.ultimoNome);

		CadastroScreen.telefone(driver).click();
		CadastroScreen.telefone(driver).sendKeys(ExcelData.telefone);
		CadastroScreen.scroll(driver);

		CadastroScreen.pais(driver).click();
		LogInScreen.scrollAndClick(driver, "Brazil");

		CadastroScreen.estado(driver).click();
		CadastroScreen.estado(driver).sendKeys(ExcelData.estado);

		CadastroScreen.endereco(driver).click();
		CadastroScreen.endereco(driver).sendKeys(ExcelData.endereco);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroScreen.cidade(driver).click();
		CadastroScreen.cidade(driver).sendKeys(ExcelData.cidade);

		CadastroScreen.cep(driver).click();
		CadastroScreen.cep(driver).sendKeys(ExcelData.cep);

		CadastroScreen.registra(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LogInScreen.clicaOpcoes(driver).click();

		Assert.assertTrue(CadastroScreen.validaCadastro(driver).equals("QWERe4r3"));

	}
 
	@Test
	public void CadastroFalha() throws MalformedURLException {
		logger = Report.criaRelatorio("CadastroFalha");
		LogInScreen.clicaOpcoes(driver).click();
		LogInScreen.clicaLogIn(driver).click();
		CadastroScreen.clicaNovaConta(driver).click();

		CadastroScreen.nome(driver).click();
		CadastroScreen.nome(driver).sendKeys("Marcos");

		CadastroScreen.email(driver).sendKeys(ExcelData.email);

		CadastroScreen.senha(driver).sendKeys(ExcelData.senha);

		CadastroScreen.confirmarSenha(driver).sendKeys(ExcelData.senha);

		CadastroScreen.primeiroNome(driver).sendKeys("MArcos");

		CadastroScreen.ultimoNome(driver).click();
		CadastroScreen.ultimoNome(driver).sendKeys(ExcelData.ultimoNome);

		CadastroScreen.telefone(driver).sendKeys(ExcelData.telefone);
		CadastroScreen.scroll(driver);

		CadastroScreen.pais(driver).click();
		LogInScreen.scrollAndClick(driver, "Brazil");

		CadastroScreen.estado(driver).click();
		CadastroScreen.estado(driver).sendKeys(ExcelData.estado);

		CadastroScreen.endereco(driver).click();
		CadastroScreen.endereco(driver).sendKeys(ExcelData.endereco);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroScreen.cidade(driver).click();
		CadastroScreen.cidade(driver).sendKeys(ExcelData.cidade);

		CadastroScreen.cep(driver).click();
		CadastroScreen.cep(driver).sendKeys(ExcelData.cep);

		CadastroScreen.registra(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		LogInScreen.clicaOpcoes(driver).click();

		Assert.assertFalse(CadastroScreen.validaCadastro(driver).equals(ExcelData.nome));
		

	}

}
