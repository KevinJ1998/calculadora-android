CALCULADORA EN ANDROID STUDIO

Integrantes: 
 - Kevin Segovia
 - Nicole Zambrano

Creación del proyecto:
Para esto se inicializó un proyecto nuevo en Android Studio, y se modificó el archivo ``activity_main.xml``

Diseño de interfaz: 
El diseño se lo realizó en el apartado de "diseño" del archivo XML, mencionado anteriormente.
Esto es un bastante sencillo ya que la modalidad para eso es "drag and drop".

Creación de fucniones: 
En el archivo `MainActivity.java` se definieron las variables para los botones y el `TextView`, y luego las funciones que realizarán los botones como suma, resta, etc.

Función Suma:

```
btnMas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
});
```
Función resta: 
```
btnMenos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
            }
});
```
Función Multiplicar:
```
btnPor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
});
```
Función Dividir:
```
btnDividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
});
```
Función Procentaje:
```
btnPorcen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = (Double.parseDouble(Resultado.getText().toString())/100);
                Resultado.setText(String.valueOf(resultado));
            }
});
```
Función Borrar (Limpiar):
```
btnClean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
});
```
Función Borrar (Caracter):
```
btnBorrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar.substring(0, mostrar.length() - 1);
                Resultado.setText(mostrar);
            }
});
```
Función Resultado: 
```
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
```
La interfaz de la calculadora se puede ver en la siguiente imagen:

![Alt text](/captures/Calculadora.png?raw=true "Interfaz")

Cada una de las funciones se puede ver el resultado en las siguientes imagenes:

Suma: (45+6)

![Alt text](/captures/Funcion_Suma.png?raw=true "Función Suma")

Resta: (65-70)

![Alt text](/captures/Funcion_Resta.png?raw=true "Función Resta")

Multiplicación: (5x80)

![Alt text](/captures/Funcion_Por.png?raw=true "Función Multiplicación")

División: (25/3)

![Alt text](/captures/Funcion_Div.png?raw=true "Función División")

División para cero: 

![Alt text](/captures/Div_Cero.png?raw=true "División para Cero")

Porcentaje: (500%)

![Alt text](/captures/Funcion_Porcentaje.png?raw=true "Función Porcentaje")






