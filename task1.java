import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Task_1_1 {

    public static void main(String[] args) throws SecurityException, IOException {
        int[] arr = new int[] { 3, 6, 1, 0, 5, 8, 12, 45, 10, 11, 5, 2 };
        show_array("Исходный массив: ", arr);
        show_array("Отсортированный массив: ", bubble_sort(arr));
    }

    // Метод пузырьковой сортировки
    public static int[] bubble_sort(int[] array) throws SecurityException, IOException {
        // Запись логов в txt-файл
        Logger text_logger = Logger.getLogger(Task_1_1.class.getName());
        FileHandler filetext = new FileHandler("C:/Users/16-jl/Study/Java/HomeWorks/HomeWork_2/log_for_HW2.txt",
                true);
        text_logger.addHandler(filetext);
        SimpleFormatter sFormat = new SimpleFormatter();
        filetext.setFormatter(sFormat);
        // Запись логов в xml-файл
        Logger xml_logger = Logger.getLogger(Task_1_1.class.getName());
        FileHandler file = new FileHandler("C:/Users/16-jl/Study/Java/HomeWorks/HomeWork_2/log.xml", 104857600, 200,
                true);
        xml_logger.addHandler(file);
        XMLFormatter xmlform = new XMLFormatter();
        file.setFormatter(xmlform);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    text_logger.info(Arrays.toString(array));
                    xml_logger.info(Arrays.toString(array));
                }
            }
        }
        return array;
    }

    // Метод выводящий массив в консоль
    public static void show_array(String msg, int[] array) {
        System.out.println();
        System.out.println(msg);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
