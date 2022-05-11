package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon'a gidip nutella aratalim
        driver.get("https://www.amazon.com");

        //findElement(By....locator)--->istedigimiz web elementini bize dondurur
        //biz de o web elementini kullanmak icin bir objeye assing ederiz

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        /*
        id kullanmayi hoca tavsiye ediyor, varsa unique olup olmadigini websitesinin
        arama kisminda search ediyoruz . unique ise kullaniyoruz.
        diger locatorlar icin de kullanacak isek unique olup olmadigina bakariz
        class genelde birden fazla islem icin kullanilir ve unique olma olasiligi daha yuksektir
         */

        /*
        WebElement aramaKutusu= driver.findElement(By.className("nav-search-field "));
        bu calismadi
        Locator alirken gozumuzden kacan detaylar olabilir
        aldigimiz bir locator
         */

        /*
        By.linkText()
        burada adresi copy paste yapacaz ve yazilma seklinde bosluk varsa oldugu gibi copy yapmamiz gerekir
        buyuk kucuk harfe, bosluga duyarlidir

        By.partialLinkText() de adresin hepsini degil de yarisini, bir kismini almayi saglar
         */

        //herhangi bir web elementine istedigimiz yaziyi yollamak istersek

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


    }
}
