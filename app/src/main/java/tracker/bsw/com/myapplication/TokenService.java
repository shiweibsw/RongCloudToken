package tracker.bsw.com.myapplication;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by baishiwei on 2016/5/12.
 */
public interface TokenService {
    @FormUrlEncoded
    @POST("getToken.json")
    Call<TokenModel> getToken(@Header("RC-App-Key") String key,
                              @Header("RC-Nonce") String nonce,
                              @Header("RC-Timestamp") String timestamp,
                              @Header("RC-Signature") String signature,
                              @Field("userId") String userId,
                              @Field("name") String name,
                              @Field("portraitUri") String portraitUri);
}
