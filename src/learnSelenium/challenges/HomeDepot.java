package learnSelenium.challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeDepot {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hafiz\\IDEA Project\\javaPractice\\seleniumFiles\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        int itemCounter = 0;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String[] selectedItems = {
                "P1819",
                "P1816",
                "DCD708C2"
        };

        driver.get("https://www.homedepot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='Shop_by_Category ']/div[4]/div/div/div/div[6]/a/img")).click();
        driver.findElement(By.xpath("//*[@id='column_thd_bf7a']/div/div/div/div/ul/li[4]/a")).click();
        Thread.sleep(4000);
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='product-pod__model']"));
        for (int i = 0; i < items.size(); i++) {
            String[] name = items.get(i).getText().split("#");
            String formattedName = name[1].trim();

            List<String> al = Arrays.asList(selectedItems);

            if (al.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='desktop product-pod']/div[4]/div[6]/div/button")).get(i).click();
                Thread.sleep(5000);
                driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='thd-overlay-frame']")));
                driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/header/div/div[2]/div/div[1]/a[1]")).click();
                Thread.sleep(5000);
                itemCounter++;

                if (itemCounter == selectedItems.length) {
                    break;
                }
            }

        }


    }
}
