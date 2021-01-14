import java.util.concurrent.LinkedBlockingDeque;

public class CashBox implements Runnable {

    private LinkedBlockingDeque<Integer> unservedCustomers;
    private LinkedBlockingDeque<Integer> servedCustomers;

    public CashBox(LinkedBlockingDeque<Integer> unservedCustomers, LinkedBlockingDeque<Integer> servedCustomers) {
        this.unservedCustomers = unservedCustomers;
        this.servedCustomers = servedCustomers;
    }

    @Override
    public void run() {

        Integer customer;
        synchronized (CashBox.class) {
            while (!unservedCustomers.isEmpty()) {
                customer = unservedCustomers.pollFirst();
                servedCustomers.addLast(customer);
            }
        }

    }

}