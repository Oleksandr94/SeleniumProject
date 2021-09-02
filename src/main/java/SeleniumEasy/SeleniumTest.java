package SeleniumEasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


    public class SeleniumTest extends BaseTest{

        @Test
        public void testFirst() throws InterruptedException {
             {
                WebElement enterButtonNoThanks = wait
                        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")));
                enterButtonNoThanks.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                WebElement enterButtonNoThanks = wait
                        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"at-cv-lightbox-close\"]")));
                enterButtonNoThanks.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                WebElement enterButtonNoThanks = wait
                        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]")));
                enterButtonNoThanks.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                WebElement enterButtonNoThanks = wait
                        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")));
                enterButtonNoThanks.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        @AfterMethod(alwaysRun = true)
        public void after() {
            driver.quit();
        }

        }
