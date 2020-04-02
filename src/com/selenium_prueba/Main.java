package com.selenium_prueba;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.setProperty("webdriver.firefox.marionette","C:\\Users\\vazke\\Desktop\\curso java\\geckodriver1\\geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.zatro.es");
    }

}