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
       public int power;
       public int guarantee;
       public String country;
       
       private String color;
       private int price;
       
       public static int sales_per_day=4;
       
       protected int batch_number;
       protected String power_supply;
               
       //методи  сигнатура-ім'я методу і список його аргументів
       public String getColor (){ 
       return color;
       }
       public void setColor (String c)
       {
       this.color = c;
       }
       
       public int getPrice () {
           return price;
       }
       public void setPrice (int p)
       {
       this.price = p;
       }
       
      public ELamp() {
    	
    }
       
       public ELamp(String col , int pri , int pow ,int grn) {
           this.color = col;
           this.price = pri ;
           this.power = pow;
           this.guarantee = grn;        
       }
       
       public ELamp (String col , int pri , int pow ,int grn ,String prod ,String coun ,int batch,String pow_supply) {
    	this ( col ,  pri ,  pow , grn);
        this.producer = prod;
        this.country =coun;
        this.batch_number = batch;
        this.power_supply = pow_supply;
    }
       
       public static void printStaticsales_per_day() {
    	System.out.println(sales_per_day);
    }
    
    public void printsales_per_day() {
    	System.out.println(sales_per_day);
    }
        
    public String toString(){
        String information = "INFORMATION" ;
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
    
    public void resetValues(String col , int pri , int pow ,int grn ,String prod ,String coun ,int batch,String pow_supply){
    this.color = col;
           this.price = pri ;
           this.power = pow;
           this.guarantee = grn;  
           this.producer = prod;
           this.country =coun;
           this.batch_number = batch;
           this.power_supply = pow_supply;
           
    }
    public static void main(String[] args) {
      ELamp num1 = new ELamp();
      ELamp num2 = new ELamp("black",300,65,30);
      ELamp num3 = new ELamp("white",400,100,40,"Saturn","Poland",123,"battery");
      
      System.out.println(num1.toString());
		System.out.println(num2.toString());
		System.out.println(num3.toString());
		ELamp.printStaticsales_per_day();
    }
    
}
