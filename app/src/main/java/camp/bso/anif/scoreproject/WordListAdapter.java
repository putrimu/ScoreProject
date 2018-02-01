package camp.bso.anif.scoreproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;


/**
 * Created by MUL-09 on 1/02/2018.
 */

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LinkedList<String> mWordListHome;
    private final LinkedList<String> mWordListAway;

    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> wordList1, LinkedList<String> wordList2) {
        mInflater = LayoutInflater.from(context);
        this.mWordListHome = wordList1;
        this.mWordListAway = wordList2;
    }

    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.item_team, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mCurrent1 = mWordListHome.get(position);
        String mCurrent2 = mWordListAway.get(position);
        holder.wordItemView1.setText(mCurrent1);
        holder.wordItemView2.setText(mCurrent2);
    }

    @Override
    public int getItemCount() {
        return mWordListHome.size();
    }

        public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            public final TextView wordItemView1;
            public final TextView wordItemView2;

            final WordListAdapter mAdapter;

            public WordViewHolder(View itemView, WordListAdapter adapter) {
                super(itemView);
                wordItemView1 = (TextView) itemView.findViewById(R.id.word1);
                wordItemView2 = (TextView) itemView.findViewById(R.id.word2); //sesuai dengan activity item_team id nya
                this.mAdapter = adapter;
                itemView.setOnClickListener(this);
            }

        @Override
        public void onClick(View view) {
            //	Get	the	position	of	the	item	that	was	clicked.
//            int mPosition = getLayoutPosition();
//
//            //	Use	that	to	access	the	affected	item	in	mWordList.
//            String element = mWordList.get(mPosition);
//
//            //	Change	the	word	in	the	mWordList.
//            mWordList.set(mPosition, "Clicked!	" + element);
//
//            //	Notify	the	adapter,	that	the	data	has	changed	so	it	can
//            //	update	the	RecyclerView	to	display	the	data.
//            mAdapter.notifyDataSetChanged();
        }


    }

}
