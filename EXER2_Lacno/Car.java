public class Car {
    private String color;
    private String plateNo;
    private String chassisNo;
    private String model;
    private String engineType;
    private String transmission;


    
    //no argument constructor
    public Car() {
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis Number Yet";
        this.model = "No Model Yet";
        this.engineType = "No Engine Type Yet";
        this.transmission = "No Transmission Yet";
    }
    
    public Car(String color, String plateNo, String chassisNo, String model, String engineType, String transmission) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.model = model;
        this.engineType = engineType;
        this.transmission = transmission;

    }
    
    //----------- methods -----------
    public void displayInfo() {
        String info = "";
        info += "Color: " + this.color;
        info += "\nPlateNo: " + this.plateNo;
        info += "\nChassisNo: " + this.chassisNo;
        info += "\nModel: " + this.model;   
        info += "\nEngineType: " + this.engineType;
        info += "\nTransmission: " + this.transmission;
        System.out.println(info);
    }
}