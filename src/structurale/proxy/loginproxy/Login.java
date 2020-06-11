package structurale.proxy.loginproxy;

public class Login implements InterfataLogin {
    @Override
    public boolean login(String username, String password) {
        return username.equals("student") && password.equals("12344");
    }
}
