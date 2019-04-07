package design.patterns.creational.builder;

public class BuilderUsage {

    public static void main(String args[]) {

        // better than StringBuffer for performance
        // and better than concatenating strings yourself
        StringBuilder builder = new StringBuilder();
        builder.append("An example ");
        builder.append("of the builder pattern. ");
        builder.append(111);

        System.out.println(builder.toString());
    }
}