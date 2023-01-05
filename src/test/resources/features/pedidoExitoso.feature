# language: es
Característica: Pedido de productos

  Antecedentes: El usuario debera estar logueado
    Dado el usuario ingresa al modulo de login
    Cuando ingresa el usuario: "melo12345@gmail.com" y la contraseña: "melo12345"
    Entonces podrá ingresar con la cuenta correspondiente


  Escenario: :  Pedido de productos exitoso
    Dado : el usuario previamente registrado va a una sección de productos
    Cuando : agregue 4 productos al carrito de compras
    Y : realize el checkout exitosamente
    Entonces : el sistema debera mostrar el siguiente mensaje: "Your order has been successfully processed!"