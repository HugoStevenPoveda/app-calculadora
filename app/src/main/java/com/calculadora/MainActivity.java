package com.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS inisializar
    private EditText number1;
    private EditText number2;
    private TextView resultado;
    private RadioButton rb_suma;
    private RadioButton rb_resta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //construir atributo
        number1 = (EditText)findViewById(R.id.txt_number1);
        number2 = (EditText)findViewById(R.id.txt_number2);
        resultado = (TextView)findViewById(R.id.txt_resultado);
        rb_suma =(RadioButton)findViewById(R.id.radioButton_sumar);
        rb_resta =(RadioButton)findViewById(R.id.radioButton_restar);
    }
     public void operacion(View view){
        //recuperarlos datos de view

        String valor1_string =number1.getText().toString();
        String valor2_string =number2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        if(rb_suma.isChecked()){
            int suma = valor2_int + valor1_int;
            resultado.setText(String.valueOf(suma));
        }else if(rb_resta.isChecked()){
            int resta = valor1_int - valor2_int;
            resultado.setText(String.valueOf(resta));

        }






     }

}