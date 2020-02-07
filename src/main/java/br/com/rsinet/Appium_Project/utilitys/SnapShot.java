package br.com.rsinet.Appium_Project.utilitys;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SnapShot {
	public static String takeSnapShot(WebDriver driver, String snapshotName) throws IOException, InterruptedException {

	
	String data = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	String destino = System.getProperty("user.dir") + "./Snapshot/" + snapshotName + data + ".png";
	File destinoFinal = new File(destino);
	FileUtils.copyFile(source, destinoFinal);
	return destino;
			}

}
