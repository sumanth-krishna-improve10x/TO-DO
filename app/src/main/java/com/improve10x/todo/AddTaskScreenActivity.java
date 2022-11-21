package com.improve10x.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddTaskScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task_screen);
        getSupportActionBar().setTitle("AddTask");
        handleAddBtn();

    }

    public void handleAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText taskTxt = findViewById(R.id.task_txt);
            String task = taskTxt.getText().toString();
            EditText descriptionTxt = findViewById(R.id.description_txt);
            String description = descriptionTxt.getText().toString();
            Toast.makeText(this, task + description, Toast.LENGTH_SHORT).show();
        });
    }
}