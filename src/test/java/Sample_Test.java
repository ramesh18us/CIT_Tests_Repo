import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

//env.Test2 = MFE_GFS_Test;

public class Sample_Test {
    Random ran = new Random();
    int range = 9;
    int randomNumber;
    int number;


    //int totalNumber = 20;

    @Test
    public void MFE_GFS_Test() {

        randomNumber = ran.nextInt(range) + 1;
        dummycode(randomNumber);
    }


    @Test
    public void MFE_KTS_Test() {

        randomNumber = ran.nextInt(range) + 1;
        dummycode(randomNumber);
    }
    public void dummycode(int number) {
        System.out.println("The Number is " + number);
        if (number < 6)
            assertTrue(5==6);

        else
            assertTrue(5==5);
    }


}
