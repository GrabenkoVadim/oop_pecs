package academy.service;

import academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("A25", "Brown", 430);
        Bulldozer bulldozer2 = new Bulldozer("L57", "Grey", 410);
        Bulldozer bulldozer3 = new Bulldozer("K1A3", "Pink", 480);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}

