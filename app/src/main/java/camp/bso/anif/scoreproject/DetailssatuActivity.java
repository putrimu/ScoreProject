package camp.bso.anif.scoreproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailssatuActivity extends AppCompatActivity {

    Button btnBeritaPersib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailssatu);

        btnBeritaPersib = (Button) findViewById(R.id.btn_beritapersib);

        btnBeritaPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "http://www.persib.co.id/berita-persib-bandung/berita/ini_susunan_pemain_persib_di_laga_pembuka_piala_pr.aspx";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }

        });



    }
}
