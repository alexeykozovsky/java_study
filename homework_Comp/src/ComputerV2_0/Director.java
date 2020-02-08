package ComputerV2_0;


import ComputerV2_0.parts.HDD.api.HDDstand;
import ComputerV2_0.parts.RAM.api.RAMstand;
import ComputerV2_0.parts.CPU.api.CPUstand;
import ComputerV2_0.api.IBuilder;

public class Director {
    public void constructCompOne(IBuilder builder){
        builder.setCPU(CPUstand.XEON);
        builder.setHDD(HDDstand.SATA);
        builder.setRAM(RAMstand.DDR1);
    }

    public void constructCompTwo(IBuilder builder){
        builder.setCPU(CPUstand.ZEN);
        builder.setHDD(HDDstand.SAS);
        builder.setRAM(RAMstand.DDR2);
    }
}
