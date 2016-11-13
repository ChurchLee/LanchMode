package com.example.administrator.launchmode;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btn = (Button) findViewById(R.id.btnStartSelf);
//        TextView textView = (TextView) findViewById(R.id.info);
        /*Log.i("Tag",this.getClass().toString()+"\n");
        Log.i("TAG",String.format("TaskID: %s\n MainActivity InstanceID:%s\n",getTaskId(),this.toString()));*/
        printInfo();



    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.btnToA:
                startActivity(intent.setClass(MainActivity.this,MainActivity.class));
                break;
            case R.id.btnToB:
                startActivity(intent.setClass(MainActivity.this,BAty.class));
                break;
            case R.id.btnToC:
                startActivity(intent.setClass(MainActivity.this,CAty.class));
                break;
            default:
                break;
        }
    }

    public void printInfo(){
        Log.i("Tag",this.getClass().toString());
        Log.i("TAG",String.format("TaskID: %s\n MainActivity InstanceID:%s\n",getTaskId(),this.toString()));
        Log.i("TAG","---------------------------------------");
    }
}
