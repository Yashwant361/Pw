package Methods;

public class Q2 {

    public static void main(String[] args) {
        System.out.println(" Area " +areaOfCircle(2));

    }
    public  static double areaOfCircle(int radius){
        double pi = 3.14;
        int r = 2;
        double area = pi * Math.pow(r,2);
        return area;
    }
}
