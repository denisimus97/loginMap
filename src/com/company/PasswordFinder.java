package com.company;
import java.util.HashMap;
import java.util.Map;

public class PasswordFinder {
    HashMap<String, String> users;

    public PasswordFinder() {
        users = new HashMap<>();
    }

    public void add(String login, String password) {
        users.put(login, password);
    }

    public String find(String login) {
        for (Map.Entry<String, String> i : users.entrySet()) {
            if (i.getKey().equals(login)) {
                return i.getValue();
            }
        }

        return "";
    }
}