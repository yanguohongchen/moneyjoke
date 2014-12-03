package me.sea.ninegag.model;

import com.google.gson.Gson;

/**
 * Created by sea on 14-3-25.
 */
public abstract class BaseModel {
    public String toJson() {
        return new Gson().toJson(this);
    }
}
