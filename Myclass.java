class MyClass {
    int value;

    public MyClass(int value) {
        this.value = value;
    }
}

public class original{

    // Method for call-by-value (does not modify the original x)
    public static void callByValue(int value) {
        value = 20;  // This change only affects the local variable
    }

    // Method for call-by-reference (modifies the object's state)
    public static void callByReference(MyClass obj) {
        obj.value = 20;  // This changes the value of the object passed as a reference
    }

    public static void main(String[] args) {
        // Call-by-value example
        int x = 10;
        System.out.println("Before callByValue, x = " + x);
        callByValue(x);  // The value of x will not change here
        System.out.println("After callByValue, x = " + x);  // x remains 10

        // Call-by-reference example
        MyClass obj = new MyClass(10);
        System.out.println("Before callByReference, obj.value = " + obj.value);
        callByReference(obj);  // The value of obj.value will be modified
        System.out.println("After callByReference, obj.value = " + obj.value);  // obj.value is now 20
    }
}