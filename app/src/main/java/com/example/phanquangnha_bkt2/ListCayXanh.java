package com.example.phanquangnha_bkt2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListCayXanh extends AppCompatActivity {

    private ListView listView;
    ArrayList<CayXanh> items = new ArrayList<>();
    CayXanhAdapter adapter;
    Boolean kt=false;
    int j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cay_xanh);
        listView = (ListView) findViewById(R.id.lvCayXanh);
        items.add(new CayXanh("Paracetamol","Acetaminophen", "loại thuốc giảm đau hiệu quả thay thế cho Aspirin, tuy nhiên Paracetamol lại không có tác dụng điều trị viêm như Aspirin.","500mg",R.drawable.thuoc2)) ;
        items.add(new CayXanh("Floctafenine","nefopam medisol", "Làm giảm các cơn đau cấp và mạn tính từ nhẹ đến trung bình như đau đầu, đau răng, đau cơ, đau do co thắt cơ, đau bụng kinh,","300mg",R.drawable.thuoc1)) ;

        adapter = new CayXanhAdapter(ListCayXanh.this,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListCayXanh.this,DetailCayXanh.class);
                intent.putExtra("Ten",items.get(i).getTenKhoaHoc()+"\n"+items.get(i).getTenThuongGoi());
                intent.putExtra("MoTa",items.get(i).getDacTinh());
                startActivity(intent);
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                kt=true;
                Xacnhanxoa(i);
                return false;
            }
        });
    }
    public void Xacnhanxoa(final int pos){
        AlertDialog.Builder alertDiaLog = new AlertDialog.Builder(ListCayXanh.this);
        alertDiaLog.setTitle("Thông báo");
        alertDiaLog.setIcon(R.mipmap.ic_launcher);
        alertDiaLog.setMessage("Bạn có muốn xóa");
        alertDiaLog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                items.remove(pos);
                adapter.notifyDataSetChanged();
            }
        });
        alertDiaLog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        alertDiaLog.show();
    }
}
