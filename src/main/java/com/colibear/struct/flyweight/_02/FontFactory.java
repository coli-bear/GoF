package com.colibear.struct.flyweight._02;

import java.util.HashMap;
import java.util.Map;

// 캐싱 하는 거야
public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.valueOf(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }

}
