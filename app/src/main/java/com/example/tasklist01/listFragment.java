package com.example.tasklist01;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class listFragment extends Fragment {

    public List<String> tasksList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_list, container , false);

        //String [] tasks = {"Faire la mise en ligne de la prod", "Finir la mise en page de la page", "Faire une copie du devis", "Commencer le rapport"};
        //ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_checked , tasks);
        /*task task01 = new task();
        task01.setTask("Repeindre la porte");
        List<task> tasksList2 = new ArrayList<task>();
        tasksList2.add(task01);*/

        // Liste des tâches - ArrayList
        tasksList = new ArrayList<String>();
        tasksList.add("Faire la mise en ligne de la prod");
        tasksList.add("Finir la mise en page de la page");
        tasksList.add("Faire une copie du devis");
        tasksList.add("Commencer le rapport");

        // Adapter mon Arraylist pour l'afficher dans une list view
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_checked, tasksList);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listView.setAdapter(arrayAdapter);
        return view;
    }
}
