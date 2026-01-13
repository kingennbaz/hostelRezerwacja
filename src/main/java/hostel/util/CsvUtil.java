package main.java.hostel.util;

import java.util.List;

public final class CsvUtil {

    private CsvUtil() {
    }

    public static String joinLines(List<String> lines) {
        return String.join("\n", lines);
    }
}
