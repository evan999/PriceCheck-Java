package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();

        List<String> products = new ArrayList<>(
                Arrays.asList("eggs", "milk", "cheese")
        );

        List<Double> productPrices = new ArrayList<Double>(Arrays.asList(2.89, 3.29, 5.79));

        List<String> productsSold = new ArrayList<>(
                Arrays.asList("eggs", "eggs", "cheese", "milk")
        );

        List<Double> soldPrices = new ArrayList<Double>(Arrays.asList(2.89, 2.99, 5.97, 3.29));

//        System.out.println(productsSold);
//        solution.priceCheck(products, productPrices, productsSold, soldPrices);
        int result = solution.priceCheck(products, productPrices, productsSold, soldPrices);
        System.out.println(result);
//        solution.priceCheck();
    }
}
