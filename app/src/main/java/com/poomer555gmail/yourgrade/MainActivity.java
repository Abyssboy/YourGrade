package com.poomer555gmail.yourgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {
    private EditText InputName ;
    private EditText InputGrade;
    private Button cal ;
    private Button Exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputName=(EditText) findViewById(R.id.Name_edittext);
        InputGrade =(EditText) findViewById(R.id.Grade_edittext);
        cal =(Button) findViewById(R.id.Enter);
        Exit =(Button) findViewById(R.id.Exit);




        cal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(InputName.getText().length()==0){
                    InputName.setError("Enter Name!!!");
                    InputName.requestFocus();
                }
                if(InputGrade.getText().length()==0){
                    InputGrade.setError("Enter Grade!!!");
                    InputGrade.requestFocus();
                }



                Integer grade = Integer.valueOf(InputGrade.getText().toString());
                String name = String.valueOf(InputName.getText().toString());
                String GradeText = getGradeText(grade);



                Intent intent = new Intent(MainActivity.this,Ans.class);
                intent.putExtra("Name",name);
                intent.putExtra("GradeText",GradeText);
                startActivity(intent);
            }
        });



    }

    private String getGradeText(Integer n) {
        String Text ="";
        if (n<=49){
            Text = "F";
        }
        else if(n<60){
            Text ="D";
        }
        else if(n<70){
            Text = "C";
        }
        else if (n<80){
            Text = "B";
        }
        else {
            Text = "A";
        }
        return Text;

    }

}
