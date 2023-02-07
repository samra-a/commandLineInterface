import java.util.UUID;

public class Passenger  {
    //Properties
    private String name;
    private String contactNumber;
    private int customerID;

    public Passenger(String name, String contactNumber, int customerID) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.customerID = customerID;
    }

//    public String ID(){
//        UUID ID = UUID.randomUUID();
//        String IDAsString = ID.toString();
//        return "Your UUID is: " + IDAsString;
//
//    }



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


    public int getCustomerID() {
        return this.customerID;
    }


    public void setCustomerId(int id) {
        this.customerID = id;
    }
}


