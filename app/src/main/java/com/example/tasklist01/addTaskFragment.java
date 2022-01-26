package com.example.tasklist01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class addTaskFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =  inflater.inflate(R.layout.fragment_addtask, container , false);
         Button buttonClick = (Button) view.findViewById(R.id.button);
         EditText inputTask = (EditText) view.findViewById(R.id.formAddTask_input);
         TextView textHello = (TextView) view.findViewById(R.id.textView);

         buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // récupération du nom de la tâche
                String value = inputTask.getText().toString();
                textHello.setText(value);
            }
         });
        return view;
    }
}
