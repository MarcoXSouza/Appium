package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.Appium_Project.ScreenObject.CadastroScreen;
import br.com.rsinet.Appium_Project.utilitys.Actions;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import br.com.rsinet.Appium_Project.utilitys.SnapShot;

public class CadastroTest {

	private static WebDriver driver;

	@Before
	public void iniciaApp() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}

	@After
	public void fechaApp() throws IOException, InterruptedException {
		SnapShot.takeSnapShot("Cadastro", driver);
		DriverFactory.fechaDriver();
	}

	@Test
	public void CadastroSucesso() throws MalformedURLException, InterruptedException {
		CadastroScreen.clicaOpcoes(driver).click();
		CadastroScreen.clicaLogIn(driver).click();
		CadastroScreen.clicaNovaConta(driver).click();

		CadastroScreen.nome(driver).click();
		CadastroScreen.nome(driver).sendKeys(Constantes.nome);
		Actions.enter(driver);

		CadastroScreen.email(driver).sendKeys(Constantes.email);
		Actions.enter(driver);

		CadastroScreen.senha(driver).sendKeys(Constantes.senha);
		Actions.enter(driver);

		CadastroScreen.confirmarSenha(driver).sendKeys(Constantes.senha);
		Actions.enter(driver);

		CadastroScreen.primeiroNome(driver).sendKeys("MArcos");
		Actions.enter(driver);

		CadastroScreen.ultimoNome(driver).click();
		CadastroScreen.ultimoNome(driver).sendKeys(Constantes.ultimoNome);
		Actions.enter(driver);

		CadastroScreen.telefone(driver).sendKeys(Constantes.telefone);
		Actions.enter(driver);

		CadastroScreen.pais(driver).click();
		CadastroScreen.selecionarPais(driver).click();

		CadastroScreen.estado(driver).click();
		CadastroScreen.estado(driver).sendKeys(Constantes.estado);
		Actions.enter(driver);

		CadastroScreen.endereco(driver).click();
		CadastroScreen.endereco(driver).sendKeys(Constantes.endereco);
		Actions.enter(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroScreen.cidade(driver).click();
		CadastroScreen.cidade(driver).sendKeys(Constantes.cidade);

		CadastroScreen.cep(driver).click();
		CadastroScreen.cep(driver).sendKeys(Constantes.cep);
		Actions.enter(driver);
		Actions.scroll(driver);

		CadastroScreen.registra(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		CadastroScreen.clicaOpcoes(driver).click();

		Assert.assertTrue(CadastroScreen.validaCadastro(driver).equals(Constantes.nome));

	}

	@Test
	public void CadastroFalha() throws MalformedURLException {
		CadastroScreen.clicaOpcoes(driver).click();
		CadastroScreen.clicaLogIn(driver).click();
		CadastroScreen.clicaNovaConta(driver).click();

		CadastroScreen.nome(driver).click();
		CadastroScreen.nome(driver).sendKeys("Marcos");
		Actions.enter(driver);

		CadastroScreen.email(driver).sendKeys(Constantes.email);
		Actions.enter(driver);

		CadastroScreen.senha(driver).sendKeys(Constantes.senha);
		Actions.enter(driver);

		CadastroScreen.confirmarSenha(driver).sendKeys(Constantes.senha);
		Actions.enter(driver);

		CadastroScreen.primeiroNome(driver).sendKeys("MArcos");
		Actions.enter(driver);

		CadastroScreen.ultimoNome(driver).click();
		CadastroScreen.ultimoNome(driver).sendKeys(Constantes.ultimoNome);
		Actions.enter(driver);

		CadastroScreen.telefone(driver).sendKeys(Constantes.telefone);
		Actions.enter(driver);

		CadastroScreen.pais(driver).click();
		CadastroScreen.selecionarPais(driver).click();

		CadastroScreen.estado(driver).click();
		CadastroScreen.estado(driver).sendKeys(Constantes.estado);
		Actions.enter(driver);

		CadastroScreen.endereco(driver).click();
		CadastroScreen.endereco(driver).sendKeys(Constantes.endereco);
		Actions.enter(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroScreen.cidade(driver).click();
		CadastroScreen.cidade(driver).sendKeys(Constantes.cidade);

		CadastroScreen.cep(driver).click();
		CadastroScreen.cep(driver).sendKeys(Constantes.cep);
		Actions.enter(driver);
		Actions.scroll(driver);
		

		CadastroScreen.registra(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroScreen.clicaOpcoes(driver).click();

		Assert.assertFalse(CadastroScreen.validaCadastro(driver).equals(Constantes.nome));

	}

}
