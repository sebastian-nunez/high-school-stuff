import java.util.Arrays;

// © A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 04/01/19
// Class - 10th
// Lab - Fibonacci

public class Fibonacci
{
    // instance variable
    private long[] fibSeq;

    // constructors
    public Fibonacci() {
        setSeqSize(3);
    }

    public Fibonacci(int size) {
        setSeqSize(size);
    }

    // set method
    public void setSeqSize(int size) {
        fibSeq = new long[size + 1];
        fibSeq[0] = 1;
        fibSeq[1] = 1;
    }

    // get method
    public long getFib(int fib) {
        long output;
        long fib_1_back = fibSeq[0];
        long fib_2_back = fibSeq[1];
        int fibSeqIndex = 2;

        if (fib >= fibSeq.length || fib < 1) {
            return -1;
        } else if (fib == 1 || fib == 2) {
            return 1;
        } else {
            while (fibSeqIndex <= fib) {
                fibSeq[fibSeqIndex] = fib_1_back + fib_2_back;
                fibSeqIndex++;
                fib_1_back = fibSeq[fibSeqIndex - 1];
                fib_2_back = fibSeq[fibSeqIndex - 2];
            }
            output = fibSeq[fib - 1];
        }
        return output;
    }

    // toString
    public String toString() {
        return Arrays.toString(fibSeq);

    }
}
