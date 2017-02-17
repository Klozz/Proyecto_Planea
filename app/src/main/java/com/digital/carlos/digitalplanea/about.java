package com.digital.carlos.digitalplanea;

/**
 * Created by carlos on 17/02/17.
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class about extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // show new activity
            setContentView(R.layout.about);
            // set profile Vanessa Linares
            ImageView vanessa = (ImageView)findViewById(R.id.vanessa);
            vanessa.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.facebook.com/vane.linaresescorcia"));
                    startActivity(intent);
                }
            });
            // set profile Carlos Arriaga
            ImageView carlos = (ImageView)findViewById(R.id.carlos);
            carlos.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.facebook.com/CarlosArriagaCM"));
                    startActivity(intent);
                }
            });
            // set profile Jośe renteria
            ImageView rente = (ImageView)findViewById(R.id.rente);
            rente.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.facebook.com/jose.renteria.77377692"));
                    startActivity(intent);
                }
            });
            // set profile José Loredo
            ImageView crow = (ImageView)findViewById(R.id.crow);
            crow.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100009745005523"));
                    startActivity(intent);
                }
            });

        }

} // end class

