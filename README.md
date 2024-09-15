# Katalon Mobile Automation Testing

This task involves testing the To Do application using Katalon on a real Android device (Android 10). 

#### A. Tools and Frameworks
1. Automation Tool: Katalon Studio
2. Mobile Platform: Android 10 (real device)
3. Programming Language: Groovy (Katalon scripting)
4. Device Configuration: Real Android 10 device for execution

#### B. Test Case Breakdown
##### 1. Task Management:
* Create Task: Test the functionality of adding a new task and ensure that the chosen category is correctly displayed in the task details after the task is created.
* Update Task: Verify that an existing task can be updated correctly.
* Delete Task: Ensure that tasks can be deleted successfully.
##### 2. Category Management:
* Create Category: Test the functionality of adding a new category.
* Update Category: Ensure that category updates are handled properly.
* Delete Category: Verify that categories can be deleted without issues.

#### C. Test Suites
1. Category Test Suite:
   * Includes tests for creating, updating, and deleting categories.
   * Data-Driven Testing: Multiple categories are created using different data sets to ensure consistent behavior.
2. Task Test Suite:
   * Includes tests for creating, updating, deleting tasks, and verifying category selection.

#### D. Steps to Execute the Automation in Katalon:

1. Open Katalon and select New Project.
2. Click Clone Git and paste the repository's HTTPS link
3. Update the global variable baseURL to match the location where the To Do application is hosted.
4. Connect your real Android 10 device to Katalon.
5. Select and run the desired test suites (either Category or Task).
