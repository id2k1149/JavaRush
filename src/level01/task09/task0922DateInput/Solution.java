package level01.task09.task0922DateInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?

Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Все переменные должны быть проинициализированы.
5. Программа должна выводить данные на экран.
6. Вывод должен соответствовать заданию.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try {
            BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
            String inputS = s.readLine();

            SimpleDateFormat simpleDate = new SimpleDateFormat("MM/dd/yyyy");
            SimpleDateFormat englishSimpleDate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

            Date date = simpleDate.parse(inputS);

            System.out.println(englishSimpleDate.format(date).toUpperCase());

        } catch (Exception e) {
            System.out.println("Неверный формат даты. Введите согласно примеру: 08/18/2013");
            main(args);
        }
    }
}


