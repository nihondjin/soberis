package com.example.soberis_suka.ui.home;

import java.io.Serializable;

public class TaskModel implements Serializable {
private    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskModel(String title) {
        this.title = title;
    }
}
