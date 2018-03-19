package pl.sda.projectY.type;

public enum Role {
    ADMIN("ADMIN"),
    STUDENT("STUDENT"),
    INSTRUCTOR("INSTRUCTOR");

    private String role;

    Role(String role) {
        this.role=role;
    }

    @Override
    public String toString() {
        return role;
    }
}
