import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public static void main(String[] args) {
        String driverpath ="C:\\Users\\Manishakumarisingh\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverpath);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test");
        driver.findElement(By.id("btn_basic_example")).click();
        driver.findElement(By.linkText("Start Practising"));
        System.out.println(driver.getCurrentUrl());

        //another url
        driver.get("https://www.tutorialspoint.com");

        //page title
        String Title = driver.getTitle();
        System.out.println(Title);

        //page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //length of the page source
        int pageSourceLength = pageSource.length();
        System.out.println(pageSourceLength);

        //new url
        driver.get("https://www.flipkart.com");
        //driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//[@class=_1jcwFN_3dmQRh and text()='Login']"));
        driver.findElement(By.xpath("(//input[@type='text'/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("bhargav@gmail.com");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bhargav");

        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }
}
