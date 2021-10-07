Exam VI - Практика
-------------------
Задача A (35 баллов):
Создать класс Student, с обязательными полями:
 - id,
 - имя,
 - средняя оценка,
 - возраст,
 - пол,
 - остальные по желанию.

В main, создать список(или массив) из 10 студентов (с разными значениям).

Написать следующие методы с использованием stream:

 1. public static List getNamesList(Student[] students) {...} - Метод получает массив(или список) студентов, назад должен вернуть список из строк, содержащий имена студентов.

 2. public static List getNamesListByAge(Student[] students, int minAge) {...} Метод, получает массив(или список) студентов и минимальный возраст, назад должен вернуть список из строк, содержащий имена студентов старше минимального возраста.

 3. public static void printAnonymously(Student[] students) {} - Метод получает список студентов, и выводит на консоль сообщение в виде 
    ID: 1, Средняя оценка: 99.
    ID: 2, Средняя оценка: 100.
    И тд.

 4. public static List getNamesFirstLetterList(Student[] students) {...} - Метод получает список студентов, назад должен вернуть список из строк, содержащий первую букву имени и длину имени.
    Например:
    Sabina -> S6
    Shamil -> S6
    Manas -> M5
    Askhat Serikov -> A14
---------------------------
Задача B (25 баллов):
Создать 6 потоков.

В каждом из которых, при запуске потока на консоль вывести одно из слов (Java, C#, PHP, JavaScript, Go, Python). Один поток - выводит одно слово.

Нужно сделать так, чтобы слова на консоли всегда выходили строго по очереди:
 Java
 Python
 Go
 JavaScript
 PHP
 C#