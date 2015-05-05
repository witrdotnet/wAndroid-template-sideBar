package net.witr.wandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by witrdotnet <witr.net@gmail.com> on 03/05/15.
 */
public class NavigationDrawerListAdapter extends ArrayAdapter<Store> {

    public NavigationDrawerListAdapter(Context context, List<Store> stores) {
        super(context, 0, stores == null ? new ArrayList<Store>() : stores);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Store store = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_activated_1, parent, false);
        }

        populateView(convertView, store);

        return convertView;
    }

    private void populateView(View v, Store store){
        TextView store_name = (TextView) v.findViewById(android.R.id.text1);
        if (store_name != null) {
            store_name.setText(store.getName());
        }
    }
}
