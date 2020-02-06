package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.Appium_Project.ScreenObject.LupaScreen;
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

	}

	@Test
	public void LupaSucesso() {
		LupaScreen.clicaLupa(driver).click();
		LupaScreen.clicaLupa(driver).sendKeys(Constantes.produto);
		Actions.enter(driver);
		LupaScreen.clicaItem(driver).click();
		Assert.assertTrue(LupaScreen.validaProduto(driver).equals(Constantes.produto));

	}

	@Test
	public void LupaFalha() {
		LupaScreen.clicaLupa(driver).click();
		LupaScreen.clicaLupa(driver).sendKeys("bicicleta");
		Actions.enter(driver);
		Assert.assertFalse(LupaScreen.produtoInexistente(driver).equals("bicicleta"));

	}

}
