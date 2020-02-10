package com.epam.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Data data=new Data();
    	Calculations cal=new Calculations(data);
        Presentation pr=new Presentation(cal,data);
        pr.choice();
    }
}
