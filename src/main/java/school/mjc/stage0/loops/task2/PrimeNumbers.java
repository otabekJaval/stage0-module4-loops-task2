package school.mjc.stage0.loops.task2;



public class PrimeNumbers {


     void printPrimeNumbers(int printToInclusive) {

         if(printToInclusive<1)return;

        int temp=2;

        while (temp!=printToInclusive+1){
            if(isPrime(temp))
                System.out.println(temp);

            temp++;
        }
    }

     static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
