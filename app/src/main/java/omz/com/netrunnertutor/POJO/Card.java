package omz.com.netrunnertutor.POJO;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by Omar on 22/9/2016.
 */

public class Card extends RealmObject {
    String code;
    @SerializedName("faction_code")
    String faction;
    @SerializedName("pack_code")
    String pack;
    @SerializedName("side_code")
    String side;
    String title;
    @SerializedName("type_code")
    String type;
}
