package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import br.com.rsinet.Appium_Project.PageObject.CadastroPage;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class novoprojeto {

	public static AndroidDriver<?> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = DriverFactory.iniciaDriver(driver);

		CadastroPage.clicaOpcoes(driver).click();
		CadastroPage.clicaLogIn(driver).click();
		CadastroPage.clicaNovaConta(driver).click();
		CadastroPage.nome(driver).click();
		CadastroPage.nome(driver).sendKeys("Marcos");

		CadastroPage.email(driver).sendKeys("Marcos@email.com");

		DriverFactory.fechaDriver();

	}

	
}

//		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
//		actions.tap(PointOption.point(998, 1713)).perform();
//		KeyEvent event = new KeyEvent();
//		event.withKey(AndroidKey.ENTER);
//		CadastroPage.email(driver).click();