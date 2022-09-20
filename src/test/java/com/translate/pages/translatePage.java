package com.translate.pages;

import com.translate.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class translatePage {
    public translatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@class='VfPpkd-Bz112c-RLmnJb'])[1]")
    public WebElement languageArrow;

    @FindBy(xpath = "(//div[@data-language-code='de'])[1]")
    public WebElement germanLang;

    @FindBy(xpath="(//div[text()='Spanish'][@class='Llmcnf'])[2]")
    public WebElement spanishLang;

    @FindBy(xpath = "(//div[@class='VfPpkd-Bz112c-RLmnJb'])[3]")
    public WebElement languageArrow2;

    @FindBy(xpath = "(//div[@class='VfPpkd-Bz112c-RLmnJb'])[2]")
    public WebElement swapButton;

    @FindBy(xpath = "//textarea[@aria-label='Source text']")
    public WebElement textArea;

    @FindBy(xpath = "(//div[@class='VfPpkd-Bz112c-RLmnJb'])[14]")
    public WebElement clearButton;

    @FindBy(xpath = "//span[@class='Q4iAWc']")
    public WebElement translatedWord;

    @FindBy(xpath="(//a[@role='button'])[4]")
    public WebElement inputTool;
    @FindBy(xpath="(//a[@role='button'])[4]")
    public WebElement showKeyboard;

    @FindBy(xpath = "//span[text()='US International']")
    public WebElement chooseKeyboard;

    @FindBy(xpath="(//button[@id='K16'])[1]")
    public WebElement shiftButton;

    @FindBy(xpath="//button[@id='K72']")
    public WebElement hButton;

    @FindBy(xpath="//button[@id='K73']")
    public WebElement iButton;

    @FindBy(xpath="//button[@id='K49']")
    public WebElement excButton;


}
