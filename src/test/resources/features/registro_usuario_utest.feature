#language:es
#autor: Rafael de jesus Martinez Nisperuza
@Historia
Característica: Validar resgitro Utest
  como usuario quiero resgistarme em la plataforma web Utest

  Antecedentes:
    Dado que el usuario ingresa a la pagina web utest

  @registro
  Esquema del escenario: Registro de usuario exitoso
    Cuando  diligencia los datos principales del paso uno
      | nombre   | apellido   | correo   | mes   | dia   | anno   | idioma   |
      | <nombre> | <apellido> | <correo> | <mes> | <dia> | <anno> | <idioma> |
    Y diligencia los datos de ubicacion en el paso dos
      | cuidad   | codigo_postal   | pais   |
      | <cuidad> | <codigo_postal> | <pais> |
    Y diligencia los datos de dispositivos en el paso tres
      | computador   | version   | lengua   | celular   | modelo   | sistema   |
      | <computador> | <version> | <lengua> | <celular> | <modelo> | <sistema> |
    Y asigna los datos de contrasenna, aceptando terminos y politicas en el paso cuatro
      | contrasenna   | confirmar   |
      | <contrasenna> | <confirmar> |
    Entonces verifica que el registro fue satisfactorio
      | mensaje   |
      | <mensaje> |

    Ejemplos:
      | nombre | apellido | correo     | mes   | dia | anno | idioma  | cuidad    | codigo_postal | pais     | computador | version      | lengua  | celular  | modelo | sistema | contrasenna  | confirmar    | mensaje                                                                 |
      | Juan   | Lopez    | @gmail.com | April | 15  | 1969 | Spanish | Sincelejo | 700001        | Colombia | Ubuntu     | Ubuntu 19.04 | Spanish | Motorola | L6     | Java ME | C4m3110loko* | C4m3110loko* | Welcome to the world's largest community of freelance software testers! |


  @registroFallido
  Esquema del escenario: Registro de usuario fallido
    Cuando  diligencia los datos principales del paso uno
      | nombre   | apellido   | correo   | mes   | dia   | anno   | idioma   |
      | <nombre> | <apellido> | <correo> | <mes> | <dia> | <anno> | <idioma> |
    Y diligencia los datos de ubicacion en el paso dos
      | cuidad   | codigo_postal   | pais   |
      | <cuidad> | <codigo_postal> | <pais> |
    Y diligencia los datos de dispositivos en el paso tres
      | computador   | version   | lengua   | celular   | modelo   | sistema   |
      | <computador> | <version> | <lengua> | <celular> | <modelo> | <sistema> |
    Y asigna los datos de contrasenna, aceptando terminos y politicas en el paso cuatro
      | contrasenna   | confirmar   |
      | <contrasenna> | <confirmar> |
    Entonces verifica que la contrasenna es insegura
      | mensaje   |
      | <mensaje> |

    Ejemplos:
      | nombre | apellido | correo     | mes   | dia | anno | idioma  | cuidad    | codigo_postal | pais     | computador | version      | lengua  | celular  | modelo | sistema | contrasenna | confirmar | mensaje                  |
      | Rosa   | Lopez    | @gmail.com | April | 15  | 1969 | Spanish | Sincelejo | 700001        | Colombia | Ubuntu     | Ubuntu 19.04 | Spanish | Motorola | L6     | Java ME | 22222       | 22222     | Use 10 to 64 characters. |





