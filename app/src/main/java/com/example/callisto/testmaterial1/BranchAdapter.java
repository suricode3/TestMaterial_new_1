package com.example.callisto.testmaterial1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by callisto on 19/03/17.
 */

public class BranchAdapter extends RecyclerView.Adapter<BranchAdapter.BranchViewHolder>{

    LayoutInflater inflater;
    List<BranchItems> items;
    Context context;

    public BranchAdapter(Context context,List<BranchItems> items)
    {
        inflater=LayoutInflater.from(context);
        this.items=items;
        this.context=context;
    }

    public BranchAdapter(){}

    @Override
    public BranchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view=inflater.inflate(R.layout.row,parent,false);

        BranchViewHolder branchViewHolder=new BranchViewHolder(view);


        return branchViewHolder;
    }

    @Override
    public void onBindViewHolder(BranchViewHolder holder, int position) {

        holder.tvName.setText(items.get(position).getBranchName());
        holder.tvDate.setText(items.get(position).getWorkingDate());

        if(position%3==0)
        {
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryDark));
            holder.imageView.setImageResource(R.mipmap.utilities);
        }
    else
        {
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
            holder.imageView.setImageResource(R.mipmap.ic_launcher);
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class BranchItems{


        String branchName;
        String workingDate;

        public BranchItems(String branchName, String workingDate) {
            this.branchName = branchName;
            this.workingDate = workingDate;
        }

        public String getBranchName() {
            return branchName;
        }

        public void setBranchName(String branchName) {
            this.branchName = branchName;
        }

        public String getWorkingDate() {
            return workingDate;
        }

        public void setWorkingDate(String workingDate) {
            this.workingDate = workingDate;
        }
    }


    public   class BranchViewHolder extends RecyclerView.ViewHolder{

        TextView tvName;
        TextView tvDate;
        ImageView imageView;


        public BranchViewHolder(View view)
        {
            super(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context,"clicked"+getPosition(),Toast.LENGTH_SHORT).show();
            }
        });
                tvName=(TextView) view.findViewById(R.id.text1);
            tvDate=(TextView) view.findViewById(R.id.text2);
            imageView=(ImageView) view.findViewById(R.id.image1);


        }

    }
}
