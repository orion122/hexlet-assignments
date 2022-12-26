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
        if (this.getArea() > another.getArea()) {
            return 1;
        }

        if (this.getArea() == another.getArea()) {
            return 0;
        }

        return -1;
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
