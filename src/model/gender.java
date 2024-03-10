package model;

public class gender {

    private double code;
    private String name;

    public gender(double code) {
        this.code = code;
    }

    public gender(String name) {
        this.name = name;
    }

    public gender() {
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gender{" + "name=" + name + '}';
    }

}
