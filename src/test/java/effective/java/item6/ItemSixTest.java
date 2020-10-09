package effective.java.item6;

import effective.java.item6.impl.ItemSixUnnecessaryObjects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class ItemSixTest {


    public Long getAndRunTimeBadSolution(Integer times, String romanNum) {

        Long startTime = System.nanoTime();
        for (int i = 0; i < times; i++) {
            ItemSixUnnecessaryObjects.isRomanNumeralBad(romanNum);
        }
        Long endTime = System.nanoTime();
        Long timeTakes = endTime - startTime;
        return timeTakes;
    }

    public Long getRunTimeGoodSolution(Integer times, String romanNum) {

        Long startTime = System.nanoTime();
        for (int i = 0; i < times; i++) {
            ItemSixUnnecessaryObjects.isRomanNumeralGood(romanNum);
        }
        Long endTime = System.nanoTime();
        Long timeTakes = endTime - startTime;
        return timeTakes;
    }

    @Test
    public void testGoodWithBadSolution() {


        final String ROMAN_NUMBER_EXAMPLE = "MCMXXXIV";
        Integer times = 10000;

        final Long timeTakesBad = getAndRunTimeBadSolution(times, ROMAN_NUMBER_EXAMPLE);
        final Long timeTakesGood = getRunTimeGoodSolution(times, ROMAN_NUMBER_EXAMPLE);

        Long diffTimeTakes = timeTakesBad - timeTakesGood;
        Long durationInMs = TimeUnit.MILLISECONDS.convert(diffTimeTakes, TimeUnit.NANOSECONDS);
        System.out.println("Bad solution time: " + timeTakesBad + " pico second");
        System.out.println("Good solution time: " + timeTakesGood + " pico second");
        System.out.println("Diff of solution times in milli sec: " + durationInMs);

        Assertions.assertTrue(timeTakesBad > timeTakesGood);
    }
}
