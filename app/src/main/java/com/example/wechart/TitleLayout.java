package com.example.wechart;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;



/**
 * Created by Administrator on 2017/11/29.
 */

public class TitleLayout extends LinearLayout {
     Button btn_search;
    public TitleLayout(final Context context , AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title_bar,this);
       btn_search = (Button)findViewById(R.id.title_btn_search);

        btn_search.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(),"搜索用户",Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(getContext(),searchActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }
}
