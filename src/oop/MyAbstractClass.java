package oop;

abstract class MyAbstractClass {

    private static Integer count=0;
    private final Integer id;
    private final Integer value;

    //public MyAbstractClass() {
    //    this.id=0;
    //    this.value=0;
    //}

    public MyAbstractClass(Integer id, Integer value) {
        this.id=id;
        this.value=value;
        count++;
    }

    public static Integer getCount() {
        return count;
    }

    abstract void test();
    abstract void setName(String name);
    abstract String getName();

    public Integer getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }
}
