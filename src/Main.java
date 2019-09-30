import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    private static WebDriver driver = new ChromeDriver();

    public static void createJetiProject(){
        driver.manage().window().maximize();
        driver.navigate().to("https://jira.codecool.codecanvas.hu/secure/Dashboard.jspa");
        WebElement createButton = driver.findElement(By.xpath("//*[@id=\"create_link\"]"));
        createButton.click();
        WebElement dropDownButton = driver.findElement(By.xpath("//*[@id=\"issuetype-single-select\"]/span"));
        dropDownButton.click();
        Select select = new Select(dropDownButton);
        select.selectByVisibleText("Bug");
    }

    public static void main(String[] args) {
        createJetiProject();
    }
}
