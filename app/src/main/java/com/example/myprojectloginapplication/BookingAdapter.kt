package com.example.myprojectloginapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class BookingAdapter(var context: Context, var data:ArrayList<User>): BaseAdapter() {


    private class ViewHolder(row: View?){
        var UserName: TextView
        var UserEmail: TextView
        var UserPhoneNumber: TextView
        init {
            this.UserName = row?.findViewById(R.id.NameEt) as TextView
            this.UserEmail = row?.findViewById(R.id.EmailEt) as TextView
            this.UserPhoneNumber = row?.findViewById(R.id.PhoneEt) as TextView

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)

            view = layout.inflate(R.layout.activity_booking_doc_view,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:User = getItem(position) as User
        viewHolder.UserName.text = item.edtUserName
        viewHolder.UserEmail.text = item.edtUserEmail
        viewHolder.UserPhoneNumber.text = item.edtUserPhoneNumber

        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }





}