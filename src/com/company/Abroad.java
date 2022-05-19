package com.company;

class Abroad extends Booking {
    String depAir;
    String ariAir; //Arival Port
    String flightNumber; // seaView OR internal

    Abroad() {
        super();
        depAir = "";
        ariAir = "";
        flightNumber = "";
    }
    //(depAir, ariAir, flightNumber, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
    Abroad(String da, String aa, String fn, int ppn, int np, int p, String sd, String ed, int n) {
        super(ppn, np, p, sd, ed, n);
        depAir = da;
        ariAir = aa;
        flightNumber = fn;
    }
    String getdepAir() {
        return depAir;
    }

    String getariAir() {
        return ariAir;
    }

    String getflightNumber() {
        return flightNumber;
    }

    void setdepAir(String n) {
        depAir = n;
    }

    void setAriAir(String n) {
        ariAir = n;
    }

    void setFlightNumber(String n) {
        flightNumber = n;
    }

    @Override
    public String toString() {
        return "International Booking - " +
                "Departure Airport: " + depAir + "\n" +
                "Arrival Airport: " + ariAir + "\n" +
                "Flight Number: " + flightNumber + "\n" +
                "Price Per Number: " + ppn + "\n" +
                "Number of People: " + numPeople + "\n" +
                "Number of Nights: " + numNights + "\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate + "\n"+
                "Total Price: " + totalPrice + "\n";
    }
}