package academy.service;

import academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("John", "Yellow", 50);
        Truck truck2 = new Truck("Andrew", "Red", 30);
        Truck truck3 = new Truck("Toney", "Black", 40);
        return List.of(truck1, truck2, truck3);
    }
}
