package com.example.alarmapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {
    ArrayList<Note> items = new ArrayList<Note>();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.note_item, viewGroup,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Note item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Note item) {
        items.add(item);
    }

    public void setItems(ArrayList<Note> items) {
        this.items = items;
    }

    public Note getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, Note item){
        items.set(position, item)
;    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView contentsTextView;
        TextView dateTextView;
        TextView textView;
        EditText editTextTime;

        public ViewHolder(View itemView) {
            super(itemView);

            contentsTextView = itemView.findViewById(R.id.contentsTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            textView = itemView.findViewById(R.id.textView);
            editTextTime = itemView.findViewById(R.id.editTextTime);
        }

        public void setItem(Note item) {
            contentsTextView.setText(item.getName());
            dateTextView.setText(item.getDate());
            textView.setText(item.getMemo());
            editTextTime.setText(item.getTime());
        }


    }

}


