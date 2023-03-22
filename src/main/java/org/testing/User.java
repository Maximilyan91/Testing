package org.testing;

import org.testing.exception.IllegalEmailException;
import org.testing.exception.LoginEqualEmailException;

public class User {
    private String login;
    private String email;

    public User(String login, String email) throws LoginEqualEmailException, IllegalEmailException {
        if (login.equals(email)) {
            throw new LoginEqualEmailException();
        }
        if (!email.contains("@") || !email.contains(".")){
            throw new IllegalEmailException();
        }
        this.login = login;
        this.email = email;
    }
    public User() {
    }
    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
}
