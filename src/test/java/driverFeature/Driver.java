package driverFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 */
public class Driver {

    public static WebDriver driver;

    public static void initialiseDriver(String Browser) {

        String s = Browser.toUpperCase();
        if (s.equals("FIREFOX")) {
            driver = new FirefoxDriver();

        } 
  
        }


        }

    


