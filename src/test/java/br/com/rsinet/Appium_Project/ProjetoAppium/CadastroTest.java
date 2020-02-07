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
import br.com.rsinet.Appium_Project.ScreenObject.LogInScreen;
import br.com.rsinet.Appium_Project.utilitys.Actions;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;

public class CadastroTest {

	private static WebDriver driver;

	@Before
	public void iniciaApp() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver();
	}

	@After
	public void fechaApp() throws IOException, InterruptedException {
		DriverFactory.fechaDriver();
	}

	@Test
	public void CadastroSucesso() throws MalformedURLException, InterruptedException {
		LogInScreen.clicaOpcoes(driver).click();
		LogInScreen.clicaLogIn(driver).click();
		CadastroScreen.clicaNovaConta(driver).click();

		CadastroScreen.nome(driver).click();
		CadastroScreen.nome(driver).sendKeys(Constantes.nome);

		CadastroScreen.email(driver).click();
		CadastroScreen.email(driver).sendKeys(Constantes.email);

		CadastroScreen.senha(driver).click();
		CadastroScreen.senha(driver).sendKeys(Constantes.senha);

		CadastroScreen.confirmarSenha(driver).click();
		CadastroScreen.confirmarSenha(driver).sendKeys(Constantes.senha);

		CadastroScreen.primeiroNome(driver).click();
		CadastroScreen.primeiroNome(driver).sendKeys("MArcos");

		CadastroScreen.ultimoNome(driver).click();
		CadastroScreen.ultimoNome(driver).sendKeys(Constantes.ultimoNome);

		CadastroScreen.telefone(driver).click();
		CadastroScreen.telefone(driver).sendKeys(Constantes.telefone);
		Actions.scroll(driver);

		CadastroScreen.pais(driver).click();
		CadastroScreen.selecionarPais(driver).click();

		CadastroScreen.estado(driver).click();
		CadastroScreen.estado(driver).sendKeys(Constantes.estado);

		CadastroScreen.endereco(driver).click();
		CadastroScreen.endereco(driver).sendKeys(Constantes.endereco);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroScreen.cidade(driver).click();
		CadastroScreen.cidade(driver).sendKeys(Constantes.cidade);

		CadastroScreen.cep(driver).click();
		CadastroScreen.cep(driver).sendKeys(Constantes.cep);

		CadastroScreen.registra(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LogInScreen.clicaOpcoes(driver).click();

		Assert.assertTrue(CadastroScreen.validaCadastro(driver).equals(Constantes.nome));

	}

	@Test
	public void CadastroFalha() throws MalformedURLException {
		LogInScreen.clicaOpcoes(driver).click();
		LogInScreen.clicaLogIn(driver).click();
		CadastroScreen.clicaNovaConta(driver).click();

		CadastroScreen.nome(driver).click();
		CadastroScreen.nome(driver).sendKeys("Marcos");

		CadastroScreen.email(driver).sendKeys(Constantes.email);

		CadastroScreen.senha(driver).sendKeys(Constantes.senha);

		CadastroScreen.confirmarSenha(driver).sendKeys(Constantes.senha);

		CadastroScreen.primeiroNome(driver).sendKeys("MArcos");

		CadastroScreen.ultimoNome(driver).click();
		CadastroScreen.ultimoNome(driver).sendKeys(Constantes.ultimoNome);

		CadastroScreen.telefone(driver).sendKeys(Constantes.telefone);
		Actions.scroll(driver);

		CadastroScreen.pais(driver).click();
		CadastroScreen.selecionarPais(driver).click();

		CadastroScreen.estado(driver).click();
		CadastroScreen.estado(driver).sendKeys(Constantes.estado);

		CadastroScreen.endereco(driver).click();
		CadastroScreen.endereco(driver).sendKeys(Constantes.endereco);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroScreen.cidade(driver).click();
		CadastroScreen.cidade(driver).sendKeys(Constantes.cidade);

		CadastroScreen.cep(driver).click();
		CadastroScreen.cep(driver).sendKeys(Constantes.cep);
		

		CadastroScreen.registra(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		LogInScreen.clicaOpcoes(driver).click();

		Assert.assertFalse(CadastroScreen.validaCadastro(driver).equals(Constantes.nome));

	}

}
