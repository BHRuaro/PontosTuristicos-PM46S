package br.edu.pontosturisticos.entity

data class Cadastro(var _id: Int, var nome: String, var descricao: String, var latitude: Double, var longitude: Double, var imagem: ByteArray? = null)