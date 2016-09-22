package omz.com.netrunnertutor.POJO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Omar on 22/9/2016.
 */

public class Type {
    String code;
    String name;
    @SerializedName("is_subtype")
    boolean subtype;
    @SerializedName("side_code")
    String side;
}
