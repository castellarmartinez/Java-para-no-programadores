### Ejercicio 3
Tomando el siguiente código:

String usuario = “Pepito”, clave= “1234”;

Informar los siguientes casos:

1. Si el usuario es ”pepito” y la clave es ”1234” informar “¡Bienvenido pepito!”.
2. Si el usuario es ”pepito” y la clave no es “1234” informar “Contraseña incorrecta”.
3. Si el usuario no es “pepito” y la clave es “1234” informar “Usuario incorrecto”.

#### Pseudocódigo

    PROGRAMA 2
    LEER usuario,clave
    SI usuario=”Pepito” y clave=”EducacionIt”
    ENTONCES
    INFORMAR “Bienvenido pepito!!”
    FIN SI
    SI usuario!=”Pepito” y clave=”EducacionIt”
    ENTONCES
    INFORMAR “Usuario incorrecto”
    FIN SI
    SI usuario=”Pepito” y clave!=”EducacionIt”
    ENTONCES
    INFORMAR “Contraseña incorrecta!”
    FIN SI