package com.philipowino.medicalhealthtracker.network;

import static com.philipowino.medicalhealthtracker.Constants.ADVERSE_EVENT_API_KEY;
import static com.philipowino.medicalhealthtracker.Constants.ADVERSE_EVENT_BASE_URL;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AdverseEventClient {
    private static Retrofit retrofit = null;

    public static AdverseEventApi getClient() {

        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request newRequest  = chain.request().newBuilder()
                                    .addHeader("Authorization","Basic " +  ADVERSE_EVENT_API_KEY)
                                    .build();
                            return chain.proceed(newRequest);
                        }
                    })
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(ADVERSE_EVENT_BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(AdverseEventApi.class);
    }
}
