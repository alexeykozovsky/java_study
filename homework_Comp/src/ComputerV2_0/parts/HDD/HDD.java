package ComputerV2_0.parts.HDD;

import ComputerV2_0.parts.api.IParts;
import ComputerV2_0.parts.api.IStandard;

public class HDD implements IParts {
    private boolean isS = false;
    private IStandard HDDStandard;

    public HDD(IStandard HDDStandard) {
        this.HDDStandard = HDDStandard;
    }

    @Override
    public IStandard getParts() {
        return HDDStandard ;
    }

    @Override
    public boolean test(IStandard[] standards) {
        for (IStandard st: standards) {
            if (HDDStandard == st) {
                isS=true;
            }
        }
        if (isS) {
            System.out.println("HDD подходит");
        }
        else {
            System.out.println("HDD не подходит");
        }
        return isS;
    }
}
