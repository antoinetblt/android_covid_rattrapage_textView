package esilv.a4.antoine.rattrapage_covid19;
/*
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;*/

    public class CountryActivity {
/*

        private TextView textViewResult;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            textViewResult = findViewById(R.id.text_view_result);

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://coronavirus-19-api.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            ApiService apiService = retrofit.create(ApiService.class);

            Call<CountryModel> call = apiService.getCountryModel();

            call.enqueue(new Callback<CountryModel>() {
                @Override
                public void onResponse(Call<CountryModel> call, Response<CountryModel> response) {

                    if ( !response.isSuccessful()) {
                        textViewResult.setText("Code : "+response.code());
                        return;
                    }

                    List<CountryModel> countryModels = Collections.singletonList(response.body());

                    for (CountryModel countryModel : countryModels) {
                        String content ="";
                        content += "Country : " + countryModel.getCountry() + "\n";

                        textViewResult.append(content);
                    }

                }

                @Override
                public void onFailure(Call<CountryModel> call, Throwable t) {

                    textViewResult.setText(t.getMessage());

                }
            });
        }

        @Override
        public boolean onCreateOptionsMenu( Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.exemple_menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            switch(item.getItemId()){
                case R.id.item1:
                    Toast.makeText(this, "All the world selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.item2:
                    Toast.makeText(this, "All countries selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.item3:
                    Toast.makeText(this, "search country selected", Toast.LENGTH_SHORT).show();
                    return true;

                default:
                    return super.onOptionsItemSelected(item);

            }



        }*/
    }

