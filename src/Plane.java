public interface Plane {
    final String nameOfManufacturer = "Boeing";

    void landing();

    //default method
    default void autoPilot() {
        System.out.println("Autopilot ON!");
    }
}