public class Triangle {
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
     
    public static double findArea2(Triangle tri) {
        return (tri.base * tri.height) / 2;
    }
}

