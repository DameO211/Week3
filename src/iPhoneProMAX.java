import kotlin.Pair;

import java.util.Scanner;

public class iPhoneProMAX extends iPhone {
    private boolean screenSize = false;

    public iPhoneProMAX(int iOS, int model, int battery) {
        super(iOS, model, battery);
        this.screenSize = screenSize;
    }

    public boolean isScreenSize() {
        return screenSize;
    }

    public void setScreenSize(boolean screenSize) {
        int screenOrientation = 0;
        if (screenOrientation <= 50){
            System.out.println("Screen orientation: Portrait ");
        }
        else{
            System.out.println("Screen orientation: Landscape ");
        }

        this.screenSize = screenSize;
    }
}

