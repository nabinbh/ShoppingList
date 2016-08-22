package com.github.depplock.shoppinglist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hathi on 13/3/16.
 */
public class ActiveItemViewHolder extends RecyclerView.ViewHolder {

    CheckBox itemStatus;
    TextView itemName;
    TextView itemQuantity;
    ImageView itemAction;
    ImageView itemRemove;

    public ActiveItemViewHolder(View itemView, CheckBox itemStatus, TextView itemName, TextView itemQuantity, ImageView itemAction, ImageView itemRemove) {
        super(itemView);
        this.itemStatus = itemStatus;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemAction = itemAction;
        this.itemRemove = itemRemove;
    }
}
