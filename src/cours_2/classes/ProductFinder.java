package cours_2.classes;


public interface ProductFinder {

    Product findById(Integer id) throws ExceptionProductNotFound;
    void addProduct(Product p);
    void clear();
}
