package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class P2
{
	public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver","E:\\MCA Data\\MCA\\SYMCA\\Practical\\STQA\\Practical 11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
    }
}
