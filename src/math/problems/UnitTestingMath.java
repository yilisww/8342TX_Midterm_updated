package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Factorial fac = new Factorial();
        Assert.assertEquals(fac.factorialNum(5), 120, "check the calculation of factorial.");

        FindMissingNumber findmiss = new FindMissingNumber();
        int [] testArray = {1,4,5,6,2,7,8,9,10};
        Assert.assertEquals(findmiss.findMissing(testArray), 3, "finding the missing number");



    }
}
