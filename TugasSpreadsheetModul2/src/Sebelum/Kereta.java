package Sebelum;

public class Kereta {
    private String Namanya;
    private String trainName;
    private String departureStation;
    private String arrivalStation;
    private String departureTime;
    private double price;

    public Kereta(String passengerName, String trainName, String departureStation, String arrivalStation, String departureTime, double price) {
        this.setNamanya(passengerName);
        this.setTrainName(trainName);
        this.setDepartureStation(departureStation);
        this.setArrivalStation(arrivalStation);
        this.setDepartureTime(departureTime);
        this.setPrice(price);
    }

    public void printTicketDetails() {
        System.out.println("Passenger: " + getNamanya());
    }

    public static void main(String[] args) {
        Kereta booking1 = new Kereta("Alice", "Express 101", "Jakarta", "Bandung", "10:00 AM", 150000);
        booking1.printTicketDetails();
    }

    public String getNamanya() {
        return Namanya;
    }

    public void setNamanya(String namanya) {
        Namanya = namanya;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
