package autox.Tasks;

import autox.cars.Car;
import autox.configuration.ActivateCar;
import autox.configuration.DeactivateCar;
import autox.configuration.IReceiveModule;
import autox.elements.ElectronicKey;

public class CommandTask {


    public CommandTask(String password){
        Car car = new Car();
        System.out.println("Command Operation started");
        ElectronicKey electronicKey = new ElectronicKey();
        IReceiveModule activateCar = new ActivateCar(car);
        IReceiveModule deactivateCar = new DeactivateCar(car);


        if(password.equals(electronicKey.checkPassword())){
            electronicKey.setCommand(activateCar);
            electronicKey.execute();
            electronicKey.setCommand(deactivateCar);
            electronicKey.checkPassword();
        }
        else{
            System.out.println("wrong password");
        }
        System.out.println("Command Operation done");

    }
    public static void main(String... args){
        Car car = new Car();
        System.out.println("Command Operation started");
        ElectronicKey electronicKey = new ElectronicKey();
        IReceiveModule activateCar = new ActivateCar(car);
        IReceiveModule deactivateCar = new DeactivateCar(car);
        String password = electronicKey.checkPassword();

        if(password.equals(electronicKey.checkPassword())){
            System.out.println("password legit");
            electronicKey.setCommand(activateCar);
            electronicKey.execute();
            electronicKey.setCommand(deactivateCar);
            electronicKey.execute();
        }
        else{
            System.out.println("wrong password");
        }
        System.out.println("Command Operation done");
    }

}
