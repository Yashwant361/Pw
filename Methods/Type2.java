package Methods;

public class Type2 {
    int a, b, res;

   public  int add() {
        a = 10;
        b = 20;
        res = a + b;
        return res;
    }

public static double genRandomNum() {
    double X = (int)(Math.random() * 10000);
    return  X;
}


    public static void main(String[] args) {
        Type2 typ = new Type2();
        System.out.println( typ.add() + " " + genRandomNum());

    }
}
