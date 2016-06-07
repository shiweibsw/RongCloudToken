package tracker.bsw.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private String APP_KEY = "your app key";
    private String APP_SECRET = "your app secret";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getToken();
    }

    private void getToken() {
        String nonce = String.valueOf(Math.random() * 1000000);
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        StringBuilder toSign = new StringBuilder(APP_SECRET).append(nonce).append(timestamp);
        String sign = CodeUtil.hexSHA1(toSign.toString());
        String baseUrl = "https://api.cn.ronghub.com/user/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TokenService tokenService = retrofit.create(TokenService.class);
        Call<TokenModel> call = tokenService.getToken(APP_KEY, nonce, timestamp, sign, "7654321", "bsw12345", "");
        call.enqueue(new Callback<TokenModel>() {
            @Override
            public void onResponse(Call<TokenModel> call, Response<TokenModel> response) {
            }

            @Override
            public void onFailure(Call<TokenModel> call, Throwable t) {
            }
        });
    }
}
