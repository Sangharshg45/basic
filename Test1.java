package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		// System.setProperty("webdeiver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String Qspider = driver.getTitle();
		String Qspider1 = driver.getCurrentUrl();
		System.out.println(Qspider);
		System.out.println(Qspider1);
		
	}

}

