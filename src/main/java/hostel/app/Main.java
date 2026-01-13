package main.java.hostel.app;

import main.java.hostel.domain.*;
import main.java.hostel.service.*;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Room single = new SingleRoom("S1");
        Room dorm = new DormRoom("D1", 6, 6);

        Guest guest = new Guest("G1", "Jan Kowalski", "jan@test.pl");

        ReservationService reservationService = new ReservationService();
        ReportingService reportingService = new ReportingService();

        reservationService.createReservation(
                guest,
                single,
                LocalDate.now(),
                LocalDate.now().plusDays(2)
        );

        String roomReport = reportingService.generateCsv(
                List.of(single, dorm)
        );

        System.out.println(roomReport);
    }
}
