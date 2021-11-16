public class Engine {
    int power;

    public Engine() {
    }

    public Engine(int power) {
        this.power = power;
    }

    int getTurbo(int par1) {
        this.power=(int)(power*1.1);
        return power;
    }
}
