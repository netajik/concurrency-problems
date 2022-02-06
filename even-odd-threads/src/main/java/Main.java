import com.netaji.Printer;
import com.netaji.PrinterType;
import com.netaji.State;

public class Main {
    public static void main(String[] args) {
        final State state = new State(PrinterType.ODD);
        final Printer oddPrinter = new Printer(1,2,state,PrinterType.ODD,PrinterType.EVEN,25);
        final Printer evenPrinter = new Printer(2,2,state,PrinterType.EVEN,PrinterType.ODD,25);

        final Thread oddThred = new Thread(oddPrinter);
        final Thread evenThred = new Thread(evenPrinter);

        oddThred.start();
        evenThred.start();

    }
}
