package ComputerV2_0;

import ComputerV2_0.parts.CPU.api.CPUstand;
import ComputerV2_0.parts.HDD.api.HDDstand;
import ComputerV2_0.parts.RAM.api.RAMstand;
import ComputerV2_0.api.IBuilder;

public class CompOneBuilder implements IBuilder {

    private CPUstand cpuStand;
    private RAMstand ramStand;
    private HDDstand hddStand;

    @Override
    public void setCPU(CPUstand cpuStand) {
        this.cpuStand = cpuStand;
    }

    @Override
    public void setHDD(HDDstand hddStand) {
        this.hddStand = hddStand;
    }

    @Override
    public void setRAM(RAMstand ramStand) {
        this.ramStand = ramStand;
    }

    public CompOne getResult(){
        return new CompOne(cpuStand, ramStand, hddStand);
    }
}
