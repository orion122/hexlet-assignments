package exercise;

// BEGIN
class Segment {
    private Point begin;
    private Point end;

    public Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBeginPoint() {
        return this.begin;
    }

    public Point getEndPoint() {
        return this.end;
    }

    public Point getMidPoint() {
        return new Point(
                (getBeginPoint().getX() + getEndPoint().getX()) / 2,
                (getBeginPoint().getY() + getEndPoint().getY()) / 2
        );
    }
}
// END
