
class Neeraj {
    void method1() {
        System.out.println("Method 1 ");
    }

    void method2() {
        System.out.println("Method 2 ");
    }
}


class Neeraj1 extends Neeraj {
    void method3() {
        System.out.println("Method 3 ");
    }

    void method4() {
        System.out.println("Method 4 ");
    }

    
    void callParentMethods() {
        super.method1(); 
        super.method2();
    }

    void callChildMethods() {
        this.method3(); 
        this.method4();
    }
}

public class Yuvraj {
    public static void main(String[] args) {
        Neeraj1 object = new Neeraj1();

        System.out.println("Call Parent Methods using super:");
        object.callParentMethods(); 

        System.out.println("\nCall Child Methods using this:");
        object.callChildMethods(); 
    }
}
