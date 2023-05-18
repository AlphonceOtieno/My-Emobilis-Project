package com.example.myprojectloginapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class PateintPrescriptionAdapter (var context: Context, var data:ArrayList<PresriptionClass>): BaseAdapter(){

        private class ViewHolder(row: View?){
            var TabletField: TextInputEditText
            var DoseField: TextInputEditText
            var RemarksField: TextInputEditText
            init {
                this.TabletField = row?.findViewById(R.id.TabletsET) as TextInputEditText
                this.DoseField = row?.findViewById(R.id.DoseET) as TextInputEditText
                this.RemarksField = row?.findViewById(R.id.RemarksET) as TextInputEditText

            }
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var view: View?
            var viewHolder:ViewHolder
            if (convertView == null){
                var layout = LayoutInflater.from(context)

                view = layout.inflate(R.layout.patient_prescription_layout,parent,false)
                viewHolder = ViewHolder(view)
                view.tag = viewHolder
            }else{
                view = convertView
                viewHolder = view.tag as ViewHolder
            }
            var item:PresriptionClass = getItem(position) as PresriptionClass
//            viewHolder.TabletField.text = item.Tablets
//            viewHolder.DoseField.text = item.Dose
//            viewHolder.RemarksField.text = item.Remarks

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







