import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class Main {

    // API KEY y URL base
    private static final String API_KEY = "a824176ca43244cda96f25892e595d1f";
    private static final String API_URL = "https://api.currencyfreaks.com/latest?apikey=" + API_KEY;

    public static void main(String[] args) {
        try {
            // 1. Consumir la API
            URL url = new URL(API_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // 2. Análisis de la Respuesta JSON
            JSONObject json = new JSONObject(response.toString());
            JSONObject rates = json.getJSONObject("rates");

            // 3. Filtro de monedas
            Scanner scanner = new Scanner(System.in);
            System.out.println("Monedas disponibles: USD, EUR, CLP, MXN, GBP, JPY");
            System.out.print("Ingrese la moneda de origen (ej: USD): ");
            String fromCurrency = scanner.nextLine().toUpperCase();
            System.out.print("Ingrese la moneda de destino (ej: CLP): ");
            String toCurrency = scanner.nextLine().toUpperCase();
            System.out.print("Ingrese el monto a convertir: ");
            double amount = scanner.nextDouble();

            if (!rates.has(fromCurrency) || !rates.has(toCurrency)) {
                System.out.println("Moneda no válida. Verifique e intente nuevamente.");
                return;
            }

            // 4. Convertir la moneda
            double fromRate = Double.parseDouble(rates.getString(fromCurrency));
            double toRate = Double.parseDouble(rates.getString(toCurrency));
            double result = amount * (toRate / fromRate);

            // 5. Mostrar resultados
            System.out.printf("\n%.2f %s equivale a %.2f %s\n", amount, fromCurrency, result, toCurrency);

        } catch (Exception e) {
            System.out.println("Error al convertir moneda: " + e.getMessage());
        }
    }
}
