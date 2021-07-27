package entity;

public enum GearType {
    MANUAL("Manual Transmission"),
    AUTOMATIC("Automatic Transmission");

    private final String value;

    GearType(String value) {
        this.value = value;
    }
}
