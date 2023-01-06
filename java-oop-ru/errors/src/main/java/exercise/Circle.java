package exercise;

// BEGIN
class Circle {
    private final Point center;
    private final Integer radius;

    public Circle(Point center, Integer radius) {
        this.center = center;
        this.radius = radius;
    }

    public Integer getRadius() {
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (getRadius() < 0) {
            throw new NegativeRadiusException("");
        }

        return Math.PI * getRadius() * getRadius();
    }
}
// END
