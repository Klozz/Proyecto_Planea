package com.digital.carlos.digitalplanea;

/**
 * Created by carlos on 17/02/17.
 */

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

public class SplashScreenActivity extends Activity {

    // Colocando duración de la screenplash.
    private static final long SPLASH_SCREEN_DELAY = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Colocando la orientación de la ScreenSplash.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Ocultando titúlo de la barra.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Mostrando nueva actividad.
        setContentView(R.layout.splash_screen);
        // Usando relog de tiempo.
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // Iniciando la actividad principal
                Intent mainIntent = new Intent().setClass(
                        SplashScreenActivity.this, MainActivity.class);
                startActivity(mainIntent);

                // Cerrando ScreenSplash
                finish();
            }
        };

        // Simulate a long loading process on application startup.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

}