package stepDefinitaions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouchSteps {

    static WebDriver driver;

    @Given("I launch the chrome browser")
    public void i_launch_the_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I openTouch home page")
    public void i_open_touch_home_page() {
        driver.get("https://touch.com.ua/");
    }

    @Then("I verify that Apple technique button presents on the page")
    public void i_verify_that_apple_technique_button_presents_on_the_page() {

    }

    @And("Close browser")
    public void close_browser() {

    }
}
