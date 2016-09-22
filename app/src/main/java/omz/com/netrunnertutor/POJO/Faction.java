package omz.com.netrunnertutor.POJO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Omar on 22/9/2016.
 */

public class Faction {
    String code;
    String color;
    @SerializedName("is_mini")
    boolean mini;
    String name;
    @SerializedName("side_code")
    String side;
}
