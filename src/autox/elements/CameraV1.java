package autox.elements;

public class CameraV1 implements ICamera {

    @Override
    public void CameraOn() {
        System.out.println("autox.elements.CameraV1 an");
    }

    @Override
    public void CameraOff() {
        System.out.println("autox.elements.CameraV1 aus");
    }
}
