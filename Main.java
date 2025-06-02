class Car {
    String name;
    int speed;
    
    void display() {
        System.out.println("name : " + name);
        System.out.println("speed : " + speed);
        System.out.println("the car is accelerating");
    }
    
    void increaseSpeed() {
        speed++;  
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.name = "Audi";
        c1.speed = 130;
        c1.increaseSpeed(); 

        c1.display();
    }
}
