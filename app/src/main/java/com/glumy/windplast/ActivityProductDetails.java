package com.glumy.windplast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ActivityProductDetails extends AppCompatActivity {

    private ImageView mainImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        initComponent();

        Bundle recivedImg = getIntent().getExtras();
        assert recivedImg != null;
        int m_id = recivedImg.getInt("image");
        mainImage.setImageResource(m_id);

    }
    public void onClick(View view){
        Intent i;
        switch (view.getId()){
            case R.id.btn_1:
                super.onBackPressed();
                break;
            case R.id.btn_2:
                Toast.makeText(this, "Включается редактирование всех размеров", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_3:
                Toast.makeText(this, "Добавлен в заказ", Toast.LENGTH_LONG).show();
                break;

        }
    }

    private void initComponent(){
        mainImage = findViewById(R.id.iv_product_details);
    }

//    @Override
//    public void onBackPressed() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Подтвердите действие");
//        builder.setMessage("Вы уверены что хотите выйти из приложения?");
//        builder.setPositiveButton("ДА", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogInterface.dismiss();
//                finish();
//            }
//        });
//        builder.setNegativeButton("НЕТ", null);
//        builder.show();
//    }

//    private void refreshCartButton() {
//        Cart c = db.getCart(product_id);
//        flag_cart = (c != null);
//        if (flag_cart) {
//            lyt_add_cart.setBackgroundColor(getResources().getColor(R.color.colorGreen));
//            tv_add_cart.setText(R.string.bt_remove_cart);
//            ic_add_cart.setImageResource(R.drawable.ic_remove);
//        } else {
//            lyt_add_cart.setBackgroundColor(getResources().getColor(R.color.colorRemoveCart));
//            tv_add_cart.setText(R.string.bt_add_cart);
//            ic_add_cart.setImageResource(R.drawable.ic_add);
//        }
//    }
}