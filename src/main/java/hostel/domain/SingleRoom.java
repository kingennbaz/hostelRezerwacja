package main.java.hostel.domain;

public class SingleRoom extends Room {

    public SingleRoom(String id) {
        super(id, 1);
    }

    @Override
    public String description() {
        return "Single room (1 bed)";
    }

    @Override
    public String toCsv() {
        return id + ",SINGLE," + beds + "," + occupied;
    }
}
