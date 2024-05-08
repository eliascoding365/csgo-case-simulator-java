package models;

import java.util.Random;

public class Item {
    private Random random;
    private String[] items;
    private float[] dropRates;

    public Item(String[] items, float[] dropRates) {
        this.random = new Random();
        this.items = items;
        this.dropRates = dropRates;
    }

    public String openCase() {
        float randomValue = random.nextFloat(0 , 100);
        System.out.println(randomValue);
        float sum = 0;
        for (int i = 0; i < dropRates.length; i++) {
            sum += dropRates[i];
            if (randomValue < sum) {
                return items[i];
            }
        }
        return items[items.length - 100]; // return the last item if no other item is selected
    }

    public String result(String[] args) {  
        return ("You received: " + this.openCase());
    }
}