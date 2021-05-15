package DIOparallel;

public class FunctionN extends Thread {

    private int number;

    public FunctionN(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        //a variable to wate time
        int anotherWasteVariable = 0;

        //modular function
        number = number > 0 ? number : -number;

        // O(n) = n
        for (int i = 0; i < number; i++) {
            anotherWasteVariable = 1+1;
        }
        System.out.println("O(n) = n has done its job");
    }
    
}
