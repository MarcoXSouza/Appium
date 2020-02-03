package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.openqa.selenium.interactions.Keyboard;

import br.com.rsinet.Appium_Project.PageObject.CadastroPage;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Cadastro {
	public static AndroidDriver<?> driver;

	@SuppressWarnings("rawtypes")

	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		driver = DriverFactory.iniciaDriver(driver);
		TouchAction actions = new TouchAction((PerformsTouchActions) DriverFactory.iniciaDriver(driver));
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
		
		CadastroPage.confirmarSenha(driver).sendKeys(Constantes.senha);
		actions.tap(PointOption.point(998, 1713)).perform();
		
		CadastroPage.primeiroNome(driver).sendKeys(Constantes.nome);
		actions.tap(PointOption.point(998, 1713)).perform();
		
		CadastroPage.ultimoNome(driver).click();
		CadastroPage.ultimoNome(driver).sendKeys(Constantes.ultimoNome);
		actions.tap(PointOption.point(998, 1713)).perform();
		
		CadastroPage.telefone(driver).sendKeys(Constantes.telefone);
		actions.tap(PointOption.point(998, 1713)).perform();
		
		CadastroPage.pais(driver).click();
		CadastroPage.selecionarPais(driver).click();

		CadastroPage.estado(driver).click();
		CadastroPage.estado(driver).sendKeys(Constantes.estado);
		actions.tap(PointOption.point(998, 1713)).perform();
		
		CadastroPage.endereco(driver).sendKeys(Constantes.endereco);
		actions.tap(PointOption.point(998, 1713)).perform();

		CadastroPage.cidade(driver).sendKeys(Constantes.cidade);
		actions.tap(PointOption.point(998, 1713)).perform();
		
		CadastroPage.cep(driver).sendKeys(Constantes.cep);
//		driver.navigate().back();
		

		
		
//		DriverFactory.fechaDriver();

	}

}



