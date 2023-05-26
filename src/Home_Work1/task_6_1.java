package Home_Work1;

import Home_Work3.calcs.api.ICommunicationPrinter;

import java.util.Objects;

public class task_6_1 implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        String OutPut;
        if (Objects.equals(name, "Вася") || (Objects.equals(name, "Анастасия"))) {
            OutPut = "Привет, я тебя так долго ждал!!!";
        } else {
            OutPut = "Здраствуйте, а вы кто ??? ";
        }
        return OutPut;
    }
}
