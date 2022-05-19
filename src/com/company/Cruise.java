package com.company;

class Cruise extends Booking {
    String depPort;
    String retPort; //Return Port
    String cabinType; // seaView OR internal

    Cruise() {
        super();
        depPort = "";
        retPort = "";
        cabinType = "";
    }

    //(cabinType, depPort, retPort, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
    Cruise(String c, String idp, String irp, int ppn, int np, int p, String sd, String ed, int n) {
        super(ppn, np, p, sd, ed, n);
        cabinType = c;
        depPort = idp;
        retPort = irp;
    }

    String getdepPort() {
        return depPort;
    }

    String getretPort() {
        return retPort;
    }

    String getcabinType() {
        return cabinType;
    }

    void setDepPort(String n) {
        depPort = n;
    }

    void setRetPort(String n) {
        retPort = n;
    }

    void setCabinType(String n) {
        cabinType = n;
    }

    @Override
    public String toString() {
        return "Cruise Booking - " +
                "Departure Port: " + depPort + "\n" +
                "Return Port: " + retPort + "\n" +
                "Cabin Type: " + cabinType + "\n" +
                "Price Per Number: " + ppn + "\n" +
                "Number of People: " + numPeople + "\n" +
                "Number of Nights: " + numNights + "\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate + "\n"+
                "Total Price: " + totalPrice + "\n";
    }
}