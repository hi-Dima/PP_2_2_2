package web.modelCar;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Car {
    private String model;
    private int series;
    private String condition;

    public Car(String model, int series, String condition) {
        this.model = model;
        this.series = series;
        this.condition = condition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", condition='" + condition + '\'' +
                '}';
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


}
