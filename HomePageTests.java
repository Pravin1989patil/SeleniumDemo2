import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTests {
	@Test
	public void HomePagetest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/");
		driver.manage().window().maximize();

	}
}
