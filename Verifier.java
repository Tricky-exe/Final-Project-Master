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



}
