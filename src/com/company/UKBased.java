package com.company;

class UKBased extends Booking {
    String accom; //accomadation - room OR property

    UKBased() {
        super();
        accom = "";
    }

    //(accom, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
    UKBased(String ac, int ppn, int np, int p, String sd, String ed, int n) {
        super(ppn, np, p, sd, ed, n);
        accom = ac;
    }

    String getaccom() {
        return accom;
    }

    void setaccom(String n) {
        accom = n;
    }

    @Override
    public String toString() {
        return "Domestic Booking - " +
                "Accomadation Type: " + accom + "\n" +
                "Price Per Number: " + ppn + "\n" +
                "Number of People: " + numPeople + "\n" +
                "Number of Nights: " + numNights + "\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate + "\n"+
                "Total Price: " + totalPrice + "\n";
    }
}
