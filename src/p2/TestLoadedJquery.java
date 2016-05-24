package p2;
/**
 * 2.3.9.2已经加载jQuery库页面定位
 * 
 **/

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestLoadedJquery {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		driver.get("https://www.baidu.com");
		
		List<WebElement> webElements = (List<WebElement>) jsExecutor.executeScript("return jQuery.find('a.mnav')");
		Assert.assertEquals(webElements.size(),6);
		Assert.assertEquals(webElements.get(2).getText(), "hao123");
		
		driver.quit();
		
	}

}
