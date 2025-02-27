public class ThisKeywordDemo {
    private String name; // Instance variable

    // Constructor using 'this' to assign instance variable
    public ThisKeywordDemo(String name) {
        this.name = name;
    }

    public void printName() {
        String name = "Local Name"; // Local variable
        System.out.println("Local Name: " + name); // Refers to local variable
        System.out.println("Instance Name: " + this.name); // Refers to instance variable using 'this'
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo("John");
        obj.printName();
    }
}