package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import br.com.rsinet.Appium_Project.PageObject.BuscaPage;
import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.AppiumDriver;

public class Busca {
    @SuppressWarnings("rawtypes")
	private static AppiumDriver driver;

	public static void main( String[] args ) throws MalformedURLException, InterruptedException
    {
    	driver = DriverFactory.iniciaDriver(driver);
    	BuscaPage.escolheCategoria(driver).click();
    	BuscaPage.escolheItem(driver).click();
    	
    	
//    	driver.quit();
    
    }
}
