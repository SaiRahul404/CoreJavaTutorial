package org.example;

abstract class DeliveryVehicle {
    String vehicleId;

    DeliveryVehicle(String id) {
        this.vehicleId = id;
    }

    abstract int calculateETA(); // in minutes

    void track() {
        System.out.println("Tracking vehicle: " + vehicleId);
    }
}

class BikeCourier extends DeliveryVehicle {
    BikeCourier(String id) {
        super(id);
    }

    @Override
    int calculateETA() {
        return 15;
    }
}

class TruckDelivery extends DeliveryVehicle {
    TruckDelivery(String id) {
        super(id);
    }

    @Override
    int calculateETA() {
        return 60;
    }
}

class CycleDelivery extends DeliveryVehicle {

    CycleDelivery(String id) {
        super(id);
    }

    @Override
    int calculateETA() {
        return 100;
    }
}
