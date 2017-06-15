package com.ifesdjeen;

import org.junit.Test;

public class StaticInitialisationTest {

    @Test
    public void initialisationTest() throws InterruptedException {
        System.out.println("ClassWithStaticFields.i1 = " + ClassWithStaticFields.i1);
        System.out.println("ClassWithStaticFields.i2 = " + ClassWithStaticFields.i2);
        System.out.println("ClassWithStaticFields.i3 = " + ClassWithStaticFields.i3);
        System.out.println("ClassWithStaticFields.b1 = " + ClassWithStaticFields.b1);
        System.out.println("==============================");
        Thread.sleep(1000);
        System.out.println("ClassWithStaticFields.m1 = " + ClassWithStaticFields.m1);
    }
}
