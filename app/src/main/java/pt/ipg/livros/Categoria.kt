package pt.ipg.livros

import android.content.ContentValues

data class Categoria(var id: Long, var nome: String) {
  fun toContentValies() : ContentValues{
      val valores = ContentValues()

      valores.put(TabelaBDCategorias.CAMPO_NOME, nome)

      return valores
  }
}