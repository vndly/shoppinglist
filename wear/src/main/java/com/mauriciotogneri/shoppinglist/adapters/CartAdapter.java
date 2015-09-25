package com.mauriciotogneri.shoppinglist.adapters;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.mauriciotogneri.common.api.CartElement;
import com.mauriciotogneri.shoppinglist.R;
import com.mauriciotogneri.shoppinglist.adapters.CartAdapter.CartViewHolder;

public class CartAdapter extends BaseAdapter<CartElement, CartViewHolder>
{
    public CartAdapter(Context context)
    {
        super(context);
    }

    @Override
    protected void fill(CartElement cartElement, CartViewHolder viewHolder)
    {
        viewHolder.name.setText(cartElement.name);

        // viewHolder.name.setPaintFlags(viewHolder.name.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
        // viewHolder.thumbnail.setImage(cartElement.getImage(), cartElement.isSelected());
        // viewHolder.selected.setChecked(cartElement.isSelected());
    }

    @Override
    protected CartViewHolder getViewHolder(View view)
    {
        return new CartViewHolder(view);
    }

    @Override
    protected int getLayoutId()
    {
        return R.layout.row_cart_item;
    }

    public void removeSelectedItems()
    {
        // TODO
    }

    public static class CartViewHolder extends BaseViewHolder<CartElement>
    {
        //public final CustomImageView thumbnail;
        public final TextView name;

        public CartViewHolder(View itemView)
        {
            super(itemView);

            this.name = (TextView) itemView.findViewById(R.id.product_name);
        }
    }
}