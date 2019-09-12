class Vehicle {
        int speed;
        int up;
        int brake;
        private String model;

        public Vehicle(int speed) {
                this.speed = speed;
        }

        void speedUp(int up) {
                this.up = up;
                speed = speed + up;
                System.out.println("SpeedUp =" + up);
        }

        void applyBrake(int brake) {
                this.brake = brake;
                speed = speed - brake;
                System.out.println("Brake On =" + brake);
        }

        void setModel(String model) {
                this.model = model;
        }

        String getModel() {
                return model;
        }

        void move() {
                System.out.println("Let's Go!");
        }

        final void stop() {
                System.out.println("That's all!");
        }
}
/*абстрактный вместе c Bicycle
public abstract class Vehicle {
        private int speed;
        private int up;
        private int brake;
        private String model

        abstract void speedUp();
        abstract void applyBrake();
        void setModel(String model) {
                this.model = model;
        }
        public String getModel(){return model;
        }
        public abstract void move();
        final void stop();
*/
