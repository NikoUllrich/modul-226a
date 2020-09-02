package piberechnen;

public class Pi {
    public static double calculate(){
        double piSquared = 0;
        double numerator = 1;
        double denominator = 1;

        for (int i = 1; i < 1000; i++){
            piSquared = piSquared + (numerator / denominator);
            numerator = -numerator;
            denominator += 2;
        }
        return (piSquared * 4);
    }

    public static void main(String[] args) {
        System.out.println(Pi.calculate());
    }
}
