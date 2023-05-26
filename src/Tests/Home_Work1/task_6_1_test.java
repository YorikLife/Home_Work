package Tests.Home_Work1;

import Home_Work1.task_6_1;
import Home_Work3.calcs.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task_6_1_test {

    @Test
    public void VasyaTest() {
        String name = "Вася";
        ICommunicationPrinter OutPut = new task_6_1();
        String expected = "Привет, я тебя так долго ждал!!!";
        String actual = OutPut.welcom(name);
        Assertions.assertEquals(expected, actual);
    }
}



