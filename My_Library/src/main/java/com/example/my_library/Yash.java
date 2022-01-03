package com.example.my_library;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.res.ResourcesCompat;


public class Yash {



    public static void dialog(Context context ,String title , String msg , int colorResource , int relmainBackground, int image , int fontstyle){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.alert_dialog_layout, null);
        alertDialog.setView(view);
        TextView textView = view.findViewById(R.id.text1);
        TextView textView1= view.findViewById(R.id.textmsg);
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageResource(image);
        textView.setTextColor(relmainBackground);
        RelativeLayout relmain = view.findViewById(R.id.relmain);
        relmain.setBackgroundResource(relmainBackground);
        RelativeLayout  main= view.findViewById(R.id.main);
        main.setBackgroundResource(colorResource);
        Typeface typeface = ResourcesCompat.getFont(context, fontstyle);
        textView.setTypeface(typeface);
        textView.setText(title);
        textView1.setText(msg);
        textView1.setTextColor(relmainBackground);
        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {


                    Toast.makeText(context, " Yes ", Toast.LENGTH_SHORT).show();

            }
        });


        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alert = alertDialog.create();
        alert.show();
        alert.getWindow().setBackgroundDrawableResource(colorResource);

    }
}
