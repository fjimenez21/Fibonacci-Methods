
class Main {

    /** Iterative method */
    public static int iterativeMethod(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        int n1 = 0, n2 = 1, next = 0;
        for (int term = 2; term <= n; term++) {
            next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
        return next;
    }

    /** Recursive Method */
    public static int recursiveMethod(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
            // recursive call
        else return recursiveMethod(n - 1) + recursiveMethod(n - 2);
    }

    public static void main(String[] args) {

        long startTime, endTime;
        long timeIterative, timeRecursive;
        System.out.printf("%2s%25s%25s\n","n","Iterative Method","Recursive Method");
        System.out.println("====================================================");
        for(int n=1; n<=20; n++){
            startTime = System.nanoTime();
            iterativeMethod(n);
            endTime = System.nanoTime();
            timeIterative = endTime  - startTime;

            startTime = System.nanoTime();
            recursiveMethod(n);
            endTime = System.nanoTime();
            timeRecursive = endTime  - startTime;

            System.out.printf("%2d%25d%25d\n",n,timeIterative,timeRecursive);

        }
        System.out.println("*Results in Nanoseconds (ns)*");
    }


}