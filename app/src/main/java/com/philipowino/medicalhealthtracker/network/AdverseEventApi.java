package com.philipowino.medicalhealthtracker.network;

import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AdverseEventApi {
    @GET("event.json")
    Call<DrugAdverseEvent> getAdverseEvents(
            @Query("search") String search,
            @Query("limit") String limit
    );
}
