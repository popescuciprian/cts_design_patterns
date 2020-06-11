package structurale.proxy.loginproxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataLogin {
    private InterfataLogin login;
    public static final int MAX_INCERCARI = 3;
    private Map<String, Integer> autentificari = new HashMap<>();

    public ProxyLogin(InterfataLogin login) {
        this.login = login;
    }

    @Override
    public boolean login(String username, String password) {
        Integer auths = autentificari.get(username);
        if (auths == null) {
            autentificari.put(username, 0);
            auths = 0;
        }
        if (auths >= MAX_INCERCARI) {
            System.out.println(" Cont blocat, pentru deblocare verificati mail...");
            return false;
        }
        if (login != null) {
            boolean result = this.login.login(username, password);
            if (!result) {
                auths++;
            } else {
                auths = 0;
            }
            autentificari.put(username, auths);
            return result;
        } else
            throw new UnsupportedOperationException();
    }
}
