
# 💱 Convertidor de Monedas en Java

Este es un sencillo **convertidor de monedas** desarrollado en **Java**, que utiliza la API pública de [Currency Freaks](https://currencyfreaks.com/) para obtener tasas de cambio en tiempo real.

## 🚀 Características

- ✅ Consumo de API REST usando `HttpURLConnection`
- ✅ Análisis de datos JSON con la librería `org.json`
- ✅ Filtro de monedas específicas (USD, EUR, CLP, MXN, GBP, JPY)
- ✅ Entrada interactiva del usuario por consola
- ✅ Cálculo preciso del monto convertido
- ✅ Código simple y fácil de entender

## 🔧 Requisitos

- Java JDK 8 o superior
- IntelliJ IDEA u otro IDE
- Conexión a Internet
- Librería externa `org.json` (si no usas Maven)

## 📦 Dependencias

Si no usas Maven, descarga manualmente el `.jar` desde:
👉 [https://repo1.maven.org/maven2/org/json/json/20210307/json-20210307.jar](https://repo1.maven.org/maven2/org/json/json/20210307/json-20210307.jar)

Agrega el `.jar` como biblioteca en tu IDE (ej: IntelliJ IDEA).

## ⚙️ Uso

1. Ejecuta el programa en tu entorno Java.
2. Ingresa:
   - La moneda de origen (ej: `USD`)
   - La moneda de destino (ej: `CLP`)
   - El monto a convertir (ej: `10`)
3. El programa te mostrará el resultado calculado.

### 💡 Ejemplo

Monedas disponibles: USD, EUR, CLP, MXN, GBP, JPY
Ingrese la moneda de origen (ej: USD): USD
Ingrese la moneda de destino (ej: CLP): CLP
Ingrese el monto a convertir: 10

10.00 USD equivale a 9185.00 CLP


## 🧠 Tecnologías usadas

- Java
- API REST
- JSON
- Consola
- Currency Freaks API

## 🔐 API Key


> ⚠️ Esta API key es pública y de prueba. Para uso personal o en producción se recomienda generar tu propia clave desde [https://currencyfreaks.com](https://currencyfreaks.com)

## 📁 Estructura del Proyecto

ConvertidorMoneda/
├── src/
│ └── Main.java
├── lib/
│ └── json-20210307.jar
├── README.md


## 👩‍💻 Autor

**Carmen Torreblanca**

carmen1974t@gmail.com

### 📜 Licencia

Este proyecto es de uso libre con fines educativos. Puedes modificarlo, adaptarlo o compartirlo.


