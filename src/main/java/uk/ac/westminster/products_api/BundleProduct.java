
package uk.ac.westminster.products_api;

import java.util.ArrayList;
import java.util.List;

// A BundleProduct HAS-A collection of Products because it contains products.
// Whether it IS-A Product is debatable: a bundle may be sold as one product,
// but its main relationship to the items inside it is composition.
public class BundleProduct extends Product {

    private List<Product> items = new ArrayList<>();

    public BundleProduct() {
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }
}
