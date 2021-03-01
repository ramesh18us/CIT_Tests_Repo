import static org.junit.Assert.assertTrue;

public class passfail {

    public static void dummycode(int number) {
   //     System.out.println("The Number is " + number);
        if (number < 6) {
            System.out.println("The test has failed, the Number is NOT greater than 5 and the random number is " + number);
            assertTrue(5 == 6);
        }
        else {
            System.out.println("The test has passed, the Number is greater than 5 and the random number is " + number);
            assertTrue(5 == 5);
        }
    }
}
