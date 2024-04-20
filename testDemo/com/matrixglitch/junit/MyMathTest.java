package com.matrixglitch.junit;
import com.matrix.math.MyMath;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    @Test
    public void test(){
        int [] nums = {1,2,3,4,5};
        MyMath math = new MyMath();
        int result = math.calculateSum(nums);
        System.out.println(result);
        int excepted = 15;
        assertEquals(excepted,result);
    }

    @BeforeEach
    public void test1(){
        int [] nums = {};
        MyMath math = new MyMath();
        int result = math.calculateSum(nums);
        System.out.println(result);
        int excepted = 0;
        assertEquals(excepted,result);
    }

}