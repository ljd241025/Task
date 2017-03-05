package com.example.admin.mytask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by admin on 2017/3/5.
 */
public class TaskOne extends Activity{

    public static int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_one);
    }

    public void task1_button(View view){
        n= Integer.parseInt(((EditText) findViewById(R.id.num)).getText().toString().trim());
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
    }
}
