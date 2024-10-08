package academy.service;

import academy.model.*;

import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer machineProducer = null;
        if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
        }
        if (Truck.class.equals(type)) {
            machineProducer = new TruckProducer();
        }
        if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProducer();
        }
        return machineProducer != null ? machineProducer.get() : Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (value != null) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, value);
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
