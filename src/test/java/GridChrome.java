import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridChrome {

    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.2.69:4444"), capabilities);
        driver.manage().window().maximize();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}
