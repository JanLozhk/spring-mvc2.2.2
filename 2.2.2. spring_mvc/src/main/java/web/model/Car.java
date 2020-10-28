package web.model;

public class Car {
    private String model;
    private Integer series;
    private Integer price;

    public Car() {
    }

    public Car(String model, Integer series, Integer price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", price=" + price +
                '}';
    }
}
