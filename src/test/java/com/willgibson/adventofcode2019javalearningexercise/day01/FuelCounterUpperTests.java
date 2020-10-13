package com.willgibson.adventofcode2019javalearningexercise.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FuelCounterUpperTests {

    private FuelCounterUpper fuelCounterUpper;

    @BeforeEach
    void initUseCase() {
        fuelCounterUpper = new FuelCounterUpper();
    }

    @Test
    void calculate_With12_Returns2() {
        int[] stars = {12};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(2);
    }

    @Test
    void calculate_With14_Returns2() {
        int[] stars = {14};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(2);
    }

    @Test
    void calculate_With1969_Returns654() {
        int[] stars = {1969};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(654);
    }
}
