public class MainPointAndMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point = new Point(10,12);
        System.out.println(point.toString());
        point.setXY(15,20);
        System.out.println(point.toString());

        point = new MoveablePoint(point.getX(), point.getY(), 10,20);
        System.out.println(point.toString());

        MoveablePoint moveablePoint = new MoveablePoint(20,20);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());

    }
}
