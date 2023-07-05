package com.example.test.experiments;

public class Left {

    public static Right lookRight = new Right();

    public String name = "Left";

    public static String bla = lookRight.name;

    public static Middle lookMiddle = new Middle();

    public Left()
    {
        System.out.println("LEFT");
        System.out.println(name);
    }





}
