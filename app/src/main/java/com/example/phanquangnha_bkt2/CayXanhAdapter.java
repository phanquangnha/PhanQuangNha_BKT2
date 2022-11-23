package com.example.phanquangnha_bkt2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CayXanhAdapter extends BaseAdapter {
    Activity activity;
    List<CayXanh> cayXanhs;

    public CayXanhAdapter(Activity activity, List<CayXanh> cayXanhs) {
        this.activity = activity;
        this.cayXanhs = cayXanhs;
    }
    @Override
    public int getCount() {
        return cayXanhs.size();
    }

    @Override
    public Object getItem(int i) {
        return cayXanhs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.layoutitem, null);
        TextView tvName = (TextView) view.findViewById(R.id.tencasi);
        TextView tvNgheDanh = (TextView) view.findViewById(R.id.nghedanhcasi);
        TextView tvLuotThich = (TextView) view.findViewById(R.id.soluotthich);
        ImageView imageView = (ImageView) view.findViewById(R.id.hinhcasi);
        tvName.setText(cayXanhs.get(i).getTenKhoaHoc());
        tvNgheDanh.setText(cayXanhs.get(i).getTenThuongGoi()+" - "+cayXanhs.get(i).getDacTinh());
        tvLuotThich.setText(String.valueOf(""+cayXanhs.get(i).getMauLa()));
        imageView.setImageResource(cayXanhs.get(i).getHinhAnh());
        return view;
    }
}
