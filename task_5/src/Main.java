import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
// Passing the file’s path
        String path = new String("C:\\Users\\DAkhtyamov\\Desktop\\Аттестация\\Курсы\\Java advanced\\task_5\\test.txt");
        CountWordInlist wordInlist = new CountWordInlist(path);

        //Выводим список слов без преобразовний
        System.out.println(wordInlist.getStr());

        //Разбиваем строку на массив из слов Заполняем List значениями из массива слов
        //Сортируем список со всеми словами в АЛФАВИТНОМ порядке
        List<String> list = wordInlist.getList();
        System.out.println(list);
        //Перекладываем слова в SET чтобы избежать дубликатов
        Set<String> setList = new HashSet<>();
        for (String word : list) {
            setList.add(word);
        }
        int max = 0;
        String maxDuplicate = new String();
        for (String word : setList) {
            int countWord = Collections.frequency(list, word);
            System.out.println("Слово: " + word + " || Количество повторений: " + countWord);
            if (max < countWord) {
                max = countWord;
                maxDuplicate = word;
            }
        }

        System.out.println("Слово с максимальным количеством повторений: "+maxDuplicate+" Количество повторений: "+max);


    }
}