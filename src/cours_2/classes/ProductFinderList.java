package cours_2.classes;


import java.util.ArrayList;
import java.util.List;

public class ProductFinderList implements ProductFinder{

    private List<Product> prods = new ArrayList<>();

    @Override
    public Product findById(Integer id) throws ExceptionProductNotFound {
        for(Product p : this.prods){
            if(p.getId().equals(id)){
                return p;
            }
        }
        //return null;
        throw new ExceptionProductNotFound();
    }

    @Override
    public void addProduct(Product p) {
        if(!this.prods.contains(p)) {
            this.prods.add(p);
        }
    }

    @Override
    public void clear() {
        this.prods.clear();
    }
}
