package main.java.hostel.domain;

public class DormRoom extends Room {

    public static final int MAX_DORM_BEDS = 12;

    private final int lockers;

    public DormRoom(String id, int beds, int lockers) {
        super(id, beds);
        if (beds > MAX_DORM_BEDS) {
            throw new IllegalArgumentException("Dorm beds exceed maximum");
        }
        if (lockers < 0) {
            throw new IllegalArgumentException("Lockers cannot be negative");
        }
        this.lockers = lockers;
    }

    @Override
    public String description() {
        return "Dorm room (" + beds + " beds, " + lockers + " lockers)";
    }

    @Override
    public String toCsv() {
        return id + ",DORM," + beds + "," + lockers + "," + occupied;
    }
}
