package p5;
/**
 * 5.6 TestNG�����ṩ��DataProvider
 * TestNG���˿���ͨ�������������������⣬���и������ṩ�ߣ�Ҳ��ͨ��ע�ͷ�ʽ�����ݵģ�
 * ��׼��ʽ�ǣ�@DataProvider(name = "XXXX")
 */
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class dataProviderDemo {

  @DataProvider(name="test")
  public static Object[][] testData(){
	return new Object[][]{{"wang"}}; 
  }
  
  @Test(dataProvider="test")
  public void f(String str1){
	  System.out.println("��ӡ����"+str1);
	  
  }

}
