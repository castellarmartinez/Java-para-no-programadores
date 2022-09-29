### Ejercicio 3: operadores lógicos

1. Analizar el código que sigue y completar la tabla
   correspondiente.
2. Luego, realizar la codificación para confirmar que
   ha completado la tabla correctamente.

[code]

      System.out.println(“A”);
      boolean n1=true;
      boolean n2=false;
      boolean n3=!n1;
      boolean n4=!n2;
      System.out.println(n1);
      System.out.println(n2);
      System.out.println(n3);
      System.out.println(n4);
      System.out.println(“B”);
      n3=n1 & n2;
      n4=n1 | n2;
      System.out.println(n3);
      System.out.println(n4);
      System.out.println(“C”);
      n3=!(n1 & n2);
      n4=!(n1 | n2);
      System.out.println(n3);
      System.out.println(n4);
      System.out.println(“D”);
      n3=!n1 & n2;
      n4=!n1 | n2;
      System.out.println(n3);
      System.out.println(n4);
      System.out.println(“E”);
      n3=n1^ n2;
      n4=n1^ !n2;
      System.out.println(n3);
      System.out.println(n4);

[/code]


|     | n1   | n2    | n3    | n4    |
|-----|------|-------|-------|-------|
| A   | true | false | false | true  |
| B   | true | false | false | true  |
| C   | true | false | true  | false |
| D   | true | false | false | false |
| E   | true | false | true  | false |