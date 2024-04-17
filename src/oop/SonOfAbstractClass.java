package oop;

public class SonOfAbstractClass extends MyAbstractClass implements Pasport {

    private String name;

    public SonOfAbstractClass(Integer id, Integer value) {
        super(id, value);
    }

    @Override
    void test() {
        System.out.println("just test function");
    }

    @Override
    void setName(String name) {
        this.name= name;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    public void showPasport() {
        System.out.println("My ID: "+this.getId()+"\nMy Name: "+this.getName()+"\nMy value: "+this.getValue());
    }
}
