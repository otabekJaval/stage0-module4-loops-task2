package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int temp = 1;


        if (power == 0) {
            System.out.println("1");
            return;
        }
        if (power < 0) {
            System.out.println("too much power");
            return;
        }

        System.out.println("1");

        while (temp != power + 1) {
            System.out.println(powers(2, temp));
            temp++;
        }
    }

    public int powers(int n, int times) {
        if (times == 0)
            return 1;
        else return n * powers(n, times - 1);
    }
}
