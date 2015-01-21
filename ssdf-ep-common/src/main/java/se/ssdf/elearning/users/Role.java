package se.ssdf.elearning.users;

public enum Role {
    ADMINISTRATOR("ROLE_ADMIN"),
    INSTRUCTOR("ROLE_INSTRUCTOR"),
    USER("ROLE_USER");

    private final String name;

    private Role(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
