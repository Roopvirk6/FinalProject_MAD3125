package com.example.finalproject_mad3125.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_mad3125.Customer;
import com.example.finalproject_mad3125.CustomerListActivity;
import com.example.finalproject_mad3125.R;

import java.util.ArrayList;

public class CustomerListAdapter extends RecyclerView.Adapter<CustomerListAdapter.CountryViewHolder>
    {
        private ArrayList<Customer> placeList;
        public CustomerListAdapter(ArrayList<Customer> placeList)
        {
            this.placeList = placeList;
        }
        @NonNull
        @Override
        public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.demo_row,parent,false);
            CountryViewHolder mCountryViewHolder = new CountryViewHolder(mView);
            return mCountryViewHolder;
        }
        @Override
        public void onBindViewHolder(@NonNull CountryViewHolder holder, final int position) {
            Customer mCountry = this.placeList.get(position);
            holder.txtname.setText(mCountry.getPlaceName());
            holder.imgflag.setImageResource(mCountry.getPlaceImage());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Customer customer = placeList.get(position);
                    Intent iIntent = new Intent(v.getContext(), CustomerListActivity.class);
                    iIntent.putExtra("Detail", customer);
                      v.getContext().startActivity(iIntent);

                }

            });
        }
        @Override
        public int getItemCount() {
            return this.placeList.size();
        }
        public class CountryViewHolder extends RecyclerView.ViewHolder {
            TextView txtname;
            ImageView imgflag;
            public CountryViewHolder(@NonNull View itemView) {
                super(itemView);
                txtname = itemView.findViewById(R.id.txtCustomerName);
                imgflag = itemView.findViewById(R.id.imageView3);
            }
        }
    }

