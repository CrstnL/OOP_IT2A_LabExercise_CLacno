public class Transportation {
    private String type;
    private int speed;
    private int capacity;  

    public Transportation(String Type, int Speed, int Capacity) {
        this.type = Type;
        this.speed = Speed;
        this.capacity = Capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void move() {
        System.out.println(type + " is moving.");
    }
    public void displayInfo() {
        System.out.println("\nType: " + type + "\nSpeed: " + speed + "\nCapacity: " + capacity);
    }
}