package ComputerV2_0.parts.HDD.api;

import ComputerV2_0.parts.api.IStandard;

public enum HDDstand implements IStandard {
    SATA,
    SAS;

    @Override
    public IStandard[] getStandard() {
        return new IStandard[0];
    }
}
