public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("\n" + "Задача 2");//Разделю пустой строкой задачи друг от друга

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper += 4; //Удобнее использовать сокращенный оператор присваивания
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("\n" + "Задача 3");
        // В условии не указано какое значение надо уменьшить - первоначальное или полученное в задаче 2
        // Выбираю уменьшение первоначального

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("\n" + "Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("\n" + "Задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("\n" + "Задача 6");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов: " + totalBoxersWeight + " кг.");
        var boxerWeightDifference = secondBoxerWeight - firstBoxerWeight;
        // Считаем что бойцы отсортированы по возрастанию веса
        System.out.println("Разница между весами бойцов: " + boxerWeightDifference + " кг.");
    }

    public static void task7() {
        System.out.println("\n" + "Задача 7");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        /* Вне рамок пройденного материала, простая сортировка
            if (firstBoxerWeight > secondBoxerWeight) {
                var maxWeight = firstBoxerWeight; firstBoxerWeight = secondBoxerWeight; secondBoxerWeight = maxWeight;
            }
         */
        System.out.println("Разница между весами бойцов вычитанием: " +
                (secondBoxerWeight - firstBoxerWeight) + " кг.");
        System.out.println("Разница между весами бойцов остатком деления: " +
                (secondBoxerWeight % firstBoxerWeight) + " кг.");
    }

    public static void task8() {
        System.out.println("\n" + "Задача 8");

        var totalWorkingHours = 640;
        var employeeWorkingHours = 8;
        var employees = totalWorkingHours / employeeWorkingHours;
        var moreEmployees = employees + 94;
        var newWorkingHours = moreEmployees * employeeWorkingHours;
        System.out.println("Всего работников в компании - " + employees + " человек.");
        System.out.println("Если в компании работает " + moreEmployees + " человека, то всего " + newWorkingHours +
                " часов работы может быть поделено между сотрудниками.");
    }
}