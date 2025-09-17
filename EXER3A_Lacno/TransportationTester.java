public class TransportationTester {
    public static void main(String[] args) {
        
        AirTransport a1 = new Helicopter();
        a1.displayInfo();
        a1.move();

        System.out.print("----------------------------------------");

        AirTransport a2 = new Airplane();
        a2.displayInfo();
        a2.move();

        System.out.print("----------------------------------------");

        AirTransport a3 = new SpaceShuttle();
        a3.displayInfo();
        a3.move();

        System.out.print("----------------------------------------");

        LandTransport l1 = new Truck();
        l1.displayInfo();
        l1.move();

        System.out.print("----------------------------------------");

        LandTransport l2 = new Suv();
        l2.displayInfo();
        l2.move();

        System.out.print("----------------------------------------");

        LandTransport l3 = new Tricycle();
        l3.displayInfo();
        l3.move();

        System.out.print("----------------------------------------");

        LandTransport l4 = new Motorcycle();
        l4.displayInfo();
        l4.move();

        System.out.print("----------------------------------------");

        LandTransport l5 = new Kariton();
        l5.displayInfo();
        l5.move();

        System.out.print("----------------------------------------");

        WaterTransport w1 = new Ship();
        w1.displayInfo();
        w1.move();

        System.out.print("----------------------------------------");
        
        WaterTransport w2 = new Submarine();
        w2.displayInfo();
        w2.move();
    }
}
