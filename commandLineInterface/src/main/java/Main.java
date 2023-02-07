import java.util.Scanner;


public class Main {
    private static BookingAgent bookingAgent;
    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);


        boolean loop = true;
        System.out.println("Hello, please choose an option");
        System.out.println("");
        System.out.println("1.Add a new flight");
        System.out.println("2.Display all available flights");
        System.out.println("3. Add a new passenger");
        System.out.println("4. Book a passenger onto a flight");
        System.out.println("5. Cancel a flight");
        String input = scanner.nextLine();

        while (loop) {
            try {
                Passenger passenger = null;
                Flight flight = null;
                int flightID = 0;
                if (input == "1") {
                    System.out.println("Enter the destination of the flight: ");
                    String destination = scanner.nextLine();
                    System.out.println("Enter the flight ID");
                    flightID = scanner.nextInt();
                    flight = new Flight(destination, flightID);
                    bookingAgent.addFlight(flight);
                    System.out.println("Here are your flight details " + flight);

                } else if (input == "2") {
                    bookingAgent.displayAllFlights();

                } else if (input == "3") {
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your phone number: ");
                    String contactNumber = scanner.nextLine();
                    System.out.println("Enter your customer ID: ");
                    int customerID = scanner.nextInt();
                    passenger = new Passenger(name, contactNumber, customerID);
                    System.out.println("Your passenger details are: " + passenger);

                } else if (input == "4") {

                    bookingAgent.bookPassengerToFlight(passenger, flightID);
                    System.out.println();

                } else if (input == "5") {
                    bookingAgent.cancelFlight(flight);
                }

            } catch(Exception e) {
                System.out.println("Sorry, you have not chosen the options listed above");
                scanner.nextLine();
                continue;
            }
        }
    }
}

