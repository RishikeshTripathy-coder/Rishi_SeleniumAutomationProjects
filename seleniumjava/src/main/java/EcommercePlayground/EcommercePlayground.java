package EcommercePlayground;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommercePlayground {
    
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to your Chrome WebDriver executable
        System.setProperty("webdriver.edge.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ecommerce-playground.lambdatest.io/");
    }

    @Test
    public void loginTest() {
        // Find and interact with elements on the login page
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("your_email@example.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("your_password");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginButton.click();

        // You can add assertions here to verify the login was successful
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver session
        driver.quit();
    }
}


