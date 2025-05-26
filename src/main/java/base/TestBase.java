package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
@Listeners(listeners.Listeners.class)
public class TestBase {
	public Properties prop;
	protected WebDriver driver;
	@BeforeTest
	public void setUp() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\jites\\eclipse-workspace\\Ecommerce\\src\\main\\java\\config\\config.properties");
		prop.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		System.out.println("Dummy comment");
		System.out.println("Dummy comment");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
