package Ball;

public class test_Ball {
    public static void main(String[] args) {
        Ball b1 = new Ball(150, 150);
        System.out.println(b1);
        b1.move(60, 30);
        System.out.println(b1);
    }
}