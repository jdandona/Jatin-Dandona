# Jatin-Dandona
N26 Home Challenge
Charter - 01
Explore
Calculator Functionality
With Resources
Various user input on mathematical operation
To discover
Expected results of mathematical operation
User input being taken correctly
User Interface 



Findings
Bugs
Explanation
Steps to reproduce
1.Output is not as expected


Open app > Go to Add expense 
Enter value “ 50.05 + 100 = “ you will see output as 150.05
Now type 55 
Output – 15060
Expected result does not match with output
2. User is not able to enter values 


Open app > Go to Add expense 
Enter value as “5484.56 + 0.85 =” you will see output as 5486.41
Enter any digit now
User is not able to enter any value now



Observations:
Note and input keyboards are active at the same time where keyboard for enter value is partially active.
Steps – 
Open app > Go to Add expense 
Type on Note > phone keyboard overlaps with app keyboard 
Enter value from behind keyboard – able to enter value in both inputs (notes and add expense). If we want to make them visible, then make it all visible why partially visible? Or for entering expense, one can click on input field to enable associated keyboard and hide other keyboard for notes.





Charter - 02
Explore
Add Income and Add expense, Delete Income and Delete expense, calculate in different categories according to time interval
With Resources
Various user daily income and expense input in different categories.
To discover
Balance calculations, total balance calculations according to different category and time interval 



Findings
Bugs
Explanation/Image
Steps to reproduce
1.Curreny type mismatched

Open app > open left panel > check All account currency unit (USD)
Click on three dot () at right > settings > currency > select any other than the selected (Euro)
Click on back icon from top left of the app
It still shows USD while everything on dashboard is change to euro
2. Total percentage is more that 100% 
RM: This is primarily calculation app and if are not giving the output correct user might not trust this app

Open app > Go to Add expense 
Enter expense for multiple category 
Check dashboard and calculate total percentage
Total percentage is more than 100% as shown in the image (102%)


3. Duplicate interval creation



Open app > go to left panel by clicking hamburger menu ()
Click on “interval” > Select interval > enter 15 – 25th range > save 
Repeat the above step
Now click on interval – two entries for same interval is visible as shown in the figure.



Observations:
User should have choice to select/Delete time interval
Steps – 
Open app > go to left panel by clicking hamburger menu ()
Click on “interval” > Select interval > enter 1-7 range > save 
Repeat the above step with 8 – 15 range > save
Repeat the above step with 16 – 21 range > save
Repeat the above step with 22 – 30 range > save
Now interval have 22-30,16-21,8-15 range. The 1-7 range got overwrite with 22-30 range.







	







Charter - 03
Explore
Explore categories (expenses and incomes) edit category, enable disable category, merge category and delete category and compute the existing entries (income and expenses)
With Resources
Various user daily income and expense input in different categories.
To discover
Balance calculations, total balance calculations according to different category and time interval 



Findings
Bugs
Explanation
Steps to reproduce
1. Viewing category wise balance from chart doesn’t always redirect to correct value

Open app > Go to Add expense
Add expense for all category 
Now click on the all category one by one from chart and see the balance
sometimes it goes under scroll as shown in the image


  







Observations:

Steps –




Charter - 04
Explore
Cash Account delete, merge, edit , compute calculation
With Resources


To discover



Findings
Bugs
Explanation
Steps to reproduce
1. BY default Account category name missing

Open app > right menu > Account > Add+
Select any icon from down
Input field have placeholder as Name that is not changing on selecting any icon from bottom.
Ideally, we must change name to educate user.
2. Error message should go away as soon as correct data is entered.



Open app > Go to New transfer
Select cash in both dropdown 
Click 2-3 times on input field to enter values > gives error at bottom
Change one dropdown value to Payment card
Click on input field > opens keyboard t enter value but error message is still visible at the bottom that overlay add transfer button.
3. Visual representation of chart is not correct

Account>add a new account as stock > select an image > Add
Transfer > from dropdown box select stock in first and select cash in second dropdown
enter value as 100 > save
Again, Transfer > from dropdown box select stock in first and select Payment in second dropdown
enter value as 50 > save
From left hamburger menu select > stock
Check dashboard
Graphical visualization is not correct it showing only red circle no different color to segregate the percentage like others.


4. Able to add same account type multiple times




Account > Add + > Type Stock and select an image.
Repeat the above step
Check account
To avoid the confusion account name should not be same.




Observations:

Steps –



Charter - 05
Explore
Settings
With Resources


To discover



Findings
Bugs
Explanation
Steps to reproduce
1.Language change is not applied to number format sometimes.

Open app > Go to setting
Change language to Deutsch
Come back to dashboard
Again, change language to English
Check the dashboard
Number formatting is still in Deutsch while calendar text is changed to English as shown in the image
2.Language change is not applied to all app but to calendar and number format.
RM: Bad user experience

Open app > Go to setting
Change language to Deutsch
All content in app is still in English except the calendar and number format







Observations:

Steps –


