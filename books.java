import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {

    private String name;

    private int RAM;
    private String oS;
    private int price;
    private String model;

    public Notebook(String name, int RAM, String oS, int price, String model) {
        this.name = name;
        this.RAM = RAM;
        this.oS = oS;
        this.price = price;
        this.model = model;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("RAM");
        list.add("oS");
        list.add("price");
        list.add("model");

        return list;

    }

    @Override
    public String toString() {
        return " Ноутбук: (" + name + "): " +
                "Оперативная память:" + RAM +
                ", операционная система: " + oS + '\'' +
                ", цена: " + price +
                ", модель: " + model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getoS() {
        return operatingSystem;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
