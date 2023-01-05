# language: es
Característica: Pedido de productos no exitoso

  Antecedentes: El usuario debera estar registrado
    Dado el usuario ingresa al modulo de login
    Cuando ingresa el usuario: "melo12345@gmail.com" y la contraseña: "melo12345"
    Entonces podrá ingresar con la cuenta correspondiente

    Escenario: No acepto los términos y condiciones
      Dado : el usuario previamente registrado
      Cuando : agregue 4 productos al carrito de compras
      Y : no acepte los términos y condiciones
      Entonces : el sistema deberá mostrar el siguiente mensaje: "Please accept the terms of service before the next step."