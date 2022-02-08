# Jatin-Dandona
N26 Home Challenge
 
 
 **Charter 101  Time Dedicated: 30 Minutes**
 
 **Explore :** Calculator Functionality
 
 **With Resources:** Various user input on mathematical operation
 
 **To discover:** Expected results of mathematical operation,
              User input being taken correctly,
              User Interface 
	      
**BUGS Charter 101 :**
     -> Computing Output is not as expected</br>
                   **Steps to reproduce:**
		   1. Open app > Go to Add expense </br>
                   2. Enter value “ 50.05 + 100 = “ you will see output as 150.05</br>
                   3. Now type 55 </br>
                   4. Output – 15060</br>
                   5. Expected result does not match with output</br>
		   
		   		   
      -> User is not able to enter values in the calculator </br>
			**Steps to reproduce:**</br>
			1. Open app > Go to Add expense </br>
			2. Enter value as “5484.56 + 0.85 =” you will see output as 5486.41</br>
			3. Enter any digit now</br>
			4. User is not able to enter any value now</br>
			
**Observations Charter 101**:
Note and input keyboards are active at the same time where keyboard for enter value is partially active.
Steps – 
Open app > Go to Add expense 
Type on Note > phone keyboard overlaps with app keyboard 
Enter value from behind keyboard – able to enter value in both inputs (notes and add expense).




 **Charter 102  Time Dedicated: 45 Minutes**
 
 **Explore :** Add Income and Add expense, Delete Income and Delete expense, calculate in different categories according to time interval
 
 **With Resources:** Various user daily income and expense input in different categories.
 
 **To discover:** Balance calculations, total balance calculations according to different category and time interval 

**BUGS Charter 102 :**
		-> Curreny type mismatched </br>
		.    **Steps to reproduce:** </br>
					1. Open app > open left panel > check All account currency unit (USD)</br>
					2. Click on three dot () at right > settings > currency > select any other than the selected (Euro)</br>
					3. Click on back icon from top left of the app</br>
					4. It still shows USD while everything on dashboard is change to euro</br>

		-> Total percentage is more that 100% </br>
			**Steps to reproduce:** </br>
					1. Open app > Go to Add expense 
					2. Enter expense for multiple category 
					3. Check dashboard and calculate total percentage
					4. Total percentage is more than 100% as shown in the image (102%)
					
		-> Duplicate interval creation </br>
				**Steps to reproduce:** </br>
				   	1. Open app > go to left panel by clicking hamburger menu ()
					2. Click on “interval” > Select interval > enter 15 – 25th range > save 
					3. Repeat the above step
					4. Now click on interval – two entries for same interval is visible as shown in the figure.
					
					
	**Observations Charter 102**:
	
	User should have choice to select/Delete time interval
     			Steps – 
				Open app > go to left panel by clicking hamburger menu ()
				Click on “interval” > Select interval > enter 1-7 range > save 
				Repeat the above step with 8 – 15 range > save
				Repeat the above step with 16 – 21 range > save
				Repeat the above step with 22 – 30 range > save
				Now interval have 22-30,16-21,8-15 range. The 1-7 range got overwrite with 22-30 range.
				
				
				

**Charter 103  Time Dedicated: 45 Minutes**

 **Explore :** Explore categories (expenses and incomes) edit category, enable disable category, merge category and delete category and compute the existing entries (income and expenses)
 
 **With Resources:** Various user daily income and expense input in different categories.
 
 **To discover:** Balance calculations, total balance calculations according to different category and time interval
 
 
**BUGS Charter 103 :**

			-> Viewing category wise balance from chart doesn’t always redirect to correct value
			    		 **Steps to reproduce:** </br>
					        1. Open app > Go to Add expense
						2. Add expense for all category 
						3. Now click on the all category one by one from chart and see the balance
						4. sometimes it goes under





		                    
**Charter 104  Time Dedicated: 45 Minutes**

 **Explore :** Add Account delete, merge, edit , compute calculation
 
 **With Resources:** Different account and the entries in income and expenses
 
 **To discover:** Account can be merged, edit and Add and the calculation associated with them will not impact.
 
 
**BUGS Charter 104 :**
			 ->BY default Account category name missing
			 		 **Steps to reproduce:** </br>
					 		1. Open app > right menu > Account > Add+ </br>
							2. Select any icon from down</br>
							3. Input field have placeholder as Name that is not changing on selecting any icon from bottom.</br>
							4. Ideally, we must change name to educate user.</br>
							
			Error message "Account have to be different" When user transfer from cashi to cash
					 **Steps to reproduce:** </br>
					 	1. Open app > Go to New transfer
						2. Select cash in both dropdown 
						3. Click 2-3 times on input field to enter values > gives error at bottom
						4. Change one dropdown value to Payment card
						5. Click on input field > opens keyboard t enter value but error message is still visible at the bottom that overlay add transfer button.
						
						
						 Visual representation of chart is not correct
						 	**Steps to reproduce:** </br>
							1. Account>add a new account as stock > select an image > Add
							2. Transfer > from dropdown box select stock in first and select cash in second dropdown
							3. enter value as 100 > save
							4. Again, Transfer > from dropdown box select stock in first and select Payment in second dropdown
							5. enter value as 50 > save
							5. From left hamburger menu select > stock
							6. Check dashboard
							7. Graphical visualization is not correct it showing only red circle no different color to segregate the percentage like others.
							
							
							Able to add same account type multiple times
							   **Steps to reproduce:** </br>
							  		1. Account > Add + > Type Stock and select an image.
									2. Repeat the above step
									3. Check account
									4. To avoid the confusion account name should not be same.
									
									


**Charter 105  Time Dedicated: 45 Minutes**

 **Explore :** Settings
 
 **With Resources:** to check available option are working fine (balance, General settings, data backup)
 
 **To discover:** Each Subsection of Settings working as expected
 
 **BUGS Charter 105 :**  
 				->Language change is not applied to number format sometimes.
						 **Steps to reproduce:** </br>
						 		Open app > Go to setting
								Change language to Deutsch
								Come back to dashboard
								Again, change language to English
								Check the dashboard
								Number formatting is still in Deutsch while calendar text is changed to English as shown in the image
								
								
								
CHARTERS PRIORITIZATION:

1. Charter 102 and Charter 103 will be highest priority charter because it is the main fucntionality of the application.
2. Charter 104 as real user are going to maintain different accounts.
3. Charter 105 as it contains the next big feature of application which is data back, data restore from cloud.
4. Charter 101.


RISK MITIGATION:

1. Calucation percentages should not be wrong it will move away the trust from the user.
2. Calculation mistakes should not be there for accounts as well/categories, it might be possbile user is tracking to pay and they might pay wrong amount to wrong accounts.
3. Uninstalling of the app might lose the pro feature as this app is totally based on user local mobile memory. time to time back should happen automatically.

									
						



								





















 
