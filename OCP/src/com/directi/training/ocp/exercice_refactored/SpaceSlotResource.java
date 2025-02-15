package com.directi.training.ocp.exercise;

public class SpaceSlotResource extends AbstractResource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotBusy(int resourceId) {
        // Implementation here
    }

    private void markSpaceSlotFree(int resourceId) {
        // Implementation here
    }

    private int findFreeSpaceSlot() {
        return 0; // Dummy implementation
    }
}
