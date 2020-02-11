package br.com.rsinet.Appium_Project.ScreenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaScreen {

	public static WebElement element = null;

	public static WebElement quantidade(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity"));
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

	public static String verificaItem(WebDriver driver) {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
	}

}
