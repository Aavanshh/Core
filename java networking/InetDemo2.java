import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class InetDemo2 {

    public static void main(String[] args) {
        try{
        InetAddress ip=Inet4Address.getByName("www.javatpoint.com");
        InetAddress ip1[]=InetAddress.getAllByName("www.javatpoint.com");
        byte addr[]={72,3,2,12};
        System.out.println(ip);
        System.out.println(ip1);
        InetAddress ip2=InetAddress.getByAddress(addr);
        System.out.println(ip2);
        System.out.println(Arrays.toString(ip.getAddress()));
        System.out.println(ip.getHostAddress());
        System.out.println(ip.isAnyLocalAddress());
        System.out.println(ip.isLinkLocalAddress());
        System.out.println(ip.isLoopbackAddress());
        System.out.println(ip.isMCGlobal());
        System.out.println(ip.isMCLinkLocal());
        System.out.println(ip.isMCNodeLocal());
        System.out.println(ip.isMCSiteLocal());
        System.out.println(ip.isMulticastAddress());
        System.out.println(ip.isSiteLocalAddress());
        System.out.println(ip.hashCode());
        System.out.println(ip.equals(ip2));

    }catch(Exception e){}
    }
    
}
