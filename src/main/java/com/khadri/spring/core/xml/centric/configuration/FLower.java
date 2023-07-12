package com.khadri.spring.core.xml.centric.configuration;

public class FLower {
    private String color;

    private String name;

    private String smell;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "FLower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }
}
