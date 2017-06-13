package id.sch.smktelkom_mlg.privateassignment.xirpl612.privateassignment;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by Fariz on 13-Jun-17.
 */

public class LikeItem extends SugarRecord implements Serializable {
    public String judul;
    public String deskripsi;
    public String urlgambar;

    public LikeItem(String judul, String deskripsi, String urlgambar) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.urlgambar = urlgambar;
    }
}
