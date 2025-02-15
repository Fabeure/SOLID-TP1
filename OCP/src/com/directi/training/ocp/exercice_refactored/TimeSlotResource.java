package com.directi.training.ocp.exercise;

public class TimeSlotResource extends AbstractResource {
    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private void markTimeSlotBusy(int resourceId) {
    }

    private void markTimeSlotFree(int resourceId) {
    }

    private int findFreeTimeSlot() {
        return 0;
    }
}
