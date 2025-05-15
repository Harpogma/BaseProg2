package cours_2.classes;


import java.util.HashMap;
import java.util.Map;

public class ProductFinderMap implements ProductFinder{
    private Map<Integer, Product> prods = new HashMap<>();

    @Override
    public Product findById(Integer id) {
        return this.prods.get(id);
    }

    @Override
    public void addProduct(Product p) {
        this.prods.put(p.getId(), p);
    }

    @Override
    public void clear() {
        this.prods.clear();
    }

    public Map<Integer, Product> getProds(){
        return this.prods;
    }
}
