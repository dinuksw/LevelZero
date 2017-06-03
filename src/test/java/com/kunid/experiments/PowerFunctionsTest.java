package com.kunid.experiments;

import org.junit.Test;

import static com.kunid.experiments.PowerFunctions.compute;
import static org.junit.Assert.assertEquals;

/**
 * Created by dinuk.weerasinghe on 03/06/2017.
 */
public class PowerFunctionsTest {

    @Test
    public void should_compute_negative_powers() {
        assertEquals(0.5d, compute(2, -1), 0.0);
    }

    @Test
    public void should_compute_power_of_zero() {
        assertEquals(1, compute(2,0), 0.0d );
    }

    @Test
    public void should_compute_power_of_one() {
        assertEquals(2, compute(2,1), 0.0d );
    }

    @Test
    public void should_computer_powers_of_positive_numbers() {
        assertEquals(1024, compute(2,10), 0.0d);
    }

}