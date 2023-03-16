package com.hrms.lib;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Manu extends Raj{
//@BeforeClass
	public void open()
	{
		System.setProperty("webdriver driver", "D:\\driver.chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		
		
	}
//@AfterClass
	
	public void close() 
	{
		driver.close();
	}
//@Test
	public void Login()
	{
		driver.findElement(By.name(login)).sendKeys(un);
		driver.findElement(By.name(password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
	}
	public void Logout()
	{
		driver.findElement(By.linkText(btn_logout)).click();
	}
	public void EnterFrames()
	{
		driver.switchTo().frame(Frame);
		System.out.println("enter in to frames");
	}
	public void ExitFrames()
	{
		driver.switchTo().defaultContent();
		
	}
	public void search()
	{
	driver.findElement(By.name(txt_search)).sendKeys(search);
	}
	//@Test
	public void Add()
	{
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(txt_code)).sendKeys(code);
		driver.findElement(By.name(txt_fname)).sendKeys(fname);
		driver.findElement(By.name(txt_lname)).sendKeys(Lname);
		driver.findElement(By.name(txt_Mname)).sendKeys(Mname);
		driver.findElement(By.name(txt_nick)).sendKeys(NickNmame);
		driver.findElement(By.xpath( file)).sendKeys(txtfile);
		
	}
public void save()
{
	driver.findElement(By.id(save_btn)).click();
}
public void searchfor()
{
	driver.findElement(By.id(txt_searchfor)).sendKeys(searchcode);
}
public void searchbtn()
{
	driver.findElement(By.xpath(btn_serach)).click();
}
public void radiobtn()
{
	driver.findElement(By.name(btn_click)).click();
}
public void Delete()
{
	driver.findElement(By.xpath(btn_detele)).click();
}
public void All()
{
	driver.findElement(By.name(click_all)).click();
}
}

