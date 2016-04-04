package com.google.android.mcccounter;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.InputStream;
import java.util.HashMap;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/** * Created by wendy on 3/20/2016. */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ApplicationTest {
//    private Context context = this.context;
//    @Before
//    public void setUp() throws Exception {
//    }

    @Test
    public void testRandomString() throws Exception {
        //HashMap<String, Integer> hashMap = new HashMap<>();
        InputStream is = getInstrumentation().getContext().getResources()
        //  .openRawResource(com.google.android.mcccounter.test.R.raw.aliceinwonderland);
            .openRawResource(com.google.android.mcccounter.test.R.raw.my812_notes);

        String in = Utility.toString(is);
        //map.put("ing", 2);
        //arrayList.add("aco");
        //Like "le-r" (and "l-er"), "de-d", "to-r", "co-n", "co-r", "a-th" (and "at-h"), "at-i", "de-n", etc.
        //String in = "ler ded tor con cor ath ati den";
        //String in = "lerdedtorconcorathatiden";
        //String in = "conor";

//        HashMap<String, Integer> frequencies = Confusions.calculateFrequencies(in, MccLists.shortMccList);
//        Log.i("MCC frequencies", frequencies.toString());

        HashMap<String, Integer> confusionRanks = Confusions.findConfusingPercentage(in);
        Log.i("MCC confusion ranks", confusionRanks.toString());


//        HashMap<String, Integer> confusions = Confusions.calculateConfusions(in, MccLists.shortMccList);
//        Log.i("MCC confusions", confusions.toString());

//        assertEquals(hashMap, confusionPercentages);
    }

}
