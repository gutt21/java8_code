package parallel;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel {

	WebDriver driver;
	
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername)

	
	{
		if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if (browsername.equalsIgnoreCase("chrome")) {
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(op);
		}
		else {
			System.out.println("invalid browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));		
		

	}
	
	   parallel ib;   
	  
	   public static void main(String [] str){
		   parallel ibgc1 = new parallel();
		   parallel ibgc2 = new parallel();
	       ibgc1.ib = ibgc2; //ibgc1 points to ibgc2
	       ibgc2.ib = ibgc1; //ibgc2 points to ibgc1
	       System.out.println(ibgc1.ib);
	       ibgc1 = null;
	       ibgc2 = null;
	       
	       
	       
	       /* 
	       * We see that ibgc1 and ibgc2 objects refer 
	       * to only each other and have no valid 
	       * references- these 2 objects for island of isolcation - eligible for GC
	       */
	   }
	
	
	
	
	
	
	
	  @Test() public void test() { 
		//driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	  }
	/*  
	  }
	 
	  @Test public void test1() { ChromeOptions op=new ChromeOptions();
	  op.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup(); WebDriver driver=new
	  ChromeDriver(op); driver.get("https://www.amazon.in/");
	  
	  }
	  
	  
	  @Test public void test2() { ChromeOptions op=new ChromeOptions();
	  op.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup(); WebDriver driver=new
	  ChromeDriver(op); driver.get("https://www.flipkart.com/");
	  
	  
	  }
	  
	  @Test public void test3() { ChromeOptions op=new ChromeOptions();
	  op.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup(); WebDriver driver=new
	  ChromeDriver(op); driver.get("https://www.amazon.in/");
	  
	  }
	  
	  
	  @Test public void test4() { ChromeOptions op=new ChromeOptions();
	  op.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup(); WebDriver driver=new
	  ChromeDriver(op); driver.get("https://www.flipkart.com/");
	  
	  
	  }
	  
	  @Test public void test5() { ChromeOptions op=new ChromeOptions();
	  op.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup(); WebDriver driver=new
	  ChromeDriver(op); driver.get("https://www.amazon.in/");
	  
	  }
	  
	  @Test public void test6() { ChromeOptions op=new ChromeOptions();
	  op.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup(); WebDriver driver=new
	  ChromeDriver(op); driver.get("https://www.flipkart.com/");
	  
	  
	  }
	  
	  @Test public void test7() { ChromeOptions op=new ChromeOptions();
	  op.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup(); WebDriver driver=new
	  ChromeDriver(op); driver.get("https://www.amazon.in/");
	  
	  }*/
	 
	  //@Test(invocationCount = 2)
	  public void testet()
	  {
		  System.out.println("hello");
	  }
	  
}
