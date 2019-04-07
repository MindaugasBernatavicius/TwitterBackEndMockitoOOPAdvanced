package design.patterns.structural.proxy;

public class ProxyPatternClient {
    public static void main(String[] args)
    {
        OfficeInternetAccess access = new ProxyInternetAccess("Mindaugas Bernatavičius");
        access.grantInternetAccess();
    }
}