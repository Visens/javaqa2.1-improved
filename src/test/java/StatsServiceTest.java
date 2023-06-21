import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;
public class StatsServiceTest {

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] Sales = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int expected = 4;
        int actual = service.minSales(Sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int[] Sales = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int expected = 7;
        int actual = service.maxSales(Sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findSalesSum() {
        StatsService service = new StatsService();
        int[] salesSum = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int expected = 546;
        int actual = service.findSalesSum(salesSum);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findAverageSale() {
        StatsService service = new StatsService();
        int[] averageSale = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int expected = 45;
        int actual = service.findAverageSale(averageSale);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void underAverageSale() {
        StatsService service = new StatsService();
        int[] underAverage = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int expected = 6;
        int actual = service.underAverageSale(underAverage);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void overAverageSale() {
        StatsService service = new StatsService();
        int[] overAverage = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int expected = 6;
        int actual = service.overAverageSale(overAverage);
        Assertions.assertEquals(expected, actual);
    }
}
