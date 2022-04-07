package daos;

import java.sql.Date;

public class Cars {
    private Integer id, make, vin;
    private Date year;
    private String color, model;

    public Cars (Integer make, Integer vin, String color, String model, Date year){
        this.make = make;
        this.vin = vin;
        this.color = color;
        this.model = model;
        this.year = year;
    }
    public Cars(){}
    public Cars (Integer id, Integer make, Integer vin, String color, String model, Date year) {
        this.id = id;
        this.make = make;
        this.vin = vin;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMake() {
        return make;
    }

    public void setMake(Integer make) {
        this.make = make;
    }

    public Integer getVin() {
        return vin;
    }

    public void setVin(Integer vin) {
        this.vin = vin;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
