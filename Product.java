class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        // Create original objects
        Category category = new Category("Electronics");
        Product originalProduct = new Product(101, category);

        // Clone the product
        Product clonedProduct = originalProduct.deepClone();

        // Show original and clone
        System.out.println("Original Product ID: " + originalProduct.getId());
        System.out.println("Original Category: " + originalProduct.getCategory().getName());

        System.out.println("Cloned Product ID: " + clonedProduct.getId());
        System.out.println("Cloned Category: " + clonedProduct.getCategory().getName());

        // Modify the clone's category
        clonedProduct.getCategory().setName("Books");

        // Show that changing the clone doesn't affect the original
        System.out.println("\nAfter modifying clone's category:");
        System.out.println("Original Category: " + originalProduct.getCategory().getName());
        System.out.println("Cloned Category: " + clonedProduct.getCategory().getName());
    }
    public Category deepClone()
    {
        return new Category(this.name);
    }
}

class Product {
    private int id;
    private Category category;

    public Product(int id, Category category) {
        this.id = id;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * TO-DO: Implement this method using recursion principles.
     \*
     * This method should create a deep copy of the Product object. This means
     * it must also create a new instance of the Category object.
     * Imagine a scenario where Category could contain other objects that also need cloning.
     * A recursive approach is ideal for such deep-copying tasks.
     \*
     * @return A new Product object with all its contained objects also newly created.
     */
    public Product deepClone() {

        // This is a shallow copy. The trainee needs to make it a deep copy.
        // For this simple case, a loop isn't present, but the concept is to
        // replace direct assignment with a recursive cloning call pattern.
        Category clonedCategory = category.deepClone();
        Product clonedProduct = new Product(this.id, clonedCategory);
        return clonedProduct;
    }

}