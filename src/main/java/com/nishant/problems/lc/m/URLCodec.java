package com.nishant.problems.lc.m;

import java.util.HashMap;
import java.util.Map;

public class URLCodec {
    Map<String, String> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        double f1 = Math.floor(Math.random() * 100);
        sb.append((char)f1);
        while(map.containsKey(sb.toString())){
            sb.append((char)Math.floor(Math.random() * 100));
        }
        map.put(sb.toString(), longUrl);
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String[] args) {
        URLCodec codec = new URLCodec();
        System.out.println(codec.decode(codec.encode("https://leetcode.com/problems/design-tinyurl")));
    }
}
