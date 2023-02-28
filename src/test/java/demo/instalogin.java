package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instalogin
{

	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.instagram.com/");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.name("username")).sendKeys("beingnitinyadav");
	       driver.findElement(By.name("password")).sendKeys("Quantum@24");
	       driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]")).click();
	       
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[1]/div/div/a/div/div[2]/div/div")).click();

	}

}
