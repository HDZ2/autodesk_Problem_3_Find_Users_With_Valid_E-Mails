package methods;

public class validateEmail {

    /*
    * This class is to have the isEmailValid function
    * I set up the regex variable which is used for regular expression where I state:
    * This part [a-zA-Z] is to set that the string contains any single character from 'a' to 'z' both lowercase and uppercase
    * This part [a-zA-Z0-9._-]is to set that the string contains any number/letters/characters like periods, underscores or dashes
    * This part @codechallenge.com is to match the domain name of the email address.
    *
    * */

    public boolean isEmailValid(String email){
        //Set up regex variable
        String regex = "[a-zA-Z][a-zA-Z0-9._-]*@codechallenge.com";

        //check if a string matches a regular expression
        return email.matches(regex);

    }

}
