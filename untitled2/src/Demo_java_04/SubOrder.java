package Demo_java_04;

import Demo_java_03.Order;

public class SubOrder extends Order {

    public void method(){

        orderProtected=1;
        orderPublic=2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为Private何缺省权限的属性、方法。
//        orderDefault=3;
//        orderPrivate=4;
//
//        methodDefault();
//        methodPrivate();

    }

}
