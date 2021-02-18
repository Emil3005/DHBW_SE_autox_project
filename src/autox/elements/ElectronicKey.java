package autox.elements;

import autox.configuration.IReceiveModule;

public class ElectronicKey {
    String password ="AutoX23";
    private IReceiveModule receiveModule;

    public void setCommand(IReceiveModule receiveModule){
        this.receiveModule = receiveModule;

    }
    public String checkPassword(){

            return password;
    }
    public void execute(){
        receiveModule.execute();
    }
}
