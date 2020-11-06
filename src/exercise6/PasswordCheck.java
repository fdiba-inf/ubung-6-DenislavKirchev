package exercise6;

import java.util.Scanner;
import java.lang.Character;

public class PasswordCheck {
    public static void main(String[] args) {
      
        boolean validLength;
        boolean check;
        int count1=0;
        int count2=0;

        do{
            System.out.println("Enter length: ");
            Scanner input = new Scanner(System.in);
            int length = input.nextInt();
            if(length<8){
                validLength=false;
            }else{
                validLength=true;
            }
            char[] password = new char [length];
            System.out.println("Enter password: ");
            for(int i = 0; i < password.length; i++){
                password[i] = input.next().charAt(0);
                if(Character.isDigit(password[i])){
                    count1++;
                }
            }
            for(int i = 0; i < password.length; i++){
                if(!Character.isLetterOrDigit(password[i])){
                    count2++;
                }

            }

            if(count2>1 || count1<2){
                check=false;
            }else{
                check=true;

            }


            if(validLength && check){
                System.out.println("Password valid!");
            }
        }while(!validLength || !check);


    }
}
