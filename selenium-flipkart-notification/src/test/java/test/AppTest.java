package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class AppTest {
public static void main(String[] args)
    {
        String driverpath = "C:\\Users\\Manishakumarisingh\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverpath);
        // Get the driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        // Enter Login credentials
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8103815637");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("manisha");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
        // Wait for page to render after login
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Move to more and click Notifications
        WebElement More = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div"));
        Actions action1= new Actions(driver).moveToElement(More);
        action1.moveToElement(More).build().perform();
        driver.findElement(By.className("_2k68Dy")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Click SMS
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/ul/a[3]/li")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Click Reminders Check box
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/section/div/div/ul/li[2]/section/div[1]/label/div")).click();
    }
}















































































//    public static void main(String[] args) {
//
//        String driverPath = "C:\\Users\\Manishakumarisingh\\Downloads\\chromedriver_win32\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.flipkart.com");
//        System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8103815637");
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("manisha");
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button ")).click();
//        driver.manage().window().maximize();
//        Wait wait=new WebDriverWait(driver,30);
//        Actions action = new Actions(driver);
//        WebElement we = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div"));
//        action.moveToElement(we).build().perform();
//        System.out.println("hover done");
//        driver.findElement(By.xpath("/*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/div/svg/path"));
//        action.moveToElement(we).build().perform();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      //  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/div/span")).click();
//      //  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/section/div/div/ul/li[1]")).click();
//
//    }
//}
////*[@id="container"]/div/div[3]/div/div[2]/div[2]
////*[@id="container"]/div/div[4]
////html/body/div[1]/div/div[3]/div/div[1]/div/div/div/div
////*[@id="container"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div  more
/////html/body/div/div/div[1]/div[1]/div[2]/div[4]/div/svg/path  arrow on more
////*[@id="container"]/div/div[1]/div[1]/div[2]/div[4]/div/svg/path
////*[@id="container"]/div/div[3]/div/div[2]/div[2]/div/section/div/div/ul/li[1] first notification
////*[@id="container"]/div/div[3]/div/div[2]/div[2]/div/section/div/div/ul/li[2] second notification
////*[@id="container"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div