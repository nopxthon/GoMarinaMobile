package com.nopx.gomarinamobile.dummyData

import com.nopx.gomarinamobile.R
import com.nopx.gomarinamobile.model.Produk
import java.math.BigDecimal

object dummyData {
    val dataProduk = listOf(
        Produk(
            id = 1,
            name = "Jambu",
            image = R.drawable.buahsatu,
            description = "Buah Jambu yang manis",
            price = BigDecimal("32000"),
            stok = 100
        )
    )
}