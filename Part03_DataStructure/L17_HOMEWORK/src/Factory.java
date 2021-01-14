import java.util.ArrayList;

public class Factory {

    public static void main(String[] args) throws InterruptedException {
        var storage = new ArrayList<Detail>();

        for (int i = 1; i <= 20; i++) {
            storage.add(new Detail(i));
        }

        for (Detail det : storage) {
            var thread1 = new Thread() {

                public void run() {
                    System.out.println("Изделие №" + det.getDetNum() + " обрабатывается на конвейере №1");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Изделие №" + det.getDetNum() + " окончило оброботку на конвейере №1");
                }

            };

            var thread2 = new Thread() {

                public void run() {
                    System.out.println("Изделие №" + det.getDetNum() + " обрабатывается на конвейере №2");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Изделие №" + det.getDetNum() + " окончило оброботку на конвейере №2");
                }

            };

            var thread3 = new Thread() {

                public void run() {
                    System.out.println("Изделие №" + det.getDetNum() + " обрабатывается на конвейере №3");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Изделие №" + det.getDetNum() + " окончило оброботку на конвейере №3");
                }

            };

            var thread4 = new Thread() {

                public void run() {
                    System.out.println("Изделие №" + det.getDetNum() + " обрабатывается на конвейере №4");
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Изделие №" + det.getDetNum() + " нокончило оброботку на конвейере №4");
                }

            };

            var thread5 = new Thread() {

                public void run() {
                    System.out.println("Изделие №" + det.getDetNum() + " обрабатывается на конвейере №5");
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Изделие №" + det.getDetNum() + " окончило оброботку на конвейере №5");
                }

            };

            var thread6 = new Thread() {

                public void run() {
                    System.out.println("Изделие №" + det.getDetNum() + " обрабатывается на конвейере №6");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Изделие №" + det.getDetNum() + " окончило оброботку на конвейере №6");
                }

            };
            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            thread3.start();
            thread3.join();

            thread4.start();
            thread5.start();

            thread4.join();
            thread5.join();

            thread6.start();

        }
    }

}
