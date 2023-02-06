package passengers;

public interface IPassenger {
    public boolean hasPassengerBeenBookedOnFlight();
    public String getName();
    public void setName(String name);
    public int getContactNumber();
    public void setContactNumber(int number);
    public int getCustomerID();
    void setCustomerId(int id);

}
