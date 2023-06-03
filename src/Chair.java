import java.util.Objects;

public class Chair {

    private String model;
    private String manufacturer;
    private int productionYear;

    public Chair(String model, String manufacturer, int productionYear) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chair)) return false;
        Chair chair = (Chair) o;
        return productionYear == chair.productionYear && Objects.equals(model, chair.model) && Objects.equals(manufacturer, chair.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, productionYear);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
