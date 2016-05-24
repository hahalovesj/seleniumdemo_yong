package p1;
/**�ڶ��£�����ҵ�Ԫ��
 * 2.3.1 ͨ��ID��λ
 * 2.3.2 ͨ��classname��λ
 * 2.3.3 ͨ��name��λ
 * 2.3.4 ͨ��xpath��λ
 * 2.3.5 ͨ��cssSelector��λ
 * 	2.3.5.1  ʹ�þ���·������λԪ��
 * 	2.3.5.2  ʹ�����·������λԪ��
 * 2.3.6 ͨ��linkText��λ
 * 2.3.7 ͨ��partialLinkText��λ
 * 2.3.8 ͨ��tagName��λ
 * 2.3.9 ͨ��jQuery����λԪ��
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
		//ʹ����jQuery��find����������Ԫ�أ��ҵ����ϡ�a.mnav����Ԫ�أ�Ȼ��ͨ��JavascriptExecutorִ��jQuery���
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		driver.get("https://www.baidu.com");
		List<WebElement> webElements =(List<WebElement>)jsExecutor.executeScript("return jQuery.find('a.mnav')");
		Assert.assertEquals(webElements.size(), 6);
		Assert.assertEquals(webElements.get(2).getText(), "hao123");
		
		
		
	}

}
