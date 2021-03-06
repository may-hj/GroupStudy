package JAVA_2021_01_18_Fourteenth;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetLocalHost {
    public InetAddress getLocalHostInfo() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();

        System.out.println("IP Address: " + inetAddress.getHostAddress());
        System.out.println("Host Name: " + inetAddress.getHostName());

        return inetAddress;
    }
}
