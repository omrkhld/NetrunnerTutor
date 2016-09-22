package omz.com.netrunnertutor.POJO;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by Omar on 22/9/2016.
 */

public class Pack extends RealmObject {
    String code;
    @SerializedName("cycle_code")
    String cycle;
    String name;
    int size;
}
