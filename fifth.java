// Design and develop a context for given case study and implement an interface for Vehicles
// Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
// functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
// these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
// functionalities in their own class in their own way.

interface Vehicle{
    void gearChange(int igear);
    void speedUp(int upSpeed);
    void appplyBrakes();
}

class Bicycle implements Vehicle{
    int gear;
    int speed;

    Bicycle(){
        gear = 1;
        speed = 0;
    }
    @Override
    public void gearChange(int igear){
        gear = igear;
        System.out.println("gear changed to "+gear);
    }

    @Override
    public void speedUp(int upSpeed){
        speed = upSpeed;
        System.out.println("speed increased to "+speed);
    }

    @Override
        public void appplyBrakes(){
            speed = 0;
            System.out.println("vehicle stopped");
        }
}



class Car implements Vehicle{
    int gear;
    int speed;

    Car(){
        gear = 1;
        speed = 0;
    }
    @Override
    public void gearChange(int igear){
        gear = igear;
        System.out.println("gear changed to "+gear);
    }

    @Override
    public void speedUp(int upSpeed){
        speed = upSpeed;
        System.out.println("speed increased to "+speed);
    }

    @Override
        public void appplyBrakes(){
            speed = 0;
            System.out.println("vehicle stopped");
        }
}



class Bike implements Vehicle{
    int gear;
    int speed;

    Bike(){
        gear = 1;
        speed = 0;
    }
    @Override
    public void gearChange(int igear){
        gear = igear;
        System.out.println("gear changed to "+gear);
    }

    @Override
    public void speedUp(int upSpeed){
        speed = upSpeed;
        System.out.println("speed increased to "+speed);
    }

    @Override
        public void appplyBrakes(){
            speed = 0;
            System.out.println("vehicle stopped");
        }
}

public class fifth {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        System.out.println("Testing Bicycle:");
        bicycle.gearChange(2);
        bicycle.speedUp(15);
        bicycle.appplyBrakes();
        

        System.out.println("\nTesting Bike:");
        bike.gearChange(3);
        bike.speedUp(40);
        bike.appplyBrakes();
        

        System.out.println("\nTesting Car:");
        car.gearChange(4);
        car.speedUp(60);
        car.appplyBrakes();
       
    }
}
