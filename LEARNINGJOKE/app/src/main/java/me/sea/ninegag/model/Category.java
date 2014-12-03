package me.sea.ninegag.model;

/**
 * Created by sea on 14-3-25.
 */
public enum Category {
    hot("Hot"), trending("Trending"), fresh("Fresh"),earnmoney("Earnmoney");
    private String mDisplayName;

    Category(String displayName) {
        mDisplayName = displayName;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
