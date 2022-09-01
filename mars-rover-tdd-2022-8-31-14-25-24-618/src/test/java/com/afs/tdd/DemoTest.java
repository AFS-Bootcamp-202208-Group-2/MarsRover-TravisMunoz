package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void Should_return_01N_when_command_is_M_given_00N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.command("M");

        Integer expected_x = 0;
        Integer expected_y = 1;
        String expected_direction = "N";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());

    }

    @Test
    void Should_return_0neg1N_when_command_is_M_given_00S() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.command("M");

        Integer expected_x = 0;
        Integer expected_y = -1;
        String expected_direction = "N";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());

    }
}
