// Design a class ‘Complex ‘with data members for real and imaginary part. Provide default and
// Parameterized constructors. Write a program to perform arithmetic operations of two complex
// numbers.
class Complex{
    double real;
    double imaginary;

    Complex(){
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    Complex(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex other){
        return new Complex(this.real+other.real, this.imaginary+other.imaginary);
    }




    Complex subtract(Complex other){
        return new Complex(this.real-other.real, this.imaginary-other.imaginary);
    }

    Complex multiply(Complex other){
        double realPart = this.real*other.real - this.imaginary*other.imaginary;
        double imaginaryPart = this.real*other.imaginary + this.imaginary*other.real;

        return new Complex(realPart, imaginaryPart);
    }

//   The correct formula for division of two complex numbers is:

// For \( (a + bi) / (c + di) \):

// - Denominator: \( c^2 + d^2 \)
// - Real Part: \( (a \cdot c + b \cdot d) / (c^2 + d^2) \)
// - Imaginary Part: \( (b \cdot c - a \cdot d) / (c^2 + d^2) \)

    Complex divide(Complex other) {
        double deno = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / deno;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / deno;
    
        return new Complex(realPart, imaginaryPart);
    }
    

    static void display(Complex hey){
        System.out.println(hey.real+" + "+hey.imaginary+"! ");
    }

}

public class first{
    public static void main(String[] args){
        Complex com1 = new Complex(3, 5);
        Complex com = new Complex(4, 6);

        Complex.display(com);
        Complex.display(com1);

        Complex.display(com.add(com1));
        Complex.display(com.subtract(com1));
        Complex.display(com.multiply(com1));
        Complex.display(com.divide(com1));
        
    }
}
