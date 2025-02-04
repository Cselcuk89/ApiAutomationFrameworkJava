package airlines;

import com.selcuk.utils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class AirlineTests {
    @Test
    public void createAirlineWithStringPayload(){
        String endPoint = "https://api.instantwebtools.net/v1/airlines";
        String payload = Payloads.createAirlinePayloadFromString("1236754378","ABC Airlines","TUR","ABC","abc slogan","Mumbai","abc.com","2022");
        Response response = RestUtils.applyPostWithStringPayload(endPoint,payload,new HashMap<>());

        Assert.assertEquals(response.getStatusCode(),200);
    }
    @Test
    public void createAirlineWithMapPayload(){
        String endPoint = "https://api.instantwebtools.net/v1/airlines";
        Map<String,Object> payload = Payloads.createAirlinePayloadFromMap("1236754378","ABC Airlines","TUR","ABC","abc slogan","Mumbai","abc.com","2022");
        Response response = RestUtils.applyPostWithMapPayload(endPoint,payload,new HashMap<>());

        Assert.assertEquals(response.getStatusCode(),200);
    }
}
