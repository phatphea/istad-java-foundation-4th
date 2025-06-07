package classobject;

public class Dog {

    //Fields or state or instance variable
    String breed;
    String color;
    Size size;

    //Default constructor
//    Dog(){
//
//    }

    //No-argument constructor
    Dog(){
        this.breed = "Unknown";
        this.color = "None";
    }

    //Argument constructor
    Dog(String breed, String color,  Size size){
        this.breed = breed;
        this.color = color;
        this.size = size;
    }

    //behaviour or method
     void display(){
        System.out.println("Dog Bread = " + this.breed);
        System.out.println("Dog Color = " + this.color);
         System.out.println("Dog Size = " + this.size);
    }



    enum Size{
        SMALL,
        MEDIUM,
        LARGE
    }
}
