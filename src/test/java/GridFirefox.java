import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridFirefox {

    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
       // capabilities.setBrowserName("chrome");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.136:4444"), capabilities);
        driver.manage().window().maximize();
        driver.get("http://flipkart.com");
        System.out.println(driver.getTitle());
    }
}
