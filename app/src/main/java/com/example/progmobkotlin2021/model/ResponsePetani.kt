package com.example.progmobkotlin2021.model

import android.provider.ContactsContract
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.*

data class ResponsePetani(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class DataItem(

	@field:SerializedName("provinsi")
	var provinsi: String? = null,

	@field:SerializedName("nama")
	var nama: String? = null,

	@field:SerializedName("foto")
	var foto: String? = null,

	@field:SerializedName("kecamatan")
	var kecamatan: String? = null,

	@field:SerializedName("nama_istri")
	val namaIstri: String? = null,

	@field:SerializedName("id")
	var id: String? = null,

	@field:SerializedName("jumlah_lahan")
	var jumlahLahan: String? = null,

	@field:SerializedName("kabupaten")
	var kabupaten: String? = null,

	@field:SerializedName("kelurahan")
	var kelurahan: String? = null,

	@field:SerializedName("alamat")
	var alamat: String? = null
)

