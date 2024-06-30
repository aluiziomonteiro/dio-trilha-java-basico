public class SmartTv {
    // default values
    private boolean powerState = false;
    private int channel = 1;
    private int volume = 25;

    public void adjustChannel(int channel){
        this.channel = channel;
    }
    public void adjustChannelIncrement(){
        channel++;
        System.out.println("Adjust Channel: "+channel);
    }
    public void adjustChannelDecrement(){
        channel--;
        System.out.println("Adjust Channel: "+channel);
    }
    public void adjustVolumeUp(){
        volume++;
        System.out.println("Volume Up: "+volume);
    }
    public void adjustVolumeDown(){
        volume--;
        System.out.println("Volume Down: "+volume);
    }
    public void on(){
        powerState = true;
    }
    public void off(){
        powerState = false;
    }
    public boolean isPowerState() {
        return powerState;
    }
    public void setPowerState(boolean powerState) {
        this.powerState = powerState;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
