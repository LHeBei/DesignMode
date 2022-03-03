package com.heior.domain;

public class App {

    private String name;

    private static App app;

    /**
     * 构造方法设置为private
     * @param name
     */
    private App(String name) {
        this.name = name;
    }

    public static App getInstance(String name) {
        if(app != null) {
            app.setName(name);
        } else {
            app = new App(name);
        }

        return app;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
