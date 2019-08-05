import org.testng.annotations.Test;

public class Day1 {
    @Test
    public void testFirstDayCOde() {
        System.out.print("Hello, World!");
        System.out.println("Another Hello!");
    }

    @Test
    public void testChars() {
        char charVars = 'g';
        System.out.println(charVars);
    }

    @Test
    public void testIntegers() {
        int myNumber;
        myNumber = 5;
        System.out.println(myNumber);
        }

    @Test
    public void testStrings() {
        String s2 = "Who, who, who, who";
        System.out.println(s2);
            }

    @Test
    public void testPrintMessages() {
        int num = 5;
        String message = "I have" + num + "cookies";
        System.out.println (message);
    }

    @Test
    public void testPrintMessages1() {
        int Numberofseconds = 5;
        String message1 = "I will be for" + Numberofseconds + "seconds";
        System.out.println(message1);

    }

    @Test
    public void testLogicalOperators() {
        boolean b = false;
        b = true;
        boolean toBe = false;
        b = toBe || !toBe;
        b = true;
        boolean c = true && false;
        System.out.println (b);

      }

    @Test
    public void testConditionalStatement() {
        boolean elementIsVisible = true;
        if (elementIsVisible ==true)
            System.out.println("Click on the element");
        }


    }


    







