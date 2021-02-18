package autox.elements;

public class GPS {
    public void GPS_On(){
        System.out.println("Gps on");
    }
    public void GPS_Off(){
        System.out.println("Gps off");
    }
    public void GPSConnectSatellite(String frequency){
        System.out.println("Gps connect to frequency : " + frequency);
    }
}
