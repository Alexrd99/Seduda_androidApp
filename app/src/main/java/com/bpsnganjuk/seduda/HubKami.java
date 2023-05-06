package com.bpsnganjuk.seduda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HubKami extends AppCompatActivity {

    ImageView fb,ig,yt,web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub_kami);

        fb = findViewById(R.id.fblink);
        ig = findViewById(R.id.iglink);
        yt = findViewById(R.id.ytlink);
        web = findViewById(R.id.weblink);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://id-id.facebook.com/bps.nganjuk");
            }
        });
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/bps_nganjuk");
            }
        });
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/channel/UCzxXyGOzIuBjxsvUQZ_zX9Q");
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://nganjukkab.bps.go.id");
    }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}