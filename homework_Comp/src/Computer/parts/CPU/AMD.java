package Computer.parts.CPU;

import Computer.parts.api.IParts;
import Computer.parts.api.IStandard;

public class AMD implements IParts {
    private IStandard CPUStandard;

    public AMD(IStandard CPUStandard) {
        this.CPUStandard = CPUStandard;
    }

    @Override
    public IStandard getParts() {
        return CPUStandard;
    }

    @Override
    public boolean test(IStandard[] standards) {
        boolean isS = false;
        for (IStandard st : standards) {
            if (CPUStandard == st) {
                isS = true;
            }
        }
        if (isS) {
            System.out.println("CPU подходит");
        }
        else {
            System.out.println("CPU не подходит");
        }
        return isS;
    }
}
