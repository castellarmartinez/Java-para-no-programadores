### Ejercicio 3: operadores aritméticos

1. Analizar el código a continuación y completar la
   tabla correspondiente.
2. Después, realizar la codificación para confirmar
   que la ha completado correctamente.

[code]

      System.out.println(“A”);
      int x = 10;
      int y=20;
      System.out.println(x);
      System.out.println(y);
      System.out.println(“B”);
      x =x+y;
      y =y+x;
      System.out.println(x);
      System.out.println(y);
      System.out.println(“C”);
      x=x-y ;
      y=y-x ;
      System.out.println(x);
      System.out.println(y);
      System.out.println(“D”);
      x=x*y;
      y=x*x;
      System.out.println(x);
      System.out.println(y);
      System.out.println(“E”);
      x=y/x ;
      y=x/y ;
      System.out.println(x);
      System.out.println(y);

[/code] 

Tabla para completar:

|     | X      | Y       |
|-----|--------|---------|
| A   | 10     | 20      |
| B   | 30     | 50      |
| C   | -20    | 70      |
| D   | -1400  | 1960000 |
| E   | -14000 | 0       |