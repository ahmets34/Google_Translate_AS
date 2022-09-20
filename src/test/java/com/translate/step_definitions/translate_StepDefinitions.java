package com.translate.step_definitions;

import com.translate.pages.translatePage;
import com.translate.utilities.BrowserUtil;
import com.translate.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class translate_StepDefinitions {
    translatePage translatePage= new translatePage();
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
    Actions builder = new Actions(Driver.getDriver());

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("https://translate.google.com/");


    }
    @When("user chose the german language")
    public void user_chose_the_german_language() {

        builder.moveToElement(translatePage.languageArrow).click(translatePage.languageArrow);
        builder.perform();
        builder.moveToElement(translatePage.germanLang).click(translatePage.germanLang);
        builder.perform();
        builder.moveToElement(translatePage.languageArrow2).click(translatePage.languageArrow2);
        builder.perform();
        builder.moveToElement(translatePage.spanishLang).click(translatePage.spanishLang);
        builder.perform();
        BrowserUtil.waitFor(2);





    }

    @And("user enters {string}")
    public void user_enters(String string) {
        translatePage.textArea.click();
        translatePage.textArea.sendKeys(string);
        BrowserUtil.waitFor(3);

    }
    @Then("user sees the verify {string}")
    public void user_sees_the_verify(String string) {
        Assert.assertEquals(string,translatePage.translatedWord.getText());

    }

    @Given("user swap the word")
    public void swap_the_word() {

        translatePage.swapButton.click();
        BrowserUtil.waitFor(2);

    }
    @Then("user sees the verify the swapped word {string}")
    public void user_sees_the_verify_the_swap_word(String string) {
        Assert.assertEquals(string,translatePage.translatedWord.getText());
    }

    @And("user click clear button")
    public void clear_button() {
        translatePage.clearButton.click();
    }

    @Given("user open the screen keyboard and enter Hi!")
    public void user_open_the_screen_keyboard_and_enter_hi() {


        translatePage.inputTool.click();
        translatePage.chooseKeyboard.click();
        translatePage.showKeyboard.click();
        translatePage.showKeyboard.click();
        translatePage.shiftButton.click();
        translatePage.hButton.click();
        translatePage.iButton.click();
        translatePage.shiftButton.click();
        translatePage.excButton.click();

    }

    @Then("verify the {string}")
    public void verify_the(String string) {
        Assert.assertEquals(string,translatePage.translatedWord.getText());
        Driver.closeDriver();
    }



}
