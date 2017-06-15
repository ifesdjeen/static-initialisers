package com.ifesdjeen;

import java.util.HashMap;
import java.util.Map;

public class ClassWithStaticFields {

    public static final int i1 = 1;
    public static final int i2 = 2;
    public static final int i3;
    public static final boolean b1 = Boolean.getBoolean("property");

    public static final Map<String, String> m1 = new HashMap<String, String>()
    {{
        put(s(1), s(2));
    }};

    static
    {
        System.out.println("Running static initialisation block");
        i3 = 3;
    }

    private static String s(int i)
    {
        System.out.println("Running static initialisation of map field");
        return Integer.toString(i);
    }
}
