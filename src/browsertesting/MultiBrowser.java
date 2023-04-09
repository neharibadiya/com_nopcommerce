package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "chrome";
    static WebDriver driver;
    static String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseurl);
        System.out.println(driver.getTitle());
        //get the title of tha page
        System.out.println("Page Title : " + driver.getTitle());
        //print current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //print the page source
        System.out.println("page source : " + driver.getPageSource());
        //enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("prime123gmail.com");
        //Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("prime123");
        //close the browser
        //driver.close();


    }

}
