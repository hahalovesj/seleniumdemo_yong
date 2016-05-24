package p4;
/**
 * 4.6 执行JS脚本
 * 用JS赋值或者用js执行点击操作等
 * **/

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunJSDemo1 {
/**
 * 此代码没有任何实际意义只做演示
 * 
 * */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		String js ="alert(\"hello,this is a alert!\")";
	    ((JavascriptExecutor) driver).executeScript(js);
	    Thread.sleep(2000);
		driver.quit();
		
		

	}
	


}
