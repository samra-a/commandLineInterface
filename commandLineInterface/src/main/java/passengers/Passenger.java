package passengers;

import java.util.UUID;

public class Passenger  {
    //Properties
    private String name;
    private String contactNumber;
    private String customerID = ID();

    public Passenger(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.customerID = ID();
    }

    public String ID(){
        UUID ID = UUID.randomUUID();
        String IDAsString = ID.toString();
        return "Your UUID is: " + IDAsString;

    }



    public boolean hasPassengerBeenBookedOnFlight() {
            return false;
    }

    //Getters/Setters

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getContactNumber() {
        return this.contactNumber;
    }


    public void setContactNumber(String number) {
        this.contactNumber = number;
    }


    public String getCustomerID() {
        return this.customerID;
    }


    public void setCustomerId(String id) {
        this.customerID = id;
    }
}


