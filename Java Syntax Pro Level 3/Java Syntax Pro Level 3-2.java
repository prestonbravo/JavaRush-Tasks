// Task 1.
package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        if ((sideA < sideB + sideC) && (sideB < sideC + sideA) && (sideC < sideA + sideB)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}

// Task 2.
package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int age = console.nextInt();
    if ((age < 20) || (age > 60))
    
    //напишите тут ваш код
        System.out.println("можно не работать");
    }
}

//Task 3. 
package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }

//Task 4.
package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Ищем максимум
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
       
        System.out.println(numberA > numberB ? numberA : numberB);
        
      
    }
}

//Task 5
package com.javarush.task.pro.task03.task0310;

import java.util.Scanner;

/* 
Через тернии...
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 5) {
            System.out.println("число меньше 5");
        } else if (number > 5) {
            System.out.println("число больше 5");
        } else {
            System.out.println("число равно 5");
        }
    }
}
// Task 6.
package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    double x = console.nextDouble();
    double y = console.nextDouble();
    if (Math.abs(y - x) < 0.000001 )
        System.out.println("числа равны");
    else    //напишите тут ваш код
        System.out.println("числа не равны");
    }
}
//

