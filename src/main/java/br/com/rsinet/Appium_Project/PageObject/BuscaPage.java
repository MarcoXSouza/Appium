package br.com.rsinet.Appium_Project.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class BuscaPage {

	public static WebElement element;

	@SuppressWarnings("rawtypes")
	public static WebElement escolheCategoria(AppiumDriver driver) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView"));
		return element;
	}
	
	@SuppressWarnings("rawtypes")
	public static WebElement escolheItem(AppiumDriver driver) {
		element = driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Tablets\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
		return element;
	}

}
