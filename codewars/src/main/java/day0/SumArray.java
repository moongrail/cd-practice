package day0;

import java.util.Arrays;

/**Напишите функцию, которая принимает массив чисел и возвращает сумму чисел. Числа могут быть отрицательными или нецелыми. Если массив не содержит чисел, вы должны вернуть 0.

 Примеры
 Вход: [1, 5.2, 4, 0, -1]
 Выход:9.2

 Вход: []
 Выход:0

 Вход: [-2.398]
 Выход:-2.398

 Предположения
 Вы можете считать, что вам даны только цифры.
 Вы не можете предположить размер массива.
 Вы можете предположить, что вы получили массив, и если массив пуст, верните 0.
 Тесты предполагают точность 1e-4.

 Что мы тестируем
 Мы тестируем базовые циклы и математические операции. Это для новичков, которые только изучают циклы и математические операции.
 Продвинутым пользователям это может показаться очень простым, и они могут легко записать это в одну строку.
**/
public class SumArray {
    public static double sum(double[] numbers) {
        if(numbers == null || numbers.length == 0){
            return 0;
        }
        return Arrays.stream(numbers).sum();
    }
}
