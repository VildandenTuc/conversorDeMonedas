import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda convierteMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/72be78b60a7f13fc93e788e9/pair/"+monedaBase+"/"+monedaTarget);
        System.out.println("monedaBase: "+monedaBase+"  -  "+"monedaTarget: "+monedaTarget);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda.");
        }
    }
}
