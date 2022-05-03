package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/main/resources/collections/flights.txt";
    final Path path = Paths.get(Histogram.class.getResource(file).toURI());
    List<String> list = new ArrayList<>(Files.readAllLines(path, charset));
    Map<String, ArrayList<String>> flights = new HashMap<>();
    public static ArrayList<String> cities = new ArrayList<>();

    public FlightPlanner() throws IOException, URISyntaxException {
    }

    public static void main(String[] args) throws IOException, URISyntaxException {

        Scanner input = new Scanner(System.in);
        FlightPlanner flightPlanner = new FlightPlanner();
        ArrayList<String> flight = new ArrayList<>();

        flightPlanner.flightEntry();
        System.out.println("What do you want to do?: ");

        while (true) {
            System.out.println();
            System.out.println("To display list of cities, press 1");
            System.out.println("To exit program, press #");
            String chosen = input.nextLine();
            if (chosen.equals(String.valueOf(1))) {
                flightPlanner.displayList(cities);
            } else if (input.equals("#")) {
                System.out.println("Goodbye! Have a good day.");
                break;
            } else {
                System.out.println("Invalid input!");
                continue;
            }

            while (true) {
                System.out.println("Where do you want to start your trip from?: ");
                try {
                    String startingDestination = input.nextLine();
                    flight.add(startingDestination);
                    String destination = startingDestination;
                    while (true) {
                        String nextCity = flightPlanner.getNextCity(destination);
                        flight.add(nextCity);
                        if (nextCity.equals(startingDestination))
                            break;
                        destination = nextCity;
                    }
                    flightPlanner.route(flight);
                    break;
                } catch (NullPointerException e) {
                    System.out.println("Invalid city!");
                }
            }
        }

    }

    public void flightEntry() throws IOException {
        for (String city : list) {
            String[] cities = city.split("->");
            String from = cities[0].trim();
            String to = cities[1].trim();
        }
    }

    public void defineCity(String city) {
        if (!cities.contains(city)) {
            cities.add(city);
            flights.put(city, new ArrayList<>());
        }
    }

    public ArrayList<String> destinations(String city) {
        return flights.get(city);
    }

    public void displayList(ArrayList<String> cities) {
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public String getNextCity(String city) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> destinations = destinations(city);
        String nextCity;
        System.out.println("From " + city + " you can fly directly to: ");
        displayList(destinations);
        while (true) {
            System.out.println("Where do you want to go from " + city + "? ");
            nextCity = in.nextLine();
            if (!destinations.contains(nextCity)) {
                System.out.println("Invalid city name");
            } else {
                break;
            }
        }
        System.out.println(nextCity);
        return nextCity;
    }

    public void route(ArrayList<String> route) {
        System.out.println("Your chosen route is: ");
        for (int i = 0; i < route.size(); i++) {
            if (i == route.size() - 1) {
                System.out.println(route.get(1));
            } else {
                System.out.println(route.get(i) + " to ");
            }
        }
    }
}
