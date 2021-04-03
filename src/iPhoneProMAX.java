import java.util.Scanner;

public class iPhoneProMAX extends iPhone {
    private int screenSize = 0;

    public iPhoneProMAX(int iOS, int model, int battery, int screenSize) {
        super(iOS, model, battery);
        this.screenSize = screenSize;
    }

    public int isScreenSize() {
        return screenSize;
    }

    public int getScreenSize() {
        int screenSize = this.screenSize;
        return screenSize;
    }

    public void setScreenSize() {

        Scanner scan = new Scanner(System.in);
        System.out.println("What size is the screen? ");
        int screenOrientation = scan.nextInt();
        if (screenOrientation <= 50){
            System.out.println("Screen orientation: Portrait ");
        }
        else{
            System.out.println("Screen orientation: Landscape ");
        }

        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return super.toString()+ "Screen size: "+this.screenSize;
    }
}

