package testsuite;
/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully
 *      click on the ‘Login’ link Verify the text ‘Welcome, Please Sign In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials * click on the ‘Login’ link
 *      Enter valid username
 *      Enter valid password
 *      Click on ‘LOGIN’ button
 *      Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 *      click on the ‘Login’ link
 *      Enter invalid username
 *      Enter invalid password
 *      Click on Login button
 *      Verify the error message ‘Login was unsuccessful. Please correct the errors and try again. No customer account found’
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void SetUp(){

        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";

        // Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
public void userShouldLoginSuccessfullyWithValidCredentials(){
        userShouldNavigateToLoginPageSuccessfully(); // re-direct to the login page

        driver.findElement(By.name("Email")).sendKeys("somin55006@eachart.com"); // find element for Email field and enter valid login-id
        driver.findElement(By.name("Password")).sendKeys("12345678"); // find element for Password field and enter valid password
        driver.findElement(By.xpath("//button[@class = 'button-1 login-button']")).click(); // find element for login button and click
        String actualValue = driver.findElement(By.xpath("//a[text() = 'Log out']")).getText(); // get the text from page to verify the re-direction
        String expectedValue = "Log out"; // expected text
        Assert.assertEquals(expectedValue, actualValue); // verify expected and actual text
}
@Test
    //Method name verifyTheErrorMessage
    public void verifyTheErrorMessage(){
    // Find the login link and click on login link with className
    userShouldNavigateToLoginPageSuccessfully();

    // Find the Username field and enter the valid username in the filed
    WebElement userName = driver.findElement(By.className("email"));
    userName.sendKeys("gediv42505@eachart.com");

    // Find the password field and enter the valid password in the field
    WebElement passwordEnter = driver.findElement(By.className("password"));
    passwordEnter.sendKeys("040608");

    //Find the Login button and click the login button
    WebElement loginButton = driver.findElement(By.xpath("//button[@class= 'button-1 login-button']"));
    loginButton.click();

    // Expected result
    String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";

    // Find the errorMessage element and get the text
    String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
    Assert.assertEquals("Error message not displayed",expectedErrorMessage, actualErrorMessage);

}
@After
    public void tearDown(){
        closeBrowser();
}

}
