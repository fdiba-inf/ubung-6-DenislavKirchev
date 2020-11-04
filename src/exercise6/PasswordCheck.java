package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        boolean validLength = true;
        boolean isLetterOrDigit;
        boolean isDigit;
        int count=0;

        do{
          System.out.println("Enter length: ");
          Scanner input = new Scanner(System.in);
          int length = input.nextInt();
          assert length > 0;
          if(length < 8){
           validLength = false;
          }
          char[] password = new char [length];
          System.out.println("Enter password: ");
          count = 0;
          for(int i = 0; i < password.length; i++){
            password[i] = input.next().charAt(0);
            
            
            if(Character.isDigit(password[i])){
              count ++;
            }
          }
          for(int i = 0; i < password.length; i++){
            isLetterOrDigit = true;
            if(Character.isLetterOrDigit(password[i])){
              isLetterOrDigit = false;
              continue;
            }
          }
        }while(isLetterOrDigit = false || count < 2 ||validLength == false);

        System.out.println("Password valid!");

        
        


    }
}
