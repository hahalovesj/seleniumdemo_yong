package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class day1SimpleDemo {

	public static void main(String[] args) {
		WebDriver driver;
		//如果浏览器不是默认安装，则指定其位置。
		System.setProperty("webdriver.firefox.bin", "D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		//声明一个火狐浏览器driver对象
		driver = new FirefoxDriver();
		
		//打开360搜索
		driver.get("https://www.so.com/");
		//找到搜索框元素
		WebElement searchInput = driver.findElement(By.name("q"));
		//向搜索框输入“selenium”
		searchInput.sendKeys("selenium");
		//找到搜索按钮
		WebElement searchButton = driver.findElement(By.id("search-button"));
		//点击搜索按钮
		searchButton.click();
		try {
			//这里我们暂时用sleep方式等待页面条状，后续会讲到如何智能等待
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//跳转之后的页面关键字输入框元素
		WebElement keywordInput = driver.findElement(By.id("keyword"));
		//验证输入框的内容是不是selenium
		Assert.assertEquals(keywordInput.getAttribute("value"), "selenium");
		//关闭浏览器
//		driver.quit();
		
		
	}

}
