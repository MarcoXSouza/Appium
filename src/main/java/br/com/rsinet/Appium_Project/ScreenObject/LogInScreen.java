package br.com.rsinet.Appium_Project.ScreenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class LogInScreen {

	public static WebElement element = null;

	public static WebElement clicaOpcoes(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		return element;
	}

	public static WebElement clicaLogIn(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin"));
		return element;
	}

	public static WebElement userName(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"));
		return element;
	}

	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"));
		return element;
	}

	public static WebElement fazLogin(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin"));
		return element;
	}

	public static void scrollAndClick(AndroidDriver driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
	}
}
