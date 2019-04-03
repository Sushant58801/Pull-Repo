package WebBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

//test for good

public class Controller {
	
	AppiumDriver<MobileElement>  driver;
	
	public void setup() throws MalformedURLException{
		
		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 5 Pro");
		des.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		des.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8");
		des.setCapability(MobileCapabilityType.APP,System.setProperty("User.dir", "//app//shaadi.apk"));
		
		driver = new AndroidDriver<MobileElement>(new URL("https://127.0.0.1:4027/wd/hub"),des);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	public void LandscapeTOPortrate(){
		ScreenOrientation currentorientation =  driver.getOrientation();
		System.out.println(currentorientation);
		driver.rotate(ScreenOrientation.PORTRAIT);
	}
	
	public void PotrateTOLandscape(){
		ScreenOrientation currentorentation = driver.getOrientation();
		System.out.println(currentorentation);
		driver.rotate(ScreenOrientation.LANDSCAPE);
	}
	
	
	public void switchContext(String Context){
		String currentcontext = driver.getContext();
		Set<String> con = driver.getContextHandles();
		for(String contextname : con){
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
