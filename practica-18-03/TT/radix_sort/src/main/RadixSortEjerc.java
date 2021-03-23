package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc{

    public static void radixSort(int[] arr){
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("L" + i, new ArrayList<String>());
        }

        String[] sArr = StringUtil.toStringArray(arr);
        StringUtil.lNormalize(sArr, '0');

        int count = 0;
        for (int i = StringUtil.maxLength(sArr) - 1; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                for (String x : sArr) {
                    if (x.charAt(i) == Integer.toString(j).charAt(0)) {
                        map.get("L" + j).add(x);
                    }
                }
            }
            String[] arrResult = new String[arr.length];
            count = 0;
            for (int k = 0; k < 10; k++) {
                while (!map.get("L" + k).isEmpty()) {
                    arrResult[count] = map.get("L" + k).get(0);
                    map.get("L" + k).remove(0);
                    count++;
                }
            }
            sArr = arrResult;
        }

        int[] newArr = StringUtil.toIntArray(sArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        radixSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
    }
}

