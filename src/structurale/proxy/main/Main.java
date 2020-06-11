package structurale.proxy.main;

import structurale.proxy.loginproxy.InterfataLogin;
import structurale.proxy.loginproxy.Login;
import structurale.proxy.loginproxy.ProxyLogin;
import structurale.proxy.virtualproxy.Imagine;
import structurale.proxy.virtualproxy.InterfataImagine;
import structurale.proxy.virtualproxy.ProxyImagine;

public class Main {
    public static void main(String[] args) {
        // Proxy virtual - verificare memorie inainte de afisare
        InterfataImagine img1 = new Imagine("img1.jpg");
        InterfataImagine img2 = new Imagine("img2.jpg");
        InterfataImagine img3 = new Imagine("img3.jpg");
        img1.afiseazaImagine();
        //versus
        System.out.println("__vs__");
        InterfataImagine IMG1 = new ProxyImagine("img1.jpg");
        InterfataImagine IMG2 = new ProxyImagine("img1.jpg");
        InterfataImagine IMG3 = new ProxyImagine("img1.jpg");
        IMG1.afiseazaImagine();

        System.out.println("_____________________");
        // Login proxy - Verificare retries:
        InterfataLogin loginNesecurizat = new Login();
        loginNesecurizat.login("","");
        loginNesecurizat.login("","");
        loginNesecurizat.login("","");
        loginNesecurizat.login("","");
        //...
        InterfataLogin loginSecurizat = new ProxyLogin(loginNesecurizat);
        loginSecurizat.login("","");
        loginSecurizat.login("","");
        loginSecurizat.login("","");
        loginSecurizat.login("","");
    }
}
