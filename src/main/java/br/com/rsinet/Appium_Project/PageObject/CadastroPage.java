package br.com.rsinet.Appium_Project.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CadastroPage {
	public static WebElement element = null;

	public static WebElement clicaOpcoes(AndroidDriver<?> driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		return element;
	}

	public static WebElement clicaLogIn(AndroidDriver<?> driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin"));
		return element;
	}

	public static WebElement clicaNovaConta(AndroidDriver<?> driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewSingUpToday"));
		return element;
	}

	public static WebElement nome(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement email(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(
				"android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement senha(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement confirmarSenha(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement primeiroNome(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(""));
//				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement ultimoNome(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(""));
//				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement telefone(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(""));
//				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement pais(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(""));
//				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement estado(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(""));
//				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement endereco(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(""));
//				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement cidade(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(""));
//				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

	public static WebElement cep(AndroidDriver<?> driver) {
		element = driver.findElement(By.xpath(""));
//				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return element;
	}

}
