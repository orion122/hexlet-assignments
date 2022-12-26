package exercise;

// BEGIN
class Cottage implements Home {
    public double area;
    public int floorCount;

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public int compareTo(Home another) {
        if (getArea() > another.getArea()) {
            return 1;
        } else if (getArea() == another.getArea()) {
            return -1;
        }

        return 0;
    }

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
