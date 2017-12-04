package arrays;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static arrays.Task01.*;
import static org.junit.Assert.*;

public class Task01Test {

    @Test
    public void stringHasNoRepeats() {
        String uniqueString = "Abcdefghjklo qw";
        assertTrue(hasNoRepeats(uniqueString));
        assertTrue(hasNoRepeatsWithoutDataStructures(uniqueString));
    }

    @Test
    public void stringHasRepeats() {
        String notUniqueString = "Abcdefghjklo qwe";
        assertFalse(hasNoRepeats(notUniqueString));
        assertFalse(hasNoRepeatsWithoutDataStructures(notUniqueString));
    }

    @Test
    public void nullStringReturnsTrue() {
        String emptyString = "";

        assertTrue(hasNoRepeats(emptyString));
        assertTrue(hasNoRepeats(null));

        assertTrue(hasNoRepeatsWithoutDataStructures(emptyString));
        assertTrue(hasNoRepeatsWithoutDataStructures(null));
    }
}