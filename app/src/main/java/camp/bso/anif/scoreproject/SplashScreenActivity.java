package camp.bso.anif.scoreproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //menghilangkan action bar supaya jadi full screen
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //mengarahkan ke main activity
                Intent i = new Intent(SplashScreenActivity.this,NavBarPertandingan.class);
                startActivity(i);
                // close this activity ( tutup splash screen)
                finish();
            }
        },SPLASH_TIME_OUT);


    }
}
