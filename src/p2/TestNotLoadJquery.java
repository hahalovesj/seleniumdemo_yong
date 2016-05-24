package p2;
/**
 * 2.3.9.3 未加载jQuery库页面定位
 * 
 */
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class TestNotLoadJquery {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		driver.get("http://www.2345.com/");
		if(!jQueryLoaded(jsExecutor)){
			//如果检测到没有jquery库就执行注入操作
			inJectJquery(jsExecutor);
		}
		//找到搜索一下按钮元素
		List<WebElement> searchButton =  (List<WebElement>) jsExecutor.executeScript("return jQuery.find('input.sch_btn')");
		//验证按钮的文本
		Assert.assertEquals(searchButton.get(0).getAttribute("value"), "搜索一下");
		driver.quit();
		
	}
	
	
	/**注入jQuery支持*/
	public static void inJectJquery(JavascriptExecutor jsExecutor){
		jsExecutor.executeScript("var headID = document.getElementsByTagName(\"head\")[0];"
				+ "var newScript = document.createElement('script');"
				+ "newScript.type = 'text/Javascript';"
				+ "newScript.src=\"http://code.jquery.com/jquery-2.1.4.min.js\";"
				+ "headID.appendChild(newScript);");
	}
	
	/**判断当前页面是否使用了jQuery*/
	public static  Boolean jQueryLoaded(JavascriptExecutor jsExecutor){
		Boolean loaded = true;
		try{
			loaded = (Boolean) jsExecutor.executeScript("return jQuery()! = null");
		}catch(WebDriverException e){
			loaded = false;
		}
		
		return loaded;
	}
	
	}


