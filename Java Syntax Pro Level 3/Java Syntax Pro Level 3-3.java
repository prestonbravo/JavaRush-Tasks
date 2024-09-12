//Task 1
package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String name1 = console.nextLine();
    String name2 = console.nextLine();
    if (name1.equals(name2))
    //напишите тут ваш код
        System.out.println("строки одинаковые");
    else    //напишите тут ваш код
        System.out.println("строки разные");
    }
}
//Task 2 .
package com.javarush.task.pro.task03.task0313;

public class Solution {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}
//Task 3
package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
    Scanner console  = new Scanner(System.in);
    String name = console.nextLine();
    if (secret.equalsIgnoreCase(name))
        System.out.println("доступ разрешен");
    else
        System.out.println("доступ запрещен");
    }
}
//

