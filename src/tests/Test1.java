package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework.TestBase;

public class Test1 {

	public class Test01 extends TestBase {

		@Test
		public void testLink() throws Exception {
			getDriver().get("http://facebook.com");
			WebElement textBox = getDriver().findElement(
					By.xpath("//input[@value='Your Email']"));
			textBox.click();
			textBox.sendKeys("Just a test!");
			Thread.sleep(2000);
		}
	}

}
