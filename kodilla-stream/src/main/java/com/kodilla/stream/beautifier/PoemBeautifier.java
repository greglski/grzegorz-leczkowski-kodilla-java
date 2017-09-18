package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String poem, PoemDecorator poemDecorator) {
        String beautifulPoem = poemDecorator.decorate(poem);
        System.out.println("Show a poem " + "\"" + beautifulPoem + "\"");
    }
}
