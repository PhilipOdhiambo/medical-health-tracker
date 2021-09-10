package com.philipowino.medicalhealthtracker.network;

import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;

import retrofit2.Call;
import retrofit2.http.Query;

public interface AdverseEventApi {
    Call<DrugAdverseEvent> getAdverseEvents(
            @Query("search") String search,
            @Query("limit") Byte limit
    );
}
