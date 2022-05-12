    package com.example.harrybhai;

    import androidx.appcompat.app.AppCompatActivity;

    import android.app.ActionBar;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;
    import android.widget.Toast;



    public class MainActivity extends AppCompatActivity {

        private Button yes;
        private Button no;
        private TextView questions;
        String []Questions={"She is so cute?","She is a simp?","She is chubby?","She loves to write?","She is Guru's biggest fan?","She is khas?"};
        Boolean []Answers ={false,false,true,true,true,true,true};
        int index=0;
        int score=0;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            yes = findViewById(R.id.yes);
            no = findViewById(R.id.no);
            questions = findViewById(R.id.questions);
            questions.setText(Questions[index]);
            getSupportActionBar().hide();


            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (index<=Questions.length-1){
                        if (Answers[index]==true){
                            score++;
                        }
                        index++;
                        if (index<=Questions.length-1){

                            questions.setText(Questions[index]);
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_LONG).show();
                        }}
                        else{
                        Toast.makeText(MainActivity.this, "Restart the app for again", Toast.LENGTH_SHORT).show();
                    }



                }
            });
            no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (index<=Questions.length-1){
                        if (Answers[index]==false){
                            score++;
                        }
                        index++;
                        if (index<=Questions.length-1){

                            questions.setText(Questions[index]);
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Your score is "+ score, Toast.LENGTH_LONG).show();
                        }}
                        else{
                            Toast.makeText(MainActivity.this, "Restart the app for again", Toast.LENGTH_SHORT).show();}
                        }


            });

        }

    }