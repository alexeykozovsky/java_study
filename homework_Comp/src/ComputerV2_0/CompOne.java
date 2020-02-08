package ComputerV2_0;

import ComputerV2_0.parts.HDD.api.HDDstand;
import ComputerV2_0.parts.RAM.api.RAMstand;
import ComputerV2_0.parts.CPU.api.CPUstand;

public class CompOne {
    private final CPUstand cpuStand;
    private final RAMstand ramStand;
    private final HDDstand hddStand;


    public CompOne (CPUstand cpuStand, RAMstand ramStand, HDDstand hddStand) {
        this.cpuStand = cpuStand;
        this.ramStand = ramStand;
        this.hddStand = hddStand;
    }

    public CPUstand getCpuStand() {
        return cpuStand;
    }

    public RAMstand getRamStand() {
        return ramStand;
    }

    public HDDstand getHddStand() {
        return hddStand;
    }

    @Override
    public String toString() {
        return "CompOne{" +
                "cpuStand=" + cpuStand +
                ", ramStand=" + ramStand +
                ", hddStand=" + hddStand +
                '}';
    }
}
