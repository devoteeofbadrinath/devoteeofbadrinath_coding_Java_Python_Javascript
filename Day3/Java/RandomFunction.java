package Day3.Java;

public class RandomFunction {

    public static void main(String[] args) {
        int inputArray[] = new int[25];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 100);
        }
        for (int i : inputArray) {
            System.out.println(i);
        }
    }

}
