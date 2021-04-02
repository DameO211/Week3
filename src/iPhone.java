public class iPhone {
    private int iOS;
    private int model;
    private int battery;



    public iPhone(int iOS,int model,int battery){
        this.iOS = iOS;
        this.model = model;
        this.battery = battery;
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


    boolean power(boolean on_off){
        if (battery == 0) {
            return on_off = false;
        }else
        {
            on_off = true;
        }
        return on_off;
    }


    public int getiOS() {
        return iOS;
    }
    public int getModel() {
        return model;
    }
    public double getbattery() {
        return battery;
    }


    public void setiOS(int iOS) {
        this.iOS = iOS;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "iOS=" + iOS +
                ", model=" + model +
                ", battery=" + battery +
                '}';
    }
}

