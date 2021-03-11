package autox.elements.battery;

import java.util.ArrayList;
import java.util.List;

public class BatteryPack {
    private String name;
    private List<BatteryPack> batteries;
    public BatteryPack(String name) {
        batteries = new ArrayList<BatteryPack>();
        this.name = name;
        System.out.println(name);
    }
    public String getName() {
        return name;
    }
    public void add(BatteryPack battery){
        batteries.add(battery);
    }
    public void loadP3(){
        System.out.println("Loading Battery with 3 Poles");

    }
    public void usage(int consumption){

    }

}
