package com.heior;

import com.heior.domain.App;

public class Main {

    App mainApp;

    void getApp() {
        mainApp = App.getInstance("There is only one App Object!");
    }

    public static void main(String[] args) {
        App app = App.getInstance("Hello Singleton!");
        System.out.println(app.getName());
        Main main = new Main();
        main.getApp();
        System.out.println(app.getName());
    }
}
