import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MultiThreading {

    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(10);
//        service.submit(() -> System.out.println( Thread.currentThread().getName()));
//        service.submit(() -> System.out.println( Thread.currentThread().getName()));
//        service.submit(() -> System.out.println( Thread.currentThread().getName()));
//        service.submit(() -> System.out.println( Thread.currentThread().getName()));
//
//        service.close();
//
//        ExecutorService service1 = Executors.newCachedThreadPool();
//        service1.submit(() -> System.out.println( Thread.currentThread().getName()));
//        service1.submit(() -> System.out.println( Thread.currentThread().getName()));
//        service1.submit(() -> System.out.println( Thread.currentThread().getName()));
//        service1.submit(() -> System.out.println( Thread.currentThread().getName()));
//service1.close();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.scheduleWithFixedDelay(
                () -> System.out.println( Thread.currentThread().getName()),
                15,
                20,
                TimeUnit.SECONDS
        );
//        scheduledExecutorService.shutdown();



    }
}
