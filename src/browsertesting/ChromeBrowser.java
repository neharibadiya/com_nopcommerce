package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //launch the chrome browser
        WebDriver driver = new ChromeDriver();
        //open url into browswer
        driver.get(baseurl);
        //maximise the browser
        driver.manage().window().maximize();
        //print the title of the page
        //String title = driver.getTitle();
        System.out.println("Page Title : " + driver.getTitle());
        //print current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //print the page source
        System.out.println("page source : " + driver.getPageSource());
        //find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));

        //enter the email to email field
        emailField.sendKeys("prime123gmail.com");
        //Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("prime123");

        //close the browser
        //driver .close();

    }
}
