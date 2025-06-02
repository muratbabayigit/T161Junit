package tests.day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase_Each;

public class P02_CheckBoxAssert extends TestBase_Each {
    // https://demoqa.com/checkbox adresine gidin
    // Home menüsünü açın
    // Açılan Menüde ilk üç checkbox'ı işaretleyin
    // her üç checkbox'ında işaretli olduğunu doğrulayın

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");
        WebElement chckBox=driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']"));
        chckBox.click();
        WebElement chckBox2=driver.findElement(By.xpath("(//*[@class='rct-icon rct-icon-uncheck'])[2]"));
        chckBox2.click();

        WebElement chckBox3= driver.findElement(By.xpath("(//*[@class='rct-title'])[3]"));
        chckBox3.click();

        WebElement chckBox4= driver.findElement(By.xpath("(//*[@class='rct-title'])[4]"));
        chckBox4.click();

        WebElement result= driver.findElement(By.id("result"));
        Assertions.assertTrue(result.getText().contains("desktop"));
        Assertions.assertTrue(result.getText().contains("documents"));
        Assertions.assertTrue(result.getText().contains("download"));





    }



}
