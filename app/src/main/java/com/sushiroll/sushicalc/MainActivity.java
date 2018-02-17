package com.sushiroll.sushicalc;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
//	Hoso
	double hoso_cogombre = 0;
    double hoso_mango = 0;
    double hoso_esparrec = 0;
    double hoso_salmo = 0;
    double hoso_melo = 0;
    double hoso_pollo = 0;
    double hoso_carla = 0;
    double hoso_fumat = 0;
    double hoso_duo = 0;
    double hoso_melo_tropic = 0;
    //double hoso_pastanaga = 0;
    double hoso_foie = 0;
    double hoso_textures = 0;
    double hoso_ikea = 0;
    
//  Maki
    double maki_classic = 0;
    double maki_green = 0;
    double maki_platan = 0;
    double maki_california = 0;
    double maki_mediterrani = 0;
    double maki_oli = 0;
    double maki_rock = 0;
    double maki_especial = 0;
    double maki_tonyina = 0;
    double maki_tropic = 0;
    double maki_nou = 0;
    double maki_codony = 0;
    double maki_pastanaga = 0;
    double huro_salmo = 0;
    double maki_mango = 0;
    double maki_tonyina_fresca = 0;
    double uramaki_salmo_alvocat = 0;
    double huro_siratcha = 0;
    double huro_platan = 0;
    double huro_curry = 0;
    double huro_bacalla = 0;    //25/02/17
    double huro_tartar= 0;      //25/02/17
    double huro_tonyina = 0;
    double huro_carbasso = 0;

//  Nigiri
    double nigiri_salmo = 0;
    double nigiri_izumidai = 0;
    double nigiri_llagosti = 0;
    double nigiri_truita = 0;
    double nigiri_kiwi = 0;
    double nigiri_gamba = 0;
    double nigiri_shime = 0;
    double nigiri_tonyina = 0;
    double nigiri_carbasso = 0;
    double nigiri_unagi = 0;    //25/02/17

//  Daus
    double daus_salmo = 0;
    double daus_tonyina = 0;

