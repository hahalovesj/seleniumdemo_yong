package p5;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class dataProviderDemo {

  @DataProvider(name="test")
  public static Object[][] testData(){
	return new Object[][]{{"wang"}}; 
  }
  
  @Test(dataProvider="test")
  public void f(String str1){
	  System.out.println("´òÓ¡³ö£º"+str1);
	  
  }

}
