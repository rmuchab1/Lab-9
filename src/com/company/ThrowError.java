package com.company;

public class ThrowError {
    public static void Error() {
        String[] arr = new String[3];
        for (int i = 0; i < 6; i++) {
            arr[i] = arr[i];
        }
    }
}
