package com.lineate.bench.pattern.decorator.example2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) throws IOException {

        String string = "Dmitry Borisenko\nLower Case Input Stream Decorator Test";
        try (InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(string.getBytes()))) {
            int c;
            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
