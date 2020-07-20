package rp.edu.sg.c346.id19020438.displayemployeeinformation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomListView extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<EmpInfo> empInfoList;

    public CustomListView(Context context, int resource, ArrayList<EmpInfo> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        empInfoList = objects;
    }

    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View empRowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = empRowView.findViewById(R.id.textViewName);
        TextView tvTitle = empRowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = empRowView.findViewById(R.id.textViewSalary);

        EmpInfo currentInfo = empInfoList.get(position);

        tvName.setText(currentInfo.getName());
        tvTitle.setText(currentInfo.getTitle());
        tvSalary.setText(String.valueOf(currentInfo.getSalary()));

        return empRowView;
    }

}
