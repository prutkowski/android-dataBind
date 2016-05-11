package com.pawel_rutkowski.databind.model;

import android.databinding.BaseObservable;

/**
 * Created by Pawel Rutkowski on 11.05.2016.
 */
public class User extends BaseObservable {

    private String foo;
    private String bar;
    private Boolean deleted;

    public User(String foo, String bar, Boolean deleted) {
        this.foo = foo;
        this.bar = bar;
        this.deleted = deleted;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }

    public Boolean getDeleted() {
        return deleted;
    }
}
