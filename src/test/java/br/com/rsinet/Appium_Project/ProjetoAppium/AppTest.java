package br.com.rsinet.Appium_Project.ProjetoAppium;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void t() {
	
	}
	
	@BeforeMethod
	public void beforeMethod() {
//	File classPathRoot = new File(System.getProperty("User.dir"));
//	File appDir = new File(classPathRoot, "/Apps/Amazon/");
//	File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(CapabilityType.BROWSER_NAME, "");
	cap.setCapability("deviceName", "AOSP on IA Emulator");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("udid", "emulator-5554");
	cap.setCapability("platformName", "Android");
	cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
	cap.setCapability("appActivity", "com.amazon.mShop.storefront.StorefrontActivity");
	
	}
	
	@BeforeMethod
	public void afterMethod() {
	
	}
}
