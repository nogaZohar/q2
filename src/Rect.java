public class Rect {
    Point upperLeft;
    Point lowerRight;

    public Rect(Point upperLeft, Point lowerRight) {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
    }

    public Rect(int upperX, int upperY, int lowerX, int lowerY){
            this.upperLeft = new Point(upperX, upperY);
            this.lowerRight = new Point(lowerX, lowerY);
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(Point lowerRight) {
        this.lowerRight = lowerRight;
    }


    public int getWidth(){
        return (Math.abs(lowerRight.getX() - upperLeft.getX()));
    }

    public int getHeight(){
        return (Math.abs(lowerRight.getY() - upperLeft.getY()));
    }

}
