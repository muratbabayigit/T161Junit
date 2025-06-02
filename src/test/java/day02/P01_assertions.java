package day02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01_assertions  {
    static WebDriver driver;
    //  https://www.bestbuy.com/ Adresine gidin
    //  farkli test method'lari olusturarak asagidaki testleri yapin
    //  ○ Sayfa URL'inin https://www.bestbuy.com/ 'a esit oldugunu test edin
    //  ○ titleTest => Sayfa başlığının "Rest" içermediğini(contains) test edin
    //  ○ logoTest => BestBuy logosunun görüntülendigini test edin
    //  ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini ve tıklanlılabilir olduğunu test edin


    @BeforeEach
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bestbuy.com/");


    }
    @AfterEach
    public void tearDown(){driver.quit();}

    @Test
    public void test01(){

        String expUrl="https://www.bestbuy.com/";
        String actUrl=driver.getCurrentUrl();
        Assertions.assertEquals(expUrl,actUrl,"Url Kontrolü Sağlandı");
    }

    @Test
    public void test02(){
        WebElement logoImage= driver.findElement(By.xpath("(//*[@class='logo'])[1]"));
        Assertions.assertTrue(logoImage.isDisplayed(),"Logo Görünülürlük Kontrolü sağlandı");

    }

    @Test
    public void test03(){
        WebElement frLang= driver.findElement(By.xpath("//button[@lang='fr']"));
        Assertions.assertTrue(frLang.isDisplayed(),"Français yazısının görünürlürlük kontrolü sağlandı");
        Assertions.assertTrue(frLang.isEnabled(),"Français yazısının tıklanabilirlik kontrolü sağlandı");
    }

    @Test
    public void test04(){
        String expWord="Rest";
        String actTitle= driver.getTitle();
        System.out.println(driver.getTitle());
        Assertions.assertFalse(actTitle.contains(expWord),"Title'ın Rest Kelimesi İçerip İçermediğinin Kontrolü Sağlandı");
    }


}
