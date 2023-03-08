package Package1;

import Package2.MethAccModInherited;
import Package2.MethodAccMod3;

public class MethodAccMod1 {
    public int x = 10;
    int xx = 11;
    protected int a = 77;
    private int w = 87;


    public static void main(String[] args) {
        //public variable

        MethodAccMod1 obj1 = new MethodAccMod1();
        System.out.println(obj1.x);

        MethodAccMod2 obj2 = new MethodAccMod2();  //can access variable in same package
        System.out.println(obj2.y);

        MethodAccMod3 obj3 = new MethodAccMod3();  //can access variable in another package by importing it
        System.out.println(obj3.z);



        //default variable

        System.out.println(obj1.xx);

        System.out.println(obj2.yy);

       // System.out.println(obj3.zz); cannot use because zz is in another package

        //protected variables

        System.out.println(obj1.a);
        System.out.println(obj2.b);
        //System.out.println(obj3.c);  this cannot be done because its in another package
        MethAccModInherited obj4 =new MethAccModInherited();
       // System.out.println(obj4.f);


        //private variables

        System.out.println(obj1.w);
        //System.out.println(obj2.e); cannot be accessed
        //System.out.println(obj3.f); cannot be accessed
        //System.out.println(obj4.h); cannot be accessed
    }
}
