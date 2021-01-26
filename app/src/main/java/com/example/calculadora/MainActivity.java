package com.example.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero,
    btnMas, btnMenos, btnIgual, btnPunto, btnPor, btnDividir, btnPorcen, btnBorrar, btnClean;
    TextView Resultado;
    double resultado;
    String operador, mostrar , reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button) findViewById(R.id.button1);
        btnDos = (Button) findViewById(R.id.button2);
        btnTres = (Button) findViewById(R.id.button3);
        btnCuatro = (Button) findViewById(R.id.button4);
        btnCinco = (Button) findViewById(R.id.button5);
        btnSeis = (Button) findViewById(R.id.button6);
        btnSiete = (Button) findViewById(R.id.button7);
        btnOcho = (Button) findViewById(R.id.button8);
        btnNueve = (Button) findViewById(R.id.button9);
        btnCero = (Button) findViewById(R.id.button10);
        btnMas = (Button) findViewById(R.id.buttonSuma);
        btnMenos = (Button) findViewById(R.id.buttonResta);
        btnPor = (Button) findViewById(R.id.buttonMulti);
        btnDividir = (Button) findViewById(R.id.buttonDividir);
        btnBorrar = (Button) findViewById(R.id.buttonBorrar);
        btnClean = (Button) findViewById(R.id.buttonClean);
        Resultado = (TextView) findViewById(R.id.textViewResult);
        btnPunto = (Button) findViewById(R.id.button11);
        btnIgual = (Button) findViewById(R.id.buttonResultado);
        btnPorcen = (Button) findViewById(R.id.buttonPorcentaje);

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });
        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = Resultado.getText().toString();
                mostrar= mostrar + "0";
                Resultado.setText(mostrar);
            }
        });

        btnMas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
            }
        });
        btnPor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar.substring(0, mostrar.length() - 1);
                Resultado.setText(mostrar);
            }
        });

        btnPorcen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = (Double.parseDouble(Resultado.getText().toString())/100);
                Resultado.setText(String.valueOf(resultado));
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                if (operador.equals("-")) {
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("+")) {
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("/")) {
                    if(Double.parseDouble(Resultado.getText().toString())!=0){
                        resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    } else {
                        Resultado.setText("SINTAX ERROR");
                    }
                }
                if (operador.equals("*")) {
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });
    }

}
