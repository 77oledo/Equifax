package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class advantage  {
    public static WebDriver driver;
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Cristian Toledo\\Equifax\\src\\test\\Resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void openURL() {
        driver.get("http://advantageonlineshopping.com/");
        System.out.println("Abrir URL OK");
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
    }


    public void select_items() {
        driver.findElement(By.xpath("//article[@id=\'our_products\']/div[2]/div/div[2]")).click();
        System.out.println("Categoria Tablets Seleccionada");
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
    }

    public void select_items_detail(){
        driver.findElement(By.cssSelector("ul > .ng-scope:nth-child(1)")).click();
        System.out.println("Detalle Seleccionado");
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
    }

    public void add_item(){
        driver.findElement(By.xpath("//div[@id=\'productProperties\']/div[4]/button")).click();
        System.out.println("Agregado al Carro de compras");
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
    }
    public void validate_shopping_cart(){
        driver.findElement(By.id("menuCart")).click();
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        if(driver.findElement(By.xpath("//div[@id='shoppingCart']/table/tbody/tr/td[2]")).isDisplayed()) {
            System.out.println("Carro de Compra OK");
        } else {
            System.out.println("Carro de Compra NOK");
        }


    }
    public void login()    {
        driver.findElement(By.id("checkOutButton")).click();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.findElement(By.name("usernameInOrderPayment")).sendKeys("77oledo");
        driver.findElement(By.name("passwordInOrderPayment")).sendKeys("Equifax.2021");
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        driver.findElement(By.id("login_btnundefined")).click();
        driver.manage().timeouts().implicitlyWait( 5 , TimeUnit.SECONDS);
        System.out.println("Login OK");

    }
    public void pago() {
        driver.findElement(By.xpath("//div[@id='userSection']/div/div[3]/button")).click();
        System.out.println("boton next OK");
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        driver.findElement(By.name("safepay_username")).clear();
        driver.findElement(By.name("safepay_username")).sendKeys("345776557");
        driver.findElement(By.name("safepay_password")).clear();
        driver.findElement(By.name("safepay_password")).sendKeys("Qa45");
        driver.manage().timeouts().implicitlyWait( 30 , TimeUnit.SECONDS);
        driver.findElement(By.id("pay_now_btn_SAFEPAY")).click();
        System.out.println("pago realizado");
        driver.manage().timeouts().implicitlyWait( 5 , TimeUnit.SECONDS);
    }

    public void validar_commpra() {
        if(driver.findElement(By.id("trackingNumberLabel")).isDisplayed()) {
            System.out.println("Compra OK");
        } else {
            System.out.println("Compra NOK");
        }
    }
    public void closeTheBrowser() {
        driver.quit();
    }


}
