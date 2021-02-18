package autox.Tasks;

import autox.elements.battery.Battery;

public class CompositeTask {
    public CompositeTask(){
        System.out.println("Composite Operation started");
        Battery[] batteries = new Battery[4];
        System.out.println("Composite Operation done");
    }
    public static void main(String... args) {
        System.out.println("Composite Operation started");
        Battery[] batteries = new Battery[4];
        System.out.println("Composite Operation done");

    }

}
