package passengers;

public interface IPassenger {
    public boolean hasPassengerBeenBookedOnFlight();
    public String getName();
    public void setName(String name);
    public int getContactNumber();
    public void setContactNumber(int number);
    public String getCustomerID();
    void setCustomerId(String id);

}
