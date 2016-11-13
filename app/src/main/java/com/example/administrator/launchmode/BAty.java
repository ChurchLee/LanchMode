package com.example.administrator.launchmode;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BAty extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baty);

        printInfo();
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.btnToA:
                startActivity(intent.setClass(BAty.this,MainActivity.class));
                break;
            case R.id.btnToB:
                startActivity(intent.setClass(BAty.this,BAty.class));
                break;
            case R.id.btnToC:
                startActivity(intent.setClass(BAty.this,CAty.class));
                break;
            default:
                break;
        }
    }


    public void printInfo(){
        Log.i("Tag",this.getClass().toString());
        Log.i("TAG",String.format("TaskID: %s MainActivity InstanceID:%s\n",getTaskId(),this.toString()));
        Log.i("TAG","---------------------------------------");
    }
}
