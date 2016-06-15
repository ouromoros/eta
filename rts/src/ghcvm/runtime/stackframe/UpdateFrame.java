package ghcvm.runtime.stackframe;

import ghcvm.runtime.closure.StgInd;

public abstract class UpdateFrame extends StackFrame {
    public final StgInd updatee;

    public UpdateFrame(final StgInd updatee) {
        this.updatee = updatee;
    }
}
