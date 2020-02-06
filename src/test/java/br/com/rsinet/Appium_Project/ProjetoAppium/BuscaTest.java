package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.Appium_Project.PageObject.BuscaPage;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;

public class BuscaTest {

	private static WebDriver driver;

	@Before
	public void beforeMethod() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}

	@After
	public void afterMethod() {
//		DriverFactory.fechaDriver();
	}

	@Test
	public void BuscaSucesso() {
		BuscaPage.escolheCategoria(driver).click();
		BuscaPage.escolheItem(driver).click();
//		driver.navigate().back();
//		driver.navigate().back();

	}

}
