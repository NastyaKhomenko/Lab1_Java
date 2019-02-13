/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elamp;

/**
 *
 * @author Nastya
 */
public class ELamp {

    private String producer;
    private int power;
    private int guarantee;
    private String country;

    private String color;
    private int price;

    public static int salesPerDay = 4;

    protected int batchNumber;
    protected String powerSupply;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ELamp() {

    }

    public ELamp(String color, int price, int power, int guarantee) {
        this.color = color;
        this.price = price;
        this.power = power;
        this.guarantee = guarantee;
    }

    public ELamp(String color, int price, int power, int guarantee, String producer, String country, int batchNumber, String powerSupply) {
        this(color, price, power, guarantee);
        this.producer = producer;
        this.country = country;
        this.batchNumber = batchNumber;
        this.powerSupply = powerSupply;
    }

    public static void printStaticsalesPerDay() {
        System.out.println(salesPerDay);
    }

    public void printsales_per_day() {
        System.out.println(salesPerDay);
    }

    public String toString() {
        String information = "INFORMATION" + "\n";
        information = information + "Producer:" + producer + "\n";
        information = information + "Power:" + power + "\n";
        information = information + "Guarantee:" + guarantee + "\n";
        information = information + "Country:" + country + "\n";
        information = information + "Color:" + color + "\n";
        information = information + "Price:" + price + "\n";
        information = information + "Batch number:" + batchNumber + "\n";
        information = information + "Power supply:" + powerSupply + "\n";
        return information;
    }

    public void resetValues(String color, int price, int power, int guarantee, String producer, String country, int batchNumber, String powerSupply) {
        this.color = color;
        this.price = price;
        this.power = power;
        this.guarantee = guarantee;
        this.producer = producer;
        this.country = country;
        this.batchNumber = batchNumber;
        this.powerSupply = powerSupply;

    }

    public static void main(String[] args) {
        ELamp Light = new ELamp();
        ELamp Electron = new ELamp("black", 300, 65, 30);
        ELamp Saturn = new ELamp("white", 400, 100, 40, "Saturn", "Poland", 123, "battery");

        System.out.println(Light.toString());
        System.out.println(Electron.toString());
        System.out.println(Saturn.toString());
        ELamp.printStaticsalesPerDay();
    }

}
