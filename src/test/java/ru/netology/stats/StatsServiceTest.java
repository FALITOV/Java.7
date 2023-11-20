package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldGetWhenMonthMin() {
        StatsService service = new StatsService();
        long[] sales = {30, 24, 56, 13, 17, 28, 15, 90, 65, 76, 67, 33};
        int expectedMont = 4;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMont, actualMonth);

    }

    @Test
    public void shouldGetWhenMonthMax() {
        StatsService service = new StatsService();
        long[] sales = {30, 24, 56, 13, 17, 28, 15, 90, 65, 76, 67, 33};
        int expectedMont = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMont, actualMonth);

    }

    @Test
    public void shouldGetTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {30, 24, 56, 13, 17, 28, 15, 90, 65, 76, 67, 33};
        long expectedTotal = 30 + 24 + 56 + 13 + 17 + 28 + 15 + 90 + 65 + 76 + 67 + 33;
        long actualTotal = service.totalSales(sales);
        Assertions.assertEquals(expectedTotal, actualTotal);

    }

    @Test
    public void shouldGetAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {30, 24, 56, 13, 17, 28, 15, 90, 65, 76, 67, 33};
        long expected = (30 + 24 + 56 + 13 + 17 + 28 + 15 + 90 + 65 + 76 + 67 + 33) / 12;
        long actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {30, 24, 56, 13, 17, 28, 15, 90, 65, 76, 67, 33};
        long expected = 7;
        long actual = service.monthBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {30, 24, 56, 13, 17, 28, 15, 90, 65, 76, 67, 33};
        long expected = 5;
        long actual = service.monthAboveAverage(sales);
        Assertions.assertEquals(expected, actual);

    }
}
