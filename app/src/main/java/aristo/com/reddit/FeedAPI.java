package aristo.com.reddit;

import java.util.Map;

import aristo.com.reddit.Comments.CheckComment;
import aristo.com.reddit.model.Feed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FeedAPI {

    String BASE_URL = "https://www.reddit.com/r/";

    //Non-static feed name
    @GET("{feed_name}/.rss")
    Call<Feed> getFeed(@Path("feed_name") String feed_name);

    //static feed name
//    @GET("earthporn/.rss")
//    Call<Feed> getFeed();

}
