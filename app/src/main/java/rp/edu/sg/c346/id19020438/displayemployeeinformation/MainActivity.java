package rp.edu.sg.c346.id19020438.displayemployeeinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmp;
    ArrayList<EmpInfo> EmpList;
    CustomListView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmp = findViewById(R.id.listViewEmployeeInfo);

        EmpList = new ArrayList<>();
        EmpList.add(new EmpInfo("John", "Software Technical Leader", 3400.0));
        EmpList.add(new EmpInfo("May", "Programmer", 2200.0));

        adapter = new CustomListView(this, R.layout.emprow, EmpList);
        lvEmp.setAdapter(adapter);

    }
}
