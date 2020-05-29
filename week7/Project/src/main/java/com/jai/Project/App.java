package com.jai.Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jai.Project.cam.Mobile;;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("C:\\Users\\jaima\\Desktop\\win2020\\sapient\\week7\\Project\\src\\main\\java\\beans\\ScreenContext.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("C:\\Users\\jaima\\Desktop\\win2020\\sapient\\week7\\Project\\src\\main\\java\\beans\\MobileContext.xml");
        ApplicationContext context3 = new ClassPathXmlApplicationContext("C:\\Users\\jaima\\Desktop\\win2020\\sapient\\week7\\Project\\src\\main\\java\\beans\\SpeakerContext.xml");

        Mobile mobile = (Mobile) context.getBean("Mobile");
        
        System.out.println(mobile);
    }
}
