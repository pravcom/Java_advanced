import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountWordInlist {
    private String str;
    private List<String> list;

    CountWordInlist(String path) throws IOException {
        FileReader f = new FileReader(path);
        int i;
        str = new String();

        while ((i = f.read()) != -1) {
            // Print the content of a file

            str = str + String.valueOf((char) i);
        }

        fillListFromStr();
    }

    public String getStr() {
        return str;
    }

    public List<String> getList() {
        return list;
    }

    private void fillListFromStr() {
        list = new ArrayList<>();
        String[] arr = str.split(" ");

        for (String value : arr) {
            list.add(value);
        }
        list.sort(String::compareToIgnoreCase);
    }
}
