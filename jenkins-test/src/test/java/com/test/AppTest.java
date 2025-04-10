package com.test;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSayHello() {
        App app = new App();
        Assert.assertEquals("Hello, Jenkins!", app.sayHello());
    }
}
