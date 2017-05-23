package com.android.hkh.ad08_customcontact;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hieu.truongvan on 5/20/2017.
 */

public class MyArrayAdapter extends ArrayAdapter<Person> {
    public MyArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Person person = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.layout_contact, parent, false);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.tv_phone);
        tvName.setText(person.getName());
        tvPhone.setText(person.getPhone());
        return convertView;
    }
}
