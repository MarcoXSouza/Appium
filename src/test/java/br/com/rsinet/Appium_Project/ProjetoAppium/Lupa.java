package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.com.rsinet.Appium_Project.PageObject.LupaPage;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Lupa {
	private static AppiumDriver<?> driver;

	@BeforeClass
	public void beforeMethod() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}

	@AfterClass
	public void afterMethod() {
		DriverFactory.fechaDriver();
	}

	@SuppressWarnings("rawtypes")
	@Test (priority = 1)
	public void LupaSucesso() {
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		LupaPage.clicaLupa(driver).click();
		LupaPage.clicaLupa(driver).sendKeys("tablet");		
		actions.tap(PointOption.point(998, 1713)).perform();
		LupaPage.clicaItem(driver).click();
		driver.navigate().back();
		driver.navigate().back();
		
	}

	@SuppressWarnings("rawtypes")
	@Test (priority = 2)
	public void LupaFalha() {
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		LupaPage.clicaLupa(driver).click();
		LupaPage.clicaLupa(driver).sendKeys("Bola");		
		actions.tap(PointOption.point(998, 1713)).perform();

	}

}
