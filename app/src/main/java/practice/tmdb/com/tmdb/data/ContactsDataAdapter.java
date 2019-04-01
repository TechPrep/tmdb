package practice.tmdb.com.tmdb.data;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import practice.tmdb.com.tmdb.R;

public class ContactsDataAdapter extends RecyclerView.Adapter<ContactsDataAdapter.ViewHolder> {
    List<ContactData> mAdapter;

    public ContactsDataAdapter(List<ContactData> input) {
        mAdapter = input;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        return new ViewHolder(inflater.inflate(R.layout.row_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data model based on position
        ContactData contact = mAdapter.get(position);
        // Update movie image
        holder.mMovieImage.setImageResource(R.mipmap.ic_launcher);

        // Update name
        TextView textView = holder.mMovieName;
        textView.setText(contact.getName());

        // Update button
        Button button = holder.mBuyButton;
        button.setText(contact.isOnline() ? "Buy" : "SoldOut");
        button.setEnabled(contact.isOnline());
    }

    @Override
    public int getItemCount() {
        return mAdapter.size();
    }

    /**
     * ViewHolder for Recycle view
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mMovieImage;
        public TextView mMovieName;
        public Button mBuyButton;

        public ViewHolder(View itemView) {
            super(itemView);

            mMovieImage = (ImageView) itemView.findViewById(R.id.movie_image);
            mMovieName = (TextView) itemView.findViewById(R.id.movie_name);
            mBuyButton = (Button) itemView.findViewById(R.id.buy_button);
        }
    }
}
