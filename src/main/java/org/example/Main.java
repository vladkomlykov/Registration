package org.example;

import authorization.Authorization;
import registration.Registration;

public class Main {
    public static void main(String[] args) {
        Authorization authorization = new Authorization();
        authorization.readDatabaseFile();

        Registration registration = new Registration();
        registration.enter();
    }
}