package br.com.rsinet.Appium_Project.ProjetoAppium;

import java.net.MalformedURLException;

import br.com.rsinet.Appium_Project.utilitys.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class AdvantageShoppingApp {
	public static AndroidDriver<?> driver;

	public static void main(String[] args) throws MalformedURLException {

	driver = DriverFactory.iniciaDriver(driver);
	}
	
	
	
//	com.Advantage.aShopping.SplashActivity	com.amazon.mShop.storefront.StorefrontActivity
	
	

}
