package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMaxAmongSmaller() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 7, 6, 1};
    assertEquals(12, service.findMax(incomesInBillions));
  }

    @Test
    void findMaxAmongBigger() {
      StatisticsService service = new StatisticsService();
      long[] incomesInBillions = {10, 450, 2000, 0, 2};
      assertEquals(2000, service.findMax(incomesInBillions));
  }
}