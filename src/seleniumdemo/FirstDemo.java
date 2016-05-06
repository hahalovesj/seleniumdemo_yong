package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FirstDemo {

	public static void main(String[] args) {
		//����һ����������driver����
		WebDriver driver = new FirefoxDriver();
		//��360����
		driver.get("http://www.haosou.com/");
		//�ҵ�������Ԫ��
		WebElement searchInput = driver.findElement(By.name("q"));
		//�����������롰selenium��
		searchInput.sendKeys("selenium");
		//�ҵ�������ť
		WebElement searchButton = driver.findElement(By.id("search-button"));
		//���������ť
		searchButton.click();
		try {
			//����������ʱ��sleep��ʽ�ȴ�ҳ����״�������ὲ��������ܵȴ�
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//��ת֮���ҳ��ؼ��������Ԫ��
		WebElement keywordInput = driver.findElement(By.id("keyword"));
		//��֤�����������ǲ���selenium
		Assert.assertEquals(keywordInput.getAttribute("value"), "selenium");
		//�ر������
//		driver.quit();
		
		
	}

}
