package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class novoprojeto {

	public static AndroidDriver<?> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = DriverFactory.iniciaDriver(driver);

//		CadastroPage.iniciaAplicativo.click();
//		CadastroPage.clicaOpcoes.click();
//		CadastroPage.clicaLogin.click();
//		CadastroPage.novaConta.click();
//		CadastroPage.
		
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewSingUpToday")).click();

		
	
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView\r\n")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView\r\n")).sendKeys("Marcos");
		//		Confirmar Senha
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView\r\n")).click();
//		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
//		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
//		WebElement element = driver.findElement(By.className("android.widget.EditText"));
//
//		element.sendKeys("moto g8" + Keys.ENTER);
//		driver.findElement(By.id("com.android.vending:id/suggest_text")).click();

	}

}
