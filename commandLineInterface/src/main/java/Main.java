import bookingAgent.BookingAgent;
import passengers.Passenger;
import flights.Flight;

import java.util.Scanner;


public class Main {
    private static BookingAgent bookingAgent;
    static Scanner scanner;

//    Passenger passenger1 = new Passenger("Joe", "07628394756", 1);
//    Passenger passenger2 = new Passenger("Helix", "07635478209", 2);
//    Passenger passenger3 = new Passenger("Emma", "02076458873", 3);



    //CMD LIne

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
                //add a new flight
                if(input == "1") {
                    System.out.println("Enter the destination of the flight: ");
                    String destination = scanner.nextLine();
                    System.out.println("Enter the flight ID");
                    int flightID = scanner.nextInt();
                    Flight flight = new Flight(destination, flightID);
                    bookingAgent.addFlight(flight);
                    System.out.println("Here are your flight details " + flight);

                } else if (input == "2"){
                    bookingAgent.displayAllFlights();

                }else if (input == "3") {
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your phone number: ");
                    String contactNumber = scanner.nextLine();
                    System.out.println("Enter your customer ID: ");
                    Passenger passenger = new Passenger(name, contactNumber, customerID);
                    System.out.println("Your passenger details are: " + passenger);

                } else if (input == "4") {
                    bookingAgent.bookPassengerToFlight(Passenger passenger, flightID);
                    System.out.println();

                }else if (input == "5") {
                    bookingAgent.cancelFlight(Flight flight);
                }

            } catch(Exception e) {
                System.out.println("Sorry, you have not chosen the options listed above");
                scanner.nextLine();
                continue;
            }
            }
        //}




        //scanner read input
        // ca.. function

        //2.


        //if airline.equals(
        //String input = reader.nextLine()
        //generate passenger id and flight id
        //sout(input);
        //

        // options one till 10
        //book pass to flight
        // print both ids
        //peint our passenger and all details
        //print out all flight ids

    }
}

