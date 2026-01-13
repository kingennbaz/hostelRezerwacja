package main.java.hostel.domain;

import java.time.LocalDate;

public class Reservation {

    private final Guest guest;
    private final Room room;
    private final LocalDate from;
    private final LocalDate to;

    public Reservation(Guest guest, Room room, LocalDate from, LocalDate to) {
        if (guest == null || room == null) {
            throw new IllegalArgumentException("Guest and room required");
        }
        if (to.isBefore(from)) {
            throw new IllegalArgumentException("Invalid date range");
        }
        this.guest = guest;
        this.room = room;
        this.from = from;
        this.to = to;
    }

    public Room getRoom() {
        return room;
    }

    public String toCsv() {
        return guest.getId() + "," + room.description() + "," + from + "," + to;
    }
}
