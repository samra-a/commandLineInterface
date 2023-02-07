package passengers;

import java.util.UUID;

public class Passenger implements IPassenger {
    //Properties
    private String name;
    private int contactNumber;
    private int customerID;

    public Passenger(String name, int contactNumber, int customerID) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.customerID = customerID;
    }

    public String ID(){
        UUID ID = UUID.randomUUID();
        String uuidAsString = ID.toString();

    }


    @Override
    public boolean hasPassengerBeenBookedOnFlight() {
            return false;
    }

    //Getters/Setters
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getContactNumber() {
        return this.contactNumber;
    }

    @Override
    public void setContactNumber(int number) {
        this.contactNumber = number;
    }

    @Override
    public int getCustomerID() {
        return this.customerID;
    }

    @Override
    public void setCustomerId(int id) {
        this.customerID = id;
    }
}


