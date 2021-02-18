package autox.elements;

public class LidarXT implements ILidar {
    @Override
    public void LidarOn() {
        System.out.println("LidarXT on");
    }

    @Override
    public void LidarOff() {
        System.out.println("LidarXT off");
    }
}
