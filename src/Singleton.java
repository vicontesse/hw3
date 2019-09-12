
class SingletonCar {
    private static SingletonCar car_instance = null;
    public String concept;
    private SingletonCar() {
        concept = "Concept cars are marvelous";

    }
    public static SingletonCar getInstance() {
        if (car_instance == null)
            car_instance = new SingletonCar();
        return car_instance;    } }
