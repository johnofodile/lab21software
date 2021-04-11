package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    private String name1;
    private int age1;

   Person person=new Person("john",-19);
    @org.junit.Test
    public void getName() {
        String johnname="john";
        String getname=person.getName();
        Assert.assertEquals(johnname,getname);


    }

    @org.junit.Test
    public void getAge() {
        int rightanswer=0;
      int answer=  person.getAge();

      Assert.assertEquals(rightanswer,answer);

    }

    @org.junit.Test
    public void setName() {

    }

    @org.junit.Test
    public void setAge() {

    }

    @org.junit.Test
    public void reversename() {
        String name1="john";
        String reversedname=" nhoj";

        String test=person.reversename(name1);
        Assert.assertEquals(reversedname,test);


    }
}