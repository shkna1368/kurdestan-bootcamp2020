package inf;

public class MovRunner {

    public static void main(String[] args) {
        MoveablePoint p1=new MoveablePoint(1,2);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);

        Movable m1=new MoveablePoint(6,7);
        m1.moveDown();
        System.out.println(m1);


    }
}
