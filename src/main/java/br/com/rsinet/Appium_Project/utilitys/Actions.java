package br.com.rsinet.Appium_Project.utilitys;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Actions {


	@SuppressWarnings("rawtypes")
	public static void enter(WebDriver driver) {
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		actions.tap(PointOption.point(998, 1713)).perform();

	}
	
	@SuppressWarnings("rawtypes")
	public static void scroll(WebDriver driver) {
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		actions.press(PointOption.point(1031, 1717)).moveTo(PointOption.point(1016, 604)).release().perform();
		
	}
}
