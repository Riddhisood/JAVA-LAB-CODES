interface Vehicle {

    default void start() {
        System.out.println("Vehicle starting...");
    }
}

public class Exp67_VehicleInterface implements Vehicle {

    public static void main(String[] args) {

        Exp67_VehicleInterface v = new Exp67_VehicleInterface();
        v.start();
    }
}