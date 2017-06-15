# Static Initialisation

Test output: 
```
Running com.ifesdjeen.StaticInitialisationTest
ClassWithStaticFields.i1 = 1
ClassWithStaticFields.i2 = 2
Running static initialisation of map field
Running static initialisation of map field
Running static initialisation block
ClassWithStaticFields.b1 = false
==============================
ClassWithStaticFields.m1 = {1=2}
```

So statically initialised constants are accessible without complete static initialisation of all static final fields in class.

Java representation (bytecode compiled):

```java
package com.ifesdjeen;

import java.util.Map;

public class ClassWithStaticFields
{
    public static final int i1 = 1;
    public static final int i2 = 2;
    public static final int i3;
    public static final boolean b1;
    public static final Map<String, String> m1;
    
    private static String s(final int i) {
        System.out.println("Running static initialisation of map field");
        return Integer.toString(i);
    }
    
    static {
        b1 = Boolean.getBoolean("property");
        m1 = (Map)new ClassWithStaticFields.ClassWithStaticFields$1();
        System.out.println("Running static initialisation block");
        i3 = 3;
    }
}
				
```
