package tracker.bsw.com.myapplication;

/**
 * Created by baishiwei on 2016/5/12.
 */
public class TokenModel {
    private int code;
    private String token;
    private String userId;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TokenModel{" +
                "code=" + code +
                ", token='" + token + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
