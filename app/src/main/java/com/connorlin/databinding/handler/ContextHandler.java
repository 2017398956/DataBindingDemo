package com.connorlin.databinding.handler;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.connorlin.databinding.R;
import com.connorlin.databinding.model.User;

/**
 * ClassName: ContextHandler
 * Description:
 * Author: connorlin
 * Date: Created on 2016-6-30.
 */
public class ContextHandler {

    public String loadString(Context context) {
        return context.getResources().getString(R.string.string_from_context);
    }

    public void onClick(Context context , User user , View view){
        Toast.makeText(context , user.getTestEt() + " |" , Toast.LENGTH_SHORT).show();
    }
}
