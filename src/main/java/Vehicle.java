class Vehicle {

    private String name;
    private String brand;

    public Vehicle(String name, String brand) {
        this.name = name;
        this.brand = brand;


    }

    public void SpeedUp(int speed) {
        System.out.println("Name: " + this.name + " Brand: " + this.brand + " Speed: " + speed);
    }


}

class Car extends Vehicle{
    public Car(String name, String brand){
        super(name, brand);
    }
    @Override
    public void SpeedUp(int speed){
        if (speed >= 190){
            super.SpeedUp(speed);
        } else{
            System.out.println("Fail to speedup!");
        }
    }
}

class Bus extends Vehicle{
    public Bus(String name, String brand){
        super(name, brand);
    }
    @Override
    public void SpeedUp(int speed){
        if (speed >= 80){
            super.SpeedUp(speed);
            System.out.println("Fail to speedup!");
        } else{
            System.out.println("Fail to speedup!");
        }
    }
}
