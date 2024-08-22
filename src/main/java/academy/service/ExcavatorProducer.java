package academy.service;

import academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator>{

    @Override
    public List get() {
        Excavator excavator1 = new Excavator("Steve", "Black", 4);
        Excavator excavator2 = new Excavator("Vincent", "White", 5);
        Excavator excavator3 = new Excavator("Mark", "Blue", 3);
        return List.of(excavator1, excavator2, excavator3);
    }
}
