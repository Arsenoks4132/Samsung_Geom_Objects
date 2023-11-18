public abstract class GeometryObjects implements Comparable<GeometryObjects>{
    abstract double GetArea();
    abstract void Scale(int coef);

    @Override
    public int compareTo(GeometryObjects o) {
        if (this.GetArea() > o.GetArea()){
            return 1;
        }
        if (this.GetArea() < o.GetArea()) {
            return -1;
        }
        return 0;
    }

}
