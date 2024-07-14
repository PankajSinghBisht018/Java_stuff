class PyramidPrinter {
    private int height;
    private int currentLine = 1;
    private Object lock = new Object();

    public PyramidPrinter(int height) {
        this.height = height;
    }

    public void printPyramidLine() {
        synchronized (lock) {
            int spaces = height - currentLine;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * currentLine - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            currentLine++;
        }
    }

    public int getCurrentLine() {
        return currentLine;
    }

    public int getHeight() {
        return height;
    }
}

class PyramidThread extends Thread {
    private PyramidPrinter printer;

    public PyramidThread(PyramidPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        while (printer.getCurrentLine() <= printer.getHeight()) {
            printer.printPyramidLine();
            try {
                Thread.sleep(100); // Sleep to simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class practical_20 {
    public static void main(String[] args) {
        int pyramidHeight = 5;
        PyramidPrinter printer = new PyramidPrinter(pyramidHeight);

        // Create multiple threads to print the pyramid
        Thread[] threads = new Thread[pyramidHeight];
        for (int i = 0; i < pyramidHeight; i++) {
            threads[i] = new PyramidThread(printer);
        }

        // Start all threads
        for (int i = 0; i < pyramidHeight; i++) {
            threads[i].start();
        }

        // Join all threads to wait for them to complete
        for (int i = 0; i < pyramidHeight; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
