package com.example.fooddelivery.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.example.fooddelivery.Interface.ItemClickListner;
import com.example.fooddelivery.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductName, txtProductPriceSmall, txtProductPriceMedium, txtProductPriceLarge;
    public ImageView imageView;
    public ItemClickListner listner;


    public ProductViewHolder(View itemView)
    {
        super(itemView);


        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        txtProductName = (TextView) itemView.findViewById(R.id.product_name);
        txtProductPriceSmall = (TextView) itemView.findViewById(R.id.product_price_small);
        txtProductPriceMedium = (TextView) itemView.findViewById(R.id.product_price_medium);
        txtProductPriceLarge = (TextView) itemView.findViewById(R.id.product_price_large);
    }

    public void setItemClickListner(ItemClickListner listner)
    {
        this.listner = listner;
    }

    @Override
    public void onClick(View view)
    {
        listner.onClick(view, getAdapterPosition(), false);
    }
}
