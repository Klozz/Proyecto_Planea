package com.digital.carlos.digitalplanea;

/**
 * Created by carlos on 17/02/17.
 */

import android.app.Activity;
import android.os.Bundle;

public class about extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.about);

           /* DisplayMetrics dm = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);
            int Width=dm.widthPixels;
            int height = dm.heightPixels;

            getWindow().setLayout((int)(Width*.8),(int)(height*.5)); */

        }

}

