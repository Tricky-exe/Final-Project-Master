import java.util.Scanner;
public class AstroMain{

    public static void main(String[] args){
        String name, serialNum, dob, address, phone, email, nextKin, status;
        double weight, payRate;
        int input = 0;
        boolean statusF = false;
        serialNum = "";
        Scanner keyboard = new Scanner(System.in);

        //Prompts for the astronauts name
        
        System.out.println("What is the astronauts name?");
        name = keyboard.nextLine();
        
        
        //Prompts for the astronauts serial number
        //Checks to make sure that the user is putting in a 6 digit number
        
        while(statusF == false){      
        System.out.println("What is the astronauts Serial Number? (Must be a 6 digit number)");
        serialNum = keyboard.nextLine();
        
        if (!Verifier.serialValid(serialNum))
            System.out.println("Please input a 6 digit number");
            
        else
            System.out.println("Accepted!");
        }
    
        //Prompts for the astronauts date of birth
        System.out.println("What is the astronauts date of birth? (MM-DD-YYYY)");
        dob = keyboard.nextLine();

        //Prompts for the astronauts weight
        System.out.println("What is the astronauts weight?");
        weight = keyboard.nextDouble();
        keyboard.nextLine();

        //Prompts for the astronauts address
        System.out.println("What is the astronauts address?");
        address = keyboard.nextLine();
        
        //Prompts for the astronauts phone number
        System.out.println("What is the astronauts phone number?");
        phone = keyboard.nextLine();

        //Prompts for the astronauts email address
        System.out.println("What is the astronauts email address?");
        email = keyboard.nextLine();

        //Prompts for the astronauts pay rate
        System.out.println("What is the astronauts pay rate?");
        payRate = keyboard.nextDouble();
        keyboard.nextLine();
        
        //Prompts for the astronauts next of kin
        System.out.println("Who is the astronauts next of kin?");
        nextKin = keyboard.nextLine();

        //Prompts for the astronauts status
        System.out.println("What is the astronauts status? (on Earth or in space)");
        status = keyboard.nextLine();

        

        //Verify that the answers are correct and in the right places
        System.out.println("Please verify the following information is correct AND is in the correct catagory");
        System.out.println("Name of the astronaut: " + name + "\nSerial Number: " + serialNum + "\nDate of birth: " + dob + "\nWeight: " + weight + "\nAddress: " + address + "\nPhone Number: " + phone + "\nEmail Address: " + email + "\nPay Rate: " + payRate + "\nNext of Kin: " + nextKin + "\nStatus: " + status);
        
        
        //Asks if the user wants to edit any info
        System.out.println("Is there anything you would like to edit? \n1.Yes \n2.No");
        input = keyboard.nextInt();

    
        while (input != 10){
        System.out.println("You selected yes. What would you like to change? \n1.Name \n2.Serial Number \n3.Date of Birth \n4.Weight \n5.Address \n6.Phone Number \n7.Email Address \n8.Pay Rate \n9.Next of Kin \n10.Status");
            input = keyboard.nextInt();
            if(input < 1 && input > 10){
                System.out.print("Invalid selection. Please select something to change: ");
            }
           input = menuChoice (name, serialNum, dob, weight, address, phone, email, payRate, nextKin, status, input, statusF );
        }
        


    }

        














}