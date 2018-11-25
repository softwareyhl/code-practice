package com.yu.tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: LT305
 * @Date: 2018/11/14 18:31
 * @Description:
 */
public class ApacheResponseTime {

    private static final int FACTOR = 10000000; // 10s
    private static final TreeMap<Integer, Integer> summary = new TreeMap<>();

    public static void main(String[] args) {
        File file = new File(ApacheResponseTime.class.getResource("/deny-access_log").getPath());
        double total = 0 ;
        try {
            Files.lines(file.toPath(), StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while (reader.readLine() != null) {
                String rt = reader.readLine().split(" ")[7].split("=")[1];
                int responseRange = Integer.valueOf(rt) / FACTOR;
                summary.put(responseRange, summary.getOrDefault(responseRange, 0) + 1);
                total++;
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

        for (Map.Entry<Integer, Integer> entry : summary.entrySet()) {
            System.out.println("cost:" + String.valueOf(entry.getKey() * FACTOR / 1000000)
                    + "   count:" + entry.getValue()
                    + "   percentage:" + (entry.getValue() / total) * 100 );
        }
    }
}
