package AS_01_UI_TestingForDesktop;

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
	            Dimension resolution1920x1080 = new Dimension(1920,1080);
	            driver.manage().window().setSize(resolution1920x1080);
	             
	            TakesScreenshot screenshot = (TakesScreenshot) driver;
	            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	            File destFile = new File("./DeskTop/1920x1080/Screenshot/06-09-2024;10-00 pm/" + fileNames[i]);
	            FileHandler.copy(srcFile, destFile);

	            Thread.sleep(2000);
	            driver.navigate().back();
	        }
	        
	        for (int i = 0; i < urls.length; i++) {
	            driver.get("https://www.getcalley.com/page-sitemap.xml");
	            driver.findElement(By.linkText(urls[i])).click();
	            Dimension resolution1366x768 = new Dimension(1366,768);
	            driver.manage().window().setSize(resolution1366x768);
	           
	            TakesScreenshot screenshot = (TakesScreenshot) driver;
	            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	            File destFile = new File("./DeskTop/1366x768/Screenshot/07-09-2024;00-40 am/" + fileNames[i]);
	            FileHandler.copy(srcFile, destFile);

	            Thread.sleep(2000);
	            driver.navigate().back();
	        }
	        
	        for (int i = 0; i < urls.length; i++) {
	            driver.get("https://www.getcalley.com/page-sitemap.xml");
	            driver.findElement(By.linkText(urls[i])).click();
	            Dimension resolution1536x864 = new Dimension(1536,864);
	            driver.manage().window().setSize(resolution1536x864);
	           
	            TakesScreenshot screenshot = (TakesScreenshot) driver;
	            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	            File destFile = new File("./DeskTop/1536x864/Screenshot/06-09-2024;08-00 pm/" + fileNames[i]);
	            FileHandler.copy(srcFile, destFile);

	            Thread.sleep(2000);
	            driver.navigate().back();
	        }
	        
	        driver.quit();
		}
	}


