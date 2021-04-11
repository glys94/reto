# language: es
Característica: creacion usurio para  compras  en la  pagina

  Escenario: creacion exitosa del usuario
    Dado que el usurio se encuentra en el formulario de registro con el correo gladis1234541@gmail.com
    Cuando el usurio completa los campos de registro
      | nombre | apellido | contrasena | dia | mes | ano  | compania | direccion            | ciudad | estado | codigoPostal | pis           | adicional          | tefono  | movil      | correoReferencia |
      | pepito | perez    | 123456     | 17  | 7   | 2003 | coucair  | avenida siempre viva | cansas | 9      | 45678        | United States | jfhjbfhnewhjm84887 | 3025624 | 3214568796 | dos1@yopmail.com  |

    Entonces el visualiza el nombre del usurio pepito perez en la pagina



