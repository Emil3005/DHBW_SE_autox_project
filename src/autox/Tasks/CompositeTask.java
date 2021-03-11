package autox.Tasks;

import autox.elements.Battery;
import autox.elements.battery.BatteryComposite;
import autox.elements.battery.BatteryPack;

import java.util.ArrayList;
import java.util.List;

public class CompositeTask {

    public CompositeTask(){
        System.out.println("Composite Operation started");
        Battery[] batteries = new Battery[4];
        System.out.println("Composite Operation done");
        start();

    }
    public static void main(String... args) {
        System.out.println("Composite Operation started");
        Battery[] batteries = new Battery[4];
        System.out.println("Composite Operation done");
        start();

    }
    public static void start(){
       System.out.println("Composite Operation started");
        BatteryPack batteryPack01 = new BatteryPack("BatteryPack01");
        for(int i=1;i<5;i++){
            BatteryPack battery = new BatteryPack("Battery"+i);
            batteryPack01.add(battery);
            for(int j=1;j<33;j++){
                BatteryPack mainCell = new BatteryPack("MainCell" + j*i);
                battery.add(mainCell);
                for(int n=1;n<9;n++){
                    BatteryPack subCell = new BatteryPack("SubCell" + n*j*i);
                    mainCell.add(subCell);
                    for(int m=1;m<3;m++){
                        BatteryPack cell = new BatteryPack("Cell" + m*n*j*i);
                        subCell.add(cell);
                    }
                }
            }
        }


    }

}
