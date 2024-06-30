public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV on? "+smartTv.isPowerState());
        System.out.println("Current Channel: "+smartTv.getChannel());
        System.out.println("Current Volume: "+smartTv.getVolume());

        smartTv.on();
        System.out.println("TV on? "+smartTv.isPowerState());

        smartTv.adjustChannel(12);
        System.out.println("Current Channel: "+smartTv.getChannel());

        smartTv.adjustVolumeUp();
        smartTv.adjustVolumeUp();
        smartTv.adjustVolumeUp();
        System.out.println("Current Volume: "+smartTv.getVolume());

        smartTv.off();
        System.out.println("TV on? "+smartTv.isPowerState());
    }
}
