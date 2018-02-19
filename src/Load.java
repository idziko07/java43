import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Load {
    public Map<Integer, Integer>loadFile(File name) throws FileNotFoundException {
        Scanner input = new Scanner(name);
        int number;
        int num;
        Map<Integer,Integer> numbers = new TreeMap<>();
        while (input.hasNext()){
            number = input.nextInt();

            if(numbers.containsKey(number)){
                num = numbers.get(number);
                numbers.put(number, num+1);
            }else{
                numbers.put(number,1);
            }
        }
        input.close();

        return numbers;
    }
}
