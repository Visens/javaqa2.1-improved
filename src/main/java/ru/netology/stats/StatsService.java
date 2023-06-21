package ru.netology.stats;
public class StatsService {
    public int minSales(int[] sales) {
        //int[] arr = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int minMonth = 0;
        for (int sale = 0; sale < sales.length; sale++)
            if (sales[sale] < sales[minMonth]) {
                minMonth = sale;
            }
        return minMonth + 1;
    }
    public int maxSales(int[] sales) {
        //int[] arr = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int maxMonth = 0;
        for (int sale = 0; sale < sales.length; sale++)
            if (sales[sale] > sales[maxMonth]) {
                maxMonth = sale;
            }
        return maxMonth + 1;
    }
    public int findSalesSum(int [] salesSum) {
        int sum = 0;
        for (int sale = 0; sale < salesSum.length; ++sale)
            sum += salesSum[sale];
        return sum;
    }
    public int findAverageSale(int [] averageSale) {
/*        int sum = 0;*/
        int average = findSalesSum(averageSale) / 12;
/*        for (int i = 0; i < averageSale.length; ++i)
            sum += averageSale[i++];*/
        return average;
    }
    public int underAverageSale(int [] underAverage) {
        int underAverageSale = 0;
        int average = findAverageSale(underAverage);
        for (int sale : underAverage) {
            if (sale < average) {
                underAverageSale += 1;
            }
        }
        return underAverageSale;
    }
    public int overAverageSale(int [] overAverage) {
        int overAverageSale = 0;
        int average = findAverageSale(overAverage);
        for (int sale : overAverage) {
            if (sale > average) {
                overAverageSale += 1;
            }
        }
        return overAverageSale;
    }
}
