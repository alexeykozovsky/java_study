package Computer.parts.RAM;

import Computer.parts.api.IParts;
import Computer.parts.api.IStandard;

public class RAM implements IParts {
    private boolean isS = false;
    private IStandard RAMStandard;

    public RAM(IStandard RAMStandard) {
        this.RAMStandard = RAMStandard;
    }

    @Override
    public IStandard getParts() {
        return RAMStandard ;
    }

    @Override
    public boolean test(IStandard[] standards) {
        for (IStandard st: standards) {
            if (RAMStandard == st) {
                isS=true;
            }
        }
        if (isS) {
            System.out.println("RAM подходит");
        }
        else {
            System.out.println("RAM не подходит");
        }
        return isS;
    }
}
