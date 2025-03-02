package com.mycompany.mavenproject2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Mavenproject2Test {

    private Mavenproject2 student;

    @Before
    public void setUp() {
        student = new Mavenproject2("SV001", "Nguyen Van A", 20);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Test getName() failed", "Nguyen Van A", student.getName());
    }

    @Test
    public void testSetAge() {
        student.setAge(25);
        Assert.assertEquals("Test setAge() failed", 25, student.getAge());
    }

    @Test
    public void testUpdateName() {
        student.updateName("Tran Van B");
        Assert.assertEquals("Test updateName() failed", "Tran Van B", student.getName());
    }
}
