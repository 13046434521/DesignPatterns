package com.jtl.designpatterns;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.jtl.designpatterns.builder.Person;

public class MainActivity extends AppCompatActivity {
    private Person mPerson;
    private Person.Builder mBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBuilder=new Person.Builder();
        mPerson=mBuilder.setAge(26).setName("jtl").create();

        changePerson(mBuilder);

        ((TextView)findViewById(R.id.tv_main_show)).setText(mPerson.getName()+"---"+mPerson.getAge());
        Toast.makeText(this,mPerson.getName()+"---"+mPerson.getAge(),Toast.LENGTH_SHORT);
    }

    private void changePerson( Person.Builder builder){
        builder.setName("jtl");
        builder.setAge(26);
    }

    private void AlertDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        AlertDialog alertDialog= builder
                .setTitle("标题")
                .setMessage("内容")
                .setCancelable(false)
                .create();
        alertDialog.show();
    }
}
