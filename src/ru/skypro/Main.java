package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        int dog = 7;
        byte cat = 5;
        short cow = 3;
        long mouse = 1L;

        double sugarWeight = 1.0;
        float saltWeight = 2.0F;

        boolean dogIsAdult = dog > 10;

        char c = 33;

        //Задание 2
        double firstFighterWeight = 78.2;
        double secondFighterWeight = 82.7;
        double totalWeight = firstFighterWeight + secondFighterWeight;
        double weightDifference = secondFighterWeight - firstFighterWeight;

        System.out.println("Задание №2");
        System.out.println("Вес двух бойцов: " + totalWeight);
        System.out.println("Разница веса двух бойцов: " + weightDifference);

        System.out.println("_____");

        //Задание 3
        int bananaWeight = 80;
        int bananaQuantity = 5;

        int milkPortionWeight = 105;
        int milkPortionQuantity = 2;

        int iceCreamWeight = 100;
        int iceCreamQuantity = 2;

        int eggsWeight = 70;
        int eggsQuantity = 4;

        int cocktailWeightGrams = bananaWeight * bananaQuantity + milkPortionWeight * milkPortionQuantity + iceCreamWeight *
                iceCreamQuantity + eggsWeight * eggsQuantity;

        double cocktailWeightKilos = cocktailWeightGrams / 1000;

        System.out.println("Задание №3");
        System.out.println("Вес коктейля в килограммах: " + cocktailWeightKilos);
        System.out.println("_____");

        //Задание 4
        int lossWeight = 7000;
        int minLossPerDay = 250;
        int maxLossPerDay = 500;

        double maxDaysForWeightLoss = lossWeight / minLossPerDay;
        double minDaysForWeightLoss = lossWeight / maxLossPerDay;
        double averageWeightLossDays = (maxDaysForWeightLoss + minDaysForWeightLoss) / 2;

        System.out.println("Задание №4");
        System.out.println("Максимальное количество дней для потери веса: " + maxDaysForWeightLoss);
        System.out.println("Минимальное количество дней для потери веса: " + minDaysForWeightLoss);
        System.out.println("Среднее количество дней для потери веса: " + averageWeightLossDays);
        System.out.println("_____");

        //Задание 5
        int mashasSalary = 67_760;
        int denisSalary = 83_690;
        int christinasSalary = 76_230;

        double mashasSalaryAfterRise = 67_760 * 1.1;
        double denisSalaryAfterRise = 83_690 * 1.1;
        double christinasSalaryAfterRise = 76_230 * 1.1;

        double mashasSalaryDifference = mashasSalaryAfterRise - mashasSalary;
        double denisSalaryDifference = denisSalaryAfterRise - denisSalary;
        double christinasSalaryDifference = christinasSalaryAfterRise - christinasSalary;

        System.out.println("Задание №5");
        System.out.println("Маша теперь получает " + mashasSalaryAfterRise + " рублей. Годовой доход вырос на " + mashasSalaryDifference + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryAfterRise + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей");
        System.out.println("Кристина теперь получает " + christinasSalaryAfterRise + " рублей. Годовой доход вырос на " + christinasSalaryDifference + " рублей");
        System.out.println("_____");

    }
}
