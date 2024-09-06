package AS_01_UI_TestingForMobile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UI_TestingOnChrome {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String[] urls = {
            "https://www.getcalley.com/",
            "https://www.getcalley.com/calley-lifetime-offer/",
            "https://www.getcalley.com/see-a-demo/",
            "https://www.getcalley.com/calley-teams-features/",
            "https://www.getcalley.com/calley-pro-features/"
        };
        String[] fileNames = {
            "FirstURLLink.png",
            "SecondURLLink.png",
            "ThirdURLLink.png",
            "FourthURLLink.png",
            "FifthURLLink.png"
        };
        for (int i = 0; i < urls.length; i++) {
            driver.get("https://www.getcalley.com/page-sitemap.xml");
            driver.findElement(By.linkText(urls[i])).click();
            Dimension resolution360x640 = new Dimension(360,640);
            driver.manage().window().setSize(resolution360x640);
          
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./Mobile/360x640/Screenshot/05-09-2024/" + fileNames[i]);
            FileHandler.copy(srcFile, destFile);

            Thread.sleep(2000);
            driver.navigate().back();
        }
        
        for (int i = 0; i < urls.length; i++) {
            driver.get("https://www.getcalley.com/page-sitemap.xml");
            driver.findElement(By.linkText(urls[i])).click();
            Dimension resolution375x667 = new Dimension(375,667);
            driver.manage().window().setSize(resolution375x667);
           
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./Mobile/375x667/Screenshot/05-09-2024/" + fileNames[i]);
            FileHandler.copy(srcFile, destFile);

            Thread.sleep(2000);
            driver.navigate().back();
        }
        
        for (int i = 0; i < urls.length; i++) {
            driver.get("https://www.getcalley.com/page-sitemap.xml");
            driver.findElement(By.linkText(urls[i])).click();
            Dimension resolution414x896 = new Dimension(414,896);
            driver.manage().window().setSize(resolution414x896);
             
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./Mobile/414x896/Screenshot/05-09-2024/" + fileNames[i]);
            FileHandler.copy(srcFile, destFile);

            Thread.sleep(2000);
            driver.navigate().back();
        }
        
        driver.quit();
	}
}
