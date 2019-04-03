package pl.szewczyk.elevator.system.Commands;

import pl.szewczyk.elevator.system.Elevator;
import pl.szewczyk.elevator.system.Orderable;

public class GoToFinalFloor implements Orderable {

    private Integer floorNumber;

    public GoToFinalFloor(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public void execute(Elevator elevator) {
        elevator.removeCurrentCommand();
    }

    @Override
    public void setState(Elevator elevator) {

    }

    @Override
    public Integer getFloorNumber() {
        return floorNumber;
    }
}