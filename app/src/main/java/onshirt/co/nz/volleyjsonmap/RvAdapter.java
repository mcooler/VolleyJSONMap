package onshirt.co.nz.volleyjsonmap;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<DataModel> dataModelArrayList;

    public RvAdapter(Context ctx, ArrayList<DataModel> dataModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public RvAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.rv_one, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RvAdapter.MyViewHolder holder, int position) {

        Picasso.get().load(dataModelArrayList.get(position).getUrlToImage()).into(holder.iv);
        holder.title.setText(dataModelArrayList.get(position).getTitle());
        holder.author.setText(dataModelArrayList.get(position).getAuthor());
        holder.description.setText(dataModelArrayList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title, author, description;
        ImageView iv;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
            author = (TextView) itemView.findViewById(R.id.author);
            description = (TextView) itemView.findViewById(R.id.description);
            iv = (ImageView) itemView.findViewById(R.id.iv);
        }

    }
}
