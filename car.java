class cardetails{
    String brand;
    String model;
    String color;
    int price;
    int year;
    String fuelType;


    void  details(){
        System.out.print( "brand:"+brand+"\nmodel: "+model+"\ncolor: "+color+"\nprice: "+price+"\nyear of purchase: "+year+"\nFuel Type: "+fuelType +"\n");
    }
}



public class car {
    public static void main(String[] args) {
        cardetails c=new cardetails();
        c.brand="bmw";
        c.color ="Black";
        c.price=1000000;
        c.year=2000;
        c.model="sedan";
        c.fuelType ="petrol";
        c.details();

        System.out.println();
        cardetails c2 = new cardetails();

        c.brand = "Audi";
        c.model = "Sedan";
        c.color = "Black";
        c.price = 6500000;
        c.year = 2024;
        c.fuelType = "Petrol";

        c.details();
    }

}
