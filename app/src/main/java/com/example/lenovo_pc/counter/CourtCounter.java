package com.example.lenovo_pc.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CourtCounter extends AppCompatActivity {
    String TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);

    }
    public void reset(View button){
        TextView score1=(TextView) findViewById(R.id.text_score1);
        TextView score2=(TextView) findViewById(R.id.text_score2);
        score1.setText("0");
        score2.setText("0");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String scorea = ((TextView)findViewById(R.id.text_score1)).getText().toString();
        String scoreb = ((TextView)findViewById(R.id.text_score2)).getText().toString();
        Log.i(TAG, "onSaveInstanceState: ");
        outState.putString("teama_score",scorea);
        outState.putString("teamb_score",scoreb);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("teama_score");
        String scoreb = savedInstanceState.getString("teamb_score");

        Log.i(TAG, "onRestoreInstanceState: ");
        ((TextView)findViewById(R.id.text_score1)).setText(scorea);
        ((TextView)findViewById(R.id.text_score2)).setText(scoreb);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    public void add_1_3(View button){
        TextView score1=(TextView) findViewById(R.id.text_score1);
        String str=score1.getText().toString();
        int count=Integer.parseInt(str)+3;
        score1.setText(count+"");
    }
    public void add_1_2(View button){
        TextView score1=(TextView) findViewById(R.id.text_score1);
        String str=score1.getText().toString();
        int count=Integer.parseInt(str)+2;
        score1.setText(count+"");
    }
    public void add_1_1(View button){
        TextView score1=(TextView) findViewById(R.id.text_score1);
        String str=score1.getText().toString();
        int count=Integer.parseInt(str)+1;
        score1.setText(count+"");
    }
    public void add_2_3(View button){
        TextView score2=(TextView) findViewById(R.id.text_score2);
        String str=score2.getText().toString();
        int count=Integer.parseInt(str)+3;
        score2.setText(count+"");
    }
    public void add_2_2(View button){
        TextView score2=(TextView) findViewById(R.id.text_score2);
        String str=score2.getText().toString();
        int count=Integer.parseInt(str)+2;
        score2.setText(count+"");
    }
    public void add_2_1(View button){
        TextView score2=(TextView) findViewById(R.id.text_score2);

        String str=score2.getText().toString();
        int count=Integer.parseInt(str)+1;
        score2.setText(count+"");
    }
}
