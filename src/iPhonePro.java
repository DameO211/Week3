public class iPhonePro extends iPhone {

    private int cameraPixels;

    public iPhonePro(int iOS, int model, int battery, int cameraPixels) {
        super(iOS, model, battery);
        this.cameraPixels = cameraPixels;
    }

    public void setCameraPixels(int pixels) {
        pixels = 0;
        if(pixels < 6) {
            System.out.println("Camera set to low definition pictures ");
        }else{
            System.out.println("Camera set to high definition pictures ");
        }
        this.cameraPixels = cameraPixels;
    }

    public int getCameraPixels() {
        return cameraPixels;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
