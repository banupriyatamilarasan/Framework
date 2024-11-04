package org.sam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.main.BaseClassCurrent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AscendingHotel extends BaseClassCurrent {
	public class Hotel extends BaseClassCurrent {
		@BeforeClass
		public void beforeClass() {
			launchChrome();
			url("https://www.omrbranch.com/");
			maximize();
			implicitWait();
		}

		@AfterClass
		public void afterClass() {
			// closeApplnWindow();
		}

		

		

		@Test
		public void tc2() throws IOException, InterruptedException {
			WebElement txtemail = findLocatorById("email");
			//System.out.println("Sample");
			elementSendKeys(txtemail, getCellData("Sheet1", 0, 0));
			WebElement txtpass = findLocatorById("pass");
			elementSendKeys(txtpass, getCellData("Sheet1", 0, 1));
			WebElement login = findLocatorByClassXpath("//button[text()='Login']");
			// elementSendKeys(login, getCellData("Sheet1", 0, 2));
			elementClick(login);
			WebElement welcome = findLocatorByClassXpath("//a[@data-testid=\"username\"]");
			String text = welcome.getText();
			System.out.println(text);
			WebElement state = findLocatorById("state");
			selectOptionByText(state, getCellData("Sheet1", 0, 2));
			WebElement city = findLocatorById("city");
			selectOptionByText(city, getCellData("Sheet1", 0, 3));
			WebElement roomtype = findLocatorByClassXpath("//textarea[@role='searchbox']");
			insertEnter(roomtype, getCellData("Sheet1", 0, 4));
			insertEnter(roomtype, getCellData("Sheet1", 0, 5));
			insertEnter(roomtype, getCellData("Sheet1", 0, 6));
			insertEnter(roomtype, getCellData("Sheet1", 0, 7));
			insertEnter(roomtype, getCellData("Sheet1", 0, 8));
			WebElement checkin = findLocatorByName("check_in");
			elementClick(checkin);
			WebElement date1 = findLocatorByClassXpath("//a[text()='6']");
			elementClick(date1);
			WebElement checkout = findLocatorByName("check_out");
			elementClick(checkout);
			WebElement date2 = findLocatorByClassXpath("//a[text()='8']");
			elementClick(date2);
			WebElement noofroom = findLocatorById("no_rooms");
			// elementClick(noofroom);
			selectOptionByText(noofroom, getCellData("Sheet1", 0, 9));
			WebElement adult = findLocatorById("no_adults");
			selectOptionByText(adult, getCellData("Sheet1", 0, 10));
			WebElement child = findLocatorById("no_child");

			elementSendKeys(child, getCellData("Sheet1", 0, 11));
			switchToFrameByIdOrName( "hotelsearch_iframe");
			WebElement search = findLocatorById("searchBtn");
			elementClick(search);
			switchToFrame();
			Thread.sleep(10000);
			WebElement low = findLocatorByClassXpath("//label[@for='value_pltoh']");
			elementClick(low);
			WebElement d = findLocatorById("hotellist");
			Thread.sleep(10000);
			List<Integer>dev=new ArrayList<>();
			List<Integer>qa=new ArrayList<>();
			List<WebElement> elements2 = driver.findElements(By.tagName("strong"));
			for (WebElement price : elements2) {
				String u = price.getText(); 
				System.out.println(u);
				//String s1="$ 2,596";
				String s = u.substring(1,7);
				System.out.println(s);
				//System.out.println(replace);
				 
			String p=s.replace("," ,"");
			//System.out.println(p);
			String trim=p.trim();
			System.out.println(trim);
			int number=Integer.parseInt(trim);
			dev.add(number);
			qa.addAll(dev);
			}
			Collections.sort(qa);
			System.out.println(qa);
			boolean b = qa.equals(dev);
			if(b)
			{
				System.out.println("ascending order");
			}
			else {
				System.out.println("Not");
			}
			
			
			List<String>dev1=new ArrayList<>();
			List<String>qa1=new ArrayList<>();
			List<WebElement> elements1 = driver.findElements(By.tagName("h5"));
			for (WebElement price2: elements1) {
				String u1 = price2.getText(); 
				System.out.println(u1);
				dev1.add(u1);
				qa1.addAll(dev1);
			}
				Collections.sort(qa1);
				
				System.out.println(qa1);
				boolean b1 = qa.equals(dev1);
				Collections.reverse(qa1);
				System.out.println(qa1);
				boolean c = qa1.equals(dev1);
				if(c) {
					System.out.println("Descending order");
					
				}
				else
				{
					System.out.println("Not");
				}
			}
				
			
				
				
			
			
			
			
		}




	}
	
