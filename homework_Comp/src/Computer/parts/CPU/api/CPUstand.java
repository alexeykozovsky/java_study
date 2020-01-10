package Computer.parts.CPU.api;

import Computer.Computer;
import Computer.parts.api.IStandard;

public enum CPUstand implements IStandard {
    ZEN,
    XEON;

    public IStandard[] getStandard() {
        return new IStandard[0];
    }
}
