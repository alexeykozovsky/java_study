package Computer;

import Computer.parts.CPU.AMD;
import Computer.parts.CPU.api.CPUstand;
import Computer.parts.HDD.HDD;
import Computer.parts.HDD.api.HDDstand;
import Computer.parts.RAM.RAM;
import Computer.parts.RAM.api.RAMstand;
import Computer.parts.api.IParts;
import Computer.parts.api.IStandard;

public class ComputerMain {
    public static void main(String[] args) {
        IParts[] parts = new IParts[3];
        IStandard[] standards = new IStandard[3];

        standards[0] = HDDstand.SAS;
        standards[1] = RAMstand.DDR3;
        standards[2] = CPUstand.XEON;

        parts[0] = new HDD(HDDstand.SAS);
        parts[1] = new RAM(RAMstand.DDR1);
        parts[2]= new AMD(CPUstand.XEON);

        Computer computer = new Computer(parts, standards);
        computer.start();
    }
}
