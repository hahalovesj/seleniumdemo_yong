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
		//���õȴ�ҳ����ȫ���ص�ʱ����10�룬�����10���ڼ�����ϣ�ʣ��ʱ�䲻�ڵȴ�
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com/");
		By inputBox = By.id("kw");
		By searchButton = By.id("su");
		//���ܵȴ�Ԫ�ؼ��س���
		intelligentWait(driver, 10, inputBox);
		//���ܵȴ�Ԫ�ؼ��س���
		intelligentWait(driver, 10, searchButton);
		//��������
		driver.findElement(inputBox).sendKeys("JAVA");
		//�����ѯ
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
			Assert.fail("��ʱ!! " + timeOut + " ��֮��û�ҵ�Ԫ�� [" + by + "]",e);
		}


	}
	


}
