package br.com.rsinet.Appium_Project.ScreenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaScreen {

	public static WebElement element = null;

	public static WebElement escolheCategoria(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView"));
		return element;
	}

	public static WebElement escolheItem(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Tablets\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
		return element;
	}

	public static WebElement quantidade(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutProductQuantity"));
		return element;
	}

	public static WebElement adcQuantidade(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity"));
		return element;
	}

	public static WebElement aplicar(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply"));
		return element;
	}

	public static WebElement adicionarAoCarrinho(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
		return element;
	}

	public static String confereCarrinho(WebDriver driver) {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartLength")).getText();

	}

}
