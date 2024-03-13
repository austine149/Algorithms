package com.api.openBank.algos;
class Parent {
    int value = 1000;

    Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    int value = 10;

    Child()
    {
        System.out.println("Child Constructor");
    }
}

class Trial {
    public static void main(String[] args)
    {
        String a = new String("A");
        String A = "A";
        System.out.println(a==A);

        Child obj = new Child();
        System.out.println(obj.value);

        Parent par = obj;
        System.out.println(par.value);
    }
}

//true
//        10
//        1000

