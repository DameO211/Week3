public class iPhonePro extends iPhone {

    private int cameraPixels;
    public iPhonePro(int iOS, int model, int battery, int cameraPixels) {
        super(iOS, model, battery);
        this.cameraPixels = cameraPixels;
    }

    public int getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(int cameraPixels) {
        this.cameraPixels = cameraPixels;
    }
}
