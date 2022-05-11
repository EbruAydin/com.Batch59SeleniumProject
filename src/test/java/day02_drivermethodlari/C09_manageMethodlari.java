package day02_drivermethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://amaazon.com");
        /*
        ilerde wait konusuna daha fazla deginilecek
        bir sayfa acilirken, oncelikle sayfanin icerisinde bulunan elementlere gore
        bir yukleme suresine ihtiyac vardir
        veya bir webelementinin kullanilabilmesi icin zamana ihtiyac vardir
        implicitWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasabilmek icin
        bekleyecek MAXIMUM sureyi belirleme olanagi tannir
         */

        driver.close();
    }
}
