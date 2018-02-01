package camp.bso.anif.scoreproject;

import android.os.WorkSource;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ListAdapter;

import java.util.LinkedList;

public class ListPertandinganActivity extends AppCompatActivity {

    private final LinkedList<String> mWordList1 = new LinkedList<>();
    private final LinkedList<String> mWordList2 = new LinkedList<>();
    private int mCount = 0;
    String timkita[] ={"persib", "persib", "persib"};
    String timlawan[] = {"PSM", "Persija", "persipura"};


    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pertandingan);

        for(int i = 0; i<3;i++) {
            mWordList1.addLast(timkita[i]); //addLast untuk nambah di belakangnya. karenakaya kereta api datanya ada di array tim kita
            mWordList2.addLast(timlawan[i]);
          Log.d("WordList", mWordList1.getLast());
          Log.d("WordList", mWordList2.getLast());
        }

        // get a handle to recycle view
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        // creat an adapter and supply the data to be display.
        mAdapter = new WordListAdapter(this, mWordList1, mWordList2);

        // connect the adapter with rycle view
        mRecyclerView.setAdapter(mAdapter);

        // Give the Recycle View a default layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
