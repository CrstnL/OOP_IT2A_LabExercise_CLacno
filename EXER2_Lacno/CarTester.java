public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car("Yellow", "KAN1234S", "AB123", "Toyota Vios", "Gasoline", "Automatic");
        Car c2 = new Car("Black", "KAD5678D", "CD456", "Honda Civic", "Diesel", "Manual");
        Car c3 = new Car("White", "KAE9101F", "EF789", "Ford Focus", "Electric", "Automatic"); 
        Car c4 = new Car(); 
        Car c5 = new Car("Blue", "KAH3344J", "IJ345", "Nissan Altima", "Gasoline", "Manual"); 
        Car c6 = new Car("Green", "KAI5566K", "KL678", "Mazda 3", "Diesel", "Automatic"); 
        Car c7 = new Car("Silver", "KAL7788L", "MN901", "Volkswagen Jetta", "Gasoline", "Manual");
        Car c8 = new Car("Gray", "KAM9900M", "OP234", "Subaru Impreza", "Hybrid", "CVT"); 

        Car c9 = new Car("Red", "KAG1122H", "GH012", "Chevrolet Malibu", "Hybrid", "CVT");
        Car c10 = new Car();
        
        System.out.println("----------Car 1------------");
        c1.displayInfo();
        System.out.println("----------Car 2------------");
        c2.displayInfo();
        System.out.println("----------Car 3------------");
        c3.displayInfo();
        System.out.println("----------Car 4------------");
        c4.displayInfo();
        System.out.println("----------Car 5------------");
        c5.displayInfo();
        System.out.println("----------Car 6------------");
        c6.displayInfo();
        System.out.println("----------Car 7------------");
        c7.displayInfo();
        System.out.println("----------Car 8------------"); 
        c8.displayInfo();
        System.out.println("----------Car 9------------");
        c9.displayInfo();
        System.out.println("----------Car 10------------");
        c10.displayInfo();

    }
}