package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void Should_return_01N_when_command_is_M_given_00N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.batchCommand("M");

        Integer expected_x = 0;
        Integer expected_y = 1;
        String expected_direction = "N";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());

    }

    @Test
    void Should_return_0neg1S_when_command_is_M_given_00S() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.batchCommand("M");

        Integer expected_x = 0;
        Integer expected_y = -1;
        String expected_direction = "S";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_10E_when_command_is_M_given_00E() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.batchCommand("M");

        Integer expected_x = 1;
        Integer expected_y = 0;
        String expected_direction = "E";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_neg10W_when_command_is_M_given_00W() {
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.batchCommand("M");

        Integer expected_x = -1;
        Integer expected_y = 0;
        String expected_direction = "W";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_00E_when_command_is_R_given_00N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.batchCommand("R");

        Integer expected_x = 0;
        Integer expected_y = 0;
        String expected_direction = "E";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_00S_when_command_is_R_given_00E() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.batchCommand("R");

        Integer expected_x = 0;
        Integer expected_y = 0;
        String expected_direction = "S";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_00W_when_command_is_R_given_00S() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.batchCommand("R");

        Integer expected_x = 0;
        Integer expected_y = 0;
        String expected_direction = "W";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_00N_when_command_is_R_given_00W() {
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.batchCommand("R");

        Integer expected_x = 0;
        Integer expected_y = 0;
        String expected_direction = "N";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_00W_when_command_is_L_given_00N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.batchCommand("L");

        Integer expected_x = 0;
        Integer expected_y = 0;
        String expected_direction = "W";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_00N_when_command_is_L_given_00E() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.batchCommand("L");

        Integer expected_x = 0;
        Integer expected_y = 0;
        String expected_direction = "N";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_00E_when_command_is_L_given_00S() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.batchCommand("L");

        Integer expected_x = 0;
        Integer expected_y = 0;
        String expected_direction = "E";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }

    @Test
    void Should_return_00S_when_command_is_L_given_00W() {
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.batchCommand("L");

        Integer expected_x = 0;
        Integer expected_y = 0;
        String expected_direction = "S";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }


    @Test
    void Should_return_00S_when_command_is_MLMR_given_00N() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.batchCommand("MLMR");

        Integer expected_x = -1;
        Integer expected_y = 1;
        String expected_direction = "N";

        assertEquals(expected_x, marsRover.getX_axis());
        assertEquals(expected_y, marsRover.getY_axis());
        assertEquals(expected_direction, marsRover.getDirection());
    }
}
