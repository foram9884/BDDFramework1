package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginstepDefinition {
    WebDriver driver;
    @Given("^User able to open browser$")
    public void user_able_to_open_browser()  {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("^Enter Url$")
    public void enter_Url()
    {
        driver.get("https://demo.nopcommerce.com/");


    }

    @Then("^User click on login Link$")
    public void user_click_on_login_Link()
    {

        driver.findElement(By.className("ico-login")).click();
    }

    @Then("^User on login page and  verify login page title$")
    public void user_on_login_page_and_verify_login_page_title()
    {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Login",title);
    }

    @When("^User enter username and password and click on login button$")
    public void user_enter_username_and_password_and_click_on_login_button()
    {
        driver.findElement(By.id("Email")).sendKeys("maya123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("abc123");
       driver.findElement(By.className("login-button")).click();


    }

    @Then("^User is on Home page$")
    public void user_is_on_Home_page()
    {


    }

    @Then("^User close the browser$")
    public void user_close_the_browser()
    {

    driver.quit();

    }

}
