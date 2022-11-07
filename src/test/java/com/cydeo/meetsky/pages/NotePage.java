package com.cydeo.meetsky.pages;

import com.cydeo.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotePage {
    public NotePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label=\"Notes\"]")
    public WebElement notesModule;

    @FindBy(xpath = "//button[@id=\"notes_new_note\"]")
    public WebElement newNoteButton;

    @FindBy(xpath ="//pre[@class=\" CodeMirror-line \"]")
    public WebElement pageToWrite;


    @FindBy(xpath = "//button[@class=\"icon vue-button action-item__menutoggle icon-picture\"]")
    public WebElement uploadImageButton;

    @FindBy(xpath ="//span[.=\"Insert image\"]")

    //span[@class=\"action-button__text\"])[1]")
    //li[@class=\"action active\"]")
    //"(//button[@type=\"button\"])[1]")
    //span[@class=\"action-button__text\"]")
    //button[@class=\"action-button focusable\"]")
    public WebElement insertImageButton;

    @FindBy(xpath = "//td[@style=\"background-image:url(/index.php/core/preview.png?file=%2FNotes%2F%2Fe087b8b23a78f5f7ebcc9e9a622d2462.jpg&x=100&y=100)\"]")
    public WebElement imageRoot;

    @FindBy(xpath = "//button[@class=\"primary\"]")
    public WebElement chooseButton;

    @FindBy(xpath ="(//button[contains(@aria-controls,'menu-')])[4]")
    public WebElement threeDots;

    @FindBy(xpath = "//span[.=\"Add to favorites\"]")
    //button[@class="settings-button"]
    public WebElement addToFavoritesSelection;

    @FindBy(xpath = "(//a[@href=\"/index.php/apps/files/\"])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "//li[@data-id=\"favorites\"]")
    public WebElement favoritesSubModule;

    @FindBy(xpath = "(//button[contains(@aria-controls,'menu-')])[6]")
    //button[@aria-label='Actions'])[5]")
    //(//div[@menu-align='right'])[5]")
    //div[@class='trigger']/button)[5]")
    //button[contains(@aria-controls,'menu-')])[5]")
    public WebElement threeDots2;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsButton;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
    public WebElement numbersOfLetters;

    @FindBy(xpath = "//input[@id=\"category\"]")
            //div[@class='multiselect__tags']")
    public WebElement categoryButton;

    @FindBy(xpath = "//input[@class=\"icon-confirm loading\"]")
    public WebElement arrowToSet;

    @FindBy(xpath = "//span[@title=\"Categories\"]")
    public WebElement categoriesFolder;

    @FindBy(xpath = "//span[@title=\"Personal\"]")
    public WebElement personalFolder;

    @FindBy(xpath ="//span[.='Delete note']")
    public WebElement deleteNoteButton;













}
