import org.testng.annotations.Test;

import static java.lang.System.out;

public class Day2 {
    private Object Boolean;

    @Test
    public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++)
            if (i % 2 == 0) out.println(i);
    }

    @Test
    public void testPrintConditions() {
        int a = 4;
        boolean b = a == 4;

        if (b) {
            out.println("It's true!");
        }
    }


    @Test
    public void testPrintBoolean() {

        int a = 4;
        int b = 5;
        boolean result;
        result = a < b; // true
        result = a > b; // false
        result = a <= 4; // a smaller or equal to 4 - true
        result = b >= 6; // b bigger or equal to 6 - false
        result = a == b; // a equal to b - false
        result = a != b; // a is not equal to b - true
        result = a > b || a < b; // Logical or - true
        result = 3 < a && a < 6; // Logical and - true
        result = !result; // Logical not - false; {
          out.println (Boolean);


    }

   }








