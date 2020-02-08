package ComputerV2_0;

public class ComputerMain {
    public static void main(String[] args) {
        Director director = new Director();

        CompOneBuilder compOneBuilder = new CompOneBuilder();
        director.constructCompOne(compOneBuilder);

        CompOne computer_v1 = compOneBuilder.getResult();
        System.out.println(computer_v1);

        CompTwoBuilder compTwoBuilder = new CompTwoBuilder();
        director.constructCompTwo(compTwoBuilder);

        CompTwo compTwo = compTwoBuilder.getResult();
        System.out.println(compTwo);
    }
}
