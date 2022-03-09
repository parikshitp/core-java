package com.divergentsl.corejava.multithreading.executors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {


    @SerializedName("name")
    @Expose
    private String name;
    
    @SerializedName("count")
    @Expose
    private Integer count;
    
    @SerializedName("child")
    @Expose
    private Child child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

}
