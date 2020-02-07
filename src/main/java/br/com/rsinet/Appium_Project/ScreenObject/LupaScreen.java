package br.com.rsinet.Appium_Project.ScreenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LupaScreen {
	public static WebElement element = null;

	public static WebElement clicaLupa(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement clicaItem(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
		return element;
	}
	
	public static String validaProduto(WebDriver driver) {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
		
	}
	public static String produtoInexistente(WebDriver driver) {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
		
	}

	public static WebElement pesquisar(WebDriver driver) {
element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		return element;
	}

}
