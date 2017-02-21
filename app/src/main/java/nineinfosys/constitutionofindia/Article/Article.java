package nineinfosys.constitutionofindia.Article;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import nineinfosys.constitutionofindia.R;


public class Article extends AppCompatActivity {

    ListView TutorialListt;
    ArrayAdapter<String> adapter;
    String[] TutoriallListt = new String[]{"भाग I: संघ और उसके क्षेत्र",
            "भाग II: नागरिकता",
            "भाग III: मूलभूत अधिकार",
            "भाग IV: राज्\u200Dय के नीति निर्देशक तत्\u200Dव",
            "भाग IV क:मूल कर्तव्\u200Dय",
            "भाग V:संघ:कार्यपालिका ","भाग V:संघ:संसद","भाग V:संघ:राष्\u200Dट्रपति के विधायी अधिकार ","भाग V:संघ:संघ न्\u200Dयायपालिका",
            "भाग V:संघ:भारतीय नियंत्रक एवं महालेखाकार","भाग VI:राज्\u200Dय-सामान्\u200Dय","भाग VI:राज्\u200Dय-कार्यपालिका","भाग VI:राज्\u200Dय-राज्\u200Dय विधानमंडल",
            "भाग VI:राज्\u200Dय-राज्\u200Dयपाल के विधायी अधिकार",
            "भाग VI:राज्\u200Dय-राज्\u200Dयों के उच्\u200Dच न्\u200Dयायालय","भाग VI:राज्\u200Dय-अधीनस्\u200Dथ न्\u200Dयायालय"
            ,"भाग VII:प्रथम अनुसूची के भाग ख में राज्\u200Dय","भाग VIII:संघ राज्\u200Dय क्षेत्र","भाग IX:पंचायत","भाग IXA:नगरपालिकाएं","भाग X:अनुसूचित जनजाति क्षेत्र"
    ,"भाग XI:संघ और राज्\u200Dयों के बीच संबंध:विधायी संबंध","भाग XI:प्रशासनिक संबंध","भाग XII:वित्त, सम्\u200Dपत्ति,संविदाएं और वाद","भाग XII:उधार","संपत्ति,संविदाएं,अधिकार,देयताएं,बाध्\u200Dयताएं और वाद","भाग XII:संपत्ति का अधिकार",
            "भाग XIII:भारत के राज्\u200Dय क्षेत्र के अंदर व्\u200Dयापार,वाणिज्\u200Dय और समागम","भाग XIV:संघ और राज्\u200Dयों के अधीन सेवाएं:सेवाएं"
    ,"भाग XIV:लोक सेवा आयोग","भाग XIVक:अधिकरण","भाग XV:निर्वाचन","भाग XVI:कुछ वर्गों के संबंध में विशेष उपबंध","भाग XVII:राजभाषा:संघ की भाषा","भाग XVII:राजभाषा:क्षेत्रीय भाषाएं","भाग XVII:राजभाषा:उच्\u200Dचतम न्\u200Dयायालय,उच्\u200Dच न्\u200Dयायालयों आदि की भाषा",
    "भाग XVII:राजभाषा:विशेष निर्देश","भाग XVIII:आपात उपबंध","भाग XIX: प्रकीर्ण","भाग XX: संविधान के संशोधन","भाग XXI: अस्\u200Dथायी, संक्रमणकालीन और विशेष उपबंध",
            "भाग XXII:संक्षिप्\u200Dत नाम,प्रारंभ,हिन्\u200Dदी में प्राधिकृत पाठ और निरसन"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectt);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_article, R.id.textViewtutt, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Article.this, ArticleDetails.class);
                EnglishBegRef.putExtra("key", position);
                startActivity(EnglishBegRef);

            }
        });
    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //  Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case android.R.id.home:


                this.finish();
                return true;
            default:
                if (id == R.id.action_send) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }

}



