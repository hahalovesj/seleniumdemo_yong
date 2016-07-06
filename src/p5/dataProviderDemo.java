package p5;
/**
 * 5.6 TestNG数据提供者DataProvider
 * TestNG除了可以通过参数化传递数据以外，还有个数据提供者，也是通过注释方式来传递的，
 * 标准格式是：@DataProvider(name = "XXXX")
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
	  System.out.println("打印出："+str1);
	  
  }

}
