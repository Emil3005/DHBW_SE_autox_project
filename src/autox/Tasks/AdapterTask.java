package autox.Tasks;

import autox.configuration.Adapter3P;
import autox.configuration.Closed;
import autox.configuration.ILoadingStation;
import autox.elements.Door;

public class AdapterTask {
public AdapterTask(){
    System.out.println("Adapter Operation started");
    ILoadingStation Adapter3P = new Adapter3P();
    System.out.println("Adapter Operation done");
}

    public static void main(String... args) {
        System.out.println("Adapter Operation started");
        ILoadingStation Adapter3P = new Adapter3P();
        System.out.println("Adapter Operation done");
    }
}
