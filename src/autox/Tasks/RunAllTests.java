package autox.Tasks;

import autox.Tasks.*;
import autox.cars.AutoX;
import autox.configuration.EventBus;

public class RunAllTests {
    public static void main(String ... args){
        EventBus eventBus = new EventBus();
        BuilderTask builderTask= new BuilderTask();
        AutoX autoX = BuilderTask.getAutoX();
        AdapterTask adapterTask = new AdapterTask();
        BridgeTask bridgeTask = new BridgeTask();
        CompositeTask compositeTask = new CompositeTask();
        Facade facade= new Facade();
        StateTask stateTask = new StateTask();
        CommandTask commandTask = new CommandTask("AutoX23");
    }


}
