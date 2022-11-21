package com.improve10x.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class TaskListScreenActivity extends AppCompatActivity {
    public ArrayList<TaskList> task;
    public RecyclerView taskListRcv;
    public TaskListAdapter taskListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list_screen);
        getSupportActionBar().setTitle("Task List");
        handleAddButton();
        setTask();
        setUpRecyclerView();
    }

    public void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AddTaskScreenActivity.class);
            startActivity(intent);
        });
    }

    public void setUpRecyclerView(){
        taskListRcv = findViewById(R.id.task_list_rcv);
        taskListAdapter = new TaskListAdapter();
        taskListRcv.setLayoutManager(new LinearLayoutManager(this));
        taskListAdapter.setTask(task);
        taskListRcv.setAdapter(taskListAdapter);
    }

    public void setTask(){
        task = new ArrayList<>();
        TaskList getVegetbles = new TaskList();
        getVegetbles.title = "Get Vegetables";
        getVegetbles.message = "for 1 week";
        task.add(getVegetbles);

        TaskList readingNews = new TaskList();
        readingNews.title = "Reading News";
        readingNews.message = "Explore politics filmy, and sports new";
        task.add(readingNews);

        TaskList prepareLunch = new TaskList();
        prepareLunch.title = "Prepare Lunch";
        prepareLunch.message = "Briyani and Raitha.yummyyyyyyy";
        task.add(prepareLunch);

        TaskList breakFast = new TaskList();
        breakFast.title = "Have Breakfast";
        breakFast.message = "Healthy breakfast for a better morning";
        task.add(breakFast);
    }

}