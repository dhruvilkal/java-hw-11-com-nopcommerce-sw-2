package testsuite;
/**
 * Write down the following test into ‘TopMenuTest’  class
 * 1. userShouldNavigateToComputerPageSuccessfully
 *      click on the ‘Computers’ Tab
 *      Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 *      click on the ‘Electronics’ Tab
 *      Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 *      click on the ‘Apparel’ Tab
 *      Verify the text ‘Apparel’
 * 4. userShouldNavigateToDigitalDownloadsPageSuccessfully
 *      click on the ‘Digital downloads’ Tab
 *      Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 *      click on the ‘Books’ Tab
 *      Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 *      click on the ‘Jewelry’ Tab
 *      Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 *      click on the ‘Gift Cards’ Tab
 *      Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    // Declare baseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    // Open Browser
    @Before
    public void setUP(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        // Find the Computer tab and click the computer tab
        WebElement computerTab = driver.findElement(By.xpath("//a[contains(text(), 'Computers')]"));
        computerTab.click();

        // Expected resul
        String expectedText = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Computers')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

        }
    @Test
    // Find the Electronic tab and click the Electronic tab
    public void userShouldNavigateToElectronicPageSuccessfully() {
        WebElement electronicTab = driver.findElement(By.xpath("//a[contains(text(), 'Electronics')]"));
        electronicTab.click();

        // Expected result
        String expectedText = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Electronic')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    // Find the Apparel tab and click the Apparel tab
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement apparelTab = driver.findElement(By.xpath("//a[contains(text(), 'Apparel')]"));
        apparelTab.click();

        // Expected result
        String expectedText = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Apparel')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    // Find the Digital downloads tab and click the Digital downloads tab
    public void userShouldNavigateToDigitalDownPageSuccessfully() {
        WebElement DigitalDownTab =driver.findElement(By.xpath("//a[text() = 'Digital downloads ' ]"));
        DigitalDownTab.click();

        // Expected result
        String expectedText = "Digital downloads";
        WebElement actualTextElement =  driver.findElement(By.xpath("//h1[text() = 'Digital downloads' ]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    // Find the Books tab and click the Books tab
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement booksTab = driver.findElement(By.xpath("//a[contains(text(), 'Books')]"));
        booksTab.click();

        // Expected result
        String expectedText = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Books')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    // Find the Jewelry tab and click the Jewelry tab
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelryTab = driver.findElement(By.xpath("//a[contains(text(), 'Jewelry')]"));
        jewelryTab.click();

        // Expected result
        String expectedText = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Jewelry')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    // Find the Gift Cards tab and click the Gift Cards tab
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement giftCardsTab = driver.findElement(By.xpath("//a[contains(text(), 'Gift Cards')]"));
        giftCardsTab.click();

        // Expected result
        String expectedText = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Gift Cards')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @After
    public void tearTown () {
        closeBrowser(); // calling method from BaseTest class to close the browser
    }

}
