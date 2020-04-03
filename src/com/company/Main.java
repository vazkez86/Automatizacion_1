package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Seat");
        //En esta linea debes modificar la ruta donde esté instalado el chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vazke\\Desktop\\selenium_prueba\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.zatro.es");
        try {

            //click en botón buscar
            driver.findElement(By.xpath("//div[@id=\"page\"]//span[contains(text(),'Buscar')]")).click();
            //click en botón búsquedal
            WebElement txtFirstName = driver.findElement(By.xpath("//*[@id=\"new-fBusqueda\"]/input "));
            //introducimos Adidas
            txtFirstName.sendKeys("Adidas");
            Thread.sleep(1500);
            //Click en BUSCAR
            driver.findElement(By.xpath("//*[@id=\"new-fBusqueda\"]/button[@value=\"BUSCAR\"]")).click();

                /*
                Los siguientes puntos de la prueba:
                3. Search for adidas
                4. Click the second item
                No encuentran nada en el buscador, así que para seleccionar un zapato he echo click en Mujer/ cerrar pop up / seleccionar la segunda opción
                */
            //click en Mujer
            driver.findElement(By.xpath("//div[@id=\"page\"]//span[contains(text(),'Mujer')]")).click();
            Thread.sleep(1500);

            //click segundo zapato
            driver.findElement(By.xpath("//*[@id=\"product8180\"]/div/div/a[2] ")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Abrimos desplegable de tallas
            driver.findElement(By.xpath("//*[@id=\"page\"]//div[4]/div[2]/button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //selecciona talla 36 del zapato
            driver.findElement(By.xpath("//*[@id=\"page\"]//ul//span[contains(text(),'36')]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Añadimos zapato a la cesta
            driver.findElement(By.xpath("//*[@id=\"page\"]//div[5]/button[text()='Añadir a la cesta']")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Cerramos para seleccionar otra talla
            driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div[5]/div[1]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Abrimos desplegable de tallas
            driver.findElement(By.xpath("//*[@id=\"page\"]//div[4]/div[2]/button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //selecciona talla 39 del zapato
            driver.findElement(By.xpath("//*[@id=\"page\"]//ul//span[contains(text(),'39')]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Añadimos zapato a la cesta
            driver.findElement(By.xpath("//*[@id=\"page\"]//div[5]/button[text()='Añadir a la cesta']")).click();
            Thread.sleep(1500);

            //Click en tramitar pedido
            driver.findElement(By.xpath("//*[@id=\"carrito\"]/div/div/a[contains(text(),'Tramitar pedido')]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Click en mi cesta
            driver.findElement(By.xpath("//*[@id=\"page\"]//span[contains(text(),'Cesta')]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            Thread.sleep(1500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }
}

