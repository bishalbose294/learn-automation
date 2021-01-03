package com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.MatcherAssert.assertThat;

public class QuestionsPage {
	
	private String q1Dropdown1Locator = ".//select[@id='interaction_response_4']";
	private By q1Dropdown1By = By.xpath(q1Dropdown1Locator);
	private Select q1Dropdown1Element = null;
	
	private String q1Dropdown2Locator = ".//select[@id='interaction_response_1']";
	private By q1Dropdown2By = By.xpath(q1Dropdown2Locator);
	private Select q1Dropdown2Element = null;
	
	private String q1Dropdown3Locator = ".//select[@id='interaction_response_2']";
	private By q1Dropdown3By = By.xpath(q1Dropdown3Locator);
	private Select q1Dropdown3Element = null;
	
	private String q1Dropdown4Locator = ".//select[@id='interaction_response_3']";
	private By q1Dropdown4By = By.xpath(q1Dropdown4Locator);
	private Select q1Dropdown4Element = null;
	
	private String tutorialCloseButtonLocator = ".//button[contains(@class,'hopscotch-bubble-close')]";
	private By tutorialCloseButtonBy = By.xpath(tutorialCloseButtonLocator);
	private WebElement tutorialCloseButtonElement = null;
	
	private String reviewButtonInactiveLocator = ".//button[@aria-label='Review']";
	private By reviewButtonInactiveBy = By.xpath(reviewButtonInactiveLocator);
	private WebElement reviewButtonInactiveElement = null;
	
	private String reviewButtonActiveLocator = ".//button[@aria-label='Review' and contains(@class,'active')]";
	private By reviewButtonActiveBy = By.xpath(reviewButtonActiveLocator);
	private WebElement reviewButtonActiveElement = null;
	
	private String currentQuestionStateLocator = ".//div[contains(@aria-label,'current item')]";
	private By currentQuestionStateBy = By.xpath(currentQuestionStateLocator);
	private WebElement currentQuestionStateElement = null;
	
	private String visibilityLocator = ".//span[@class='circle-sprite']";
	private By visibilityBy = By.xpath(visibilityLocator);
	private WebElement visibilityElement = null;
	
	private String questionNumberLocator = ".//div[contains(@aria-label,'answered')]";
	private By questionNumberBy = By.xpath(questionNumberLocator);
	private List<WebElement> questionNumberElement = null;
	
	private String q5Dropdown1Locator = ".//select[@id='interaction_RESPONSE']";
	private By q5Dropdown1By = By.xpath(q5Dropdown1Locator);
	private Select q5Dropdown1Element = null;
	
	private String q5Dropdown2Locator = ".//select[@id='interaction_RESPONSE1']";
	private By q5Dropdown2By = By.xpath(q5Dropdown2Locator);
	private Select q5Dropdown2Element = null;
	
	private String q5Blank1Locator = ".//span[@id='foo']";
	private By q5Blank1By = By.xpath(q5Blank1Locator);
	private WebElement q5Blank1Element = null;
	
	private String q5Blank2Locator = ".//div[@id='sign']";
	private By q5Blank2By = By.xpath(q5Blank2Locator);
	private WebElement q5Blank2Element = null;
	
	private String q14CheckboxLocator = ".//input[@name='group_RESPONSE']";
	private By q14CheckboxBy = By.xpath(q14CheckboxLocator);
	private List<WebElement> q14CheckboxElement = null;
	
	private String nextButtonLocator = ".//button[@id='btnNext']";
	private By nextButtonBy = By.xpath(nextButtonLocator);
	private WebElement nextButtonElement = null;
	
	private String q2Dropdown1Locator = ".//select[@id='interaction_RESPONSE']";
	private By q2Dropdown1By = By.xpath(q2Dropdown1Locator);
	private Select q2Dropdown1Element = null;
	
	private String q2Dropdown2Locator = ".//select[@id='interaction_RESPONSE1']";
	private By q2Dropdown2By = By.xpath(q2Dropdown2Locator);
	private Select q2Dropdown2Element = null;
	
	private String q2Dropdown3Locator = ".//select[@id='interaction_RESPONSE2']";
	private By q2Dropdown3By = By.xpath(q2Dropdown3Locator);
	private Select q2Dropdown3Element = null;
	
	private String q2Dropdown4Locator = ".//select[@id='interaction_RESPONSE3']";
	private By q2Dropdown4By = By.xpath(q2Dropdown4Locator);
	private Select q2Dropdown4Element = null;
	
	private String q2Dropdown5Locator = ".//select[@id='interaction_RESPONSE5']";
	private By q2Dropdown5By = By.xpath(q2Dropdown5Locator);
	private Select q2Dropdown5Element = null;
	
