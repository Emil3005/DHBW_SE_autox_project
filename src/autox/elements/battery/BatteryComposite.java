package autox.elements.battery;

import java.util.ArrayList;
import java.util.List;

public class BatteryComposite {
    private String name;
    private List<BatteryComposite> batteries;
    public BatteryComposite(String name) {
        batteries = new ArrayList<BatteryComposite>();
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void add(BatteryComposite battery){
        batteries.add(battery);
    }


}
