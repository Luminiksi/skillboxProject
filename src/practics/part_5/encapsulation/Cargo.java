package practics.part_5.encapsulation;

public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private boolean isFlip;
    private String regNumber;
    private boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String address, boolean isFlip, String regNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.isFlip = isFlip;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFlip() {
        return isFlip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber, isFragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber, isFragile);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber, isFragile);
    }

    public String toString(){
        String info = "Информация о доставке:" + "\n";
        info += "Габариты груза:        " + dimensions.toString() + "\n";
        info += "Вес груза:             " + weight + "\n";
        info += "Адресс доставки:       " + address + "\n";
        info += "Регистрационный номер: " + regNumber + "\n";
        info += "Можно переворачивать:  " + (isFlip ? "Да" : "Нет") + "\n";
        info += "Хрупкий груз:          " + (isFragile ? "Да" : "Нет");
        return info;
    }

    public void setFlip(boolean flip) {
        isFlip = flip;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }
}
