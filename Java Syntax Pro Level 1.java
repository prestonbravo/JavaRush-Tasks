//Task 1.  Amigo is very smart. Write a programm which displays "Амиго очень умный"
package com.javarush.task.task01.task0142;

/* 
Амиго очень умный
*/

public class Solution {
    public static void main(String[] args) {
    System.out.println("Амиго очень умный");    //напишите тут ваш код
    }
}

//Task 2. I think being a programmer is cool . Write a programm which displays "Я думаю, быть программистом круто"
package com.javarush.task.task01.task0101;

/* 
Я думаю, быть программистом круто
*/

public class Solution {
    public static void main(String[] args) {
    System.out.println("Я думаю, быть программистом круто");    //напишите тут ваш код
    }
}

//Task 3. Naming variables. 
package com.javarush.task.task01.task0105;

/* 
Объявляем переменные
*/

public class Solution {
    public static void main(String[] args) {
    String name;
    int age;
    String city;//напишите тут ваш код
    }
}

//Task 4. Naming myself
package com.javarush.task.task01.task0109;

/* 
«Я по объявлению…»
*/

public class Solution {
    public static void main(String[] args) {
    int a = 5;
    int b = 7; //напишите тут ваш код
    }
}

//Task 5. My little friend
package com.javarush.task.task01.task0103;

/* 
Мой юный друг
*/

public class Solution {
    public static void main(String[] args) {
    int a = 3126;
    int b = a - 8;
    System.out.println(b);//напишите тут ваш код
    }
}

//Task 6. Happy New Year. Uncomment lines.
package com.javarush.task.task01.task0115;

/* 
Ну это… С новым годом!
*/

public class Solution {
    public static void main(String[] args) {
        // String s = "Merry";
        // System.out.println("Christmas");
        // System.out.println("Merry New");
        // System.out.println("weekend");
         System.out.print("Happy New");
        // System.out.println("weekend");
        // System.out.println(s);
        // System.out.print("Merry New!");
        System.out.print(" ");
         System.out.println("Year");
    }
}

// Task 7. No comments.  Uncomment 1 line to show in compilator in exact order 12, 2
package com.javarush.task.task01.task0107;

/* 
Комментарии излишни
*/

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}

//Task 8. Comment out any unnecessary lines of code so that the text appears on the screen: 2 plus 3 equals 5 

// Note: You can't comment on  int a and int b variables.
package com.javarush.task.task01.task0108;

/* 
2 + 3 = 5
*/

public class Solution {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        //System.out.print("два");
        System.out.print(b);
        System.out.print(" плюс ");
        //System.out.print(" минус ");
        System.out.print(a);
        //System.out.print("три");
        System.out.print(" равно ");
        //System.out.print(" будет ");
        //System.out.print("пять");
        System.out.print(a + b);
    }
}
