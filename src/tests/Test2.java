package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework.TestBase;

public class Test2 extends TestBase {
	
	@Test
    public void testLink()throws Exception{
        getDriver().get("https://twitter.com");
        WebElement textBox = getDriver().findElement(By.xpath("//label[text()='Full name']"));
        textBox.click();
        textBox.sendKeys("Just another test!");
        Thread.sleep(2000);
    }

}
