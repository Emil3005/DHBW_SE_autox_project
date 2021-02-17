package autox.elements;

public class LidarNG implements ILidar {
    @Override
    public void LidarOn() {
        System.out.println("autox.elements.LidarNG on");
    }

    @Override
    public void LidarOff() {
        System.out.println("autox.elements.LidarNG off");
    }
}
