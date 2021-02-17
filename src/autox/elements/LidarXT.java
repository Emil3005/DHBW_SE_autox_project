package autox.elements;

public class LidarXT implements ILidar {
    @Override
    public void LidarOn() {
        System.out.println("autox.elements.LidarXT on");
    }

    @Override
    public void LidarOff() {
        System.out.println("autox.elements.LidarXT off");
    }
}
