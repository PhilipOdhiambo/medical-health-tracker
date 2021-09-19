package com.philipowino.medicalhealthtracker.network;

import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;
import com.philipowino.medicalhealthtracker.models.count.AdverseCountResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface AdverseEventApi {
    @GET()
    Call<DrugAdverseEvent> getAdverseEvents(@Url String endpoint);
    @GET
    Call<AdverseCountResult> getAdverseCount(@Url String endpoint);
}
