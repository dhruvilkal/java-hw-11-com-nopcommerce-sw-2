package testsuite;
/**
 * Write down the following test into ‘RegisterTest’  class
 * 1. userShouldNavigateToRegisterPageSuccessful ly
 *      click on the ‘Register’ link
 *      Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully *  click on the ‘Register’ link
 *      Select gender radio button
 *      Enter First name
 *      Enter Last name
 *      Select Day Month and Year
 *      Enter Email address
 *      Enter Password
 *      Enter Confirm password
 *      Click on REGISTER button
 *      Verify the text 'Your registration completed’
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest  extends BaseTest {
    // Declare baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    // Open Browser
    @Before
    public void setUP(){
        openBrowser(baseUrl);
    }
    @Test
    //userShouldNavigateToRegisterPageSuccessfully
    public void userShouldNavigateToRegisterPageSuccessful(){
        WebElement registerLink = driver.findElement(By.className("ico-register"));
        registerLink.click();

        // Find the gender radio button and select radio button with id
        WebElement genderRadioButton = driver.findElement(By.xpath("//input[starts-with(@id, 'gender-male')]"));
        genderRadioButton.click();

        // Find the first name field nd enter first name
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Smith");

        // Find the last name field nd enter last name
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("stevie");

        // Select Day Month and Year
WebElement day = driver.findElement(By.className("valid"));
day.sendKeys("1");

WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
month.sendKeys("5");

WebElement year = driver.findElement(By.className("valid"));
year.sendKeys("2000");

           // Enter Email address
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("goxihob315@eachart.com");

        // Enter Password Field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Manish@1234");

        //Enter Confirm password
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Manish@1234");

        //Click on REGISTER button
        WebElement registerButton = driver.findElement(By.name("register-button"));
        registerButton.click();

        //Verify the text 'Your registration completed
        //expected result
        String expectedText = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.className("result"));
        String actualText = actualTextElement.getText();
        // Verify expected and actual text
        Assert.assertEquals(expectedText,actualText);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
