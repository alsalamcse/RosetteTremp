package draz.rosette.rosettetremp.data;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class RouteAdapter extends ArrayAdapter <MyRoute> {
    public RouteAdapter(Context context, int resource) {
        super(context, resource);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null)
//            convertView =

        return super.getView(position, convertView, parent);

    }

}
