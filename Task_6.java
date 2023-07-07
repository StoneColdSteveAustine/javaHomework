import java.util.*;

public class Task_6 {
}


class Criterion {

    Object value;
    Double minValue;
    Double maxValue;
    boolean isQuantitative;
    String property;

    public Criterion(String property, boolean isQuantitative, Object value, Double minValue, Double maxValue) {
        this.property = property;
        this.isQuantitative = isQuantitative;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public static Criterion startGetting(Scanner iScanner, String property, boolean isQuantitative) {

        if (isQuantitative) {

            String quest = "Выберите тип криетрия: " +
                    "\n 1. Значение" +
                    "\n 2. Меньше" +
                    "\n 3. Больше" +
                    "\n 4. Интервал";
            System.out.println(quest);

            String text = iScanner.next();

            Criterion criterion = null;

            if (text.equals("1")) {
                System.out.println("Введите значение для поиска: ");
                int getValue = iScanner.nextInt();
                criterion = new Criterion(property, isQuantitative, getValue, null, null);
            } else if (text.equals("2")) {
                System.out.println("Введите предельное максимальное значение: ");
                double getValue = iScanner.nextDouble();
                criterion = new Criterion(property, isQuantitative, null, null, getValue);
            } else if (text.equals("3")) {
                System.out.println("Введите предельное минимальное значение: ");
                double getValue = iScanner.nextDouble();
                criterion = new Criterion(property, isQuantitative, null, getValue, null);
            } else if (text.equals("4")) {
                System.out.println("Введите предельное минимальноезначение: ");
                double getMin = iScanner.nextDouble();
                System.out.println("Введите предельное максимальное  значение: ");
                double getMax = iScanner.nextDouble();
                criterion = new Criterion(property, isQuantitative, null, getMin, getMax);
            }

            return criterion;
        }

        System.out.println(" Введите значение для поиска: ");
        String getValue = iScanner.next();
        return new Criterion(property, isQuantitative, getValue, null, null);
}

}
}
