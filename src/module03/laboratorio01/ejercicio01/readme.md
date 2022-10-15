### Ejercicio 1: Operador condicional

Dados los siguientes códigos, informar los distintos valores de n3:

[code]

    System.out.println(“A”);
    int n1=20;
    int n2=10;
    int n3=(n1>n2)? n1:0;
    System.out.println(n3);
    System.out.println(“B”);
    int n1=20;
    int n2=10;
    int n3=(n1<n2)? n1:0;
    System.out.println(n3);
    System.out.println(“C”);
    int n1=20;
    int n2=10;
    int n3=(n1==n2)? n1:0;
    System.out.println(n3);
    System.out.println(“D”);
    int n1=20;
    int n2=10;
    int n3=(n1!=n2)? n1:0;
    System.out.println(n3);

[/code]


|     | n1   | n2  | n3  |
|-----|------|-----|-----|
| A   | 20   | 10  | 20  |
| B   | 20   | 10  | 0   |
| C   | 20   | 10  | 0   |
| D   | 20   | 10  | 20  |