package day01;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P04_aramaTesti {
    static WebDriver driver;
    static WebElement searchbox;
    static String filmAd="";
      /*
        BeforeAll ile driver'i oluşturun ve class icinde static yapin
        driver'ı Maximize edin ve 10 sn bekletin
        her biri için https://www.babayigit.net/test adresine gidin ilgili aramayı yapıp cikan sonuc sayisini yazdirin
        1-arama kutusuna "12 Angry Men” yazip aratın
        2-arama kutusuna "Vizontele” yazip aratın
        3-arama kutusuna "Saving Private Ryan” yazip aratın
        AfterAll ile kapatin.
     */
    @BeforeAll
    public static void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeEach
    public void beforeEach(){
        driver.get("https://www.babayigit.net/test");
        searchbox= driver.findElement(By.id("babayigit"));
    }



      @Test
      public void test01(){
          filmAd="12 Angry Men";
          searchbox.sendKeys(filmAd+ Keys.ENTER);
      }
      @Test
      public void test02(){
          filmAd="Vizontele";
          searchbox.sendKeys(filmAd+ Keys.ENTER);
      }

      @Test
      public void test03(){
          filmAd="Saving Private Ryan";
          searchbox.sendKeys(filmAd+ Keys.ENTER);
      }



    @AfterEach
    public void afterEach(){
        String resultNumber=driver.findElement(By.xpath("//aside[@class='title']")).getText();
        System.out.println(filmAd+" filmi ile ilgili bulunan sonuç sayısı bilgisi aşağıdaki gibidir:\n"+resultNumber);
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
