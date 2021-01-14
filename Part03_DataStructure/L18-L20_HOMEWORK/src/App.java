import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class App {

        public static void main (String[]args) throws InterruptedException {

            var unservedCustomers = new LinkedBlockingDeque<Integer>();
            var servedCustomers = new LinkedBlockingDeque<Integer>();
            var executors = Executors.newFixedThreadPool(4);

            for (int i = 1; i <= 2000; i++) {
                unservedCustomers.addLast(i);
            }

            System.out.println("Галя! Люда! Наташа! Валя! Хватит мальчиков обсуждать! "
                    + "У нас очередь из " + unservedCustomers.size() + " человек!");

            var cashBox1 = new Thread(new CashBox(unservedCustomers, servedCustomers));
            var cashBox2 = new Thread(new CashBox(unservedCustomers, servedCustomers));
            var cashBox3 = new Thread(new CashBox(unservedCustomers, servedCustomers));
            var cashBox4 = new Thread(new CashBox(unservedCustomers, servedCustomers));

            executors.execute(cashBox1);
            executors.execute(cashBox2);
            executors.execute(cashBox3);
            executors.execute(cashBox4);

            executors.awaitTermination(2, TimeUnit.SECONDS);
            executors.shutdown();

            System.out.println("Девчонки! Вам удалось их обслужить!");

        }

}
