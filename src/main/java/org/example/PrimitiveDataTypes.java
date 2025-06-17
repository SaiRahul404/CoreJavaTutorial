package org.example;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Primitive (int float char double byte short long..)
        // Not objects (no methods).
        //
        //Store actual values.
        //
        //Faster and more memory efficient.
        //
        //Stored in stack memory.

        int a;
        // | Type      | Size    | Example                | Description                    |
        //| --------- | ------- | ---------------------- | ------------------------------ |
        //| `byte`    | 1 byte  | `byte b = 10;`         | Whole number (-128 to 127)     |
        //| `short`   | 2 bytes | `short s = 1000;`      | Larger range than byte         |
        //| `int`     | 4 bytes | `int i = 50000;`       | Default for integers           |
        //| `long`    | 8 bytes | `long l = 123456789L;` | Larger integers                |
        //| `float`   | 4 bytes | `float f = 5.75f;`     | Decimal numbers (less precise) |
        //| `double`  | 8 bytes | `double d = 19.99;`    | Default for decimals           |
        //| `char`    | 2 bytes | `char c = 'A';`        | Single character               |
        //| `boolean` | 1 bit   | `boolean flag = true;` | true or false                  |

        // Non-Primitive Data Types (Reference Types)

        // Are objects (can call methods).
        //
        //Store reference (memory address).
        //
        //Slower and use more memory.
        //
        //Stored in heap memory.

        // | Type          | Example                          | Description                       |
        //| ------------- | -------------------------------- | --------------------------------- |
        //| **String**    | `String name = "Alice";`         | Sequence of characters            |
        //| **Array**     | `int[] numbers = {1, 2, 3};`     | Collection of elements            |
        //| **Class**     | `MyClass obj = new MyClass();`   | Custom object with fields/methods |

        // Primitive type
        int age = 25;
        System.out.println(age);  // Outputs: 25

        // Non-primitive type
        String name = "John";
        System.out.println(name.toUpperCase());  // Outputs: JOHN (calls method on object)

        // | Feature         | Primitive                | Non-Primitive                        |
        //| --------------- | ------------------------ | ------------------------------------ |
        //| Nature          | Basic data type          | Object / Reference type              |
        //| Stores          | Actual value             | Reference to object in memory        |
        //| Methods         | No methods               | Have methods (since they're objects) |
        //| Memory location | Stack                    | Heap                                 |
        //| Examples        | `int`, `char`, `boolean` | `String`, `Array`, `Object`          |

    }
}
