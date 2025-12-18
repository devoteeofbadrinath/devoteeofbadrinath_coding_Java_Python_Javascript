package Day1.Java;

public class ForLoopInJava {

    public static void main(String[] args) {
        ForLoopInJava forLoopInJava = new ForLoopInJava();
        int inputArray[] = { 1, 2, 3, 4, 5 };
        forLoopInJava.printArray(inputArray);
    }

    private void printArray(int inputArray[]) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }

}
