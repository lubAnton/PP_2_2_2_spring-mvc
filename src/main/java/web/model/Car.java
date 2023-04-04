package web.model;

import java.util.Objects;

public class Car {
    private int series;
    private String model;
    private String color;


    public Car() {
    }

    public Car(int series, String model, String color) {
        this.series = series;
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "web.model.Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series;
    }

    @Override
    public int hashCode() {
        return Objects.hash(series);
    }
}

