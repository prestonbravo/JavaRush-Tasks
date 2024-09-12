//Task1.
package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
    Scanner console = new Scanner(System.in);
    int number = console.nextInt();
    if (number < 0)
        System.out.println(cold);
    else 
        System.out.println(warm);
        //напишите тут ваш код
    }
}

//Task 2. 
package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
    Scanner console =  new Scanner(System.in);
    String name = console.nextLine();
    int age = console.nextInt();
    if (age >= 18 && age <= 28)
        System.out.println(name + militaryCommissar);
    //напишите тут ваш код
    }
}

// Task 3.
package com.javarush.task.pro.task03.task0303;

import java.util.Scanner;

/* 
Школа или институт
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18)
            {
                if (age >= 6)
                System.out.println("нужно ходить в школу");
            }    
        else
            System.out.println("пора в институт");
    }
}

//Task 4.
package com.javarush.task.pro.task03.task0304;

import java.util.Scanner;

/* 
Измерим температуру тела
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
       isHigh = (bodyTemperature > 37);
       isLow = (bodyTemperature < 36);
       //напишите тут ваш код
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}

// Task 5/
package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2) {
            if (number1 == number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number1 + " " + number2);
            }
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        }
    }
}
