package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD_OLD {

    public static WebDriver driver;


    public static WebDriver getDriver(){


        Locale.setDefault(new Locale("EN")); // extend report türkçe bilgisayarların çalışmaması sebebiyle kondu
        System.setProperty("user.language", "EN"); // extend report türkçe bilgisayarların çalışmaması sebebiyle kondu

        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (driver==null) { // 1 kere çalışsın diye if yazıldı
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            //  driver.manage().deleteAllCookies();
        }
        return driver;
    }

    public static void quitDiver(){

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }

        if (driver!=null) { // dolu ise, boş değilse
            driver.quit();
            driver = null;
        }
}

}
