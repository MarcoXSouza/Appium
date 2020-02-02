package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import br.com.rsinet.Appium_Project.PageObject.CadastroPage;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Cadastro {
	public static AppiumDriver
	<?> driver;
	@SuppressWarnings("rawtypes")


	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		driver = DriverFactory.iniciaDriver(driver);
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);

		CadastroPage.clicaOpcoes(driver).click();
		CadastroPage.clicaLogIn(driver).click();
		CadastroPage.clicaNovaConta(driver).click();
		CadastroPage.nome(driver).click();
		CadastroPage.nome(driver).sendKeys(Constantes.nome);
		actions.tap(PointOption.point(998, 1713)).perform();
		CadastroPage.email(driver).sendKeys(Constantes.email);
		actions.tap(PointOption.point(998, 1713)).perform();
		CadastroPage.senha(driver).sendKeys(Constantes.senha);
		actions.tap(PointOption.point(998, 1713)).perform();
		actions.tap(PointOption.point(998, 1713)).perform();
		CadastroPage.confirmarSenha(driver).click();
		CadastroPage.confirmarSenha(driver).sendKeys(Constantes.senha);
		
		CadastroPage.confirmarSenha(driver).clear();
		
		
		DriverFactory.fechaDriver();

	}

	
}
