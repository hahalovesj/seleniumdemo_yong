package p4;
/**
 * 4.6 ִ��JS�ű�
 * 
 * ��������Ƚ�����ĳЩԪ�ز��׵���������ʹ�ã�������ҳ����̫������ǰ����̫������Ҫ�����Щ���ڵ�ǰ���ڿ��Կ���Ԫ�ؿ����ô˷�����
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
