package Computer.parts.HDD.api;

import Computer.parts.api.IStandard;

public enum HDDstand implements IStandard {
    SATA,
    SAS;

    @Override
    public IStandard[] getStandard() {
        return new IStandard[0];
    }
}
