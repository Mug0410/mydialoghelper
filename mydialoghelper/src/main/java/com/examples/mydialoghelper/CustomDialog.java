package com.examples.mydialoghelper;


import android.content.Context;
import android.content.DialogInterface;

import android.graphics.Color;
import android.view.View;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;



public class CustomDialog {

    public static void simpleAlert(Context context,String title,String mesage,String pBtnTitle,String nBtnTitle,String pButnClickMsg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(mesage);
        builder.setPositiveButton(pBtnTitle,
                (dialog, which) -> Toast.makeText(context,
                        pButnClickMsg,
                        Toast.LENGTH_SHORT).show());
        builder.setNegativeButton(nBtnTitle, (dialog, which) -> dialog.dismiss());
        builder.setCancelable(false);
        builder.create().show();
    }



    public void withItems(Context context, String[] items,String title,String pBtnTitle,String negBtnTitle,String neuBtnTitle,String dialogMes) {


        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title)

                .setItems(items, (dialog, which) -> Toast.makeText(context, dialogMes, Toast.LENGTH_SHORT).show());

        builder.setPositiveButton(pBtnTitle, null);
        builder.setNegativeButton(negBtnTitle, null);
        builder.setNeutralButton(neuBtnTitle, null);


        AlertDialog alertDialog = builder.create();

        alertDialog.show();

        Button button = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        button.setBackgroundColor(Color.BLACK);
        button.setPadding(0, 0, 20, 0);
        button.setTextColor(Color.WHITE);
    }




}
