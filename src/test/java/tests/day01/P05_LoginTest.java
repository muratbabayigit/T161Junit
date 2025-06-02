package tests.day01;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class P05_LoginTest {
    static WebDriver driver;
    static WebElement login;
    static String loginResult;
    static WebElement loginButton;



       /*
        1-https://babayigit.net/test/ adresine gidin
        2-Login butonuna tıklayın
        3-Username kısmına “babayigit” yazdırın
        4-Password kısmına baba123 yazdırın
        5-Login butonuna tıklayın
        6-Pasword kısmına “Mb3471&” yazdırın.
        7-Login butonuna tıklayın
        8-Sayfayı kaptın
     */

    @BeforeAll
    public static void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterAll
    public static void tearDown(){driver.quit();}

    @BeforeEach
    public void beforeTest(){
        driver.get("https://babayigit.net/test/");
        login = driver.findElement(By.xpath("//img[@alt='Login']"));
        login.click();
    }

    @AfterEach
    public void afterTest(){
        loginResult = driver.findElement(By.id("result")).getText();
        System.out.println(loginResult);
    }

    @Test
    public void test01(){

        driver.findElement(By.id("username")).sendKeys("babayigit");
        driver.findElement(By.id("password")).sendKeys("baba123"+ Keys.TAB +Keys.ENTER);




    }
    @Test
    public void test02(){

        driver.findElement(By.id("username")).sendKeys("babayigit");
        driver.findElement(By.id("password")).sendKeys("Mb3471&"+ Keys.TAB +Keys.ENTER);


    }







}
