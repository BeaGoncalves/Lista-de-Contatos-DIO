package br.com.estudos.contatobootcamp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatoAdapter(
    val contatoList : ArrayList<Contato>
) : RecyclerView.Adapter<ContatoViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder =
        ContatoViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.contato_item, parent, false))

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
            holder.onBindItem(contatoList[position])
    }

    override fun getItemCount(): Int = contatoList.size

}

class ContatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    fun onBindItem(contato: Contato) {
        val nome = itemView.findViewById(R.id.contato_nome_item) as TextView
        val telefone = itemView.findViewById(R.id.contato_telefone_item) as TextView

        nome.text = contato.nome
        telefone.text = contato.telefone
    }
}