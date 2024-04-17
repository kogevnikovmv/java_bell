package oop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyMainClass {

    public static void main(String[] args) {
        System.out.println("Start");
        SonOfAbstractClass firstSon=new SonOfAbstractClass(1, 100);
        //SonOfAbstractClass secondSon=new SonOfAbstractClass(2, 200);
        firstSon.setName("First Son");
        //secondSon.setName("Second Son");
        //System.out.println("firstSon name="+firstSon.getName());
        //System.out.println("SecondSon name="+secondSon.getName());
        //System.out.println(firstSon.getId()+" "+secondSon.getId());
        //System.out.println("MyAbstractClass count="+MyAbstractClass.getCount());
        //System.out.println("MyAbstractClass count from subclass(?)="+SonOfAbstractClass.getCount());
        OverloadingSon thirdSon=new OverloadingSon(3, 300);
        //thirdSon.setProperties("red", 2008);
        thirdSon.setProperties("sx4", "madiar");
        thirdSon.setProperties(33, "Michael");
        thirdSon.getProperties();
        OtherSon otherSon=new OtherSon(4, 400);
        Stream.of(thirdSon, firstSon, otherSon)
                .filter(x-> (x instanceof Pasport)==true)
                .forEach(x->((Pasport) x).showPasport());


    }
}

