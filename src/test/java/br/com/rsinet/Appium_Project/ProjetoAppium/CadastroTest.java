package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.com.rsinet.Appium_Project.PageObject.CadastroPage;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class CadastroTest {

	private static AndroidDriver<?> driver;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}

	@AfterClass
	public void afterClass() {
		DriverFactory.fechaDriver();
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void CadastroSucesso() throws MalformedURLException {
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

		CadastroPage.endereco(driver).click();
		CadastroPage.endereco(driver).sendKeys(Constantes.endereco);
		actions.tap(PointOption.point(998, 1713)).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroPage.cidade(driver).click();
		CadastroPage.cidade(driver).sendKeys(Constantes.cidade);

		CadastroPage.cep(driver).click();
		CadastroPage.cep(driver).sendKeys(Constantes.cep);
		actions.tap(PointOption.point(998, 1713)).perform();
		actions.press(PointOption.point(1031, 1717)).moveTo(PointOption.point(1016, 604)).release().perform();


		CadastroPage.registra(driver).click();
	}

}
