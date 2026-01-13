package main.java.hostel.domain;

public class Guest {

    private final String id;
    private final String name;
    private final String email;

    public Guest(String id, String name, String email) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Guest id required");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Guest name required");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }
}
