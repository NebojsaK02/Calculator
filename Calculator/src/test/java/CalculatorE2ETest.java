import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorE2ETest {
    @Test
    void testWebAddition() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080.index.html");

        driver.findElement(By.id("a")).sendKeys("6");
        driver.findElement(By.id("op")).sendKeys("add");
        driver.findElement(By.id("b")).sendKeys("4");
        driver.findElement(By.id("calculate")).click();

        assertEquals("10", driver.findElement(By.id("result")).getText());

        driver.quit();
    }
}
