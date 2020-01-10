package Computer.parts.RAM.api;

import Computer.parts.api.IStandard;

public enum RAMstand implements IStandard {
    DDR1,
    DDR2,
    DDR3,
    DDR4;

    @Override
    public IStandard[] getStandard() {
        return new IStandard[0];
    }
}
