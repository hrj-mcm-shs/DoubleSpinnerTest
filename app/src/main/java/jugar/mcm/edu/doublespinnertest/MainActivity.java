package jugar.mcm.edu.doublespinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String grade,eleven, twelve, college;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner callGrade = findViewById(R.id.gradeLevel);
        final Spinner callEleven = findViewById(R.id.gradeEleven);
        final Spinner callTwelve = findViewById(R.id.gradeTwelve);
        final Spinner callCollege = findViewById(R.id.gradeCollege);

        callEleven.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        eleven = callEleven.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        callTwelve.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        twelve = callTwelve.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        callCollege.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        college = callCollege.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        callEleven.setVisibility(View.GONE);
        callTwelve.setVisibility(View.GONE);
        callCollege.setVisibility(View.GONE);

        callGrade.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        grade = callGrade.getSelectedItem().toString();


                        if (position == 0) {
                            callEleven.setVisibility(View.VISIBLE);
                            callTwelve.setVisibility(View.GONE);
                            callCollege.setVisibility(View.GONE);
                        } else if (position == 1) {
                            callEleven.setVisibility(View.GONE);
                            callTwelve.setVisibility(View.VISIBLE);
                            callCollege.setVisibility(View.GONE);
                        } else if (position == 2) {
                            callEleven.setVisibility(View.GONE);
                            callTwelve.setVisibility(View.GONE);
                            callCollege.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

    }
}
