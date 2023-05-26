import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class MemoryPrediction extends SetUp{

    @Test
    public void MemoryPrediction() throws InterruptedException {
        driver.get("http://192.168.1.14:3000/");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("Memory Prediction"));

        //Tech
        driver.findElement(By.xpath("//div[@id='mui-component-select-tech']")).click();
        driver.findElement(By.xpath("//li[normalize-space()='12LPP']")).click();


        //Vendor
        driver.findElement(By.xpath("//div[@id='mui-component-select-vendor']")).click();
        driver.findElement(By.cssSelector("#menu-vendor")).click();
        driver.findElement(By.xpath("//li[@role='option']")).click();


        //MemType
        driver.findElement(By.xpath("//div[@id='mui-component-select-mem_type']")).click();
        driver.findElement(By.xpath("//li[normalize-space()='SRAM']")).click();


        //port
        driver.findElement(By.xpath("//div[@id='mui-component-select-port']")).click();
        driver.findElement(By.xpath("//li[normalize-space()='SP']")).click();

        //HD or HS
        driver.findElement(By.xpath("//div[@id='mui-component-select-hd_or_hs']")).click();
        driver.findElement(By.xpath("//li[normalize-space()='HSE']")).click();

        //VT Type
        driver.findElement(By.xpath("//div[@id='mui-component-select-vt_type']")).click();
        driver.findElement(By.xpath("//li[normalize-space()='RVT']")).click();

        //Words
        driver.findElement(By.xpath("//input[@id=':r3:']")).click();
        driver.findElement(By.xpath("//li[@id=':r3:-option-32']")).click();



        //Bits
        driver.findElement(By.xpath("//input[@id=':r7:']")).click();
        driver.findElement(By.xpath("//li[@id=':r7:-option-0']")).click();



        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[2]")).click();
      //driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[2]/div[1]/label[2]/span[2]")).click();
//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[2]/div[1]/label[2]/span[2]
        driver.findElement(By.xpath("//body/div[@id='root']/div[@class='bg-gray-50 min-h-screen']/div[@class='w-full gap-4 2xl:gap-8 h-[90vh] flex justify-between overflow-y-auto']/div[2]")).click();




         driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[10]/div[2]")).click();
         driver.findElement(By.xpath("//body/div[@id='root']/div[@class='bg-gray-50 min-h-screen']/div[@class='w-full gap-4 2xl:gap-8 h-[90vh] flex justify-between overflow-y-auto']/div[1]")).click();

         driver.findElement(By.xpath("//button[normalize-space()='Run']")).click();

         Thread.sleep(5000);
    }
}
