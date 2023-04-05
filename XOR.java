import data.SuperX;

import java.util.ArrayList;
import java.util.List;

public class XOR extends SuperX {
    static String s1;

    public static void main(String[] args) {


//        String[][] s1 = new String[12][];
//        String s2 = new String("Test");
//
//
//        Boolean b = new Boolean("TRUE");
//        if (b.booleanValue()) {
//            System.out.println("yes" + b);
//        } else
//            System.out.println("Equals");

//        SuperX s = new XOR();
//        XOR xo = new XOR();
//
//        void m () {
//            xo.superXMethod();
//            int i;
//            i = xo.superClassX;
//        }

//        MyThread myThread = new MyThread();
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        myThread.start();
//        thread.start();
//
//
//        if (s1 instanceof String) {
//            System.out.println("trye string");
//        } else {
//            System.out.println("false string");
//        }
//
//        if (true)
//            if (false)
//                if (true)
//                    System.out.println("");
//                else
//                    System.out.println();
//            else if (true && false)
//                System.out.println("");
//            else System.out.println("won compile");



        MyChild myChi = new MyChild (10, 20, 30);
        MyParent myPar = new MyParent(10, 20);
        int x = myChi . addMe (10, 20, 30);
        int y = myChi . addMe (myChi);
        int z = myPar . addMe (myPar);
        System.out.println(x + y + z);
    }
}

//class MyThread extends Thread {
//    public void run() {
//        System.out.println("MyThread: run(}");
//    }
//
//    public void start() {
//        System.out.println("MyThread: start(}");
//    }
//}
//
//class MyRunnable implements Runnable {
//    public void run() {
//        System.out.println("MyRunnable: run(}");
//    }
//
//    public void start() {
//        System.out.println("MyRunnable: start(}");
//
//    }
//}


class MyParent {
    int x, y;

    MyParent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addMe(int x, int y) {
        return this.x + x + y + this.y;
    }

    public int addMe(MyParent myPar) {
        return addMe(myPar.x, myPar.y);
    }
}

class MyChild extends MyParent {
    int z;

    MyChild(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int addMe(int x, int y, int z) {
        return this.x + x + this.y + y + this.z + z;
    }

    public int addMe(MyChild myChi) {
        return addMe(myChi.x, myChi.y, myChi.z);
    }

    public int addMe(int x, int y) {
        return this.x + x + this.y + y;
    }

}