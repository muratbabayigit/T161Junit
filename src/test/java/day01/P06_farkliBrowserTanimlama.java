package day01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class P06_farkliBrowserTanimlama {
    static WebDriver driver;

    //seleniumun desteklediği chrome, firefox, edge, safari dışındaki
    // farklı bir browser kullanmak istersek
    //önce onu tanımlamamızın içine dahil edeceğiz
    /*
            Bunun için https://www.babayigit.net/test sayfasına gidip
            info form butonuna tıklayıp
            formu doldurup save now butonuna tıklayıp
            sonucu yazdırın
     */

    @BeforeEach
    public void setup() {
        ChromeOptions options=new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test(){
        driver.get("https://www.babayigit.net/test");
        driver.findElement(By.xpath("//*[@alt='Info']")).click();
        driver.findElement(By.id("firstName")).sendKeys("Murat");
        driver.findElement(By.id("lastName")).sendKeys("Yiğit");
        driver.findElement(By.id("email")).sendKeys("babayigit@babayigit.net");
        driver.findElement(By.id("phone")).sendKeys("905888887766");
        driver.findElement(By.id("age")).sendKeys("45");
        driver.findElement(By.id("occupation")).sendKeys("Educator"+ Keys.TAB+Keys.TAB);
        driver.findElement(By.id("male")).click();
        driver.findElement(By.id("city")).sendKeys("İstanbul"+Keys.TAB);
        driver.findElement(By.id("country")).sendKeys("Turkiye"+Keys.TAB+Keys.TAB+Keys.TAB);
        driver.findElement(By.xpath("//*[@src='img/save.png']")).click();
        System.out.println("\n"+driver.findElement(By.id("resultMessage")).getText());
    }
}
