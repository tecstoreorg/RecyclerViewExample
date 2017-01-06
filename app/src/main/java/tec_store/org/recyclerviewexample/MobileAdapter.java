package tec_store.org.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by devlomi on 12/22/16.
 */
public class MobileAdapter extends RecyclerView.Adapter<MobileAdapter.MobileHolder> {
    private List<Mobile> mobileList;
    private Context context;

    public MobileAdapter(List<Mobile> mobileList, Context context) {
        this.mobileList = mobileList;
        this.context = context;
    }

    @Override
    public MobileHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_row, parent, false);
        MobileHolder holder = new MobileHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(MobileHolder holder, int position) {
        final Mobile mobile = mobileList.get(position);
        holder.mobileName.setText(mobile.getMobileName());
        holder.mobileManufacture.setText(mobile.getMobileManufacture());
        holder.mobileImg.setImageResource(mobile.getMobileImage());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("name",mobile.getMobileName());
                intent.putExtra("manufacture",mobile.getMobileManufacture());
                intent.putExtra("img",mobile.getMobileImage());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mobileList.size();
    }

    public class MobileHolder extends RecyclerView.ViewHolder {
        TextView mobileName, mobileManufacture;
        ImageView mobileImg;
        LinearLayout linearLayout;

        public MobileHolder(View itemView) {
            super(itemView);
            mobileName = (TextView) itemView.findViewById(R.id.mobile_name);
            mobileManufacture = (TextView) itemView.findViewById(R.id.manufacture);
            mobileImg = (ImageView) itemView.findViewById(R.id.mobile_img);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_lo);
        }
    }
}
