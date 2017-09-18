package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(() -> System.out.println("This is an example text"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method reference");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        System.out.println();
        System.out.println("Beautifying poem");
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Great poem", (poem -> poem + " on lambdas"));
        poemBeautifier.beautify("Great poem", (poem -> poem.toUpperCase()));
        poemBeautifier.beautify("Great poem", (poem -> poem.substring(0,1).toLowerCase() + poem.substring(1).toUpperCase()));
        poemBeautifier.beautify("Great poem", (poem -> poem.substring(6)));
        poemBeautifier.beautify("Great poem", (poem -> "The greatest" + poem.substring(5)));
    }
}
