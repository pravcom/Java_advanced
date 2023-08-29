public class MaxMinValueOfArray {
    int[] array;
    int indexOfMinValue;
    int indexOfMaxValue;
    void setArray(int[] a){
        array = a;
    }
    /**
     * Получаем максимальное значение массива и его индекс
     * @return
     */
    int getMaxValueOfArray(){
        int max = array[0];
        for (int i = 0; i < array.length; i++ ){
            int value = array[i];
            if(value > max){
                max = value;
                indexOfMaxValue = i;
            }
        }

        return max;
    }

    /**
     * Получаем минимальное значение массива и его индекс
     * @return
     */
    int getMinValueOfArray(){
        int min = array[0];
        for (int i = 0; i < array.length; i++ ){
            int value = array[i];
            if(value < min){
                min = value;
                indexOfMinValue = i;
            }
        }

        return min;
    }

    /**
     * Меняем местами максимиальный и минимальный элемент массива.
     * @return
     */
    int[] changeMaxAndMinValueOfArray(){
        int max = getMaxValueOfArray();
        int min = getMinValueOfArray();

        int[] changeArray = array;

        changeArray[indexOfMaxValue] = min;
        changeArray[indexOfMinValue] = max;

        return changeArray;
    }
}
