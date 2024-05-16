package chapter18.touppercasewriter;

import java.io.IOException;
import java.io.Writer;

public abstract class DecoratorWriter extends Writer {
    protected Writer writer;

    @Override
    public abstract void write(char[] cbuf, int off, int len) throws IOException;

    @Override
    public abstract void flush() throws IOException;

    @Override
    public abstract void close() throws IOException;
}
