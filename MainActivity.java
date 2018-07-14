package ingenium.splashmyscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {


    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1= (Button) findViewById(R.id.button1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent
                );
            }
        });



        btn2= (Button) findViewById(R.id.button2);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1  =new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent1);
            }
        });



        btn3= (Button) findViewById(R.id.button3);


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentr =new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intentr);
            }
        });


        btn4= (Button) findViewById(R.id.button4);


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentn  =new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intentn);
            }
        });




        btn5= (Button) findViewById(R.id.button5);


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnn  =new Intent(MainActivity.this, Main6Activity.class);
                startActivity(intentnn);
            }
        });




        btn6= (Button) findViewById(R.id.button6);


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnnn  =new Intent(MainActivity.this, Main7Activity.class);
                startActivity(intentnnn);
            }
        });




        btn7= (Button) findViewById(R.id.button7);


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnnun  =new Intent(MainActivity.this, Main8Activity.class);
                startActivity(intentnnun);
            }
        });




        btn8= (Button) findViewById(R.id.button8);


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentun  =new Intent(MainActivity.this, Main9Activity.class);
                startActivity(intentun);
            }
        });


        btn9= (Button) findViewById(R.id.roundoff);


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnnunw  =new Intent(MainActivity.this, Main10Activity.class);
                startActivity(intentnnunw);
            }
        });



        btn10= (Button) findViewById(R.id.quater);


        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnnunw  =new Intent(MainActivity.this, Main11Activity.class);
                startActivity(intentnnunw);
            }
        });



        btn11= (Button) findViewById(R.id.semifinal);


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnnunwq  =new Intent(MainActivity.this, Main12Activity.class);
                startActivity(intentnnunwq);
            }
        });


        btn12= (Button) findViewById(R.id.play);


        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ntentnnunwq  =new Intent(MainActivity.this, Main13Activity.class);
                startActivity(ntentnnunwq);
            }
        });

        btn13= (Button) findViewById(R.id.finaldd);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ntentnnunw  =new Intent(MainActivity.this, Main14Activity.class);
                startActivity(ntentnnunw);
            }
        });
    }
}
