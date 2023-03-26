package org.example.patterns.templateMethod;

public class Test {
    public static void main(String[] args) {
        DataRenderer renderer = new CSVDataRenderer();
        System.out.println(renderer.render());

        renderer = new XMLDataRenderer();
        System.out.println(renderer.render());
    }
}
