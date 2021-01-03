package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XPathAxes {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/P7110968/eclipse-workspace/AutomationProject/Xpathaxes.html");
		
		WebElement contextNode = driver.findElement(By.xpath("//div[@class='Mammal']"));
		System.out.println("Context Node: " + contextNode.getAttribute("class"));
	
		List<WebElement> ancestorNode1 = driver.findElements(By.xpath(".//div[@class='Mammal']/ancestor::div"));
		for(WebElement element:ancestorNode1) {
			System.out.println("Ancestor Node Xpath1: " +element.getAttribute("class"));
		}
		
		WebElement ancestorNode2 = driver.findElement(By.xpath(".//div[@class='Mammal']/ancestor::div[@class='Vertebrate']"));
		System.out.println("Ancestor Node Xpath2: " +ancestorNode2.getAttribute("class"));
		
		WebElement ancestorNode3 = driver.findElement(By.xpath(".//div[@class='Mammal']/ancestor::div/h2[text()='Animal']"));
		System.out.println("Ancestor Node Xpath3: " +ancestorNode3.getText());
		
		List<WebElement> ancestorOrSelfNode = driver.findElements(By.xpath(".//div[@class='Mammal']/ancestor-or-self::div"));
		for(WebElement element1:ancestorOrSelfNode) {
			System.out.println("Ancestor or Self Node: " +element1.getAttribute("class"));
		}
		
		List<WebElement> childNode1 = driver.findElements(By.xpath(".//div[@class='Mammal']/child::div"));
		for(WebElement element2:childNode1) {
			System.out.println("Child Node Xpath1: " +element2.getAttribute("class"));
		}
		
		WebElement childNode2 = driver.findElement(By.xpath(".//div[@class='Mammal']/child::div[@class='Herbivore']"));
		System.out.println("Child Node Xpath2: " +childNode2.getAttribute("class"));
		
		List<WebElement> descendantNode = driver.findElements(By.xpath(".//div[@class='Animal']/descendant::div"));
		for(WebElement element3:descendantNode) {
			System.out.println("Descendant Node: " +element3.getAttribute("class"));
		}
		
		List<WebElement> descendantOrSelfNode = driver.findElements(By.xpath(".//div[@class='Animal']/descendant-or-self::div"));
		for(WebElement element4:descendantOrSelfNode) {
			System.out.println("Descendant or Self Node: " +element4.getAttribute("class"));
		}
		
		List<WebElement> followingNode = driver.findElements(By.xpath(".//div[@class='Mammal']/following::div"));
		for(WebElement element5:followingNode) {
			System.out.println("Following Node: " +element5.getAttribute("class"));
		}
		
		WebElement followingSiblingNode = driver.findElement(By.xpath(".//div[@class='Mammal']/following-sibling::div"));
		System.out.println("Following Sibling Node: " +followingSiblingNode.getAttribute("class"));
		
		List<WebElement> precedingNode = driver.findElements(By.xpath(".//div[@class='Invertebrate']/preceding::div"));
		for(WebElement element6:precedingNode) {
			System.out.println("Preceding Node: " +element6.getAttribute("class"));
		}
		
		WebElement precedingSiblingNode = driver.findElement(By.xpath(".//div[@class='Invertebrate']/preceding-sibling::div"));
		System.out.println("Preceding Sibling Node: " +precedingSiblingNode.getAttribute("class"));
		
		WebElement parentNode1 = driver.findElement(By.xpath(".//div[@class='Mammal']/parent::div"));
		System.out.println("Parent Node Xpath1: " +parentNode1.getAttribute("class"));
		
		WebElement selfNode = driver.findElement(By.xpath(".//div[@class='Mammal']/self::div"));
		System.out.println("Self Node: " +selfNode.getAttribute("class"));
		
		driver.quit();
	}
}
