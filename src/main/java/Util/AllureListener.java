package Util;

import org.junit.runner.notification.Failure;


/**
 * Created by 777 on 08.05.2017.
 */
public class AllureListener {

    public void testFailure(Failure failure) {
        System.out.println("Тест упал");
    }
}