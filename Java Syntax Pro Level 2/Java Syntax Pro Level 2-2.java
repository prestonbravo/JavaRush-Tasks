//Task 1.
package com.javarush.task.pro.task02.task0206;

public class Solution {

    public static void main(String[] args) {
    String word = "Happy", phrase = "good luck", line = "Pet the cat", text = "Let's go!";   //напишите тут ваш код

    }
}

//Task 2.
package com.javarush.task.pro.task02.task0207;

/* 
Логотип решает все
*/

public class Solution {

    public static void main(String[] args) {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 +s2; //напишите тут ваш код

        System.out.println(tagline);
    }
}

//Task 3.
package com.javarush.task.pro.task02.task0208;

/* 
Пустота и пробелы
*/

public class Solution {

    public static void main(String[] args) {
        String emptiness = "пустота";

        String fullness = emptiness + " " + emptiness + " " + emptiness; //напишите тут ваш код

        System.out.println(fullness);
    }
}

//Task 4.
package com.javarush.task.pro.task02.task0209;

/* 
Конкатенация строк и чисел
*/

public class Solution {

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = (x+y) + "" + z; //напишите тут ваш код

        System.out.println(digits);
    }
}

//Task 5.
package com.javarush.task.pro.task02.task0210;

/* 
С каждым разом огромнее
*/

public class Solution {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount); //напишите тут ваш код

        System.out.println(hugeAmount);
    }
}

// Task 6.
package com.javarush.task.pro.task02.task0211;

/* 
Получение длины строки
*/

public class Solution {

    public static void main(String[] args) {
        String emptyString = "";

        //напишите тут ваш код
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}

//Task 7.
package com.javarush.task.pro.task02.task0213;

/* 
Причешем резюме
*/

public class Solution {

    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        //напишите тут ваш код
        System.out.println("RESUME".toLowerCase());
        System.out.println("TITLE: ".toLowerCase() + title.toLowerCase());
        System.out.println("DEGREE: ".toLowerCase() + degree.toLowerCase());
        System.out.println("CAREER: ".toLowerCase() + career.toLowerCase());
    }
}

//Task 8.
package com.javarush.task.pro.task02.task0212;

/* 
Попрошу регистр на меня не повышать!
*/

public class Solution {

    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        //напишите тут ваш код
        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println(caps.toUpperCase() + "they know I mean business".toUpperCase());
    }
}

