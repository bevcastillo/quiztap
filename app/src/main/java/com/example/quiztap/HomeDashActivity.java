package com.example.quiztap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.quiztap.adapters.SubjTeachersAdapter;
import com.example.quiztap.models.SubjTeachersObj;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;
import java.util.List;

public class HomeDashActivity extends AppCompatActivity {

    private CircularImageView civUserImage;
    private TextView tvUserName, tvUserId;
    private RecyclerView rvAllSubjTeachers;

    private List<SubjTeachersObj> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dash);

        setTitle("Dashboard");

        //instantiating the variables
        civUserImage = (CircularImageView) findViewById(R.id.circularImageView);
        tvUserName = (TextView) findViewById(R.id.tv_user_name);
        tvUserId = (TextView) findViewById(R.id.tv_user_id);
        rvAllSubjTeachers = (RecyclerView) findViewById(R.id.rv_subj_teacher);

    }

    @Override
    protected void onStart() {

        list = new ArrayList<>();

        list.add(
                new SubjTeachersObj(
                        "Dennis Durano", "ANDROID1, ANDROID 2"
                )
        );
        list.add(
                new SubjTeachersObj(
                        "Bell Campanilla", "C Prog, Big Data"
                )
        );
        list.add(
                new SubjTeachersObj(
                        "Ms. Villaceran", "Java"
                )
        );

        SubjTeachersAdapter adapter = new SubjTeachersAdapter(getApplicationContext(), list);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
//        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        rvAllSubjTeachers.setLayoutManager(gridLayoutManager);
//        rvAllSubjTeachers.setItemAnimator(new DefaultItemAnimator());
        rvAllSubjTeachers.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        ItemOffsetDecoration itemOffsetDecoration = new ItemOffsetDecoration(getApplicationContext(), R.dimen.item_offset);
        rvAllSubjTeachers.addItemDecoration(itemOffsetDecoration);

        rvAllSubjTeachers.setAdapter(adapter);

        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_notification, menu);

        return true;
    }
}
