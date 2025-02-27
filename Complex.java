public class Complex {

    double real;
    double imag;

    // Constructor to initialize the complex number
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public static Complex add(Complex n1, Complex n2) {
        Complex temp = new Complex(0.0, 0.0);
        
        // Adding real and imaginary parts separately
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return temp;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Complex n1 = new Complex(2.3, 4.5),
                n2 = new Complex(3.4, 5.0),
                temp;

        // Adding the two complex numbers
        temp = add(n1, n2);

        // Printing the sum in the format "real + imaginary i"
        System.out.printf("Sum = %.1f + %.1fi\n", temp.real, temp.imag);
    }
}