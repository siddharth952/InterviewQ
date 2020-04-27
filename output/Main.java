import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Siddharth
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int t = in.nextInt();

            while (t-- != 0) {
                int n = in.nextInt(); // No of candies

                //⌊𝑛−12⌋ , where ⌊𝑥⌋ is 𝑥 rounded down.
                out.println((n - 1) / 2);


                // if (a < 0 || b < 0 || a < b || a + b != n) out.print(0);
            }

        }

    }
}

