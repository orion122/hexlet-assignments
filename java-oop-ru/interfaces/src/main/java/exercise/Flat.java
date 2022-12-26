package exercise;

// BEGIN
class Flat implements Home {
    public double area;
    public double balconyArea;
    public int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area + this.balconyArea;
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

    @Override
    public String toString() {
        return "Квартира площадью " +  getArea() + " метров на " + floor + " этаже";
    }
}
// END
