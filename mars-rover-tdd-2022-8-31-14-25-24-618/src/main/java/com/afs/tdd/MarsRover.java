package com.afs.tdd;

import java.util.Arrays;
import java.util.List;


public class MarsRover {

    private int x_axis;
    private int y_axis;
    private String direction;

    public MarsRover(int x_axis, int y_axis, String direction) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.direction = direction;
    }

    public int getX_axis() {
        return x_axis;
    }

    public void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }

    public void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void move() {
        switch (getDirection()) {
            case "N":
                setY_axis((getY_axis() + 1));
                break;
            case "S":
                setY_axis((getY_axis() - 1));
                break;
            case "E":
                setX_axis((getX_axis() + 1));
                break;
            case "W":
                setX_axis((getX_axis() - 1));
                break;
        }


    }

    public void batchCommand(String batchCommand){
        splitBatchCommand(batchCommand).forEach(this::command);
    }

    private List<String> splitBatchCommand(String batchCommand) {
        return Arrays.asList(batchCommand.split(""));
    }

    private void command(String command) {
        switch (command) {
            case "M":
                this.move();
                break;
            case "R":
                this.turnRight();
                break;
            case "L":
                this.turnLeft();
                break;
        }
    }

    private void turnLeft() {
        switch (getDirection()) {
            case "N":
                setDirection("W");
                break;
            case "S":
                setDirection("E");
                break;
            case "E":
                setDirection("N");
                break;
            case "W":
                setDirection("S");
                break;
        }
    }

    private void turnRight() {
        switch (getDirection()) {
            case "N":
                setDirection("E");
                break;
            case "S":
                setDirection("W");
                break;
            case "E":
                setDirection("S");
                break;
            case "W":
                setDirection("N");
                break;
        }

    }
}
