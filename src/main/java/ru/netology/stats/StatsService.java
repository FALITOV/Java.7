
package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }

        return maxMonth + 1;
    }

    public long totalSales(long[] sales) {
        long topSales = 0;
        for (long sale : sales) {
            topSales += sale;

        }
        return topSales;
    }

    public long averageSales(long[] sales) {

        long averageValueSales = totalSales(sales) / 12;

        return averageValueSales;
    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }


        }

        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }


        }

        return counter;
    }
}



