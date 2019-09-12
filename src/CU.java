// anonymous class
class CU {
    static Vehicle vehic = new Vehicle(103){
        void move (){
            super.move();
            System.out.println ("See You later!");
        }
    };
}