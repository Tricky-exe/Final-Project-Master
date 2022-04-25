public class AstronautInfo {
    //this class is to get the information of the astronauts
    private String name;       // A person's name
    private String serialNum;  // A person's generated serial number
    private String dob;        // A person's date of birth (dob)
    private double weight;     // A person's weight
    private String address;    // A person's address
    private String phone;      // A person's phone number
    private String email;      // A person's email address
    private double payRate;    // A person's pay rate
    private String nextKin;    // A person's next of kin
    private String status;     // A person's status of whether they are on Earth or in space


    //previous code that ive got open rn   personalinformation, personBuilder

    /**
     The setName method sets the person's name
     @param name2 The person's name
     */
    public void setName(String name2){
        name = name2;
    }

    /**
     The setSetialNum method sets the person's generated serial number
     @param serialNum2 The person's generated serial number
     */
    public void setSerialNum(String serialNum2){
        serialNum = serialNum2;
        //make this so it randomly generates a serial number (5 numbers long and it has to be numbers)
    }

    /**
     The setDob method sets the person's date of birth
     @param dob2 The person's age
     */
    public void setDob(String dob2){
        dob = dob2;
    }

    /**
     The setWeight method sets the person's weight
     @param weight2 The person's weight
     */
    public void setWeight(double weight2){
        weight = weight2;
    }

    /**
     The setAddress method sets the person's address on Earth
     @param address2 The person's address
     */
    public void setAddress(String address2){
        address = address2;
    }

    /**
     The setPhone method sets the person's phone number
     @param phone2 The person's phone number
     */
    public void setPhone(String phone2){
        phone = phone2;
    }

    /**
     The setEmail method sets the person's email address
     @param email2 The person's email address
     */
    public void setEmail(String email2){
        email = email2;
    }

    /**
     The setPayRate method sets the person's pay rate
     @param payRate2 The person's pay rate
     */
    public void setPayRate(double payRate2){
        payRate = payRate2;
    }

    /**
     The setNextKin method sets the person's next of kin
     @param nextKin The person's next of kin
     */
    public void setNextKin(String nextKin2){
        nextKin = nextKin2;
    }

    /**
     The setStatus methos sets the person's status of whether they are on Earth or in space
     @param status2 The person's status
     */
    public void setStatus(String status2){
        status = status2;
    }

    //------------------------------------------------------------------------------------------\\

    /**
     The getName method returns the person's name
     @return The person's name
     */
    public String getName(){
        return name;
    }

    /**
     The get getSerialNum method returns the person's generated serial number
     @return The person's serial number
     */
    public String getSerialNum(){
        return serialNum;
    }

    /**
     The getDob method returns the person's date of birth
     @return The person's date of birth
     */                                        
    public String getDob(){            
        return dob;
    }

    /**
     The getWeight method returns the person's weight
     @return The person's weight
     */                                   
    public double getWeight(){            
        return weight;
    }

    /**
     The getAddress method returns the person's address
     @return The person's address
     */                                        
    public String getAddress(){            
        return address;
    }

    /**
     The getPhone method returns the person's phone number
     @return The person's phone number
     */                                        
    public String getPhone(){            
        return phone;
    }

    /**
     The getEmail method returns the person's email address
     @return The person's email address
     */                                        
    public String getEmail(){            
        return email;
    }

    /**
     The getPayRate method returns the person's pay rate
     @return The person's pay rate
     */                                        
    public double getPayRate (){            
        return payRate;
    }

    /**
     The getNextKin method returns the person's next of kin
     @return The person's next of kin
     */                                        
    public String getNextKin(){            
        return nextKin;
    }

    /**
     The getStatus method returns the person's status of whether they are on Earth or in space
     @return The person's status
     */                                        
    public String getStatus(){            
        return status;
    }





}
