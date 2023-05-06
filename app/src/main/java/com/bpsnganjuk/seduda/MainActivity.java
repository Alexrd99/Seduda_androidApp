package com.bpsnganjuk.seduda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView card1,card2,card3,card4,card5,card6;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.card_instra);
        card2 = (CardView) findViewById(R.id.card_brs);
        card3 = (CardView) findViewById(R.id.card_arc);
        card4 = (CardView) findViewById(R.id.card_berita);
        card5 = (CardView) findViewById(R.id.card_pub);
        card6 = (CardView) findViewById(R.id.card_hub);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);


        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.beranda);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.beranda:
                        return true;

                    case R.id.tabel:
                        startActivity(new Intent(getApplicationContext(),Tabel.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.info:
                        startActivity(new Intent(getApplicationContext(),Info.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.card_instra:
                i = new Intent(this,InStra.class);
                startActivity(i);
                break;
            case R.id.card_brs:
                i = new Intent(this,Brs.class);
                startActivity(i);
                break;
            case R.id.card_arc:
                i = new Intent(this,Arc.class);
                startActivity(i);
                break;
            case R.id.card_berita:
                i = new Intent(this,Berita.class);
                startActivity(i);
                break;
            case R.id.card_pub:
                i = new Intent(this,Publikasi.class);
                startActivity(i);
                break;
            case R.id.card_hub:
                i = new Intent(this,HubKami.class);
                startActivity(i);
                break;

        }
    }
}