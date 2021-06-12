package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class P1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\MCA Data\\MCA\\SYMCA\\Practical\\STQA\\Practical 11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://omayo.blogspot.com/";
		String expectedTitle = "omayo (QAFox.com)";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
	}
}
