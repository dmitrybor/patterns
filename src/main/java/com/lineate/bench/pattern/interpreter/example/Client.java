package com.lineate.bench.pattern.interpreter.example;

public class Client {
    public InterpreterContext context;

    public Client(InterpreterContext context) {
        this.context = context;
    }

    public String interpret (String str) {
        Expression expression = null;
        int intValue = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if (str.toLowerCase().contains("hexadecimal")) {
            expression = new IntToHexExpression(intValue);
        } else if (str.toLowerCase().contains("binary")) {
            expression = new IntToBinaryExpression(intValue);
        } else  {
            return str;
        }
        return expression.interpret(context);
    }

    public static void main(String[] args) {
        String str1 = "28 in binary";
        String str2 = "28 in hexadecimal";
        Client client = new Client(new InterpreterContext());
        System.out.println(client.interpret(str1));
        System.out.println(client.interpret(str2));
    }
}
