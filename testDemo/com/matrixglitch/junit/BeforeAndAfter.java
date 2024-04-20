package com.matrixglitch.junit;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BeforeAndAfter {
    @BeforeAll
    static void test1(){
        System.out.println("beforeAll");
    }

    @BeforeEach
    void test2(){
        System.out.println("before each");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

     @Test
    public void test4(){
        System.out.println("test4");
    }

    @AfterAll
    static void test5(){
        System.out.println("After All");
    }

    @AfterEach
    void test6(){
        System.out.println("After each");
    }
}
