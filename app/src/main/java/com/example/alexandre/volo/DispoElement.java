package com.example.alexandre.volo;

/**
 * Created by alexandre on 2015-10-02.
 */
public class DispoElement {

    private String disp;

    public DispoElement (int start, int finish, String day) {
        this.disp = day + " : " + start + " to " + finish;
    }

    public String toString() {
        return disp;
    }
}
