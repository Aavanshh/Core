import java.net.*;

public class URLExample1 {
    public static void main(String[] args) {
        // try{
        // URL url=new URL("http://www.javatpoint.com/java-tutorial");
        // System.out.println(url.getProtocol());
        // System.out.println(url.getHost());
        // System.out.println(url.getPort());
        // System.out.println(url.getFile());
        // }catch(Exception e){}

        try{
            URL url=new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getFile());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getQuery());
            System.out.println(url.getPath());
            }catch(Exception e){}
    }
}
