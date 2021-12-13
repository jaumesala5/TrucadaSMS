package cat.dam.jaume.trucadasms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    final  EditText et_num_telefon = findViewById(R.id.et_num_telefon);
    final Button btn_1 = findViewById(R.id.buto1);
    final Button btn_2 = findViewById(R.id.buto2);
    final Button btn_3 = findViewById(R.id.buto3);
    final Button btn_4 = findViewById(R.id.buto4);
    final Button btn_5 = findViewById(R.id.buto5);
    final Button btn_6 = findViewById(R.id.buto6);
    final Button btn_7 = findViewById(R.id.buto7);
    final Button btn_8 = findViewById(R.id.buto8);
    final Button btn_9 = findViewById(R.id.buto9);
    final Button  CALL = (Button) findViewById(R.id.CALL);
    final Button  SMS = (Button) findViewById(R.id.SMS);
    final Button  DEL = (Button) findViewById(R.id.DEL);


        btn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "1");
            }

        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "2");
            }});
        btn_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "3");
            }});
        btn_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "4");
            }});
        btn_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "5");
            }});
        btn_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "6");
            }});
        btn_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "7");
            }});
        btn_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "8");
            }});
        btn_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                et_num_telefon.setText(et_num_telefon.getText() + "9");
            }});

        SMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String missatge = SMS.getText().toString();
                String num_telefon = et_num_telefon.getText().toString();
                    Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + num_telefon));
                    smsIntent.putExtra("sms_body", missatge);
                    startActivity(smsIntent);

            }

        });

        CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num_telefon = et_num_telefon.getText().toString();
                    String dial = "tel:" + num_telefon;
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));

            }


        });

        DEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = et_num_telefon.getText().toString();
                if (!TextUtils.isEmpty(text)) {
                    String newText = text.substring(0, text.length() - 1);
                    et_num_telefon.setText(newText);
                    et_num_telefon.setSelection(newText.length());

                }
            }
        });
    }}