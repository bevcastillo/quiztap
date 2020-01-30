package com.example.quiztap.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quiztap.R;
import com.example.quiztap.models.SubjTeachersObj;

import java.util.List;

public class SubjTeachersAdapter extends RecyclerView.Adapter<SubjTeachersAdapter.ViewHolder> {

    Context context;
    List<SubjTeachersObj> list;

    public SubjTeachersAdapter(Context context, List<SubjTeachersObj> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_teacher_cardview, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SubjTeachersObj data = list.get(position);

        holder.tvTeacherName.setText(data.getTeacherName());
        holder.tvSubj.setText("Subjects: "+data.getSubjects());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTeacherName, tvSubj;
        CardView cvSubjTeachers;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTeacherName = (TextView) itemView.findViewById(R.id.textView);
            tvSubj = (TextView) itemView.findViewById(R.id.tv_subjects);
            cvSubjTeachers = (CardView) itemView.findViewById(R.id.card_subj_teachers);
        }
    }
}
