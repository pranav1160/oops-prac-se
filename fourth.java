// Design a base class shape with two double type values and member functions to input the data
// and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make
// compute_area() as abstract function and redefine this function in the derived class to suit their
// requirements. Write a program that accepts dimensions of triangle/rectangle and display
// calculated area. Implement dynamic binding for given case study.

abstract class Shape {
    int d1;
    int d2;

    void inputData(int d1,int d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    abstract int area();
    
}

class Triangle extends Shape{
    @Override
    int area(){
        return (d1*d2)/2;
    }
}


class Rectangle extends Shape{
    @Override
    int area(){
        return (d1*d2);
    }
}


public class fourth {
    public static void main(String[] args) {
        Shape s;
        s = new Triangle();
        s.inputData(2,4);
        System.out.println("tri :"+s.area());

        s = new Rectangle();
        s.inputData(4, 5);
        System.out.println("rect :"+s.area());
    }
   
}
