package InheritanceExample;

public class WirelessMouse extends Mouse {
    private boolean isWireless,hasDongle;
    private int batteryLifeDays, latencyMS;

    /**
     * WirelessMouse constructor
     */
    public WirelessMouse(){
        isWireless=true;
        hasDongle=true;
        batteryLifeDays=30;
        latencyMS=750;
    }
    public boolean getIsWireless(){
        return isWireless;
    }
    public boolean getHasDongle(){
        return hasDongle;
    }
    public int getBatteryLifeDays(){
        return batteryLifeDays;
    }
    public int getLatencyMS(){
        return latencyMS;
    }
}
