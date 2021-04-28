package com.examples.mydialoghelper;


import android.content.Context;
import android.content.DialogInterface;

import android.view.View;

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
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context,
                                pButnClickMsg,
                                Toast.LENGTH_SHORT).show();
                    }
                });
        builder.setNegativeButton(nBtnTitle, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
            }
        });
        builder.setCancelable(false);
        builder.create().show();
    }



}
