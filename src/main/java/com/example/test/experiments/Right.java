package com.example.test.experiments;

public class Right {

    public static Left lookLeft = new Left();

    public String name = "Right";

    public static String bla = lookLeft.name;

    public Right()
    {
        System.out.println("RIGHT");
    }


}
