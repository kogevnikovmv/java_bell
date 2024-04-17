package oop;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class OverloadingSon extends MyAbstractClass implements Pasport{

    private String name;
    private String color;
    private Integer year;
    private String model;
    private String country;

    private String ownerName;
    private Integer ownerAge;
    //private F allFields;

    public OverloadingSon(Integer id, Integer value) {
        super(id, value);
    }

    @Override
    void test() {

    }

    @Override
    void setName(String name) {
        this.name=name;
    }

    @Override
    String getName() {
        return name;
    }

    boolean setProperties(String color, Integer year) {
        this.color=color;
        this.year=year;
        return true;
    }

    void setProperties(String model, String country) {
        this.model=model;
        this.country=country;
    }

    void setProperties(Integer ownerAge, String ownerName) {
        this.ownerAge=ownerAge;
        this.ownerName=ownerName;

    }

    public void getProperties() {
        List<Field> allFields= Arrays.asList(this.getClass().getDeclaredFields());
        allFields.stream()
                .filter(x-> {
                    try {
                        return x.get(this)!=null;
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .forEach(x-> {
                    try {
                        System.out.println(x.getName() + " = " + x.get(this));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    @Override
    public void showPasport() {
        System.out.println("My ID: "+this.getId()+"\nMy Name: "+this.getName()+"\nMy value: "+this.getValue());
    }
}
