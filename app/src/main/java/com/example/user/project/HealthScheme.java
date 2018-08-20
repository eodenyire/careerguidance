package com.example.user.project;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
/**
 * Created by user on 7/12/2018.
 */
public class HealthScheme extends AppCompatActivity {
    TextView HyperLink1,HyperLink2,HyperLink3,HyperLink4,HyperLink5;
    Spanned Text1,Text2,Text3,Text4,Text5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.healthschemes);
        HyperLink1=(TextView)findViewById(R.id.textView1);
        HyperLink2=(TextView)findViewById(R.id.textView2);
        HyperLink3=(TextView)findViewById(R.id.textView3);
        HyperLink4=(TextView)findViewById(R.id.textView4);
        Text1 = Html.fromHtml(
                "<a href='http://www.nrhmhp.gov.in/sites/default/files/files/Neonatal%20Health.pdf'>Facility Based New Born.com</a>");
        HyperLink1.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink1.setText(Text1);
        Text2 = Html.fromHtml(
                "<a href='http://nhm.gov.in/janani-shishu-suraksha-karyakram.html'>Janani Shishu Suraksha Karyakram.com</a>");
        HyperLink2.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink2.setText(Text2);
        Text3 = Html.fromHtml(
                "<a href='https://www.wbhealth.gov.in/uploaded_files/FIMNCI/chart_booklet_FIMNCI.pdfa'>Facility Based Integrated Management of Neonatal and Childhood Illness (F- IMNCI).com</a>");
        HyperLink3.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink3.setText(Text3);
        Text4 = Html.fromHtml(
                "<a href='http://nhm.gov.in/janani-shishu-suraksha-karyakram.html'>Integrated Management of Neonatal Childhood Illnesses (IMNCI).com</a>");
        HyperLink4.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink4.setText(Text4);
    }
}
