package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.Appium_Project.ScreenObject.LupaScreen;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;

public class LupaTest {
	private static WebDriver driver;

	@Before
	public void iniciaAplicativo() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver();
	}

	@After
	public void finalizaTeste() throws IOException, InterruptedException {
		DriverFactory.fechaDriver();

	}

	@Test
	public void LupaSucesso() {
		LupaScreen.clicaLupa(driver).click();
		LupaScreen.clicaLupa(driver).sendKeys(Constantes.produto);
		LupaScreen.pesquisar(driver).click();
		LupaScreen.clicaItem(driver).click();
		Assert.assertTrue(LupaScreen.validaProduto(driver).equals(Constantes.produto));

	}

	@Test
	public void LupaFalha() {
		LupaScreen.clicaLupa(driver).click();
		LupaScreen.clicaLupa(driver).sendKeys("bicicleta");
		LupaScreen.pesquisar(driver).click();
		Assert.assertFalse(LupaScreen.produtoInexistente(driver).equals("bicicleta"));

	}

}
