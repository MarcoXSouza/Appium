package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.Appium_Project.ScreenObject.BuscaScreen;
import br.com.rsinet.Appium_Project.ScreenObject.LogInScreen;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;

public class BuscaTest {

	private static WebDriver driver;

	
	@Before
	public void beforeMethod() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver();
	}

	@After
	public void afterMethod() {
		DriverFactory.fechaDriver();
	}

	@Test
	public void BuscaSucesso() {
		BuscaScreen.escolheCategoria(driver).click();
		BuscaScreen.escolheItem(driver).click();
	}

	@Test
	public void BuscaFalha() {
		LogInScreen.clicaOpcoes(driver).click();
		LogInScreen.clicaLogIn(driver).click();
		LogInScreen.username(driver).sendKeys("martos");
		LogInScreen.password(driver).sendKeys("aBc123");
		LogInScreen.fazLogin(driver).click();
		BuscaScreen.escolheCategoria(driver).click();
		BuscaScreen.escolheItem(driver).click();
		
		BuscaScreen.quantidade(driver).click();
		BuscaScreen.adcQuantidade(driver).sendKeys("20");
		BuscaScreen.aplicar(driver).click();
		BuscaScreen.adicionarAoCarrinho(driver).click();
		Assert.assertFalse(BuscaScreen.confereCarrinho(driver).equals("120"));
		
	}

}
