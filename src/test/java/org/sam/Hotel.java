package org.sam;





import java.io.IOException;
import java.util.List;

import org.main.BaseClassCurrent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
	public void tc2() throws IOException {
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
		
	}

	@Test
	public void tc3() {

		WebElement searchhotel = findLocatorByClassXpath("//h5[text()='Select Hotel']");
		String text2 = searchhotel.getText();
		System.out.println(text2);
		List<WebElement> elements = driver.findElements(By.tagName("h5"));
		for (WebElement i : elements) {
		String h = i.getText();
		System.out.println(h);
		}
		List<WebElement> elements2 = driver.findElements(By.tagName("strong"));
		for (WebElement price : elements2) {
			String u = price.getText(); 
			System.out.println(u);
			
			
		}
			
		
		WebElement book = findLocatorByClassXpath("//h5[text()='Hyatt Regency Chennai Deluxe']");
		String text14 = book.getText();
		System.out.println(text14);
		
		
		///		
		WebElement con = findLocatorByClassXpath("(//a[text()='Continue'])[1]");
		elementClick(con);
		clickAlert();
		
	}

	@Test
	public void tc4() throws IOException, InterruptedException {
		//WebElement cont = findLocatorByClassXpath("(//a[text()='Continue'])[1]");
		//elementClick(cont);
		Thread.sleep(4000);
		WebElement my = findLocatorById("own");
		elementClick(my);
		//clickJava(my);
		//String text15 = my.getText();
		//System.out.println(text15);
		WebElement salutation = findLocatorById("user_title");
		selectOptionByText(salutation, getCellData("Sheet1", 0, 12));
		WebElement firstname = findLocatorById("first_name");
		elementSendKeys(firstname, getCellData("Sheet1", 0, 13));
		WebElement lastname = findLocatorById("last_name");
		elementSendKeys(lastname, getCellData("Sheet1", 0, 14));
		WebElement mobile = findLocatorById("user_phone");
		elementSendKeys(mobile, getCellData("Sheet1", 0, 15));
		WebElement email = findLocatorById("user_email");
		elementSendKeys(email, getCellData("Sheet1", 0, 16));
		WebElement g = findLocatorById("gst");
		elementClick(g);
		WebElement regist = findLocatorById("gst_registration");
		elementSendKeys(regist, getCellData("Sheet1", 0, 17));
		WebElement company = findLocatorById("company_name");
		elementSendKeys(company, getCellData("Sheet1", 0, 18));
		WebElement address = findLocatorById("company_address");
		elementSendKeys(address, getCellData("Sheet1", 0, 19));
		Thread.sleep(6000);
		WebElement next = findLocatorById("step1next");
		//clickJava(next);
		elementClick(next);
		WebElement b = findLocatorById("bed");
		elementClick(b);
		WebElement box = findLocatorById("other_request");
		elementSendKeys(box, getCellData("Sheet1", 0, 20));
		Thread.sleep(6000);
		WebElement next1 = findLocatorByClassXpath("(//button[text()='Next'])[2]");
		elementClick(next1);
		WebElement payment = findLocatorByClassXpath("//h5[text()='Credit/Debit/ATM Card']");
		//selectOptionByText(payment, getCellData(getApplnTitle(), 0, 0))
		elementClick(payment);
		WebElement typepayment = findLocatorById("payment_type");
		selectOptionByText(typepayment, getCellData("Sheet1", 0, 21));
		WebElement cardtype = findLocatorById("card_type");
		selectOptionByText(cardtype, getCellData("Sheet1", 0, 22));
		WebElement cardno = findLocatorById("card_no");
		elementSendKeys(cardno, getCellData("Sheet1", 0, 23));
		WebElement cardname = findLocatorById("card_name");
		elementSendKeys(cardname, getCellData("Sheet1", 0, 24));
		WebElement month = findLocatorById("card_month");
		elementSendKeys(month, getCellData("Sheet1", 0, 25));
		WebElement year = findLocatorById("card_year");
		selectOptionByText(year, getCellData("Sheet1", 0, 26));
		WebElement cvv = findLocatorById("cvv");
		elementSendKeys(cvv, getCellData("Sheet1", 0, 27));
		WebElement submit = findLocatorById("submitBtn");
		elementClick(submit);
		WebElement orderno = findLocatorByClassXpath("//h2[@name='booking-code']//strong");
		String text16 = orderno.getText();
		System.out.println(text16);
		String s1="#CTXQR15747";
		String s2=s1.substring(1,11);
		System.out.println(s2);
		
		createCellAndSetCellData("Sheet1", 4, 0, s2);
		String s="#CTXQR15747 ,Booking is Confirmed ";
		String confirm=s.substring(12,33);
		System.out.println(confirm);
		WebElement hotelname = findLocatorByClassXpath("//strong[text()='Hyatt Regency Chennai']");
		String text18 = hotelname.getText();
		System.out.println(text18);

		WebElement mybook = findLocatorByClassXpath("//button[text()='My Booking']");
		elementClick(mybook);
		WebElement searchorder = findLocatorByName("search");
		insertEnter(searchorder, getCellData("Sheet1", 4, 0));

		WebElement id = findLocatorByClassXpath("//span[text()='#CTXQR15747']");
		String text20 = id.getText();
		System.out.println(text20);
		WebElement hotelname1 = findLocatorByClassXpath("//h5[text()='Hyatt Regency Chennai Deluxe']");
		String text21 = hotelname1.getText();
		System.out.println(text21);
		WebElement pricelist = findLocatorByClassXpath("//strong[text()='Rs 2,832']");

		String text22 = pricelist.getText();
		System.out.println(text22);
		WebElement edit = findLocatorByClassXpath("(//button[@type='submit'])[1]");
		elementClick(edit);
		WebElement date = findLocatorByName("check_in");
		elementClick(date);
		WebElement date1 = findLocatorByClassXpath("//a[text()='8']");
		elementClick(date1);
		WebElement confirm1 = findLocatorByClassXpath("//button[text()='Confirm']");
		elementClick(confirm1);
		WebElement success = findLocatorByClassXpath("//li[text()='Booking updated successfully']");
		String text23 = success.getText();
		System.out.println(text23);
		WebElement cancel = findLocatorByClassXpath("(//a[text()='Cancel'])[1]");
		// String text24 = cancel.getText();
		// System.out.println(text24);
		elementClick(cancel);
		clickAlert();
		WebElement id1 = findLocatorByClassXpath("//span[text()='#CTXQR15747']");
		String text25 = id1.getText();
		System.out.println(text25);
		WebElement hotelname2 = findLocatorByClassXpath("//h5[text()='Hyatt Regency Chennai Deluxe']");
		String text26 = hotelname2.getText();
		System.out.println(text26);
		WebElement pricelist1 = findLocatorByClassXpath("//strong[text()='Rs 2,832']");

		String text27 = pricelist1.getText();
		System.out.println(text27);
		WebElement cancelalert = findLocatorByClassXpath("//li[text()='Your booking cancelled successfully']");

		String text28 = cancelalert.getText();
		System.out.println(text28);
		Thread.sleep(10000);
		WebElement cancelorder1 = findLocatorByClassXpath("//span[text()='#CTXQR15747']");

	}

}
