package oop;

public class OtherSon extends MyAbstractClass{
    private String name;

    public OtherSon(Integer id, Integer value) {
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
        return this.name;
    }
}
