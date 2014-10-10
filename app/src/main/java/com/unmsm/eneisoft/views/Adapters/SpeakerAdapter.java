package com.unmsm.eneisoft.views.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.github.siyamed.shapeimageview.HexagonImageView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.unmsm.eneisoft.R;
import com.unmsm.eneisoft.models.Speaker;

import java.util.ArrayList;

/**
 * Created by manu on 10/10/14.
 */

public class SpeakerAdapter extends ArrayAdapter<Speaker>{
    private Context context;
    private ArrayList<Speaker> items;
    public SpeakerAdapter(Context context,
                         ArrayList<Speaker> items) {
        super(context, R.layout.speaker_item_layout, items);
        this.context = context;
        this.items = items;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        if(rowView == null){
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.speaker_item_layout, parent, false);
            ViewHolder holder = new ViewHolder();
            holder.name = (TextView) rowView.findViewById(R.id.tv_name);
            holder.description = (TextView) rowView.findViewById(R.id.tv_description);
            holder.photo = (HexagonImageView) rowView.findViewById(R.id.iv_photo);
            rowView.setTag(holder);
        }
        Speaker speaker = items.get(position);
        if(speaker!=null) {
            ViewHolder holder = (ViewHolder) rowView.getTag();
            holder.name.setText(speaker.getName());
            holder.description.setText(speaker.getDescription());
            holder.photo.setImageDrawable(getContext().getResources().getDrawable(speaker.getResource()));
        }
        return rowView;

    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Speaker getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        public TextView name;
        public TextView description;
        public HexagonImageView photo;

    }
}
