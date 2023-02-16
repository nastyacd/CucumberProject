package StepDefinition;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class TestSteps {
    public static int a;
    public static int b;
    public static String condition;

    @Когда("запомнить число а (\\d+)$")
    public static void getValueA(int a) {
        TestSteps.a = a;
    }
    @Когда("запомнить число b (\\d+)$")
    public static void getValueB(int b) {
        TestSteps.b = b;
    }
    @Когда("запомнить условие (сложить|вычесть|умножить|разделить)$")
    public static void getCondition(String condition) {
        TestSteps.condition = condition;
    }
    @Тогда("посчитать$")
    public static void calculate(){
        calculate(condition, a, b);
    }
    @Когда("(сложить|вычесть|умножить|разделить) числа (\\d+) и (\\d+)$")
    public static void calculate(String condition, int a, int b) {
        switch (condition) {
            case "сложить":
                System.out.println(a + b);
                break;
            case "вычесть":
                System.out.println(a - b);
                break;
            case "умножить":
                System.out.println(a * b);
                break;
            case "разделить":
                System.out.println((double)a / b);
                break;
        }
    }
}
