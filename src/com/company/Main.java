package com.company;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    LinkedList<Booking> holidays = new LinkedList<Booking>();
    public static void main(String[] args) {
        Main mainObj = new Main();
        mainObj.menu();
    }
    public void menu() {
        int menuchoice = 0;
        System.out.println("=========================================");
        System.out.println("       Welcome to the Booking System     ");
        System.out.println("=========================================");
        System.out.println("         (1) Booking for a cruise        ");
        System.out.println("    (2) Booking for a Domestic holiday   ");
        System.out.println(" (3) Booking for a International holiday ");
        System.out.println("        (4) Logout of the system         ");
        System.out.println("       (5) [ADMIN] Check Bookings        ");
        System.out.println("=========================================");
        System.out.println(" ");
        Scanner number_input = new Scanner (System.in);
        System.out.println("Please select the option you would like to use: ");
        menuchoice = number_input.nextInt();

        switch(menuchoice) {
            case 1:
                newCruise();
            case 2:
                newDomestic();
            case 3:
                newInternational();
            case 4:
                System.out.println("Thank you for using this system.");
                System.exit(0);
            case 5:
                System.out.println(holidays.toString());
            default:
                menu();
        }
    }

    public void newCruise() {
        //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )
        System.out.println("=========================================");
        System.out.println("               Cruise System             ");
        System.out.println("=========================================");
        System.out.println("                (1) Paris                ");
        System.out.println("              (2) Amsterdam              ");
        System.out.println("               (3) Norway                ");
        System.out.println("        (4) Back to the main menu        ");
        System.out.println("=========================================");
        System.out.println(" ");
        Scanner number_input = new Scanner(System.in);
        System.out.println("Please select the option you would like to use: ");
        int menuchoice = 0;
        menuchoice = number_input.nextInt();
        switch (menuchoice) {
            case 1:
                CruiseDover();
            case 2:
                CruiseAmsterdam();
            case 3:
                CruiseNorway();
            default:
                menu();
        }
    }
    public void newDomestic() {
        //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )
        System.out.println("=========================================");
        System.out.println("              Domestic System            ");
        System.out.println("=========================================");
        System.out.println("             (1) Manchester              ");
        System.out.println("              (2) Newcastle              ");
        System.out.println("               (3) Glasgow               ");
        System.out.println("        (4) Back to the main menu        ");
        System.out.println("=========================================");
        System.out.println(" ");
        Scanner number_input = new Scanner(System.in);
        System.out.println("Please select the option you would like to use: ");
        int menuchoice = 0;
        menuchoice = number_input.nextInt();
        switch (menuchoice) {
            case 1:
                DomesticManchester();
            case 2:
                DomesticNewcastle();
            case 3:
                DomesticGlasgow();
            default:
                menu();
        }
    }
    public void newInternational() {
        //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )
        System.out.println("=========================================");
        System.out.println("           International System          ");
        System.out.println("=========================================");
        System.out.println("               (1) Hamburg               ");
        System.out.println("              (2) Brussles               ");
        System.out.println("               (3) Iceland               ");
        System.out.println("        (4) Back to the main menu        ");
        System.out.println("=========================================");
        System.out.println(" ");

        Scanner number_input = new Scanner(System.in);
        System.out.println("Please select the option you would like to use: ");
        int menuchoice = 0;
        menuchoice = number_input.nextInt();
        switch (menuchoice) {
            case 1:
                InternationalHamburg();
            case 2:
                InternationalBrussles();
            case 3:
                InternationalIceland();
            default:
                menu();
        }
    }
    public void InternationalHamburg() {
        Scanner number_input = new Scanner (System.in);
        int ppn = 53;
        int n = 12;
        String sd = "10/07/2022";
        String ed = "22/07/2022";
        String da = "EGLL";
        String aa = "EDDH";
        String fn = "BA926";
        System.out.println("Please select the number of people you are taking: ");
        int np = number_input.nextInt();
        int p = ppn * np * n; // = ppn * numPeople * numNights

        System.out.println("Departure Airport: "+da);
        System.out.println("Arrival Airport: "+aa);
        System.out.println("Flight Number: "+fn);
        System.out.println("Price Per Night: £"+ppn );
        System.out.println("Number of People: "+np);
        System.out.println("Start Date: "+sd);
        System.out.println("End Date: "+ed);
        System.out.println("Number of Nights: "+n);
        System.out.println("Total Price: £"+p);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                //(depAir, ariAir, flightNumber, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
                holidays.add(new Abroad(da, aa, fn, ppn, np, p, sd, ed, n));
                //holidays.add(new Abroad("test", "test", "test", 5, 5, 100, "test", "test", 5));
                System.out.println("Booking Comfirmed.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
    public void InternationalBrussles() {
        Scanner number_input = new Scanner (System.in);
        int ppn = 53;
        int n = 12;
        String sd = "10/07/2022";
        String ed = "22/07/2022";
        String da = "EGLL";
        String aa = "EBBR";
        String fn = "BA953";
        System.out.println("Please select the number of people you are taking: ");
        int np = number_input.nextInt();
        int p = ppn * np * n; // = ppn * numPeople * numNights

        System.out.println("Departure Airport: "+da);
        System.out.println("Arrival Airport: "+aa);
        System.out.println("Flight Number: "+fn);
        System.out.println("Price Per Night: £"+ppn );
        System.out.println("Number of People: "+np);
        System.out.println("Start Date: "+sd);
        System.out.println("End Date: "+ed);
        System.out.println("Number of Nights: "+n);
        System.out.println("Total Price: £"+p);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                //(depAir, ariAir, flightNumber, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
                holidays.add(new Abroad(da, aa, fn, ppn, np, p, sd, ed, n));
                System.out.println("Booking Comfirmed.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
    public void InternationalIceland() {
        Scanner number_input = new Scanner (System.in);
        int ppn = 53;
        int n = 12;
        String sd = "10/07/2022";
        String ed = "22/07/2022";
        String da = "EGLL";
        String aa = "BIKF";
        String fn = "BA623";
        System.out.println("Please select the number of people you are taking: ");
        int np = number_input.nextInt();
        int p = ppn * np * n; // = ppn * numPeople * numNights

        System.out.println("Departure Airport: "+da);
        System.out.println("Arrival Airport: "+aa);
        System.out.println("Flight Number: "+fn);
        System.out.println("Price Per Night: £"+ppn );
        System.out.println("Number of People: "+np);
        System.out.println("Start Date: "+sd);
        System.out.println("End Date: "+ed);
        System.out.println("Number of Nights: "+n);
        System.out.println("Total Price: £"+p);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                //(depAir, ariAir, flightNumber, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
                holidays.add(new Abroad(da, aa, fn, ppn, np, p, sd, ed, n));
                System.out.println("Booking Comfirmed.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
    public void DomesticManchester() {
        Scanner number_input = new Scanner (System.in);
        String accom  = "";
        int accomType  = 0;
        String retPort = "Manchester";
        int PricePerNight = 23;
        int numNights = 14;
        String startDate = "10/07/2022";
        String endDate = "24/07/2022";
        System.out.println("Please select the number of people you are taking: ");
        int NumPeople = number_input.nextInt();
        int PriceTotal = PricePerNight * NumPeople * numNights; // = ppn * numPeople * numNights
        do {
            System.out.println("Please select the type of cabin: Property [15 pound more per night] (1) or Room (2)");
            accomType = number_input.nextInt();
            if (accomType == 1) {
                PricePerNight = PricePerNight + 15;
                accom = "Room"; //room OR property
            } else if (accomType == 2) {
                accom = "Property"; //room OR property
            } else {
                System.out.println("Please provide a correct repsonce");
            }
        }while (accomType != 1 && accomType != 2);
        System.out.println("Accomidation Type: "+accom);
        System.out.println("Price Per Night: "+PricePerNight);
        System.out.println("Number of People: "+NumPeople);
        System.out.println("Start Date: "+startDate);
        System.out.println("End Date: "+endDate);
        System.out.println("Number of Nights: "+numNights);
        System.out.println("Total Price: £"+PriceTotal);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                //(accom, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
                holidays.add(new UKBased(accom, PricePerNight, numNights, PriceTotal, startDate, endDate, numNights));
                System.out.println("Booking Comfired.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
    public void DomesticNewcastle() {
        Scanner number_input = new Scanner (System.in);
        String accom  = "";
        int accomType  = 0;
        String retPort = "NewCastle";
        int PricePerNight = 36;
        int numNights = 18;
        String startDate = "10/07/2022";
        String endDate = "28/07/2022";
        System.out.println("Please select the number of people you are taking: ");
        int NumPeople = number_input.nextInt();
        int PriceTotal = PricePerNight * NumPeople * numNights; // = ppn * numPeople * numNights
        do {
            System.out.println("Please select the type of cabin: Property [15 pound more per night] (1) or Room (2)");
            accomType = number_input.nextInt();
            if (accomType == 1) {
                PricePerNight = PricePerNight + 15;
                accom = "Room"; //room OR property
            } else if (accomType == 2) {
                accom = "Property"; //room OR property
            } else {
                System.out.println("Please provide a correct repsonce");
            }
        }while (accomType != 1 && accomType != 2);
        System.out.println("Accomidation Type: "+accom);
        System.out.println("Price Per Night: "+PricePerNight);
        System.out.println("Number of People: "+NumPeople);
        System.out.println("Start Date: "+startDate);
        System.out.println("End Date: "+endDate);
        System.out.println("Number of Nights: "+numNights);
        System.out.println("Total Price: £"+PriceTotal);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                //(accom, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
                holidays.add(new UKBased(accom, PricePerNight, numNights, PriceTotal, startDate, endDate, numNights));
                System.out.println("Booking Comfirmed.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
    public void DomesticGlasgow() {
        Scanner number_input = new Scanner (System.in);
        String accom  = "";
        int accomType  = 0;
        String retPort = "NewCastle";
        int PricePerNight = 36;
        int numNights = 18;
        String startDate = "10/07/2022";
        String endDate = "28/07/2022";
        System.out.println("Please select the number of people you are taking: ");
        int NumPeople = number_input.nextInt();
        int PriceTotal = PricePerNight * NumPeople * numNights; // = ppn * numPeople * numNights
        do {
            System.out.println("Please select the type of cabin: Property [15 pound more per night] (1) or Room (2)");
            accomType = number_input.nextInt();
            if (accomType == 1) {
                PricePerNight = PricePerNight + 15;
                accom = "Room"; //room OR property
            } else if (accomType == 2) {
                accom = "Property"; //room OR property
            } else {
                System.out.println("Please provide a correct repsonce");
            }
        }while (accomType != 1 && accomType != 2);
        System.out.println("Accomidation Type: "+accom);
        System.out.println("Price Per Night: "+PricePerNight);
        System.out.println("Number of People: "+NumPeople);
        System.out.println("Start Date: "+startDate);
        System.out.println("End Date: "+endDate);
        System.out.println("Number of Nights: "+numNights);
        System.out.println("Total Price: £"+PriceTotal);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                //(accom, ppn, numPeople, totalPrice, startDate, endDate ,numNights)
                holidays.add(new UKBased(accom, PricePerNight, numNights, PriceTotal, startDate, endDate, numNights));
                System.out.println("Booking Comfirmed.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
    public void CruiseDover() {
        Scanner number_input = new Scanner (System.in);
        String depPort = "Dover";
        String retPort = "Paris";
        int PricePerNight = 23;
        int numNights = 12;
        String startDate = "10/07/2022";
        String endDate = "22/07/2022";
        int cabinType = 0;
        String cabinTypeName = "";
        do {
            System.out.println("Please select the type of cabin: Sea View [6 pound more per night] (1) or Internal (2)");
            cabinType = number_input.nextInt();
            if (cabinType == 1) {
                PricePerNight = PricePerNight + 6;
                cabinTypeName = "Sea View";
            } else if (cabinType == 2) {
                cabinTypeName = "Internal";
            } else {
                System.out.println("Please provide a correct repsonce");
            }
        }while (cabinType != 1 && cabinType != 2);

        System.out.println("Please select the number of people you are taking: ");
        int NumPeople = number_input.nextInt();
        int PriceTotal = PricePerNight * NumPeople * numNights; // = ppn * numPeople * numNights
        System.out.println("Cabin Type:" +cabinTypeName);
        System.out.println("Departure Port:" +depPort);
        System.out.println("Return Port:" +retPort);
        System.out.println("Price Per Night: £" +PricePerNight);
        System.out.println("Number of People:" +NumPeople);
        System.out.println("Start Date:" +startDate);
        System.out.println("End Date:" +endDate);
        System.out.println("Number of Nights: "+numNights);
        System.out.println("Total Price: £"+PriceTotal);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                holidays.add(new Cruise(cabinTypeName, depPort, retPort, PricePerNight, NumPeople, PriceTotal, startDate, endDate, numNights));
                System.out.println("Booking Comfirmed.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
    public void CruiseAmsterdam() {
        Scanner number_input = new Scanner (System.in);
        String depPort = "Dover";
        String retPort = "Amsterdam";
        int PricePerNight = 29;
        int numNights = 16;
        String startDate = "15/07/2022";
        String endDate = "21/07/2022";
        int cabinType = 0;
        String cabinTypeName = "";
        do {
            System.out.println("Please select the type of cabin: Sea View [9 pound more per night] (1) or Internal (2)");
            cabinType = number_input.nextInt();
            if (cabinType == 1) {
                PricePerNight = PricePerNight + 9;
                cabinTypeName = "Sea View";
            } else if (cabinType == 2) {
                cabinTypeName = "Internal";
            } else {
                System.out.println("Please provide a correct repsonce");
            }
        }while (cabinType != 1 && cabinType != 2);

        System.out.println("Please select the number of people you are taking: ");
        int NumPeople = number_input.nextInt();
        int PriceTotal = PricePerNight * NumPeople * numNights; // = ppn * numPeople * numNights
        System.out.println("Cabin Type:" +cabinTypeName);
        System.out.println("Departure Port:" +depPort);
        System.out.println("Return Port:" +retPort);
        System.out.println("Price Per Night: £" +PricePerNight);
        System.out.println("Number of People:" +NumPeople);
        System.out.println("Start Date:" +startDate);
        System.out.println("End Date:" +endDate);
        System.out.println("Number of Nights: "+numNights);
        System.out.println("Total Price: £"+PriceTotal);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                holidays.add(new Cruise(cabinTypeName, depPort, retPort, PricePerNight, NumPeople, PriceTotal, startDate, endDate, numNights));
                System.out.println("Booking Comfirmed.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
    public void CruiseNorway() {
        Scanner number_input = new Scanner (System.in);
        String depPort = "Edinburgh";
        String retPort = "Norway";
        int PricePerNight = 36;
        int numNights = 19;
        String startDate = "01/08/2022";
        String endDate = "20/08/2022";
        int cabinType = 0;
        String cabinTypeName = "";
        do {
            System.out.println("Please select the type of cabin: Sea View [9 pound more per night] (1) or Internal (2)");
            cabinType = number_input.nextInt();
            if (cabinType == 1) {
                PricePerNight = PricePerNight + 9;
                cabinTypeName = "Sea View";
            } else if (cabinType == 2) {
                cabinTypeName = "Internal";
            } else {
                System.out.println("Please provide a correct repsonce");
            }
        }while (cabinType != 1 && cabinType != 2);

        System.out.println("Please select the number of people you are taking: ");
        int NumPeople = number_input.nextInt();
        int PriceTotal = PricePerNight * NumPeople * numNights; // = ppn * numPeople * numNights
        System.out.println("Cabin Type:" +cabinTypeName);
        System.out.println("Departure Port:" +depPort);
        System.out.println("Return Port:" +retPort);
        System.out.println("Price Per Night: £" +PricePerNight);
        System.out.println("Number of People:" +NumPeople);
        System.out.println("Start Date:" +startDate);
        System.out.println("End Date:" +endDate);
        System.out.println("Number of Nights: "+numNights);
        System.out.println("Total Price: £"+PriceTotal);

        System.out.println("Please review then type 'y' to confirm booking: ");
        String menuOption = number_input.next();
        switch(menuOption) {
            case "y":
                holidays.add(new Cruise(cabinTypeName, depPort, retPort, PricePerNight, NumPeople, PriceTotal, startDate, endDate, numNights));
                System.out.println("Booking Comfirmed.");
                menu();
            default:
                System.out.println("Booking Cancelled.");
                menu();
        }
    }
}