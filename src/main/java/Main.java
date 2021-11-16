public class Main {
    public static void main(String[] args) {
        Car car1=new Car(new Color("red"), new Engine(100),Types.SEDAN);
        car1.color.putDarker();
        System.out.println(car1);


    }
}
