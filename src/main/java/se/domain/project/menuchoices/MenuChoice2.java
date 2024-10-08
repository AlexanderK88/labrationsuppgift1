package se.domain.project.menuchoices;

import se.domain.project.HourlyPrice;

public class MenuChoice2 {

  public static double average(HourlyPrice[] prices) {
    int total = 0;
    int count = 0;

    for (HourlyPrice price : prices) {
      if (price != null) {
        total += price.price();
        count++;
      }
    }

    return count > 0 ? (double)total / count : 0;
  }

  public static HourlyPrice minValue(HourlyPrice[] prices) {
    if (prices == null || prices.length == 0) {
      return null;
    }

    HourlyPrice minPrice = null;

    for (HourlyPrice price : prices) {
      if (price != null && (minPrice == null || price.price() < minPrice.price())) {
        minPrice = price;
      }
    }

    return minPrice;
  }

  public static HourlyPrice maxValue(HourlyPrice[] prices) {
    if (prices == null || prices.length == 0) {
      return null;
    }

    HourlyPrice maxPrice = null;

    for (HourlyPrice price : prices) {
      if (price != null && (maxPrice == null || price.price() > maxPrice.price())) {
        maxPrice = price;
      }
    }

    return maxPrice;
  }
}