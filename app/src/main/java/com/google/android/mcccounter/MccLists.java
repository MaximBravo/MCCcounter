package com.google.android.mcccounter;

import java.util.Arrays;
import java.util.List;

/** Created by alex on 4/4/16. */

public class MccLists {
//    public static List<String> shortMccList = Arrays.asList(
//            "re", "in", "or", "an", "th", "al", "at", "ma", "ar", "es",
//            "co", "il", "ac", "ch", "no", "de", "se", "ed", "of", "le",
//            "ro", "ou", "ti", "is", "it", "en", "er", "on", "to", "st"); // Full list

// Removed: re, ti, le, co, se, ma, st
// Removed: es, ti, re, co, le, se, ma*/
// Removed: es, ti, le, se, ma

    public static List<String> shortMccList = Arrays.asList(
            "re", "in", "or", "an", "th", "al", "at", "ar",
            "co", "il", "ac", "ch", "no", "de", "ed", "of",
            "ro", "ou", "is", "it", "en", "er", "on", "to", "st"); // Removed: ti, es, le, se, ma

    public static List<String> longMccList = Arrays.asList("ing", "and", "the");
}
