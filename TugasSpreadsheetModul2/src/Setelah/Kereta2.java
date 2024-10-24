package Setelah;

public class Kereta2 {
    private String name;

    public Kereta2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Train {
    private String trainName;

    public Train(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainName() {
        return trainName;
    }
}

class Route {
    private String departureStation;
    private String arrivalStation;

    public Route(String departureStation, String arrivalStation) {
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }
}

class Ticket {
    private Kereta2 kereta2;
    private Train train;
    private Route route;
    private String departureTime;
    private double price;

    public Ticket(Kereta2 kereta2, Train train, Route route, String departureTime, double price) {
        this.kereta2 = kereta2;
        this.train = train;
        this.route = route;
        this.departureTime = departureTime;
        this.price = price;
    }

    public void printTicketDetails() {
        System.out.println("Passenger: " + kereta2.getName());
        System.out.println("Train: " + train.getTrainName());
        System.out.println("From: " + route.getDepartureStation() + " To: " + route.getArrivalStation());
        System.out.println("Departure: " + departureTime);
        System.out.println("Price: $" + price);
    }
}

class Main {
    public static void main(String[] args) {
        Kereta2 kereta2 = new Kereta2("Alice");
        Train train = new Train("Express 101");
        Route route = new Route("Jakarta", "Bandung");
        Ticket ticket = new Ticket(kereta2, train, route, "10:00 AM", 150000);

        ticket.printTicketDetails();
    }
}
