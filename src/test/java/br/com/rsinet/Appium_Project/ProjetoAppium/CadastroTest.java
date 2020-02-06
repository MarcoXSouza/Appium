package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.Appium_Project.PageObject.CadastroPage;
import br.com.rsinet.Appium_Project.utilitys.Actions;
import br.com.rsinet.Appium_Project.utilitys.Constantes;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import br.com.rsinet.Appium_Project.utilitys.SnapShot;

public class CadastroTest {

	private static WebDriver driver;

	@Before
	public void beforeClass() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}

	@After
	public void afterClass() throws IOException, InterruptedException {
		SnapShot.takeSnapShot("Cadastro", driver);
		DriverFactory.fechaDriver();
	}

	@Test
	public void CadastroSucesso() throws MalformedURLException, InterruptedException {
		CadastroPage.clicaOpcoes(driver).click();
		CadastroPage.clicaLogIn(driver).click();
		CadastroPage.clicaNovaConta(driver).click();

		CadastroPage.nome(driver).click();
		CadastroPage.nome(driver).sendKeys(Constantes.nome);
		Actions.enter(driver);

		CadastroPage.email(driver).sendKeys(Constantes.email);
		Actions.enter(driver);

		CadastroPage.senha(driver).sendKeys(Constantes.senha);
		Actions.enter(driver);

		CadastroPage.confirmarSenha(driver).sendKeys(Constantes.senha);
		Actions.enter(driver);

		CadastroPage.primeiroNome(driver).sendKeys("MArcos");
		Actions.enter(driver);

		CadastroPage.ultimoNome(driver).click();
		CadastroPage.ultimoNome(driver).sendKeys(Constantes.ultimoNome);
		Actions.enter(driver);

		CadastroPage.telefone(driver).sendKeys(Constantes.telefone);
		Actions.enter(driver);

		CadastroPage.pais(driver).click();
		CadastroPage.selecionarPais(driver).click();

		CadastroPage.estado(driver).click();
		CadastroPage.estado(driver).sendKeys(Constantes.estado);
		Actions.enter(driver);

		CadastroPage.endereco(driver).click();
		CadastroPage.endereco(driver).sendKeys(Constantes.endereco);
		Actions.enter(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroPage.cidade(driver).click();
		CadastroPage.cidade(driver).sendKeys(Constantes.cidade);

		CadastroPage.cep(driver).click();
		CadastroPage.cep(driver).sendKeys(Constantes.cep);
		Actions.enter(driver);
		Actions.scroll(driver);

		CadastroPage.registra(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		CadastroPage.clicaOpcoes(driver).click();

		Assert.assertTrue(CadastroPage.validaCadastro(driver).equals(Constantes.nome));

	}

	@Test
	public void CadastroFalha() throws MalformedURLException {
		CadastroPage.clicaOpcoes(driver).click();
		CadastroPage.clicaLogIn(driver).click();
		CadastroPage.clicaNovaConta(driver).click();

		CadastroPage.nome(driver).click();
		CadastroPage.nome(driver).sendKeys("Marcos");
		Actions.enter(driver);

		CadastroPage.email(driver).sendKeys(Constantes.email);
		Actions.enter(driver);

		CadastroPage.senha(driver).sendKeys(Constantes.senha);
		Actions.enter(driver);

		CadastroPage.confirmarSenha(driver).sendKeys(Constantes.senha);
		Actions.enter(driver);

		CadastroPage.primeiroNome(driver).sendKeys("MArcos");
		Actions.enter(driver);

		CadastroPage.ultimoNome(driver).click();
		CadastroPage.ultimoNome(driver).sendKeys(Constantes.ultimoNome);
		Actions.enter(driver);

		CadastroPage.telefone(driver).sendKeys(Constantes.telefone);
		Actions.enter(driver);

		CadastroPage.pais(driver).click();
		CadastroPage.selecionarPais(driver).click();

		CadastroPage.estado(driver).click();
		CadastroPage.estado(driver).sendKeys(Constantes.estado);
		Actions.enter(driver);

		CadastroPage.endereco(driver).click();
		CadastroPage.endereco(driver).sendKeys(Constantes.endereco);
		Actions.enter(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroPage.cidade(driver).click();
		CadastroPage.cidade(driver).sendKeys(Constantes.cidade);

		CadastroPage.cep(driver).click();
		CadastroPage.cep(driver).sendKeys(Constantes.cep);
		Actions.enter(driver);
		Actions.scroll(driver);
		

		CadastroPage.registra(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CadastroPage.clicaOpcoes(driver).click();

		Assert.assertFalse(CadastroPage.validaCadastro(driver).equals(Constantes.nome));

	}

}
