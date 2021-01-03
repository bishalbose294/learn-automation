package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;
import com.pages.QuestionsPage;
import com.pages.StartTestPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ItemAnswer {
	
	private WebDriver driver;
	
	@Before
    public void open_a_browser() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 }
	
	@Given("^navigation to TestNav URL \"(.*)\"$")
    public void navigateToUrl(String url) {
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }
	
	
	@When("^perform login using username \"(.*)\" and password \"(.*)\"$")
    public void enter_username_and_password(String username, String password) {
      
		LoginPage loginPage = new LoginPage();
		loginPage.login(driver, username, password);
    }
	
	@And("^start the test$")
	public void start_test()
	{
		StartTestPage startTest = new StartTestPage();
		startTest.clickOnStartButton(driver);
		startTest.clickOnTermsAndConditionsCheckBox(driver);
		startTest.clickOnContinueButton(driver);
		startTest.clickOnStartSectionButton(driver);
	}
	
	@When("^I navigate to question (\\d+) from Review drop-down$")
	public void navigate_to_question(int question)
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.openReviewDropdown(driver);
		questionsPage.questionNumberClick(driver, question);
		questionsPage.closeReviewDropdown(driver);
	}
	
	@And("^select values from question dropdown indexes (\\d+), (\\d+), (\\d+), (\\d+)$")
	public void select_values(int index1, int index2, int index3, int index4)
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.tutorialCloseButtonClick(driver);
		questionsPage.selectValueOfQuestion1DropDown1ByIndex(driver, index1);
		questionsPage.selectValueOfQuestion1DropDown2ByIndex(driver, index2);
		questionsPage.selectValueOfQuestion1DropDown3ByIndex(driver, index3);
		questionsPage.selectValueOfQuestion1DropDown4ByIndex(driver, index4);
	}
	
	
	@And("^click on Next button$")
	public void click_next_button()
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.nextButtonClick(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@And("^scroll down the page$")
	public void page_scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "window.scrollTo(0, document.body.scrollHeight)";
		js.executeScript(script);
	}
	
	
	@And("^select values from question dropdown indexes (\\d+), (\\d+), (\\d+), (\\d+), (\\d+), (\\d+)$")
	public void select_values(int index1, int index2, int index3, int index4, int index5, int index6)
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.selectValueOfQuestion2DropDown1ByIndex(driver, index1);
		questionsPage.selectValueOfQuestion2DropDown2ByIndex(driver, index2);
		questionsPage.selectValueOfQuestion2DropDown3ByIndex(driver, index3);
		questionsPage.selectValueOfQuestion2DropDown4ByIndex(driver, index4);
		questionsPage.selectValueOfQuestion2DropDown5ByIndex(driver, index5);
		questionsPage.selectValueOfQuestion2DropDown6ByIndex(driver, index6);
	}
	
	@And("^select values from question3$")
	public void select_values_from_question()
	{
		
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.chooseValueOfQuestion3DropDown(driver);
		questionsPage.chooseValueOfQuestion3DropDownOption2(driver);
	}
	
	@And("^select values from question4$")
	public void select_values_from_question4()
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.chooseValueOfQuestion4DropDown1(driver);
		questionsPage.chooseValueOfQuestion4DropDown1Option2(driver);
		questionsPage.chooseValueOfQuestion4DropDown2(driver);
		questionsPage.chooseValueOfQuestion4DropDown2Option2(driver);
	}
	
	@And("^select values from question dropdown indexes (\\d+), (\\d+)$")
	public void select_values(int index1, int index2)
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.selectValueOfQuestion5DropDown1ByIndex(driver, index1);
		questionsPage.selectValueOfQuestion5DropDown2ByIndex(driver, index2);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Then("^check if blanks are filled$")
	public void check_if_blanks_filled()
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.verifyDropdown1AndBlankValues1Match(driver);
		questionsPage.verifyDropdown2AndBlankValues2Match(driver);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@And("^choose from the radio button options")
	public void choose_from_radio_button_options()
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.q6RadioButtonsChoose(driver);
	}
	
	@And("^check the checkboxes (\\d+)$")
	public void check_the_checkboxes(int num)
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.q14CheckboxClicks(driver, num);
	}
	
	@And("^click on Review question button$")
	public void click_review_button()
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.openReviewDropdown(driver);
	}
	
	@Then("^verify answer state for question$")
	public void verify_answer_state()
	{
		QuestionsPage questionsPage = new QuestionsPage();
		questionsPage.currentQuestionStateCheck(driver);
		questionsPage.closeReviewDropdown(driver);
	}
	
	
		
	@After
	public void driverclose() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
