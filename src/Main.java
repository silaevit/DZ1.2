public class Main {
    public static void main(String[] args) {

        //Задание 1
        byte AA = 1;
        short BB = 2;
        int CC = 3;
        long DD = 4L;
        float EE = 5.5f;
        double FF = 6.6;
        boolean AABB = AA < 2;
        char bar = 63;
        System.out.println(AABB);


// Задание 2
        System.out.println("Задание 2");
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double allboxer = boxer1 + boxer2;
        double differens = boxer2 - boxer1;
        System.out.println("Общий вес боксеров: " + allboxer+" кг.");
        System.out.println("Разница в весе боксеров: " + differens+" кг.");

        //Задание 3
        System.out.println("Задание 3");
        byte bananas = 5;
        int milk = 2;
        byte iceCream = 2;
        byte ags = 4;
        short bananasWeght = 80;
        short milkWeght = 105;
        short iceCreamWeght = 100;
        short agsWeght = 70;
        int ingredientsAll = bananas + milk + iceCream + ags;
        float weghtAll = bananas*bananasWeght + milk*milkWeght + iceCream*iceCreamWeght + ags*agsWeght;
        System.out.println("Общий вес в граммах: " + weghtAll+ "г.");
        System.out.println("Общий вес в килограммах: " + weghtAll/1000+" кг.");

        //Задание 4
        System.out.println("Задание 4");
        int weghtNeed = 7;
        double weght1 = 0.250;
        double weght2 = 0.500;
        double numberOfDays1 = weghtNeed/weght1;
        double numberOfDays2 = weghtNeed/weght2;
        System.out.println("Количество дней при похудании по 250 г.: "+numberOfDays1+ " дней");
        System.out.println("Количество дней при похудании по 500 г.: "+numberOfDays2+ " дней");

        //Задание 5
        System.out.println("Задание 5");
        int salaryMasha = 67760;
        int salaryDinis = 83690;
        int salaryKristina = 76230;

        System.out.println("Зраплата Маши: "+salaryMasha+ " руб.");
        System.out.println("Зарплата Диниса: "+salaryDinis+ " руб.");
        System.out.println("Зарплата Кристины: "+salaryKristina+ " руб.");


        double salaryIncreaseMasha = 6776;
        double salaryIncreaseDinis = 8369;
        double salaryIncreaseKristina = 7623;

        System.out.println("Каждому сотруднику увеличили зарплату на 10%");

        System.out.println("Маша стала получать: "+ salaryIncreaseMasha+ " руб.");
        System.out.println("Динис стал получать: "+salaryIncreaseDinis+ " руб.");
        System.out.println("Кристина стала получать: "+salaryIncreaseKristina+ " руб.");

        byte monthsInAYear = 12;

        int salaryYearMasha = monthsInAYear * salaryMasha;
        int salaryYearDinis = monthsInAYear * salaryDinis;
        int salaryYearKristina = monthsInAYear * salaryKristina;

        double NewSalaryYearMasha = monthsInAYear * (salaryMasha+salaryIncreaseMasha);
        double NewSalaryYearDinis = monthsInAYear * (salaryDinis +salaryIncreaseDinis);
        double NewSalaryYearKristina = monthsInAYear * (salaryKristina +salaryIncreaseKristina);

        double salaryDifferenceYearMasha = NewSalaryYearMasha - salaryYearMasha;
        double salaryDifferenceYearDinis = NewSalaryYearDinis - salaryYearDinis;
        double salaryDifferenceYearKristina = NewSalaryYearKristina - salaryYearKristina;

        System.out.println("Годовая зарплата Маши перед повышеним: "+ salaryYearMasha+ " руб.");
        System.out.println("Годовая зарплата Диниса перед повышеним: "+salaryYearDinis+ " руб.");
        System.out.println("Годовая зарплата Кристины перед повышеним: "+salaryYearKristina+ " руб.");

        System.out.println("Годовая зарплата Маши после повышеним: "+ NewSalaryYearMasha+ " руб." );
        System.out.println("Маша стала зарабатывать на: "+ salaryDifferenceYearMasha+ " руб. в год больше" );

        System.out.println("Годовая зарплата Динса после повышеним: "+NewSalaryYearKristina+ " руб.");
        System.out.println("Динис стал зарабатывать на: "+ salaryDifferenceYearDinis+ " руб. в год больше" );

        System.out.println("Годовая зарплата Кристины после повышеним: "+NewSalaryYearKristina+ " руб.");
        System.out.println("Кристина стала зарабатывать на: "+ salaryDifferenceYearKristina+ " руб.в год больше" );
    }
}