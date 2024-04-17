# **This project is used to solve the following problem:**

## **Problem #3: Find Users With Valid E-Mails**

Write a solution to determine if an email is valid. Return true is e-mail is valid, return false for an invalid e-mail. A valid e-mail has a prefix name and a domain where:

•	The prefix name is a string that may contain letters (upper or lower case), digits, underscore '_', period '.', and/or dash '-'. The prefix name must start with a letter.
•	The domain is '@codechallenge.com'.

### Examples:

Input: winston@codechallenge.com 
Output: true

Input: jonathanisgreat
Output: false (Explanation: email doesn’t have a domain)

Input: bella-@codechallenge.com
Output: true

Input: sally.ctl@codechallenge.com
Output: true

Input: quarz#2020@ codechallenge.com
Output: false (Explanation: email has the ‘#’ sign which is not allowed)

Input: david33@cdchallenge.com
Output: false (Explanation: email doesn’t have the correct domain)

Input: .shapo@codechallenge.com
Output: false (Explanation: starts with a. period)
