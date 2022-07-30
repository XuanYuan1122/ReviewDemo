package org.seraph.review.demo;

import android.util.Log;

public class DemoTWO extends DemoThree {

    public int s = 3;

    @Override
    public void setsd() {

    }

//    public void setTExt() {
//        new DemoText().text();
//        Log.e("DemoTWO", s+"");
//    }

    class DemoText extends DemoOne {
        public void text() {
            s = 6;
            Log.e("Demotext", s + "");
        }
    }
}
