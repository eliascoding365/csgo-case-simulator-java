import models.Item;

public class App {
    public static void main(String[] args) throws Exception {
        String[] items = {"Item1", "Item2", "Item3", "Item4", "Item5"};
        float[] dropRates = {79.92327f, 15.98465f, 3.19693f, 0.63939f, 0.25575f}; // these should add up to 1
        Item simulator = new Item(items, dropRates);
        String result = simulator.result(args);
        System.out.println(result);
    }
}