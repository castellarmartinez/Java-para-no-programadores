### Etapa 1

Una reconocida Entidad Bancaria está en la búsqueda de Desarrolladores Backend Java Jr,
Ssr y Sr. Para que puedan postularse, se debe crear una aplicación que valide el ingreso a la
plataforma de Online Banking a través de una clave Token.

Se debe tener en cuenta lo siguiente:

● La Clave Token debe ser un número aleatorio de 6 dígitos.\
● El cliente debe ingresar los campos Usuario, Contraseña y Clave Token (todos obligatorios).\
● El campo Usuario no distingue minúsculas o mayúsculas.\
● El campo Contraseña es sensible a las minúsculas y mayúsculas.\
● El cliente solo posee 3 intentos de logueo. Si alcanza los 3 intentos fallidos de forma
consecutiva, la aplicación deberá informar al usuario que debe dirigirse a la sucursal del
banco más cercana para poder desbloquear sus credenciales.\
● Por cada intento fallido, la aplicación debe preguntar al cliente si desea continuar
colocando las credenciales de manera correcta.\
● Si el cliente coloca las credenciales de forma correcta, deberá informar que ha ingresado
correctamente al Online Banking.

    Notas:
    ● Para realizar esta primera etapa del proyecto se deben haber completado 
    los módulos 1, 2 y 3
    ● Deberá incluir: Proyecto Java con una sola clase llamada App.java, 
    datos de entrada (Manejo de la Consola), Variables, Operadores Relacionales
    y Lógicos, Condicionales, Ciclos, Métodos de laclase String y Métodos de la librería Math.

#### Para realizar este proyecto:
1. Todo el código debe estar en el método principal (main).
2. La variable Usuario a validar deberá ser el literal administrador.
3. La variable Contraseña a validar deberá ser el literal administrador.1234.
4. Para generar el número aleatorio, utilizar la librería que provee java.lang.Math.
