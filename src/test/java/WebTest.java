import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class WebTest{

    @Test
    public void testFirstWeb() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "d:/F_QA_2021/SeleniumDriver/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(3000);

        WebElement actualResult = driver.findElement(By.cssSelector("#main h2"));

        AssertJUnit.assertEquals(expectedResult, actualResult.getText());

        driver.close();
        driver.quit();
    }

    @Test
    public void testAvailabilityMenuButtons() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "d:/F_QA_2021/SeleniumDriver/chromedriver.exe";
        String url = "https://www.coldstonecreamery.com/index.php";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement closeButton = driver.findElement(By.xpath("//div[contains(@class,'close-button')]"));
        closeButton.click();
    }
}
