# CS_IA
## Installation
```
cd Desktop/IA-forms/Product
git clone https://github.com/Ron-it/CS_IA.git
```
open the "CS_IA" folder in any ide of choice

go to src/main and run LoginPage.java

also prob won't work on mac/linux rn cuz file paths

## Info and Some stuf
```
| Login Page
	Step 1: Create an account and restart the application
	Step 2: The file will read the credentials and will autofill the login boxes -> Press login to continue
| Home Page
	> redirects to pages listed below
| Create New Entry
	> Fully complete
	Step 1: Enter student details
	Step 2: Click "Create"
	Step 3: Click clear if creating a new entry else go to step 5
	Step 4: Repeat Steps 1-3
	Step 5: Click view Entries to view the saved entries
| View Saved Entries
	---- No bugs just missing 1 or 2 features right now I have the functions ready in the All_Entries.java file
	> Initially you will be redirected to a page where you can Individually view each student, view their details
		>> Working on a function which will allow you to update and delete entries from this page
			>>> Workaround: use excel
	> Next you can choose to view it in a tabular format
		>> in the menu bar there are options to sort by priority, name or exit the tabular format
			>>> Might add search, client didn't request it
	> Next from this page you can go back to home or click on new entry which takes you back to "Create New Entry"
| Meeting Scheduler
	> Completely broken
	For now the only thing that works on this page is that it is able to extract student names and place it in the dropdown-
	box. The timeslots also exist extracted from TimeTable.csv as well as dates from MeetingEvents.csv but none of the but-
	tons have any function right now.
| Email Generator
	> Fully complete
	Step 1 > Select a student from the dropdown menu and it will auto generate an email using the details provided from
		the entry before
	Step 2 > Currently the generate button does nothing because I made it so it auto generates when a different student 
		is selected from the list.
	Step 3 > Click on copy to copy the message to the clipboard.
```
