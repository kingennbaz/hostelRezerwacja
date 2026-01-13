package main.java.hostel.service;

import main.java.hostel.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReservationService {

    private final List<Reservation> reservations = new ArrayList<>();

    public Reservation createReservation(Guest guest, Room room,
                                         LocalDate from, LocalDate to) {
        if (!room.isAvailable()) {
            throw new IllegalStateException("Room not available");
        }
        room.book();
        Reservation reservation = new Reservation(guest, room, from, to);
        reservations.add(reservation);
        return reservation;
    }

    public void cancelReservation(Reservation reservation) {
        reservation.getRoom().cancel();
        reservations.remove(reservation);
    }

    public List<Reservation> getReservations() {
        return Collections.unmodifiableList(reservations);
    }
}
