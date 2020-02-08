package ComputerV2_0.parts.CPU.api;

import ComputerV2_0.parts.api.IStandard;

public enum CPUstand implements IStandard {
    ZEN,
    XEON;

    public IStandard[] getStandard() {
        return new IStandard[0];
    }
}
