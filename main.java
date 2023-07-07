import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows_10", 200000, "Acer"));
        set.add(new Notebook("Notebook 2", 16, "Windows_11", 285000, "Lenovo"));
        set.add(new Notebook("Notebook 3", 32, "linux", 22000, "HP-Pavilion"));
        set.add(new Notebook("Notebook 4", 64, "Macos", 390000, "MacBook"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}
