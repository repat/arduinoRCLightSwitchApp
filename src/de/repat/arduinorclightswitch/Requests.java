package de.repat.arduinorclightswitch;

public interface Requests {

    public static final String IP = "http://192.168.1.42/?";
    
    public static final String LICHT1ON = IP + "1-on";
    public static final String LICHT1OFF = IP + "1-off";

    public static final String LICHT2ON = IP + "2-on";
    public static final String LICHT2OFF = IP + "2-off";

    public static final String LICHT3ON = IP + "3-on";
    public static final String LICHT3OFF = IP + "3-off";

}
