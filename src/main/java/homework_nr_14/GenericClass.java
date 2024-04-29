package homework_nr_14;
import java.util.ArrayList;
import java.util.List;

public class GenericClass <T extends  Number>{
    private List<T> listOfNumbers = new ArrayList<>();

    public GenericClass(List<T> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public List<T> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(List<T> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "listOfNumbers=" + listOfNumbers +
                '}';
    }
}
