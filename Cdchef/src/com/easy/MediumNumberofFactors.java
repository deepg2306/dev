package com.easy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MediumNumberofFactors {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        for (int i = 0; i < t; i++) {
	            int n = scanner.nextInt();
	            int[] val = new int[n];
	            HashMap<Integer, Integer> map = new HashMap<>();
	            for (int j = 0; j < n; j++) {
	                val[j] = scanner.nextInt();
	                primeFactor(val[j], map);
	            }
	            Iterator it = map.entrySet().iterator();
	            int numberOfFactors = 1;
	            while (it.hasNext()) {
	                HashMap.Entry pair = (HashMap.Entry) it.next();
	                numberOfFactors *= ((int) pair.getValue() + 1);
	            }
	            System.out.println("\n"+numberOfFactors);
	        }
	    }

	    public static void primeFactor(int n, HashMap<Integer, Integer> map) {
	        while (n % 2 == 0) {
	            if (!map.containsKey(2)) {
	                map.put(2, 1);
	            } else {
	                int count = map.get(2);
	                map.put(2, count + 1);
	            }
	            n = n / 2;
	        }
	        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
	            while (n % i == 0) {
	                if (map.get(i) == null) {
	                    map.put(i, 1);
	                } else {
	                    map.put(i, map.get(i) + 1);
	                }
	                n = n / i;
	            }
	        }
	        if (n > 2) {
	            if (!map.containsKey(n)) {
	                map.put(n, 1);
	            } else {
	                map.put(n, map.get(n) + 1);
	            }
	        }
	    }
	    
	}




