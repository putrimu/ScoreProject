package camp.bso.anif.scoreproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDetailssatu;
    Button btnDetailsdua;
    Button btnPersib;  //btn_persib
    Button btnPersija;
    Button btnMinPersib;
    Button btnMinPersija;
    Button btnResetPoin;
    Button btnBerita;
    Button map;
    TextView persib;
    TextView persija;
    int k=0;
    int l=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDetailssatu = (Button) findViewById(R.id.btn_detailssatu);
        btnDetailsdua = (Button) findViewById(R.id.btn_detailsdua);
        btnPersib = (Button) findViewById(R.id.btn_persib);
        btnPersija = (Button) findViewById(R.id.btn_persija);
        btnMinPersib = (Button) findViewById(R.id.btn_minpersib);
        btnMinPersija = (Button) findViewById(R.id.btn_minpersija);
        btnBerita = (Button) findViewById(R.id.btn_berita);
        map = (Button) findViewById(R.id.btn_maps);
        persib = (TextView) findViewById(R.id.poinPersib);
        persija = (TextView) findViewById(R.id.poinPersija);
        btnResetPoin = (Button) findViewById(R.id.btn_reset);


        btnDetailssatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailssatuActivity.class);
                startActivity(i);
            }

        });

        btnDetailsdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this, DetailsduaActivity.class);
                startActivity(j);
            }
        });


        btnPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k++;
                persib.setText(String.valueOf(k));

            }

        });

        btnPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l++;
                persija.setText(String.valueOf(l));
            }

        });


        btnMinPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k--;
                if(k<0){
                    k=0;
                }
                persib.setText(String.valueOf(k));

            }

        });

        btnMinPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l--;
                if(l<0){
                    l=0;
                }
                persija.setText(String.valueOf(l));
            }

        });

        btnResetPoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k=0;
                l=0;
                persib.setText(String.valueOf(k));
                persija.setText(String.valueOf(l));
            }

        });


        btnBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "http://bola.liputan6.com/read/3151301/mantan-wasit-fifa-komentari-laga-persija-vs-persib";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }

        });


        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri=Uri.parse("geo:-6.957446, 107.712105");
                Intent mapIntent=new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        } );





    }
}
