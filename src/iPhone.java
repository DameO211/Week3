public class iPhone {
    private int iOS;
    private int model;
    private double price;



    public iPhone(int iOS,int model,double price){
        this.iOS = iOS;
        this.model = model;
        this.price = price;
    }

    /*
    * Create a Java class with two subclasses (children).
    * Each class should have at least one attribute and a method.

    * Parent class should have attribute/method that is common to both children
    * and children should have attribute/method that is unique to what they represent.
    * Write main method to demonstrate the correct functionality of the code and to
    * demonstrate that the children inherit from the parent class.
     *
    * */




    public int getiOS() {
        return iOS;
    }
    public int getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }


    public void setiOS(int iOS) {
        this.iOS = iOS;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}

