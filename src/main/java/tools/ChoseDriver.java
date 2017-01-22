package tools;

import org.openqa.selenium.WebDriver;

import drive.ForChrome;
import drive.ForFirefox;

public class ChoseDriver {
	
	public WebDriver runDriver(String s){
		if (s=="Chrome"){
			ForChrome fh = new ForChrome();
			WebDriver driver = fh.startChromeDriver();
			return driver;
		}
		if (s=="FireFox"){
			ForFirefox ff = new ForFirefox();
			WebDriver driver = ff.startMozilaDriver();
			return driver;
		}
		return null;
		
	}

}
