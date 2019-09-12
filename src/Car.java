class Car extends Vehicle {
    String carType;
    String transmission;
    int color;
    public Car (int speed, String carType, String transmission){
        super(speed);
        this.carType = carType;
        this.transmission = transmission;
    }
    //Override HW№3
    @Override
    public void speedUp (int up){
        this.up=up;
        speed = speed+(2*up);
    }
    // Overload HW№3
    public Car (int speed, String transmission, int color){
        super (speed);
        this.transmission = transmission;
        this.color = color;
    }
    // inner class
    class Sedan {
        public void choiseType(){
            System.out.println (carType+"? Good choise!");
        }
    }

}
