class Rectangle {
    float length;
    float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float calculateArea() {
        return length * width;
    }
}

public class area {
    public static void main(String[] args) {
        Rectangle reference1 = new Rectangle(4.5f, 5.3f); // Using float values
        Rectangle reference2 = reference1;

        System.out.println("Area calculated using reference1: " + reference1.calculateArea());
        System.out.println("Area calculated using reference2: " + reference2.calculateArea());

        reference1.length = 7.8f; // Update the length using reference1

        System.out.println("Updated area calculated using reference1: " + reference1.calculateArea());
        System.out.println("Updated area calculated using reference2: " + reference2.calculateArea());
    }
}
