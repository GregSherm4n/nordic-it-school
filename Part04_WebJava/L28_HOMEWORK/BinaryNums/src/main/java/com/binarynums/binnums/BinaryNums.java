package com.binarynums.binnums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class BinaryNums {

    public static void main(String[] args) {
        SpringApplication.run(BinaryNumsApplication.class, args);

        System.out.println(countNumbers("11001111001"));
    }

    public static int countNumbers(String str) {
        var result = 0;
        var counter = 0;

        if (str == null || str == "")
            return 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '1')
                counter = 0;
            else {
                counter++;
                if (result <= counter)
                    result = counter;
            }
        }

        return result;
    }

}
