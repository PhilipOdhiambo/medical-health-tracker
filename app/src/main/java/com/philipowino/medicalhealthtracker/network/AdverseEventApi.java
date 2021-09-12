package com.philipowino.medicalhealthtracker.network;

import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface AdverseEventApi {
    @GET()
    Call<DrugAdverseEvent> getAdverseEvents(@Url String endpoint);
}
