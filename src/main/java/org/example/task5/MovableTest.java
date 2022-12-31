package org.example.task5;

public class MovableTest {

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 20, 5, 10);
        System.out.println("Rectangle before moving:\n" + rectangle + "\n");
        rectangle.moveUp();
        rectangle.moveRight();
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println("\nRectangle after moving in a circle:\n" + rectangle);
    }

    public static class MovablePoint implements Movable {
        private int x;
        private int y;
        private final int xSpeed;
        private final int ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveUp() {
            this.y += ySpeed;
            System.out.println("Move up: " + this);
        }

        @Override
        public void moveDown() {
            this.y -= ySpeed;
            System.out.println("Move down: " + this);
        }

        @Override
        public void moveLeft() {
            this.x -= xSpeed;
            System.out.println("Move left: " + this);
        }

        @Override
        public void moveRight() {
            this.x += xSpeed;
            System.out.println("Move right: " + this);
        }


        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    ", xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }
    }

    public static class MovableRectangle implements Movable {
        private final MovablePoint topLeft;
        private final MovablePoint bottomRight;

        public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
            this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }

        @Override
        public void moveUp() {
            topLeft.moveUp();
            bottomRight.moveUp();
        }

        @Override
        public void moveDown() {
            topLeft.moveDown();
            bottomRight.moveDown();
        }

        @Override
        public void moveLeft() {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }

        @Override
        public void moveRight() {
            topLeft.moveRight();
            bottomRight.moveRight();
        }

        @Override
        public String toString() {
            return "MovableRectangle{" +
                    "topLeft=" + topLeft +
                    ", bottomRight=" + bottomRight +
                    '}';
        }
    }
}
