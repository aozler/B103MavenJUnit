package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
public class P11_UploadFile extends TestBase {
    //https://demo.guru99.com/test/upload/ adresine gidiniz
    //Bilgisayarınızdan herhangi bir dosyayı upload ediniz
    // I accept terms of service bölümünü tikleyin
    // Submit File buttonuna basınız
    // "1 file has been successfully uploaded" görünür olduğunu test edin
    @Test
    public void name() throws InterruptedException {
        //https://demo.guru99.com/test/upload/ adresine gidiniz
        driver.get("https://demo.guru99.com/test/upload/");

//        WebElement ifrane = driver.findElement(By.xpath("//*[@class='faktor-iframe-wrapper']"));
//        driver.switchTo().frame(ifrane);
//        driver.findElement(By.xpath("//*[text()='Accept All']")).click();
//        driver.switchTo().defaultContent();
//        Thread.sleep(2000);

        //Bilgisayarınızdan herhangi bir dosyayı upload ediniz
        //""C:\Users\eeozl\Desktop\Interview Questions.txt"" //DOSYANIN GERÇEK YOLUNU ALIP GÖREBİLMEK BURAYA KOYDUK
        //String farkliKisim = System.getProperty("user.home");//C:\Users\Lenovo
        //String ortakYol = "\\OneDrive\\Masaüstü\\sen.txt";
        //String dosyaYolu = farkliKisim+ortakYol;
        String dosyaYolu = "C:\\Users\\eeozl\\Desktop\\Interview Questions.txt";
        WebElement dosyaSec = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
        dosyaSec.sendKeys(dosyaYolu);
        Thread.sleep(3000);


        // I accept terms of service bölümünü tikleyin
        // Submit File buttonuna basınız
        WebElement checkBox =  driver.findElement(By.xpath("//*[@id='terms']"));
        checkBox.click();
        checkBox.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);

        // "1 file has been successfully uploaded" görünür olduğunu test edin
        Thread.sleep(3000);
        assert driver.findElement(By.xpath("//*[@id='res']")).isDisplayed();
    }
}
