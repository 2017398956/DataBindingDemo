package com.connorlin.databinding.handler;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.connorlin.databinding.task.Task;

/**
 * ClassName: ViewHandler
 * Description:
 * Author: connorlin
 * Date: Created on 2016-7-1.
 */
public class EventHandler {

    private Context mContext;

    public EventHandler(Context context) {
        mContext = context;
    }

    public void onClickFriend(View view) {
        Toast.makeText(mContext, "id:" + view.getId() + ",class:" + view.getClass(), Toast.LENGTH_LONG).show();
    }

    public void onTaskClick(Task task) {
        task.run();
    }

    public void onTaskClickWithParams(View view, Task task) {
        Toast.makeText(mContext, "id:" + view.getId() + ",class:" + view.getClass(), Toast.LENGTH_LONG).show();
        task.run();
    }

    public void onCompletedChanged(Task task, boolean completed) {
        if(completed) {
            Toast.makeText(mContext, "true", Toast.LENGTH_LONG).show();
            task.run();
        }
    }
}
