package autox.elements;

public class LidarNG implements ILidar {
    @Override
    public void LidarOn() {
        System.out.println("LidarNG on");
    }

    @Override
    public void LidarOff() {
        System.out.println("LidarNG off");
    }
}
