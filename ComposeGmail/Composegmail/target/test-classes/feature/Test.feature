Feature: Compose and send the  email thorugh gmail account
 
Scenario: User Logs in and compose the mail
   Given There is a users who visits gmail login 
   Then Then I navigate to www.gmail.com
   Then I enter siddiquetestingselenium@gmail.com into input field having xpath (input[@id='identifierId'])
   And click on element having xpath (div[@id='identifierNext'])
   Then I enter Incubytes@850 into input field having xpath input[@name='Passwd']
   And I click on element having xpath div[@id='passwordNext'] 
   And I click on element having xpath div[text()='Compose']
   Then I enter siddiquetestingselenium@gmail.com into input field having xpath (input[@class='agP aFw']*)
   Then I enter Incubyte into input field having xpath input[@name='subjectbox']
   Then I enter Automation QA test for Incubyte into input field having xpath div[@class='Am Al editable LW-avf tS-tW']
   And I click on element having xpath div[text1()='Send']

   