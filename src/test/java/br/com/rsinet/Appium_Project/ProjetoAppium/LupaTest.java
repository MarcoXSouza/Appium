package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.Appium_Project.PageObject.LupaPage;
import br.com.rsinet.Appium_Project.utilitys.Actions;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import br.com.rsinet.Appium_Project.utilitys.SnapShot;

public class LupaTest {
	private static WebDriver driver;

	@Before
	public void iniciaAplicativo() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}

	@After
	public void finalizaTeste() throws IOException, InterruptedException {
		SnapShot.takeSnapShot("LupaSucesso", driver);
		DriverFactory.fechaDriver();
//		driver.quit();

	}

	@Test
	public void LupaSucesso() throws IOException, InterruptedException {
		LupaPage.clicaLupa(driver).click();
		LupaPage.clicaLupa(driver).sendKeys(Constantes.produto);
		Actions.enter(driver);
		LupaPage.clicaItem(driver).click();
		Assert.assertTrue(LupaPage.validaProduto(driver).equals(Constantes.produto));

	}

	@Test
	public void LupaFalha() throws IOException, InterruptedException {
		LupaPage.clicaLupa(driver).click();
		LupaPage.clicaLupa(driver).sendKeys("bicicleta");
		Actions.enter(driver);
		String mensagem = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
		Assert.assertFalse(mensagem.equals("bicicleta"));

	}

}
