package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public  void printFactorialRow(int printToInclusive) {

        for(int i=0;i<=printToInclusive;i++){
            System.out.println(returnFactorial(i));
        }
    }

    public  int returnFactorial(int n) {
        if (n == 0)
            return 1;
        else return n * returnFactorial(n -1);
    }
}
