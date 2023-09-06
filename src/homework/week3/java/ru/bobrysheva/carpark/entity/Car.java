
public class Car {
    String model;
    String colour;

    public Car(){
    }
    public Car(String model, String colour){
        this.model = model;
        this.colour = colour;
    }

    public static void main(String[] args){

        Car bmv = new Car("bmv", "red");
        Car audi = new Car();
        audi.model = "audi";
        audi.colour = "white";
        Car toyota = new Car();
        toyota.model = "toyota";
        toyota.colour = "black";

        System.out.println("В автопарке имеется автомобиль " + bmv.model + ", его цвет -  " + bmv.colour);
        System.out.println("В автопарке имеется автомобиль " + audi.model + ", его цвет -  " + audi.colour);
        System.out.println("В автопарке имеется автомобиль " + toyota.model + ", его цвет - " + toyota.colour);


    }

}