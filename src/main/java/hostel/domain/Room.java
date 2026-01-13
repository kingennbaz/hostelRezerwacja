package main.java.hostel.domain;

public abstract class Room implements Bookable, Exportable {

    protected final String id;
    protected final int beds;
    protected boolean occupied;

    protected Room(String id, int beds) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Room id cannot be empty");
        }
        if (beds <= 0) {
            throw new IllegalArgumentException("Beds must be greater than 0");
        }
        this.id = id;
        this.beds = beds;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    protected void occupy() {
        this.occupied = true;
    }

    protected void release() {
        this.occupied = false;
    }

    @Override
    public void book() {
        if (occupied) {
            throw new IllegalStateException("Room already occupied");
        }
        occupy();
    }

    @Override
    public void cancel() {
        release();
    }

    @Override
    public boolean isAvailable() {
        return !occupied;
    }

    public abstract String description();
}
