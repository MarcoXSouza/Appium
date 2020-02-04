package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.com.rsinet.Appium_Project.PageObject.LupaPage;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class LupaTest {
	private static AndroidDriver<?> driver;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}

	@AfterClass
	public void afterClass() {
		DriverFactory.fechaDriver();
	}

	@SuppressWarnings("rawtypes")
	@Test 
	public void LupaSucesso() {
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		LupaPage.clicaLupa(driver).click();
		LupaPage.clicaLupa(driver).sendKeys(Constantes.produto);		
		actions.tap(PointOption.point(998, 1713)).perform();
		LupaPage.clicaItem(driver).click();
		System.out.println(LupaPage.validaProduto(driver));
		Assert.assertTrue(LupaPage.validaProduto(driver).equals(Constantes.produto));
		driver.navigate().back();
		driver.navigate().back();
		
	}

	@SuppressWarnings("rawtypes")
	@Test 
	public void LupaFalha() {
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		LupaPage.clicaLupa(driver).click();
		LupaPage.clicaLupa(driver).sendKeys("bicicleta");		
		actions.tap(PointOption.point(998, 1713)).perform();
		String mensagem = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
		Assert.assertFalse(mensagem.equals("bicicleta"));
	}

}
