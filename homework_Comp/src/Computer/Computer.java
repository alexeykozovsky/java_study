package Computer;

import Computer.parts.CPU.AMD;
import Computer.parts.HDD.HDD;
import Computer.parts.RAM.RAM;
import Computer.parts.api.IParts;
import Computer.parts.api.IStandard;

public class Computer {
    private IParts[] parts;
    private IStandard[] standards;

    Computer(IParts[] parts, IStandard[] standards) {
        this.parts = parts;
        this.standards = standards;
    }

    public void start(){
        for (IParts part:parts) {

            if(part.getClass() == AMD.class){
                if(parts[0].test(standards)){
                }
            }
            else

            if(part.getClass() == HDD.class){
                if(parts[1].test(standards)){
                }
            }
            else

            if(part.getClass() == RAM.class){
                if(parts[2].test(standards)){
                }
            }
        }
    }



}