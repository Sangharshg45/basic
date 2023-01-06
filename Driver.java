package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");		
	}

}
