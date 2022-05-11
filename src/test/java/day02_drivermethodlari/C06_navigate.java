package day02_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        testimiz arasinda birden fazla sayfa arasinda ileri geri hareket edecek isek
        driver.get() yerine driver.navigate().to("") kullaniriz ve sonrasinda
        forward(), back(), refresh() kullaniriz.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //Amazon'a geri donelim

        driver.navigate().back();
        Thread.sleep(2000);

        //yeniden Facabook'a gidelim

        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);

        //sayfayi kapatalim
        driver.close();

    }
}
