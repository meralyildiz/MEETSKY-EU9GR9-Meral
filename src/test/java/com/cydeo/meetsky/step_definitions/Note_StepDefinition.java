package com.cydeo.meetsky.step_definitions;

import com.cydeo.meetsky.pages.LoginPage;
import com.cydeo.meetsky.pages.NotePage;
import com.cydeo.meetsky.utilities.BrowserUtils;
import com.cydeo.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Note_StepDefinition {
    LoginPage loginPage = new LoginPage();
    NotePage notePage = new NotePage();

    @Given("user is already logged in")
    public void user_is_already_logged_in() {
        loginPage.loginWithConfig();
    }
    @When("user clicks on the note module")
    public void user_clicks_on_the_note_module() {
        BrowserUtils.sleep(10);
        //wait.until(ExpectedConditions.visibilityOf(notePage.notesModule);
        notePage.notesModule.click();
    }
    @When("user clicks on New note")
    public void user_clicks_on_new_note() {
        BrowserUtils.sleep(5);
        notePage.newNoteButton.click();
    }
    @When("user types {string}")
    public void user_types(String string) {
        BrowserUtils.sleep(5);
        //notePage.pageToWrite.click();
        notePage.pageToWrite.sendKeys("Hello world!");
    }
    @Then("verify that the created note and it's title are matching")
    public void verify_that_the_created_note_and_it_s_title_are_matching() {
        BrowserUtils.sleep(2);
        Driver.getDriver().getTitle().equals("Hello world!");
    }



    @When("user clicks on the image button to upload an image as note")
    public void user_clicks_on_the_image_button_to_upload_an_image_as_note() {
        BrowserUtils.sleep(2);
        notePage.uploadImageButton.click();
    }
    @When("user selects insert an image")
    public void user_selects_insert_an_image() {
        BrowserUtils.sleep(2);
        notePage.insertImageButton.click();
    }
    @When("user selects an image from folder and clicks on choose button")
    public void user_selects_an_image_from_folder_and_clicks_on_choose_button() {
        BrowserUtils.sleep(2);
        notePage.imageRoot.click();
        BrowserUtils.sleep(2);
        notePage.chooseButton.click();
    }
    @Then("selected image is visible as note on the note page")
    public void selected_image_is_visible_as_note_on_the_note_page() {
        BrowserUtils.sleep(2);
        notePage.pageToWrite.isDisplayed();
    }


    @When("user clicks on three dots")
    public void user_clicks_on_three_dots() {
        BrowserUtils.sleep(2);
        BrowserUtils.clickWithJS(notePage.threeDots);
    }
    @When("user selects add to favorites")
    public void user_selects_add_to_favorites() {
        BrowserUtils.sleep(2);
        notePage.addToFavoritesSelection.click();
    }
    @When("user goes to Files module")
    public void user_goes_to_files_module() {
        BrowserUtils.sleep(2);
        notePage.filesModule.click();
    }
    @When("user clicks on Favorites sub-module")
    public void user_clicks_on_favorites_sub_module() {
        BrowserUtils.sleep(2);
        notePage.favoritesSubModule.click();
    }
    @Then("verify if the selected note is under favorite folder")
    public void verify_if_the_selected_note_is_under_favorite_folder() {
        BrowserUtils.sleep(2);
        System.out.println("notePage.favoritesSubModule.isDisplayed() = " + notePage.favoritesSubModule.isDisplayed());
    }


    @When("user clicks on the ... dots on the right side of the recently created note select details")
    public void user_clicks_on_the_dots_on_the_right_side_of_the_recently_created_note_select_details() {
        BrowserUtils.sleep(2);
        notePage.threeDots2.click();
        BrowserUtils.sleep(2);
        notePage.detailsButton.click();
    }
    @Then("user can can see the number of letters and words that the note includes")
    public void user_can_can_see_the_number_of_letters_and_words_that_the_note_includes() {
        BrowserUtils.sleep(2);
        System.out.println("notePage.numbersOfLetters.getText() = " + notePage.numbersOfLetters.getText());

    }

    @When("user sees under the recently added note Category box")
    public void user_sees_under_the_recently_added_note_category_box() {
        BrowserUtils.sleep(2);
        notePage.categoryButton.click();
    }
    @When("user writes {string} into it")
    public void user_writes_into_it(String string) {
        BrowserUtils.sleep(2);
        notePage.categoryButton.sendKeys(string);
    }
    @When("user clicks on the arrow to set the category")
    public void user_clicks_on_the_arrow_to_set_the_category() {
        notePage.arrowToSet.click();

    }
    @Then("on the left side of the page, under All notes folder will appear Personal folder")
    public void on_the_left_side_of_the_page_under_all_notes_folder_will_appear_personal_folder() {
        BrowserUtils.sleep(2);
        notePage.categoryButton.click();

        BrowserUtils.sleep(2);
        notePage.personalFolder.isDisplayed();
    }

    @When("user clicks on ... dots near to the note")
    public void user_clicks_on_dots_near_to_the_note() {
        BrowserUtils.clickWithJS(notePage.threeDots);

    }
    @Then("user selects Delete button")
    public void user_selects_delete_button() {
        BrowserUtils.clickWithJS(notePage.removeFromFavorites);

    }

}
