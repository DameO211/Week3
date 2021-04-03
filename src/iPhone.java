public class iPhone {
    private int iOS;
    private int model;
    private int battery;



    public iPhone(int iOS,int model,int battery){
        this.iOS = iOS;
        this.model = model;
        this.battery = battery;
    }


    //power method used to determine if phone is on or off
    boolean power(boolean on_off){
        on_off = false;
        if (battery == 0) {
            return on_off = false;
        }
        return true;
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

