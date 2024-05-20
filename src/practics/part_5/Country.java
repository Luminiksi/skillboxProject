package practics.part_5;

public class Country {
    private  String name;
    private  int populSize;
    private double area;
    private String capital;
    private boolean isAccessSea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulSize() {
        return populSize;
    }

    public void setPopulSize(int populSize) {
        this.populSize = populSize;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isAccessSea() {
        return isAccessSea;
    }

    public void setAccessSea(boolean accessSea) {
        isAccessSea = accessSea;
    }
}
