package ComputerV2_0.api;

import ComputerV2_0.parts.CPU.api.CPUstand;
import ComputerV2_0.parts.HDD.api.HDDstand;
import ComputerV2_0.parts.RAM.api.RAMstand;

public interface IBuilder {
    void setCPU (CPUstand cpuStand);
    void setHDD (HDDstand hddStand);
    void setRAM (RAMstand ramStand);
}
