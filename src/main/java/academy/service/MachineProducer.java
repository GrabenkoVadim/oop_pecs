package academy.service;

import academy.model.Machine;

import java.util.List;

public interface MachineProducer <T extends  Machine> {
       List<T>get();
}

