package com.sushiroll.sushicalc;

import com.sushiroll.sushicalc.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostraResultatsActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultats);
        
        Intent intent = getIntent();
        
        double hoso_cogombreE = intent.getDoubleExtra("hoso_cogombre", -1);
        double hoso_mangoE = intent.getDoubleExtra("hoso_mango", -1);
        double hoso_esparrecE = intent.getDoubleExtra("hoso_esparrec", -1);
        double hoso_salmoE = intent.getDoubleExtra("hoso_salmo", -1);
        double hoso_meloE = intent.getDoubleExtra("hoso_melo", -1);
        double hoso_polloE = intent.getDoubleExtra("hoso_pollo", -1);
        double hoso_carlaE = intent.getDoubleExtra("hoso_carla", -1);
        double hoso_fumatE = intent.getDoubleExtra("hoso_fumat", -1);
        double hoso_duoE = intent.getDoubleExtra("hoso_duo", -1);
        double hoso_melo_tropicE = intent.getDoubleExtra("hoso_melo_tropic", -1);
        double hoso_foieE = intent.getDoubleExtra("hoso_foie", -1);
        double hoso_ikeaE = intent.getDoubleExtra("hoso_ikea", -1);
        double hoso_texturesE = intent.getDoubleExtra("hoso_textures", -1);

        double huro_siratchaE = intent.getDoubleExtra("huro_siratcha", -1);
        double huro_bacallaE = intent.getDoubleExtra("uromaki_bacalla", -1);
        double huro_tartarE = intent.getDoubleExtra("uromaki_tartar", -1);


        double maki_classicE = intent.getDoubleExtra("maki_classic", -1);
        double maki_californiaE = intent.getDoubleExtra("maki_california", -1);
        double maki_mediterraniE = intent.getDoubleExtra("maki_mediterrani", -1);
        double maki_oliE = intent.getDoubleExtra("maki_oli", -1);
        double maki_rockE = intent.getDoubleExtra("maki_rock", -1);
        double maki_tonyinaE = intent.getDoubleExtra("maki_tonyina", -1);
        double maki_tropicE = intent.getDoubleExtra("maki_tropic", -1);
        double maki_codonyE = intent.getDoubleExtra("maki_codony", -1);
        double maki_pastanagaE = intent.getDoubleExtra("maki_pastanaga", -1);
        double huro_salmoE = intent.getDoubleExtra("huro_salmo", -1);
        double maki_mangoE = intent.getDoubleExtra("maki_mango", -1);
        double maki_tonyina_frescaE = intent.getDoubleExtra("maki_tonyina_fresca", -1);
        double uramaki_salmo_alvocatE = intent.getDoubleExtra("uramaki_salmo_alvocat", -1);
        double huro_platanE = intent.getDoubleExtra("huro_platan", -1);
        double huro_curryE = intent.getDoubleExtra("huro_curry", -1);
        double huro_carbassoE = intent.getDoubleExtra("huro_carbasso", -1);
        
        double nigiri_salmoE = intent.getDoubleExtra("nigiri_salmo", -1);
        double nigiri_izumidaiE = intent.getDoubleExtra("nigiri_izumidai", -1);
        double nigiri_llagostiE = intent.getDoubleExtra("nigiri_llagosti", -1);
        double nigiri_truitaE = intent.getDoubleExtra("nigiri_truita", -1);
        double nigiri_kiwiE = intent.getDoubleExtra("nigiri_kiwi", -1);
        double nigiri_gambaE = intent.getDoubleExtra("nigiri_gamba", -1);
        double nigiri_shimeE = intent.getDoubleExtra("nigiri_shime", -1);
        double nigiri_tonyinaE = intent.getDoubleExtra("nigiri_tonyina", -1);
        double nigiri_carbassoE = intent.getDoubleExtra("nigiri_carbasso", -1);
        double nigiri_unagiE = intent.getDoubleExtra("nigiri_unagi", -1);

        double daus_salmoE = intent.getDoubleExtra("daus_salmo", -1);
        double daus_tonyinaE = intent.getDoubleExtra("daus_tonyina", -1);

        double tartarE = intent.getDoubleExtra("tartar", -1);
        double sashimi_salmoE = intent.getDoubleExtra("sashimi_salmo", -1);

        TextView hoso_cogombre = (TextView) findViewById(R.id.hoso_cogombre);
        hoso_cogombre.setText(""+hoso_cogombre.getText()+hoso_cogombreE/8);
        TextView hoso_mango = (TextView) findViewById(R.id.hoso_mango);
        hoso_mango.setText(""+hoso_mango.getText()+hoso_mangoE/8);
        TextView hoso_esparrec = (TextView) findViewById(R.id.hoso_esparrec);
        hoso_esparrec.setText(""+hoso_esparrec.getText()+hoso_esparrecE/8);
        TextView hoso_salmo = (TextView) findViewById(R.id.hoso_salmo);
        hoso_salmo.setText(""+hoso_salmo.getText()+hoso_salmoE/8);
        TextView hoso_melo = (TextView) findViewById(R.id.hoso_melo);
        hoso_melo.setText(""+hoso_melo.getText()+hoso_meloE/8);
        TextView hoso_pollo = (TextView) findViewById(R.id.hoso_pollo);
        hoso_pollo.setText(""+hoso_pollo.getText()+hoso_polloE/8);
        TextView hoso_carla = (TextView) findViewById(R.id.hoso_carla);
        hoso_carla.setText(""+hoso_carla.getText()+hoso_carlaE/8);
        TextView hoso_fumat = (TextView) findViewById(R.id.hoso_fumat);
        hoso_fumat.setText(""+hoso_fumat.getText()+hoso_fumatE/8);
        TextView hoso_duo = (TextView) findViewById(R.id.hoso_duo);
        hoso_duo.setText(""+hoso_duo.getText()+hoso_duoE/8);
        TextView hoso_melo_tropic = (TextView) findViewById(R.id.hoso_melo_tropic);
        hoso_melo_tropic.setText(""+hoso_melo_tropic.getText()+hoso_melo_tropicE/8);
        TextView hoso_foie = (TextView) findViewById(R.id.hoso_foie);
        hoso_foie.setText(""+hoso_foie.getText()+hoso_foieE/8);
        TextView hoso_ikea = (TextView) findViewById(R.id.hoso_ikea);
        hoso_ikea.setText(""+hoso_ikea.getText()+hoso_ikeaE/8);
        TextView hoso_textures = (TextView) findViewById(R.id.hoso_textures);
        hoso_textures.setText(""+hoso_textures.getText()+hoso_texturesE/8);

        TextView huro_siratcha = (TextView) findViewById(R.id.huro_siratcha);
        huro_siratcha.setText(""+huro_siratcha.getText()+huro_siratchaE/8);
        
        TextView maki_classic = (TextView) findViewById(R.id.maki_classic);
        maki_classic.setText(""+maki_classic.getText()+maki_classicE/8);
        TextView maki_california = (TextView) findViewById(R.id.maki_california);
        maki_california.setText(""+maki_california.getText()+maki_californiaE/8);
        TextView maki_mediterrani = (TextView) findViewById(R.id.maki_mediterrani);
        maki_mediterrani.setText(""+maki_mediterrani.getText()+maki_mediterraniE/8);
        TextView maki_oli = (TextView) findViewById(R.id.maki_oli);
        maki_oli.setText(""+maki_oli.getText()+maki_oliE/8);
        TextView maki_rock = (TextView) findViewById(R.id.maki_rock);
        maki_rock.setText(""+maki_rock.getText()+maki_rockE/8);
        TextView maki_tonyina = (TextView) findViewById(R.id.maki_tonyina);
        maki_tonyina.setText(""+maki_tonyina.getText()+maki_tonyinaE/8);
        TextView maki_tropic = (TextView) findViewById(R.id.maki_tropic);
        maki_tropic.setText(""+maki_tropic.getText()+maki_tropicE/8);
        TextView maki_codony = (TextView) findViewById(R.id.maki_codony);
        maki_codony.setText(""+maki_codony.getText()+maki_codonyE/8);
        TextView maki_pastanaga = (TextView) findViewById(R.id.maki_pastanaga);
        maki_pastanaga.setText(""+maki_pastanaga.getText()+maki_pastanagaE/8);
        TextView huro_salmo = (TextView) findViewById(R.id.huro_salmo);
        huro_salmo.setText(""+huro_salmo.getText()+huro_salmoE/8);
        TextView maki_mango = (TextView) findViewById(R.id.maki_mango);
        maki_mango.setText(""+maki_mango.getText()+maki_mangoE/8);
        TextView maki_tonyina_fresca = (TextView) findViewById(R.id.maki_tonyina_fresca);
        maki_tonyina_fresca.setText(""+maki_tonyina_fresca.getText()+maki_tonyina_frescaE/8);
        TextView uramaki_salmo_alvocat = (TextView) findViewById(R.id.uramaki_salmo_alvocat);
        uramaki_salmo_alvocat.setText(""+uramaki_salmo_alvocat.getText()+uramaki_salmo_alvocatE/8);
        TextView huro_platan = (TextView) findViewById(R.id.huro_platan);
        huro_platan.setText(""+huro_platan.getText()+huro_platanE/8);
        TextView huro_curry = (TextView) findViewById(R.id.huro_curry);
        huro_curry.setText(""+huro_curry.getText()+huro_curryE/8);
        TextView huro_bacalla = (TextView) findViewById(R.id.huro_bacalla);
        huro_bacalla.setText(""+huro_bacalla.getText()+huro_bacallaE/8);
        TextView huro_tartar = (TextView) findViewById(R.id.huro_tartar);
        huro_tartar.setText(""+huro_tartar.getText()+huro_tartarE/8);
        TextView huro_carbasso = (TextView) findViewById(R.id.huro_carbasso);
        huro_carbasso.setText(""+huro_carbasso.getText()+huro_carbassoE/8);

        TextView nigiri_salmo = (TextView) findViewById(R.id.nigiri_salmo);
        nigiri_salmo.setText(""+nigiri_salmo.getText()+nigiri_salmoE);
        TextView nigiri_izumidai = (TextView) findViewById(R.id.nigiri_izumidai);
        nigiri_izumidai.setText(""+nigiri_izumidai.getText()+nigiri_izumidaiE);
        TextView nigiri_llagosti = (TextView) findViewById(R.id.nigiri_llagosti);
        nigiri_llagosti.setText(""+nigiri_llagosti.getText()+nigiri_llagostiE);
        TextView nigiri_truita = (TextView) findViewById(R.id.nigiri_truita);
        nigiri_truita.setText(""+nigiri_truita.getText()+nigiri_truitaE);
        TextView nigiri_kiwi = (TextView) findViewById(R.id.nigiri_kiwi);
        nigiri_kiwi.setText(""+nigiri_kiwi.getText()+nigiri_kiwiE);
        TextView nigiri_gamba = (TextView) findViewById(R.id.nigiri_gamba);
        nigiri_gamba.setText(""+nigiri_gamba.getText()+nigiri_gambaE);
        TextView nigiri_shime = (TextView) findViewById(R.id.nigiri_shime);
        nigiri_shime.setText(""+nigiri_shime.getText()+nigiri_shimeE);
        TextView nigiri_tonyina = (TextView) findViewById(R.id.nigiri_tonyina);
        nigiri_tonyina.setText(""+nigiri_tonyina.getText()+nigiri_tonyinaE);
        TextView nigiri_carbasso = (TextView) findViewById(R.id.nigiri_carbasso);
        nigiri_carbasso.setText(""+nigiri_carbasso.getText()+nigiri_carbassoE);
        TextView nigiri_unagi = (TextView) findViewById(R.id.nigiri_unagi);
        nigiri_unagi.setText(""+nigiri_unagi.getText()+nigiri_unagiE);

        TextView daus_salmo = (TextView) findViewById(R.id.daus_salmo);
        daus_salmo.setText(""+daus_salmo.getText()+daus_salmoE);
        TextView daus_tonyina = (TextView) findViewById(R.id.daus_tonyina);
        daus_tonyina.setText(""+daus_tonyina.getText()+daus_tonyinaE);
        TextView tartar = (TextView) findViewById(R.id.tartar);
        tartar.setText(""+tartar.getText()+tartarE);
        TextView sashimi_salmo = (TextView) findViewById(R.id.sashimi_salmo);
        sashimi_salmo.setText(""+sashimi_salmo.getText()+sashimi_salmoE);
    }
}
