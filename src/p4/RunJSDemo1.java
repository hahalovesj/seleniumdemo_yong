package p4;
/**
 * 4.6 ִ��JS�ű�
 * ��JS��ֵ������jsִ�е��������
 * **/

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunJSDemo1 {
/**
 * �˴���û���κ�ʵ������ֻ����ʾ
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
