package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {

        int temp=0;
        while (temp!=lastPrinted+1){
            System.out.println(temp);
            temp++;
        }
    }
}
