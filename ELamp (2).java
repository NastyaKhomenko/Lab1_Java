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
       
       public static int sales_per_day = 4;
       
       protected int batch_number;
       protected String power_supply;
               
       
       public String getColor (){ 
       return color;
       }
       public void setColor(String color)
       {
       this.color = color;
       }
       
       public int getPrice(){
           return price;
       }
       public void setPrice(int price)
       {
       this.price = price;
       }
       
      public ELamp(){
    	
    }
       
       public ELamp(String color , int price , int power ,int guarantee){
           this.color = color;
           this.price = price;
           this.power = power;
           this.guarantee = guarantee;        
       }
       
       public ELamp (String color , int price , int power ,int guarantee ,String producer ,String country ,int batch_number, String power_supply){
    	this ( color ,  price ,  power , guarantee);
        this.producer = producer;
        this.country =country;
        this.batch_number = batch_number;
        this.power_supply = power_supply;
    }
       
       public static void printStaticsales_per_day(){
    	System.out.println(sales_per_day);
    }
    
    public void printsales_per_day(){
    	System.out.println(sales_per_day);
    }
        
    public String toString(){
        String information = "INFORMATION" + "\n" ;
        information = information + "Producer:"+producer+"\n";
        information = information + "Power:"+power+"\n";
        information = information + "Guarantee:"+guarantee+"\n";
        information = information + "Country:"+country+"\n";
        information = information + "Color:"+color+"\n";
        information = information + "Price:"+price+"\n";
        information = information + "Batch number:"+batch_number+"\n";
        information = information + "Power supply:"+power_supply+"\n";
        return information;
    }
    
    public void resetValues(String color , int price , int power ,int guarantee ,String producer ,String country ,int batch_number ,String power_supply){
    this.color = color;
           this.price = price;
           this.power = power;
           this.guarantee = guarantee;  
           this.producer = producer;
           this.country =country;
           this.batch_number = batch_number;
           this.power_supply = power_supply;
           
    }
    public static void main(String[] args){
      ELamp num1 = new ELamp();
      ELamp num2 = new ELamp("black",300,65,30);
      ELamp num3 = new ELamp("white",400,100,40,"Saturn","Poland",123,"battery");
      
      System.out.println(num1.toString());
		System.out.println(num2.toString());
		System.out.println(num3.toString());
		ELamp.printStaticsales_per_day();
    }
    
}
 