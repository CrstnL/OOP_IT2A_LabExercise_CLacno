 class WaterTransport extends Transportation {
    public WaterTransport(String type, int speed, int capacity) {
        super(type, speed, capacity);
    }

    @Override
    public void move() {
          System.out.println(getType() + " is moving at " + getSpeed() + " km/h.");
    }
}
