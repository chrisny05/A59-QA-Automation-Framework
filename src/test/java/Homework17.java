import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.time.Duration;

public static class Homework17 extends BaseTest {

    @Test
    public void addSongToPlayList() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts();implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);

        navigateToPage();

        provideEmail("chris.nguyen@testpro.io");
        providePassword("BoAt9hC6");
        clickSubmit();
        
            }

    private void implicitlyWait(Duration duration) {
    }

    private void clickSubmit() {
    }

    private void providePassword(String BoAt9hC6) {
    }

    private void provideEmail(String mail) {
    }

    private void navigateToPage() {
    }


}
    WebElement addSongToPlayList = driver.findElement(By.cssSelector("type=home-view-all-recently-played-btn");
    addSongToPlayList.click;

    String addSongToPlayListUrl = "https://qa.koel.app/#!/recently-played";

    Assert.assertEquals(driver.getCurrentUrl(), addSongToPlayListUrl);

    driver.quit();

}