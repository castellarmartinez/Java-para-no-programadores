### Ejercicio 2: asignación compacta

1. Analizar el código a continuación y completar la
   tabla correspondiente.
2. A continuación, realizar la codificación para
   confirmar que la ha completado de forma correcta.

[code]

      System.out.println(“A”);
      int x = 10;
      int y=20;
      System.out.println(x);
      System.out.println(y);
      System.out.println(“B”);
      x += 5;
      y -= 15;
      System.out.println(x);
      System.out.println(y);
      System.out.println(“C”);
      x++;
      y--;
      System.out.println(x);
      System.out.println(y);
      System.out.println(“D”);
      x*=4 ;
      y*=-3 ;
      System.out.println(x);
      System.out.println(y);
      System.out.println(“E”);
      x/=2;
      y/=4 ;
      System.out.println(x);
      System.out.println(y);

[/code]

Tabla para completar:

|     | X   | Y   |
|-----|-----|-----|
| A   | 10  | 20  |
| B   | 15  | 5   |
| C   | 16  | 4   |
| D   | 64  | -12 |
| E   | 32  | -3  |