// 2) Дана последовательность целых чисел, оканчивающаяся нулем. 
// Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите через пробел последовательность целых чисел, оканчивающаяся нулем:");
        Scanner sc = new Scanner(System.in);
        String strNumbers= sc.nextLine();
        String[] strArr=strNumbers.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        int sum=0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]>0 && intArr[i+1]<0 ) {
                sum=sum+intArr[i];
            }
        }
        System.out.println("Сумма положительных чисел, после которых следует отрицательное число: ");
        System.out.print(sum);
    }
}
