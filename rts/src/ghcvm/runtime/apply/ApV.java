package ghcvm.runtime.apply;

import ghcvm.runtime.*;
import ghcvm.runtime.closure.*;
import ghcvm.runtime.stackframe.*;
import static ghcvm.runtime.RtsMessages.*;

public class ApV extends StackFrame {

    @Override
    public void stackEnter(StgContext context) {
        context.papExpectedArity = 1;
        context.R1.preEnter(context);
        // TODO: Complete definition
    }
}