// Extres
    double tartar = 0;
    double sashimi_salmo = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void classicF(int n) {
    	maki_classic += (n * 4);
        hoso_cogombre += (n*3);
        hoso_mango += (n*3);
        nigiri_salmo += (n*4);
        nigiri_llagosti += (n*2);
        //nigiri_izumidai += (n*2);
    }

    void californiaF(int n) {
        maki_california += (n*6);
        nigiri_salmo += (n*2);
        nigiri_llagosti += (n);
        hoso_salmo += (n*4);
        hoso_cogombre += (n*2);
    }

    void mediterraniF(int n) {
        maki_mediterrani += (n*4);
        maki_oli += (n*3);
        hoso_melo += (n*3);
        hoso_esparrec += (n*3);
        nigiri_llagosti += (n*2);
    }

    void rockF(int n) {
        maki_rock += (n*5);
        hoso_pollo += (n*3);
        hoso_mango += (n*4);
        nigiri_salmo += (n*4);
        //nigiri_izumidai += (n*2);
    }

    void especialF(int n) {
        hoso_carla += (n*4);
        hoso_duo += (n*3);
        huro_carbasso += (n*4);
        nigiri_truita += (n*2);
        nigiri_llagosti += (n);
        nigiri_salmo += (n);
    }

    void mixF(int n) {
        maki_california += (n*2);
        maki_classic += (n*2);
        hoso_salmo += (n*4);
        hoso_cogombre += (n*2);
        hoso_mango += (n*2);
        nigiri_salmo += (n*3);
        //nigiri_izumidai += (n);
        nigiri_llagosti += (n);
    }

    void tropicF(int n) {
        maki_tonyina += (n*3);
        maki_tropic += (n*3);
        hoso_mango += (n*2);
        hoso_cogombre += (n*2);
        hoso_melo_tropic += (n*2);
        nigiri_salmo += (n*2);
        nigiri_llagosti += n;
    }
    
    void nouF(int n) { // Rename to green
    	maki_pastanaga += (n*2);
    	maki_codony += (n*2);
    	hoso_cogombre += (n*2);
    	hoso_mango += (n*2); // Rename to nap
    	hoso_esparrec += (n*2);
    	nigiri_kiwi += n; // Rename to cogombre
        huro_platan += (n*2);
        huro_carbasso += (n*2);
    }
    
    void sushirollF(int n) {
    	maki_classic += (n*3);
    	huro_salmo += (n*2);
    	nigiri_salmo += (n*8);
    	nigiri_llagosti += (n*2);
    	//nigiri_izumidai += (n*2);
    }

    void rollboxF(int n) {
        maki_classic += (n*6);
        maki_tropic += (n*6);
        maki_oli += (n*6);
        maki_california += (n*6);
        hoso_esparrec += (n*6);
        hoso_mango += (n*6);
        hoso_salmo += (n*6);
        hoso_cogombre += (n*6);
        hoso_melo_tropic += (n*6);
        nigiri_salmo += (n*12);
        nigiri_llagosti += (n*6);
        //nigiri_izumidai += (n*6);
    }
    
    void makirollF(int n) {
    	maki_classic += (n*2); //
    	maki_california += n*2; //
    	maki_oli += 2*n; //
    	maki_pastanaga += 2*n;
    	maki_tropic += 2*n; //
        maki_tonyina += 2*n;
    }
    
    void duorollF(int n) {
    	nigiri_salmo += 4*n;
    	nigiri_llagosti += (n*4);
    	hoso_melo_tropic += (n*4);
    	hoso_mango += (n*4);
    	hoso_carla += (n*4);
    	huro_salmo += (n*4);
    	maki_california += (n*4);
    	maki_tropic += (n*4);
    	maki_classic += (n*4);
    }
    
    void atlanticF(int n) {
    	nigiri_salmo += (n*6);
    	nigiri_llagosti += (n*4);
    	maki_classic += (n*4);
    	maki_california += (n*4);
    	maki_mango += (n*4);
    	hoso_carla += (n*4);
    	hoso_fumat += (n*4);
        daus_tonyina += (n*6);
        sashimi_salmo += (n*6);
    }

    void gourmetF(int n) {
        nigiri_gamba += (n*2);
        nigiri_shime += (n*2);
        maki_tonyina_fresca += (n*4);
        hoso_foie += (n*4);
        hoso_carla += (n*2); // 15/01/16
        daus_salmo += (n*2);
        daus_tonyina += (n*2);
    }

    void blauF(int n) {
        uramaki_salmo_alvocat += (n*3);
        maki_tonyina_fresca += (n*3);
        nigiri_salmo += (n*3);
        nigiri_tonyina += (n*3);
    }

    void tramuntanaF(int n) {
        hoso_carla += (n*4);
        hoso_foie += (n*4);
        huro_siratcha += (n*4);
        nigiri_salmo += (n*2);
        nigiri_gamba += (n*2);
    }

    void duoSibaritaF(int n) {
        maki_tonyina_fresca += (n*4);
        hoso_carla += (n*4);
        huro_siratcha += (n*4);
        hoso_foie += (n*4);
        nigiri_salmo += (n*6);
        nigiri_gamba += (n*6);
        tartar += (n);
    }

    void festiuF(int n) {
        hoso_foie += (n*4);
        hoso_textures += (n*4);
        hoso_ikea += (n*4);
        nigiri_salmo += (n*2);
        nigiri_gamba += (n*2);
    }

    void duoFestiuF(int n) {
        hoso_foie += (n*6);
        hoso_textures += (n*6);
        hoso_ikea += (n*6);
        maki_tonyina_fresca += (n*6);
        nigiri_salmo += (n*6);
        nigiri_gamba += (n*6);
    }

    void duoGourmetF(int n) {
        nigiri_gamba += (n*4);
        nigiri_shime += (n*4);
        nigiri_salmo += (n*4);
        maki_tonyina_fresca += (n*4);
        hoso_foie += (n*8);
        hoso_carla += (n*4);
        daus_tonyina += (n*4);
        sashimi_salmo += (n*4);
    }

    void duoVegaF(int n) {
        maki_pastanaga += (n*4);
        maki_codony += (n*4);
        huro_platan += (n*4);
        huro_curry += (n*4);
        hoso_mango += (n*4);
        hoso_melo_tropic += (n*4);
        hoso_esparrec += (n*4);
        hoso_pollo += (n*4);
        nigiri_kiwi += (n*2);
        nigiri_carbasso += (n*2);
    }

    void tastF(int n) { // 31/03/17
        nigiri_gamba += (n*2);
        nigiri_unagi += (n*2);
        nigiri_shime += (n*2);
        huro_bacalla += (n*2);
        huro_tartar += (n*2);
        huro_tonyina += (n*2);
        maki_tonyina_fresca += (n*2);
    }

    void cremosF(int n) { // 31/03/17
        hoso_textures += (n*4);
        hoso_carla  += (n*4);
        maki_california  += (n*4);
        nigiri_salmo += (n*2);
        nigiri_llagosti += n;
    }

    void garbiF(int n) { // 17/02/18
        maki_california += n*3;
        maki_classic += n*3;
        hoso_salmo += n*6;
        nigiri_llagosti += n;
        nigiri_salmo += n*2;
    }

    public void mostraResultats(View view) {
    	Intent intent = new Intent(this, MostraResultatsActivity.class);
    	
    	EditText classicT = (EditText) findViewById(R.id.classic);
    	EditText californiaT = (EditText) findViewById(R.id.california);
    	EditText mediterraniT = (EditText) findViewById(R.id.mediterrani);
    	EditText rockT = (EditText) findViewById(R.id.rock);
    	EditText especialT = (EditText) findViewById(R.id.especial);
    	EditText mixT = (EditText) findViewById(R.id.mix);
    	EditText tropicT = (EditText) findViewById(R.id.tropic);
    	EditText nouT = (EditText) findViewById(R.id.nou);
    	EditText sushirollT = (EditText) findViewById(R.id.sushiroll);
    	EditText rollboxT = (EditText) findViewById(R.id.rollbox);
    	EditText makirollT = (EditText) findViewById(R.id.makiroll);
    	EditText duorollT = (EditText) findViewById(R.id.duoroll);
    	EditText atlanticT = (EditText) findViewById(R.id.atlantic);
        EditText gourmetT = (EditText) findViewById(R.id.gourmet);
        EditText blauT = (EditText) findViewById(R.id.blau);
        EditText tramuntanaT = (EditText) findViewById(R.id.tramuntana);
        EditText duoSibaritaT = (EditText) findViewById(R.id.duoSibarita);
        EditText festiuT = (EditText) findViewById(R.id.festiu);
        EditText duoFestiuT = (EditText) findViewById(R.id.duoFestiu);
        EditText duoGourmetT = (EditText) findViewById(R.id.duoGourmet);
        EditText duoVegaT = (EditText) findViewById(R.id.duoVega);
        EditText tastT = (EditText) findViewById(R.id.tast);
        EditText cremosT = (EditText) findViewById(R.id.cremos);
        EditText garbiT = (EditText) findViewById(R.id.garbi);

    	
    	int classic = Integer.parseInt(classicT.getText().toString());
    	int california = Integer.parseInt(californiaT.getText().toString());
    	int mediterrani = Integer.parseInt(mediterraniT.getText().toString());
    	int rock = Integer.parseInt(rockT.getText().toString());
    	int especial = Integer.parseInt(especialT.getText().toString());
    	int mix = Integer.parseInt(mixT.getText().toString());
    	int tropic = Integer.parseInt(tropicT.getText().toString());
    	int nou = Integer.parseInt(nouT.getText().toString());
    	int sushiroll = Integer.parseInt(sushirollT.getText().toString());
    	int makiroll = Integer.parseInt(makirollT.getText().toString());
    	int duoroll = Integer.parseInt(duorollT.getText().toString());
    	int rollbox = Integer.parseInt(rollboxT.getText().toString());
    	int atlantic = Integer.parseInt(atlanticT.getText().toString());
        int gourmet = Integer.parseInt(gourmetT.getText().toString());
        int blau = Integer.parseInt(blauT.getText().toString());
        int tramuntana = Integer.parseInt(tramuntanaT.getText().toString());
        int duoSibarita = Integer.parseInt(duoSibaritaT.getText().toString());
    	int festiu = Integer.parseInt(festiuT.getText().toString());
        int duoFestiu = Integer.parseInt(duoFestiuT.getText().toString());
        int duoGourmet = Integer.parseInt(duoGourmetT.getText().toString());
        int duoVega = Integer.parseInt(duoVegaT.getText().toString());
        int tast = Integer.parseInt(tastT.getText().toString());
        int cremos = Integer.parseInt(cremosT.getText().toString());
        int garbi = Integer.parseInt(garbiT.getText().toString());



        classicF(classic);
    	californiaF(california);
    	mediterraniF(mediterrani);
    	rockF(rock);
    	especialF(especial);
    	mixF(mix);
    	tropicF(tropic);
    	nouF(nou);
    	sushirollF(sushiroll);
    	makirollF(makiroll);
    	rollboxF(rollbox);
    	duorollF(duoroll);
    	atlanticF(atlantic);
        gourmetF(gourmet);
        blauF(blau);
        tramuntanaF(tramuntana);
        duoSibaritaF(duoSibarita);
        festiuF(festiu);
        duoFestiuF(duoFestiu);
        duoGourmetF(duoGourmet);
        duoVegaF(duoVega);
        tastF(tast);
        cremosF(cremos);
        garbiF(garbi);
    	
    	intent.putExtra("hoso_cogombre", hoso_cogombre);
    	intent.putExtra("hoso_mango", hoso_mango);
    	intent.putExtra("hoso_esparrec", hoso_esparrec);
    	intent.putExtra("hoso_salmo", hoso_salmo);
    	intent.putExtra("hoso_melo", hoso_melo);
    	intent.putExtra("hoso_pollo", hoso_pollo);
    	intent.putExtra("hoso_carla", hoso_carla);
    	intent.putExtra("hoso_fumat", hoso_fumat);
    	intent.putExtra("hoso_duo", hoso_duo);
    	intent.putExtra("hoso_melo_tropic", hoso_melo_tropic);
        intent.putExtra("hoso_foie", hoso_foie);
        intent.putExtra("hoso_ikea", hoso_ikea);
        intent.putExtra("hoso_textures", hoso_textures);

        intent.putExtra("huro_salmo", huro_salmo);
        intent.putExtra("huro_siratcha", huro_siratcha);
        intent.putExtra("huro_platan", huro_platan);
        intent.putExtra("huro_curry", huro_curry);
        intent.putExtra("huro_carbasso", huro_carbasso);

        intent.putExtra("maki_classic", maki_classic);
    	intent.putExtra("maki_california", maki_california);
    	intent.putExtra("maki_mediterrani", maki_mediterrani);
    	intent.putExtra("maki_oli", maki_oli);
    	intent.putExtra("maki_rock", maki_rock);
    	intent.putExtra("maki_tonyina", maki_tonyina);
    	intent.putExtra("maki_tropic", maki_tropic);
    	intent.putExtra("maki_nou", maki_nou);
    	intent.putExtra("maki_codony", maki_codony);
    	intent.putExtra("maki_pastanaga", maki_pastanaga);
        intent.putExtra("maki_mango", maki_mango);
        intent.putExtra("maki_tonyina_fresca", maki_tonyina_fresca);
        intent.putExtra("uramaki_salmo_alvocat", uramaki_salmo_alvocat);
        intent.putExtra("uromaki_bacalla", huro_bacalla);
        intent.putExtra("uromaki_tartar", huro_tartar);


        intent.putExtra("nigiri_salmo", nigiri_salmo);
    	intent.putExtra("nigiri_izumidai", nigiri_izumidai);
    	intent.putExtra("nigiri_llagosti", nigiri_llagosti);
    	intent.putExtra("nigiri_truita", nigiri_truita);
    	intent.putExtra("nigiri_kiwi", nigiri_kiwi);
        intent.putExtra("nigiri_gamba", nigiri_gamba);
        intent.putExtra("nigiri_shime", nigiri_shime);
        intent.putExtra("nigiri_tonyina", nigiri_tonyina);
        intent.putExtra("nigiri_carbasso", nigiri_carbasso);
        intent.putExtra("nigiri_unagi", nigiri_unagi);


        intent.putExtra("daus_salmo", daus_salmo);
        intent.putExtra("daus_tonyina", daus_tonyina);

        intent.putExtra("tartar", tartar);
        intent.putExtra("sashimi_salmo", sashimi_salmo);

// 		  Hoso
    	hoso_cogombre = 0;
        hoso_mango = 0;
        hoso_esparrec = 0;
        hoso_salmo = 0;
        hoso_melo = 0;
        hoso_pollo = 0;
        hoso_carla = 0;
        hoso_fumat = 0;
        hoso_duo = 0;
        hoso_melo_tropic = 0;
        hoso_foie = 0;
        hoso_ikea = 0;
        hoso_textures = 0;

//      Huro
        huro_siratcha = 0;
        huro_bacalla = 0;
        huro_tartar = 0;
        huro_carbasso = 0;
        
//      Maki
        maki_classic = 0;
        maki_california = 0;
        maki_mediterrani = 0;
        maki_oli = 0;
        maki_rock = 0;
        maki_especial = 0;
        maki_tonyina = 0;
        maki_tropic = 0;
        maki_codony = 0;
        maki_pastanaga = 0;
        huro_salmo = 0;
        maki_mango = 0;
        maki_tonyina_fresca = 0;
        uramaki_salmo_alvocat = 0;
        huro_platan = 0;
        huro_curry = 0;
        
//      Nigiri
        nigiri_salmo = 0;
        nigiri_izumidai = 0;
        nigiri_llagosti = 0;
        nigiri_truita = 0;
        nigiri_kiwi = 0;
        nigiri_gamba = 0;
        nigiri_shime = 0;
        nigiri_tonyina = 0;
        nigiri_carbasso = 0;
        nigiri_unagi = 0;

//      Extres
        daus_salmo = 0;
        daus_tonyina = 0;
        tartar = 0;
        sashimi_salmo = 0;

    	startActivity(intent);
    }
}
