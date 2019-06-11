package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.baway.a.tlm20190611.R;
import com.bumptech.glide.Glide;

import java.util.List;

import bean.Bean;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<Bean.Result.commodityList> list;

    public MyAdapter(Context context, List<Bean.Result.commodityList> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = View.inflate(context,R.layout.item_layout,null);
            holder = new ViewHolder();
            holder.text_01 = convertView.findViewById(R.id.text_01);
            holder.image_01 = convertView.findViewById(R.id.image_01);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
            holder.text_01.setText(list.get(position).commodityName);
            Glide.with(context).load(list.get(position).masterPic).into(holder.image_01);
        return convertView;
    }

    class ViewHolder{
        ImageView image_01;
        TextView text_01;
    }

}
