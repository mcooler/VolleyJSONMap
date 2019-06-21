package onshirt.co.nz.volleyjsonmap;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GeoRvAdapter extends RecyclerView.Adapter<GeoRvAdapter.MyViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<GeoDataModel> geoDataModels ;

    public GeoRvAdapter(Context context, ArrayList<GeoDataModel>geoDataModelArrayList ){

        inflater = LayoutInflater.from(context);
        this.geoDataModels = geoDataModelArrayList;
    }

    @Override
    public GeoRvAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {

        View view = inflater.inflate(R.layout.geo_activity, parent, false);
        GeoRvAdapter.MyViewHolder holder = new GeoRvAdapter.MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(GeoRvAdapter.MyViewHolder holder, int position) {

        holder.type.setText(geoDataModels.get(position).getType());
        holder.properties.setText(geoDataModels.get(position).getProperties());
        holder.coordinates.setText("" + geoDataModels.get(position).getCoordinates());
    }

    @Override
    public int getItemCount() {
        if (geoDataModels != null && geoDataModels.size() > 0) {
            return geoDataModels.size();
        }
        return 0;
    }


    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView type;
        TextView properties;
        TextView coordinates;


        public MyViewHolder(View itemView) {
            super(itemView);

            type = (TextView) itemView.findViewById(R.id.type);
            properties = (TextView) itemView.findViewById(R.id.properties);
            coordinates = (TextView) itemView.findViewById(R.id.coordinates); }

    }

}
