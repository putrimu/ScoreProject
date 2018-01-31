package camp.bso.anif.scoreproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsduaActivity extends AppCompatActivity {

    Button btnBeritaPersija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsdua);

        btnBeritaPersija = (Button) findViewById(R.id.btn_beritapersija);

        btnBeritaPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "https://persija.id/persija-lolos-ke-babak-delapan-besar-piala-presiden/";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }

        });
    }
}
