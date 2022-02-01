# Author: Miguel Rubide
# language:es
  @historia

Característica: Utest.com
   Como usuario quiero ingresar a Utest.com, dar clic en la opción de registro (JOIN TODAY)
   y realizar el diligenciamiento del formulario con la finalidad de crear un nuevo usuario.

  @Escenario
 Esquema del escenario:  Crear un Nuevo Usuario

    Dado que miguel quiere registrarse con un nuevo usuario en Utest.com

    Cuando  el debe dar click en el boton Join y luego ingresa la informacion solicitada (datos personales) en el formulario y dar click en el boton
    | nombres     | apellidos       | email   | fmes    | fdia   | fano   | ciudad   | codpostal   | contrasena   | confirmarcontrasena   |
    | <nombres>   | <apellidos>     | <email> | <fmes>  | <fdia> | <fano> | <ciudad> | <codpostal> | <contrasena> | <confirmarcontrasena> |

    Entonces el deberia de recibir un mensaje de usuario registrado y tener acceso a la cuenta y las funcionalidades de la app

  Ejemplos:
      | nombres        | apellidos    | email              | fmes    | fdia | fano | ciudad | codpostal | contrasena       | confirmarcontrasena |
      | Mariano Julian | Pachon Ramos | pmmachpr25@gmail.com | January | 28   | 1986 | med    | 270001    | tuContrasena2022 | tuContrasena2022    |
