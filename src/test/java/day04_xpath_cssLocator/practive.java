package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practive {
    /*
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
     */

    /*
    xpath kullanirken unique olmaz ise index ekleriz boylece uzerinde calistigimiz WebElementi
    unique olur. Index 1'den baslar ve aradigimiz WebElement'in index'ini mesela yazmis oluruz.
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
      // WebElement addButton=driver.findElement(By.xpath(("(//button[@onclick='addElement()'])")));
        //addButton.click();
        /*
        bu webElementi bir defa kullancak isek mesela click yapmak icin, o zaman asagidaki tek satirlik
        kod kullanilir:
        */
        driver.findElement(By.xpath(("(//button[@onclick='addElement()'])"))).click();

        /*
        bu asagida yorum olan kisimdaki kodlari bu sekilde yazmamizi saglayan bunyesinde
        text barindirmasidir.
         */
       // driver.findElement(By.xpath("(//button[text()='addElement()'])")).click();
       // driver.findElement(By.xpath("(//*[text()='addElement()'])")).click();

        Thread.sleep(2000);
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton=driver.findElement(By.xpath(("(//button[@class='added-manually'])")));
        if(deleteButton.isDisplayed())
            System.out.println("delete Button test PASSED");
        else System.out.println("delete Button test FAILED");

        Thread.sleep(2000);

        //4- Delete tusuna basin
        deleteButton.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements=driver.findElement(By.xpath("//h3"));
       // WebElement addRemoveElements=driver.findElement(By.tagName("h3"));
        if (addRemoveElements.isDisplayed()) {
            System.out.println("Add/Remove element testi PASSED");
        } else System.out.println("Add/Remove element testi FAILED");

        driver.close();
    }
}
