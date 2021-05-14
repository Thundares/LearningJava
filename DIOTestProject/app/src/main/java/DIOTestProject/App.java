/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DIOTestProject;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    // calculates exponentiation
    public int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        else {
            return base * power(base, exp - 1);
        }
    }

    // return the string paramter
    public String getString(String returned) {
        return returned;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
