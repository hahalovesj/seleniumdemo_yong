package p1;
/**第二章，如何找到元素
 * 2.3.1 通过ID定位
 * 2.3.2 通过classname定位
 * 2.3.3 通过name定位
 * 2.3.4 通过xpath定位
 * 2.3.5 通过cssSelector定位
 * 	2.3.5.1  使用绝对路径来定位元素
 * 	2.3.5.2  使用相对路径来定位元素
 * 2.3.6 通过linkText定位
 * 2.3.7 通过partialLinkText定位
 * 2.3.8 通过tagName定位
 * 2.3.9 通过jQuery来定位元素
 * 
 */
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class day2findElementByjQuery {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//使用了jQuery的find方法来查找元素，找到符合“a.mnav”的元素，然后通过JavascriptExecutor执行jQuery命令。
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		driver.get("https://www.baidu.com");
		List<WebElement> webElements =(List<WebElement>)jsExecutor.executeScript("return jQuery.find('a.mnav')");
		Assert.assertEquals(webElements.size(), 6);
		Assert.assertEquals(webElements.get(2).getText(), "hao123");
		
		
		
	}

}
