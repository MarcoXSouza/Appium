package br.com.rsinet.Appium_Project.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class LupaPage {
	public static WebElement element = null;

	public static WebElement clicaLupa(AppiumDriver<?> driver) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement clicaItem(AppiumDriver<?> driver) {
		element = driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
		return element;
	}

}
