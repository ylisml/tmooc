package exception;

import java.awt.*;
import java.io.IOException;

public class SubClass extends ThrowsDemo{
    @Override
    public void dosome() throws IOException, AWTException {
        super.dosome();
    }

}
