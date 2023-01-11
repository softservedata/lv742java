package orest.edu05.car;

public enum Type {
    SUV("SUV"),
    SEDAN("Sedan"),
    COUPE("Coupe"),
    MINIVAN("Minivan");

    final String type;

    Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
