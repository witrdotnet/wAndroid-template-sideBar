package net.witr.wandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by witrdotnet <witr.net@gmail.com> on 02/05/15.
 */
public class ModelListAdapter extends ArrayAdapter<ModelElement> {

    public ModelListAdapter(Context context, List<ModelElement> modelElements) {
        super(context, 0, modelElements);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ModelElement modelElement = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_main_list, parent, false);
        }

        populateView(convertView, modelElement);

        return convertView;
    }

    private void populateView(View v, ModelElement modelElement){
        TextView element_title = (TextView) v.findViewById(R.id.element_title);
        if (element_title != null) {
            element_title.setText(modelElement.getTitle());
        }

        TextView element_date = (TextView) v.findViewById(R.id.element_date);
        if (element_date != null) {
            element_date.setText(modelElement.getDate());
        }

        TextView element_content = (TextView) v.findViewById(R.id.element_content);
        if (element_content != null) {
            element_content.setText(modelElement.getContent());
        }
    }
}
