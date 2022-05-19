package com.company;

class Booking {
    int ppn; //Price per person per night
    int numPeople;
    int totalPrice; // = ppn * numPeople * numNights
    String startDate;
    String endDate;
    int numNights;

    Booking() {
        ppn = 0;
        numPeople = 0;
        totalPrice = 0;
        startDate = "";
        endDate = "";
        numNights = 0;
    }

    Booking(int ippn, int inp, int ip, String isd, String ied, int in) {
        //(ppn, numPeople, totalPrice, startDate, endDate ,numNights)
        ppn = ippn;
        numPeople = inp;
        totalPrice = ip;
        startDate = isd;
        endDate = ied;
        numNights = in;
    }

    int getppn() {
        return ppn;
    }

    int getnumPeople() {
        return numPeople;
    }

    int gettotalPrice() {
        return totalPrice;
    }

    String getstartDate() {
        return startDate;
    }

    String getendDate() {
        return endDate;
    }

    int getnumNights() {
        return numNights;
    }

    void setppn(int n) {
        ppn = n;
    }

    void setNumPeople(int n) {
        numPeople = n;
    }

    void settotalPrice(int n) {
        totalPrice = n;
    }

    void setstartDate(String n) {
        startDate = n;
    }

    void setendDate(String n) {
        endDate = n;
    }

    void setnumNights(int n) {
        numNights = n;
    }
}
