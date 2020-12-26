package com.hackerrank;

import java.util.*;

public class Solution {

    public static int priceCheck(List<String> products, List<Double> productPrices, List<String> productSold, List<Double> soldPrice){
        // Compare selling prices to product prices.
        // Determine number of errors in selling prices.
        int sellingErrors = 0;

        // Group the products with their prices
        HashMap<String, Double> input = new HashMap<>();
        HashMap<String, Double> sold = new HashMap<>();
//        HashMap<String, Float>

        for(int product = 0; product < productPrices.size(); product++){
            input.put(products.get(product), productPrices.get(product));
//            System.out.println(products.get(product) + " " + productPrices.get(product));
        }

        for(int product = 0; product < soldPrice.size(); product++){
            sold.put(productSold.get(product), soldPrice.get(product));
//            System.out.println(productSold.get(product) + " " + soldPrice.get(product));
        }

        // Compare prices in input hashmap with sold hashmap prices
        // Correct prices in input hashmap
//        for(Map.Entry<String, Double> entry : sold.entrySet()){
//            // Check keys first!
//            // Check price of that item with key
//            // if price does not match in productPrice hashmap, + 1 to sellingErrors
//
//        }

        Set<String> productKeys = new HashSet<String>(input.keySet());
        Set<String> soldKeys = new HashSet<String>

        for(String key : sold.keySet()){
//             Check keys of each hashmap entry first!
//             Check price of that item with key
//             if price does not match in productPrice hashmap, + 1 to sellingErrors

        }





        // compare product prices to sold prices
//        for(int price = 0; price < productPrices.size(); price++){
//            if(productPrices.get(price) != soldPrice.get(price)){
//                sellingErrors++;
//            }
//        }

        return sellingErrors;
    }
}
