package com.example.fooddelivery.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.Interface.ItemClickListner;
import com.example.fooddelivery.R;

public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtProductPriceSmall, txtProductPriceMedium, txtProductPriceLarge,
            txtProductQuantitySmall, txtProductQuantityMedium, txtProductQuantityLarge;
    private ItemClickListner itemClickListner;


    public CartViewHolder(View itemView)
    {
        super(itemView);

        txtProductName = itemView.findViewById(R.id.cart_product_name);
        txtProductPriceSmall = itemView.findViewById(R.id.cart_product_price_small);
        txtProductPriceMedium = itemView.findViewById(R.id.cart_product_price_medium);
        txtProductPriceLarge = itemView.findViewById(R.id.cart_product_price_large);
        txtProductQuantitySmall = itemView.findViewById(R.id.cart_product_quantity_small);
        txtProductQuantityMedium = itemView.findViewById(R.id.cart_product_quantity_medium);
        txtProductQuantityLarge = itemView.findViewById(R.id.cart_product_quantity_large);
    }

    @Override
    public void onClick(View view)
    {
        itemClickListner.onClick(view, getAdapterPosition(), false);
    }

    public void setItemClickListner(ItemClickListner itemClickListner)
    {
        this.itemClickListner = itemClickListner;
    }
}
