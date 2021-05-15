package DIOparallel;

public class FunctionNsquare extends Thread {

    private int number;

    public FunctionNsquare(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        // a variable to use to waste a little time
        int useComputationalPower = 0;

        // modular function
        number = number > 0 ? number : -number;

        // O(n) = n^2
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++)
                useComputationalPower = 1 + 1;
        }
        System.out.println("O(n) = n^2 has done its job");    
    }
    
}