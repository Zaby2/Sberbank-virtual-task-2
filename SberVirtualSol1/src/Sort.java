import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
    List<String> str1 = new ArrayList<String>();
    public Sort( List<String> str1) {
        this.str1 = str1;
    }
    public void sort() {
        str1.stream().sorted(Comparator.comparing(str -> str.split(";")[1]));
    }
}
