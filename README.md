ChallengeConvertidorMonedas 💱✨
¡Bienvenido al Challenge Convertidor de Monedas! 🚀 🚀🎉 
Este proyecto es un convertidor de monedas 💱  esta desarrollado en Java ☕ permite 
convertir entre diferentes tipos de monedas 🌍💰 de manera rápida y sencilla.
Con este convertidor, podrás utilizar tasas de cambio actualizadas 📈 en tiempo real a través de una API externa 🔗,
asegurando que siempre tengas los valores más precisos. ¡Adiós a los cálculos complicados! 🔢🙅‍♂️

Características ✨
La Conversión se da en tiempo real entre monedas como el Sol peruano (PEN), el Dólar estadounidense (USD), 
el Euro (EUR), el Peso chileno (CLP), el Peso colombiano (COP) y el Bolívar venezolano (VES).
Actualización de tasas de cambio desde una API confiable.
Estructura modular con clases dedicadas para obtener tasas de cambio y realizar las conversiones.

Estructura del Proyecto 🗂️
Principal.java: Contiene el punto de entrada del programa y la interfaz de usuario de la consola.
Conversor.java: Gestiona la lógica de conversión de monedas y la obtención de tasas de cambio.
ActualizadorTasas.java: Se conecta a la API de ExchangeRate para obtener las tasas de cambio y almacenarlas.
Convertible.java: Interfaz que define el método de conversión.

Uso del Programa 🖥️
Al iniciar el programa, se te pedirá que selecciones una moneda de origen y otra de destino usando los 
numeros establecidos en el menu de opciones
Ingresa el monto que deseas convertir.
El programa mostrará la tasa de cambio actual y el resultado de la conversión.
Al finalizar, podrás realizar otra conversión o salir del programa.

Configuración y Ejecución 🚀
Prerrequisitos
Java (versión 11 o superior).
IDE recomendado: IntelliJ IDEA o Eclipse.

Pasos 1️⃣, 2️⃣, 3️⃣:
📥 Clona este repositorio en tu máquina local.
 ⚙️ Configura la dependencia de la API org.json en tu proyecto para manejar las respuestas JSON
 de la API de ExchangeRate.
💻Ejecuta Principal.java desde tu IDE para iniciar el programa.

API de Tasas de Cambio 🌎
Este proyecto usa la 🌐 ExchangeRate-API para obtener las tasas de cambio en tiempo real. 
Necesitarás una 🔑 clave de API  para utilizarla, la cual puedes obtener creando 
una cuenta en el sitio web de ExchangeRate-API.

Mejoras Futuras 🚧

🌍 Agregar soporte para más monedas: Expandir el convertidor para incluir una mayor variedad de divisas.
🖥️ Crear una interfaz gráfica (GUI): Desarrollar una interfaz visual para mejorar la experiencia de usuario.
✅ Implementar pruebas unitarias: Asegurar la precisión de los cálculos a través de pruebas automatizadas.

👤 Autor:
Katerin Aguilar
