// Task 1.
package com.javarush.task.pro.task04.task0401;

/* 
Я никогда не буду работать за копейки
*/

public class Solution {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int n = 1;
        while (n <= 100) {
            System.out.println(quote);
            n++;
        }
    }
}
//Task 2.
package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine() + text;
        int n = 1;
        while (n <= 10) {
            System.out.println(result);
            n++;
        }
    }
}
//Task 3.
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}
//Task 4
public class Solution {
    public static void main(String[] args) {
   int n = 0;

while (n < 5)
{

   int m = 0;

   while (m < 10)
{
   System.out.print("Q");
   m++;
}

   System.out.println();

   n++;

} 

    }
}
// Task 5.
public class Solution {
    public static void main(String[] args) {
        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('Б');
                } else if (width == 1 || width == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}
