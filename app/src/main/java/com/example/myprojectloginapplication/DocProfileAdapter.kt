/*
package com.example.myprojectloginapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class DocProfileAdapter (var context: Context, var data:ArrayList<DoctorFormClass>): BaseAdapter() {

    private class ViewHolder(row: View?){
        var DoctorName: TextInputEditText
        var DoctorQualificaion: TextInputEditText
        var DoctorEmail: TextInputEditText
        var DoctorPhone: TextInputEditText
        var DoctorImage : ImageView

        init {
            this.DoctorName = row?.findViewById(R.id.NameField) as TextInputEditText
            this.DoctorQualificaion = row?.findViewById(R.id.QualificationsField) as TextInputEditText
            this.DoctorEmail = row?.findViewById(R.id.EmailField) as TextInputEditText
            this.DoctorPhone = row?.findViewById(R.id.PhoneField) as TextInputEditText
            this.DoctorImage = row?.findViewById(R.id.Doctor_Image) as ImageView
        }

    }
}
override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
    var view: View?
    var viewHolder: RecyclerView.ViewHolder
    if (convertView == null){
        var layout = LayoutInflater.from(context)
        if {
            DoctorPhone is Nephrology

            view = layout.inflate(R.layout.activity_nephrology_doctors, parent, false)
        }
        elseif{

            DoctorPhone is obsetrics
            view = layout.inflate(R.layout.activity_obsetrics_doctors, parent, false)

        }elseif{
            DoctorPhone is obygn
            view = layout.inflate(R.layout.activity_obygn_doctors, parent, false)

        }elseif{
            DoctorPhone is orthopedics
            view = layout.inflate(R.layout.activity_orthopedics_doctors, parent, false)

        }kelseif{
            DoctorPhone is paediatric
            view = layout.inflate(R.layout.activity_paediatric_doctors, parent, false)

        }elseif{
            DoctorPhone is dermertology
            view = layout.inflate(R.layout.activity_dermertology_doctors*, parent, false)

        }


        viewHolder = ViewHolder(view)
        view.tag = viewHolder
    }else{
        view = convertView
        viewHolder = view.tag as ViewHolder
    }
    var item:PresriptionClass = getItem(position) as PresriptionClass
    viewHolder.DoctorName.text = item.DocName
    viewHolder.DoctorQualificaion.text = item.DocQualifications
    viewHolder.DoctorEmail.text = item.RemarksField
    viewHolder.DoctorPhone.text = item.RemarksField
    viewHolder.DoctorImage.text = item.RemarksField
    Glide.with(context).load(item.image).into(viewHolder.mImage)

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

}*/
