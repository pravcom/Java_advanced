import java.util.HashSet;
import java.util.Set;

public class MaxValuesOfArray {
    String[] str;

    void setArray(String[] array) {
        str = array;
    }

    public MaxValuesOfArray(String[] array) {
        setArray(array);
    }

    /**
     * get max value of array str
     * @return get String of str with max value
     */
    public String getMaxValueOfArray(){
        //Массив где будут храниться кол-во символов строки массива str и номер строки str
        String[][] countSymbols = new String[str.length][2];

        int Symbols;
        //Проходим в цикле по введеным строкам
        for (int i = 0; i < str.length; i++){
            Symbols = 0;
            //В цикле проходим по каждому символу строки
            for(int y=0; y < str[i].length(); y++){
                Symbols ++;
            }
            //записываем номер строки и кол-во символов строки
            countSymbols[i][0] = String.valueOf(i);
            countSymbols[i][1] = String.valueOf(Symbols);
        }

        int[][] max = {{Integer.parseInt(countSymbols[0][0]), Integer.parseInt(countSymbols[0][1]) } };
        //Находим максимальный элемент массива
        for (int i=0; i < countSymbols.length; i++){
            int value = Integer.parseInt(countSymbols[i][1]);
            if (value > max[0][1]){
                max[0][0] = i;
                max[0][1] = value;
            }
        }

        return str[max[0][0]];
    }
}
