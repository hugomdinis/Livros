package pt.ipg.livros

import android.content.ContentValues

data class Livros (
    var id: Long,
    var titulo: String,
    var autores: String,
    var categoriaId: Long
        ) {
    fun toContentValies() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaBDLivros.CAMPO_TITULO, titulo)
        valores.put(TabelaBDLivros.CAMPO_AUTOR, autores)
        valores.put(TabelaBDLivros.CAMPO_CATEGORIA_ID, categoriaId)

        return valores
    }
}