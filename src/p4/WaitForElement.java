package p4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitForElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		//设置等待页面完全加载的时间是10秒，如果在10秒内加载完毕，剩余时间不在等待
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com/");
		By inputBox = By.id("kw");
		By searchButton = By.id("su");
		//智能等待元素加载出来
		intelligentWait(driver, 10, inputBox);
		//智能等待元素加载出来
		intelligentWait(driver, 10, searchButton);
		//输入内容
		driver.findElement(inputBox).sendKeys("JAVA");
		//点击查询
		driver.findElement(searchButton).click();
		driver.quit();
	}
	
	public static void intelligentWait(WebDriver driver,int timeOut, final By by){
		
		
		try {
			(new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {

				public Boolean apply(WebDriver driver) {
					WebElement element = driver.findElement(by);
					return element.isDisplayed();
				}
			});
		} catch (TimeoutException e) {
			Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]",e);
		}


	}
	


}
