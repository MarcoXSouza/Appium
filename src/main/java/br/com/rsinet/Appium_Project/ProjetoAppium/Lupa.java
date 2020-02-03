package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import br.com.rsinet.Appium_Project.PageObject.LupaPage;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Lupa {
	public static AndroidDriver<?> driver;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);

		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		LupaPage.clicaLupa(driver).click();
		LupaPage.clicaLupa(driver).sendKeys("tablet");
		actions.tap(PointOption.point(998, 1713)).perform();
		LupaPage.clicaItem(driver).click();
		driver.navigate().back();
		driver.navigate().back();

	}

}