	private String q2Dropdown6Locator = ".//select[@id='interaction_RESPONSE6']";
	private By q2Dropdown6By = By.xpath(q2Dropdown6Locator);
	private Select q2Dropdown6Element = null;
	
	private String q3DropdownLocator = ".//button[@id='btn_interaction_RESPONSE']";
	private By q3DropdownBy = By.xpath(q3DropdownLocator);
	private WebElement q3DropdownElement = null;
	
	private String q3Dropdownoption2Locator = ".//ul[@class='dropdown-menu inner selectpicker']//li[@rel='2']";
	private By q3Dropdownoption2By = By.xpath(q3Dropdownoption2Locator);
	private WebElement q3Dropdownoption2Element = null;
	
	private String q4Dropdown1Locator = ".//button[@id='btn_interaction_RESPONSE']";
	private By q4Dropdown1By = By.xpath(q4Dropdown1Locator);
	private WebElement q4Dropdown1Element = null;
	
	private String q4Dropdown1option2Locator = ".//ul[@class='dropdown-menu inner selectpicker']//li[@rel='2']";
	private By q4Dropdown1option2By = By.xpath(q4Dropdown1option2Locator);
	private WebElement q4Dropdown1option2Element = null;
	
	private String q4Dropdown2Locator = ".//button[@id='btn_interaction_RESPONSE_3']";
	private By q4Dropdown2By = By.xpath(q4Dropdown2Locator);
	private WebElement q4Dropdown2Element = null;
	
	private String q4Dropdown2option2Locator = ".//ul[@class='dropdown-menu inner selectpicker']//li[@rel='2']//img[@id='IMG_M02422_B']";
	private By q4Dropdown2option2By = By.xpath(q4Dropdown2option2Locator);
	private WebElement q4Dropdown2option2Element = null;
	
	private String q6Radiobutton1Locator = ".//input[@id='choice_c2e47']";
	private By q6Radiobutton1By = By.xpath(q6Radiobutton1Locator);
	private WebElement q6Radiobutton1Element = null;
	
	private String q6Radiobutton2Locator = ".//input[@id='choice_5e59c']";
	private By q6Radiobutton2By = By.xpath(q6Radiobutton2Locator);
	private WebElement q6Radiobutton2Element = null;
	
	private String q7GlossaryLocator = ".//span[@id='plugin7b94d']";
	private By q7GlossaryBy = By.xpath(q7GlossaryLocator);
	private WebElement q7GlossaryElement = null;
	
	private String q7Radio1Locator = ".//input[@id='choice_RESPONSE_A']";
	private By q7Radio1By = By.xpath(q7Radio1Locator);
	private WebElement q7Radio1Element = null;
	
	private String q7RadioplayLocator = "(.//div[@class='jw-icon jw-icon-inline jw-button-color jw-reset jw-icon-playback'])[3]";
	private By q7RadioplayBy = By.xpath(q7RadioplayLocator);
	private WebElement q7RadioplayElement = null;
	
	private String q7Radio2Locator = ".//input[@id='choice_73e6d']";
	private By q7Radio2By = By.xpath(q7Radio2Locator);
	private WebElement q7Radio2Element = null;
	
	public void selectValueOfQuestion1DropDown1ByIndex(WebDriver driver, int index)
	{
		q1Dropdown1Element = new Select (driver.findElement(q1Dropdown1By));
		q1Dropdown1Element.selectByIndex(index);
		System.out.println("q1Dropdown1Element:- "+q1Dropdown1Element.getFirstSelectedOption().getText());
	}
	
	public void selectValueOfQuestion1DropDown2ByIndex(WebDriver driver, int index)
	{
		q1Dropdown2Element = new Select (driver.findElement(q1Dropdown2By));
		q1Dropdown2Element.selectByIndex(index);
	}
	
	public void selectValueOfQuestion1DropDown3ByIndex(WebDriver driver, int index)
	{
		q1Dropdown3Element = new Select (driver.findElement(q1Dropdown3By));
		q1Dropdown3Element.selectByIndex(index);
	}
	
	public void selectValueOfQuestion1DropDown4ByIndex(WebDriver driver, int index)
	{
		q1Dropdown4Element = new Select (driver.findElement(q1Dropdown4By));
		q1Dropdown4Element.selectByIndex(index);
	}
	
