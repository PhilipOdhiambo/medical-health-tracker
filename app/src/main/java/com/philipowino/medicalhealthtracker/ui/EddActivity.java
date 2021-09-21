package com.philipowino.medicalhealthtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;

import com.philipowino.medicalhealthtracker.Constants;
import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.drug_label.DrugDetail;
import com.philipowino.medicalhealthtracker.models.drug_label.Openfda;
import com.philipowino.medicalhealthtracker.models.drug_label.Result;
import com.philipowino.medicalhealthtracker.network.AdverseEventApi;
import com.philipowino.medicalhealthtracker.network.AdverseEventClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EddActivity extends AppCompatActivity {

    final String RESPONSE = "Response";


    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private String mRecentMed;

    @BindView(R.id.titleTv) TextView mTitleTv;
    @BindView(R.id.drugNameTv) TextView mDrugNameTv;
    @BindView(R.id.resultTitleTv) TextView mResultTitleTv;
    @BindView(R.id.resultTv) TextView mResultTv;
    @BindView(R.id.warningTv) TextView mWarningTv;


    public Result mDrugLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edd);
        ButterKnife.bind(this);
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mRecentMed = mSharedPreferences.getString(Constants.PREFERENCES_LOCATION_KEY, null);

        fetchMedLabel(mRecentMed);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.med_search, menu);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();

        MenuItem menuItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) menuItem.getActionView();

        String genericName = mSharedPreferences.getString(Constants.PREFERENCES_LOCATION_KEY,null);

        fetchMedLabel(genericName);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String generic_name) {
                addToSharedPreferences(generic_name);
                fetchMedLabel(generic_name);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String generic_name) {
                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return super.onOptionsItemSelected(item);
    }

    private void addToSharedPreferences(String generic_name) {
        mEditor.putString(Constants.PREFERENCES_LOCATION_KEY, generic_name).apply();
    }

    private void fetchMedLabel(String generic_name){
        Log.d(RESPONSE,"inside fetch");
        String endpoint = "https://api.fda.gov/drug/label.json?search=openfda.generic_name:" + generic_name + ".exact";
        AdverseEventApi client = AdverseEventClient.getClient();
        Call<DrugDetail> call = client.getDrugLabel(endpoint);
        call.enqueue(new Callback<DrugDetail>() {
            @Override
            public void onResponse(Call<DrugDetail> call, Response<DrugDetail> response) {
                    Log.d("Response",String.valueOf(response.code()));
                if (response.isSuccessful()) {
                    mDrugLabel = response.body().getResults().get(0);

                    String indication = mDrugLabel.getIndicationsAndUsage().toString();
                    Openfda openfda = mDrugLabel.getOpenfda();
                    List<String> meds = openfda.getGenericName();
                    String meda = meds.get(0);
                    String warning =  mDrugLabel.getWarnings().toString();

                    mDrugNameTv.setText("Drug Name: " +  meda);
                    mResultTv.setText(indication);
                    mWarningTv.setText(warning);
                }
            }

            @Override
            public void onFailure(Call<DrugDetail> call, Throwable t) {

            }
        });

    }


}