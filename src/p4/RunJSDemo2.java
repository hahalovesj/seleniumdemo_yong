package p4;
/**
 * 4.6 执行JS脚本
 * 
 * 这个方法比较适用某些元素不易点击的情况下使用，比如网页内容太长，当前窗口太长，想要点击那些不在当前窗口可以看到元素可以用此方法。
 * **/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunJSDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.baidu.com/");
		String js ="arguments[0].click();";
		driver.findElement(By.id("kw")).sendKeys("JAVA");
		WebElement searchButton = driver.findElement(By.id("su"));
	    ((JavascriptExecutor) driver).executeScript(js,searchButton);
	    Thread.sleep(2000);
		driver.quit();
		
		

	}
	


}
