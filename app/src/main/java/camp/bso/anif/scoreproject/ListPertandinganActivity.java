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

    String timkita[] ={"persib", "persib", "persib"};
    String timlawan[] = {"PSM", "Persija", "persipura"};


    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private TeamListOpenHelper mDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pertandingan);

        mDB = new TeamListOpenHelper(this);


        for(int i = 0; i<3;i++) {
            mWordList1.addLast(timkita[i]); //addLast untuk nambah di belakangnya. karenakaya kereta api datanya ada di array tim kita
            mWordList2.addLast(timlawan[i]);
          Log.d("WordList", mWordList1.getLast());
          Log.d("WordList", mWordList2.getLast());
        }

        //	Get	a	handle	to	the	RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //	Create	an	adapter	and	supply	the	data	to	be	displayed.
        mAdapter = new WordListAdapter(this, mDB);

        //	Connect	the	adapter	with	the	RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        //	Give	the	RecyclerView	a	default	layout	manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
