package pl.szewczyk.elevator.system.Commands;

import pl.szewczyk.elevator.system.Elevator;
import pl.szewczyk.elevator.system.Orderable;
import pl.szewczyk.elevator.system.States.AcceptingOrderState;

public class ReceiveOrder implements Orderable {
    @Override
    public void execute(Elevator elevator) {
        Integer targetFloor = elevator.receiveTargetFloorFromInput();
        elevator.receiveCommand(new GoToFinalFloor(targetFloor));
        elevator.updateState();
    }

    @Override
    public void setState(Elevator elevator) {
        elevator.changeState(new AcceptingOrderState(elevator));
    }

    @Override
    public Integer getFloorNumber() {
        return null;
    }
}