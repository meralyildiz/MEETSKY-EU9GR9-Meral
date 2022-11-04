Feature: Creating/deleting any note

  As a user, I should be able to create/delete any note and see the details of the note.

  Acceptance Criteria:**

  Background: : Login as user
    Given user is already logged in

  @ETSKY-877
  Scenario: user can create a new note
    When user clicks on the note module
    And user clicks on New note
    And user types "Hello world!"
    Then verify that the created note and it's title are matching

  @ETSKY-878
  Scenario: User can add image as a note
    When user clicks on the note module
    And user clicks on New note
    And user clicks on the image button to upload an image as note
    And user selects insert an image
    And user selects an image from folder and clicks on choose button
    Then selected image is visible as note on the note page

  @ETSKY-879
  Scenario: User can add any note to the favorites
    When user clicks on the note module
    And user clicks on three dots
    And user selects add to favorites
    And user goes to Files module
    And user clicks on Favorites sub-module
    Then verify if the selected note is under favorite folder

  @ETSKY-880
  Scenario: User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
    When user clicks on the note module
    And user clicks on the ... dots on the right side of the recently created note select details
    Then user can can see the number of letters and words that the note includes

  @ETSKY-881
  Scenario: User can create a new category by passing a new category name from inside the notes details
    When user sees under the recently added note Category box
    And user writes "Personal" into it
    And user clicks on the arrow to set the category
    Then on the left side of the page, under All notes folder will appear Personal folder

  @ETSKY-882
  Scenario: User can delete any note
    When user clicks on ... dots near to the note
    Then user selects Delete button
