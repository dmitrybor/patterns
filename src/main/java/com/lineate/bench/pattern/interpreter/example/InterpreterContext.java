package com.lineate.bench.pattern.interpreter.example;

public class InterpreterContext {
    // Typical inputs
    // "<number> in binary"
    // "<number> in hexadecimal

    // Output
    // "number" in the format specified by the input

    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}
