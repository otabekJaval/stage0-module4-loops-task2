package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int copy = 0;

        if(multiplyByAndToInclusive==0)
            return;

        while (copy != Math.abs(multiplyByAndToInclusive)+1) {

            System.out.println(copy*multiplyByAndToInclusive);


            copy++;
        }
    }
}
