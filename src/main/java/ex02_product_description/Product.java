package ex02_product_description;

import java.util.Locale;

public class Product {

    private final String name;
    private final Integer size;
    private final Double percentage;

    public Product(String name, Integer size, Double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public String productDescription(){

        if(size == null || percentage == null) return "";

        double nbr = (percentage * 10) % 10;

        if(nbr > 0) return String.format(Locale.US, " - %dCL %.1f%%", size, percentage);
        return String.format(Locale.US, " - %dCL %.0f%%", size, percentage);

    }
}
