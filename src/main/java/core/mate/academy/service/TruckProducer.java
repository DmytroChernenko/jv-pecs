package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        return List.of(new Truck(), new Truck(), new Truck());
    }
}
