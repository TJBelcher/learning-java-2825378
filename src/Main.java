public class Main {

    public static void main(String[] args) {
    	Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
    	Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

    	double AreaA = triangleA.findArea();
    	double AreaB = triangleB.findArea();
    	System.out.println("The area of TriangleA is " + AreaA + " and the area of TriangleB is " + AreaB);

     	
    	double AreaAA = Triangle.findArea2(triangleA);
    	double AreaBB= Triangle.findArea2(triangleB);
    	System.out.println("The area of TriangleA is " + AreaAA + " and the area of TriangleB is " + AreaBB);
    	
    }

}
