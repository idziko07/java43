import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File name = new File("plik.txt");
        Load load = new Load();

        Map<Integer,Integer> numbers = load.loadFile(name);

        Collection<Map.Entry<Integer,Integer>> numbersEntry = numbers.entrySet();

        for (Map.Entry<Integer, Integer> number : numbersEntry) {
            System.out.println(number.getKey() + "- liczba wystąpień: " + number.getValue());
        }

    }
}
