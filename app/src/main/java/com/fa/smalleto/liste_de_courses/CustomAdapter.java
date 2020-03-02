package com.fa.smalleto.liste_de_courses;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<UserModel> userModelArrayList;

    public CustomAdapter(Context context, ArrayList<UserModel> userModelArrayList) {

        this.context = context;
        this.userModelArrayList = userModelArrayList;
    }


    @Override
    public int getCount() {
        return userModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return userModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lv_item, null, true);


            holder.tvname = (TextView) convertView.findViewById(R.id.name);
            holder.tvcountry = (TextView) convertView.findViewById(R.id.hobby);
            //holder.tvcountry2 = (TextView) convertView.findViewById(R.id.tvChild);


            convertView.setTag(holder);
        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder)convertView.getTag();
        }

        holder.tvname.setText("ARTICLES DEFINIS :\n "+userModelArrayList.get(position).getName()+"\n");
        holder.tvcountry.setText("ARTICLES AJOUTES :\n "+""+userModelArrayList.get(position).getHobby());
        //holder.tvcountry2.setText("Hobby: "+userModelArrayList.get(position).getTvChild());

        return convertView;
    }

    private class ViewHolder {

        protected TextView tvname, tvcountry;
    }

}
