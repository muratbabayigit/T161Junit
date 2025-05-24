package day01;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_LoginTest {
    static WebDriver driver;
    static WebElement login;
    static WebElement loginButton;
    static String loginResult;
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
        login=driver.findElement(By.xpath("//img[@alt='Login']"));
    }

    @AfterEach
    public void afterTest(){
        loginResult = driver.findElement(By.id("result")).getText();
        System.out.println(loginResult);
    }

    @Test
    public void test01(){

    }







}
