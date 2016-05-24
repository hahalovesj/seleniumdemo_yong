package p3;
/**
 * 第三章 启动常用浏览器
 * 3.1 启动firefox浏览器
 * 3.2 启动chrome浏览器
 * 	3.2.3 指定用户数据启动方式
 * 3.3 启动ie浏览器
 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class seleniumDemo {

	public static void main(String[] args) {
		
		//firefox();
		//chrome();
		ie();
	}
	public static void firefox()
	{
		WebDriver driver = new FirefoxDriver();
		Navigation navigation =driver.navigate();
		navigation.to("http://www.baidu.com");
		driver.close();
		driver=null;
	}
	public static void chrome()
	{
		System.setProperty("webdriver.chrome.driver", "./Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Navigation navigation =driver.navigate();
		navigation.to("http://www.jd.com");
		//driver.quit();
	}
	public static void ie()
	{
		
        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer(); 
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "D:\\Program Files\\ie\\IEDriverServer32.exe");
		WebDriver driver =new InternetExplorerDriver(ieCapabilities);
		Navigation navigation =driver.navigate();
		navigation.to("http://www.baidu.com");
		driver.getTitle();
	} 

}