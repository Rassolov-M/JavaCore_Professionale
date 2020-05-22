package lesson4.homework4;

public class Main {

    private static Object monitor = new Object();
    private static final int quantity = 5;
    private static volatile char last = 'C';

    public static void main(String[] args) {
        PrinterThread threadA = new PrinterThread('C', 'A');
        PrinterThread threadB = new PrinterThread('A', 'B');
        PrinterThread threadC = new PrinterThread('B', 'C');

        threadA.start();
        threadB.start();
        threadC.start();
    }

    private static class PrinterThread extends Thread {
        private char before;
        private char after;

        public PrinterThread(char before, char after) {
            this.before = before;
            this.after = after;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < quantity; i++) {
                    synchronized (monitor) {
                        while (last != before) {
                            monitor.wait();
                        }
                        System.out.print(after);
                        last = after;
                        monitor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
