package day01;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class P01_notasyon {


    @Test
    @Order(5) @Disabled
    public void serpil(){
        System.out.println("Serpil");
    }

    @Test
    public void atilla(){
        System.out.println("Atilla");
    }

    @Test @Order(2)
    public void erkan(){
        System.out.println("Erkan");
    }

    @Test @Order(3)
    public void yusuf(){
        System.out.println("Yusuf");
    }
}
