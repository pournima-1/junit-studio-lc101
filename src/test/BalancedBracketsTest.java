package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    // @Test
    //public void emptyTest() {
    //  assertEquals(true, true);
    //}

    @Test
    public void onlyBracketsReturnsTrue() {
      assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyValidMultipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }

    @Test
    public void onlyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }

    @Test
    public void validBracketsWithStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void validBracketsInMiddleOfStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launc[]hcode"));
    }

    @Test
    public void validMultipleBracketsInMiddleOfStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launc[][][][][]hcode"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyInvalidOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void onlyInvalidClosedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void invalidOpenBracketsWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }

    @Test
    public void invalidClosedBracketsWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launchcode"));
    }

    @Test
    public void invalidOpenBracketsInMiddleOfStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launc[hcode"));
    }

    @Test
    public void invalidClosedBracketsInMiddleOfStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchc]ode"));
    }
}
