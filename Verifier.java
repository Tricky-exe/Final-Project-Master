import java.util.Scanner;
public class Verifier {

final int MIN_SERIALNUMBER_LENGTH = 6;


public static boolean serialValid (String serialNum){
    boolean status;
    status = false;

    if(serialNum.length() == 6 ){
        status = true;
    }
    else{
        status = false;
    }


    return status;
}


public static int menuChoice (String name, String serialNum, String dob, double weight, String address, String phone, String email, double payRate, String nextKin, String status, int input, boolean statusF ){
    Scanner keyboard = new Scanner(System.in);
    if (input == 1){
        System.out.println("What is the astronauts name?");
        name = keyboard.nextLine();
    }
    if (input == 2){
        while(statusF == false){      
            System.out.println("What is the astronauts Serial Number? (Must be a 6 digit number)");
            serialNum = keyboard.nextLine();
            
            if (!Verifier.serialValid(serialNum))
                System.out.println("Please input a 6 digit number");
                
            else
                System.out.println("Accepted!");
            }
    }
    if (input == 3){
        System.out.println("What is the astronauts date of birth? (MM-DD-YYYY)");
        dob = keyboard.nextLine();
    }
    if (input == 4){
        System.out.println("What is the astronauts weight?");
        weight = keyboard.nextDouble();
        keyboard.nextLine();
    }
    if (input == 5){
        System.out.println("What is the astronauts address?");
        address = keyboard.nextLine();
    }
    if (input == 6){
        System.out.println("What is the astronauts phone number?");
        phone = keyboard.nextLine();
    }
    if (input == 7){
        System.out.println("What is the astronauts email address?");
        email = keyboard.nextLine();
    }
    if (input == 8){
        System.out.println("What is the astronauts pay rate?");
        payRate = keyboard.nextDouble();
        keyboard.nextLine();
    }
    if (input == 9){
        System.out.println("Who is the astronauts next of kin?");
        nextKin = keyboard.nextLine();
    }
    if (input == 10){
        System.out.println("What is the astronauts status? (on Earth or in space)");
        status = keyboard.nextLine();
    }
    return input;
}

}