	public void tutorialCloseButtonClick(WebDriver driver)
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
		tutorialCloseButtonElement = driver.findElement(tutorialCloseButtonBy);
		tutorialCloseButtonElement.click();
	}
	
	/*public void reviewButtonClick(WebDriver driver)
	{
		reviewButtonInactiveElement = driver.findElement(reviewButtonInactiveBy);
		reviewButtonInactiveElement.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}*/
	
	public void openReviewDropdown(WebDriver driver)
	{
		try {
			reviewButtonActiveElement = driver.findElement(reviewButtonActiveBy);
		} catch (Exception e) {
			reviewButtonInactiveElement = driver.findElement(reviewButtonInactiveBy);
		    reviewButtonInactiveElement.click();
		    try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				
				e.printStackTrace();
			}
		}
	}

	public void closeReviewDropdown(WebDriver driver)
	{
		try {
			reviewButtonInactiveElement = driver.findElement(reviewButtonInactiveBy);
		} catch (Exception e) {
			reviewButtonActiveElement = driver.findElement(reviewButtonActiveBy);
			reviewButtonActiveElement.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				
				e.printStackTrace();
			}
		}
	
	}
    public void currentQuestionStateCheck(WebDriver driver) {
		currentQuestionStateElement = driver.findElement(currentQuestionStateBy);
		visibilityElement = currentQuestionStateElement.findElement(visibilityBy);
		if(visibilityElement.getAttribute("style").contains("hidden"))
		{
	    System.out.println("Item is answered");
		}
        else
        {
	    System.out.println("Item is not answered");
        }
	}
    
    public void questionNumberClick(WebDriver driver, int question)
    {
    	/*Method1:-*/
    	questionNumberElement = driver.findElements(questionNumberBy);
    	questionNumberElement.get(question-1).click();
    	
    	
    	/*Method2:-
    	 for(int i=0; i<=questionNumberElement.size(); i++)
    	{
    		if(questionNumberElement.get(i).getText().contains("Question " + question))
    		{
    		   questionNumberElement.get(i).click();
    		}
    	}*/
    	
    	/*Method3:-
    	 String dynaXpath = ".//div[contains(text(),'Question #')]";
    	dynaXpath.replace("#", "" +question);*/
    	
    	/*Method4:-
    	 String dynaXpath = "(.//div[contains(@aria-label,'answered')])";
    	dynaXpath = dynaXpath+"["+question+"]";*/
    }
    
    public void selectValueOfQuestion5DropDown1ByIndex(WebDriver driver, int index)
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
    	q5Dropdown1Element = new Select(driver.findElement(q5Dropdown1By));
    	q5Dropdown1Element.selectByIndex(index);
    	System.out.println("Value of selected option from dropdown 1 is:- " +q5Dropdown1Element.getOptions().get(index).getText());
    	//System.out.println("q5Dropdown1Element:- "+q5Dropdown1Element.getFirstSelectedOption().getText());
    }
    
    public void selectValueOfQuestion5DropDown2ByIndex(WebDriver driver, int index)
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
    	q5Dropdown2Element = new Select(driver.findElement(q5Dropdown2By));
    	q5Dropdown2Element.selectByIndex(index);
    	System.out.println("Value of selected option from dropdown 2 is:- " +q5Dropdown2Element.getOptions().get(index).getText());
    	//System.out.println("q5Dropdown2Element:- "+q5Dropdown2Element.getFirstSelectedOption().getText());
    }
    
    public void q5Blank1AnswerCheck(WebDriver driver)
    {
    	q5Blank1Element = driver.findElement(q5Blank1By);
    	String blank1Text = q5Blank1Element.getText();
    	String spaceText = "&nbsp";
    	if(blank1Text.equalsIgnoreCase(spaceText))
    	{
    		System.out.println("Blank 1 is empty" +blank1Text);
    	}
    	else
    	{
    		System.out.println("Value of Blank 1 is:- " +blank1Text);
    	}
    }
    
    public void verifyDropdown1AndBlankValues1Match(WebDriver driver)
    {
    	q5Blank1Element = driver.findElement(q5Blank1By);
    	String blank1Text = q5Blank1Element.getText();
    	//String spaceText = "&nbsp";
    	q5Dropdown1Element = new Select(driver.findElement(q5Dropdown1By));
    	String dropdownText = q5Dropdown1Element.getFirstSelectedOption().getText();
    	if(blank1Text.equalsIgnoreCase(dropdownText))
    	{
    		assertThat("Checking Dropdown Text",blank1Text.equalsIgnoreCase(dropdownText));
    	}
    	else if(blank1Text.trim().isEmpty() && dropdownText.contains("Choose"))
    	{
    		assertThat("Checking blanks", true);
    	}
    	else
    	{
    		assertThat("Checking Dropdown Text",blank1Text.equalsIgnoreCase(dropdownText));
    	}
    }
    
    public void q5Blank2AnswerCheck(WebDriver driver)
    {
    	q5Blank2Element = driver.findElement(q5Blank2By);
    	String blank2Text = q5Blank2Element.getText();
    	String spaceText = "&nbsp";
    	if(blank2Text.equalsIgnoreCase(spaceText))
    	{
    		System.out.println("Blank 2 is empty" +blank2Text);
    	}
    	else
    	{
    		System.out.println("Value of Blank 2 is:- " +blank2Text);
    	}
    
	}
    
    public void verifyDropdown2AndBlankValues2Match(WebDriver driver)
    {
    	q5Blank2Element = driver.findElement(q5Blank2By);
    	String blank2Text = q5Blank2Element.getText();
    	//String spaceText = "&nbsp";
    	q5Dropdown2Element = new Select(driver.findElement(q5Dropdown2By));
    	String dropdownText = q5Dropdown2Element.getFirstSelectedOption().getText();
    	if(blank2Text.equalsIgnoreCase(dropdownText))
    	{
    		assertThat("Checking Dropdown Text",blank2Text.equalsIgnoreCase(dropdownText));
    	}
    	else if(blank2Text.trim().isEmpty() && dropdownText.contains("Choose"))
    	{
    		assertThat("Checking blanks", true);
    	}
    	else
    	{
    		assertThat("Checking Dropdown Text",blank2Text.equalsIgnoreCase(dropdownText));
    		
    	}
    }
    
    public void q14CheckboxClicks(WebDriver driver, int num)
    {
    	q14CheckboxElement = driver.findElements(q14CheckboxBy);
    	for (int i=0; i<num; i++)
    	{
    		q14CheckboxElement.get(i).click();
    	}

    }
    
    public void nextButtonClick(WebDriver driver)
    {
    	nextButtonElement = driver.findElement(nextButtonBy);
    	nextButtonElement.click();
    }
    
    public void selectValueOfQuestion2DropDown1ByIndex(WebDriver driver, int index)
    {
    	q2Dropdown1Element = new Select(driver.findElement(q2Dropdown1By));
    	q2Dropdown1Element.selectByIndex(index);
    }
    
    public void selectValueOfQuestion2DropDown2ByIndex(WebDriver driver, int index)
    {
    	q2Dropdown2Element = new Select(driver.findElement(q2Dropdown2By));
    	q2Dropdown2Element.selectByIndex(index);
    }
    
    public void selectValueOfQuestion2DropDown3ByIndex(WebDriver driver, int index)
    {
    	q2Dropdown3Element = new Select(driver.findElement(q2Dropdown3By));
    	q2Dropdown3Element.selectByIndex(index);
    }
    
    public void selectValueOfQuestion2DropDown4ByIndex(WebDriver driver, int index)
    {
    	q2Dropdown4Element = new Select(driver.findElement(q2Dropdown4By));
    	q2Dropdown4Element.selectByIndex(index);
    }
    
    public void selectValueOfQuestion2DropDown5ByIndex(WebDriver driver, int index)
    {
    	q2Dropdown5Element = new Select(driver.findElement(q2Dropdown5By));
    	q2Dropdown5Element.selectByIndex(index);
    }
    
    public void selectValueOfQuestion2DropDown6ByIndex(WebDriver driver, int index)
    {
    	q2Dropdown6Element = new Select(driver.findElement(q2Dropdown6By));
    	q2Dropdown6Element.selectByIndex(index);
    }
    
    public void chooseValueOfQuestion3DropDown(WebDriver driver)
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
    	q3DropdownElement = driver.findElement(q3DropdownBy);
    	q3DropdownElement.click();
    	
    }
    
    public void chooseValueOfQuestion3DropDownOption2(WebDriver driver)
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
    	q3Dropdownoption2Element = driver.findElement(q3Dropdownoption2By);
    	q3Dropdownoption2Element.click();
    	
    }
    
    public void chooseValueOfQuestion4DropDown1(WebDriver driver)
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
    	q4Dropdown1Element = driver.findElement(q4Dropdown1By);
    	q4Dropdown1Element.click();
    }
    
    public void chooseValueOfQuestion4DropDown1Option2(WebDriver driver)
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
    	q4Dropdown1option2Element = driver.findElement(q4Dropdown1option2By);
    	q4Dropdown1option2Element.click();
    	
    }
    
    public void chooseValueOfQuestion4DropDown2(WebDriver driver)
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
    	q4Dropdown2Element = driver.findElement(q4Dropdown2By);
    	q4Dropdown2Element.click();
    }
    
    public void chooseValueOfQuestion4DropDown2Option2(WebDriver driver)
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			
			ie.printStackTrace();
		}
    	q4Dropdown2option2Element = driver.findElement(q4Dropdown2option2By);
    	q4Dropdown2option2Element.click();
    }
    
    public void q6RadioButtonsChoose(WebDriver driver)
    {
    	q6Radiobutton1Element = driver.findElement(q6Radiobutton1By);
    	q6Radiobutton1Element.click();
    	q6Radiobutton2Element = driver.findElement(q6Radiobutton2By);
    	q6Radiobutton2Element.click();
    }
    
    
    
    
    
    
    
    
}
	

		
	


