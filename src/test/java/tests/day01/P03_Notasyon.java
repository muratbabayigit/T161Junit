package tests.day01;

import org.junit.jupiter.api.*;

public class P03_Notasyon {

    @BeforeAll //Tüm testlerden önce bir kere çalışır
    public static void setup(){
        System.out.println("Test Prosesi Başlıyor\n");
    }

    @AfterAll //Tüm testler bitince bir kere çalışır
    public static void teraDown(){
        System.out.println("Tüm testlerin çalıştırılması tamamlanmıştır\n");
    }

    @BeforeEach //Her bir testten önce birer kere çalışır
    public void beforeEach(){
        System.out.println("Sıradaki test Çalıştırılıyor");
    }

    @AfterEach //Her testten sonra birer kere çalışır
    public void afterEach(){
        System.out.println("Bu test çalışması bitti. Sıradaki teste geçiliyor\n");
    }

    @Test
    public void test01(){
        System.out.println("Test - 1 Çalıştırılıyor.");
    }

   @Test
    public void test02(){
       System.out.println("Test - 2 Çalıştırılıyor");
   }

   @Test
    public void test03(){
       System.out.println("Test - 3 Çalıştırılıyor");
   }


}
