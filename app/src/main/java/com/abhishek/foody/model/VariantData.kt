package com.abhishek.foody.model

data class VariantData(
    val variant_addon_data: List<VariantAddonData>,
    val variant_addon_status: Int,
    val variant_id: Int,
    val variant_mrp: Int,
    val variant_name: String,
    val variant_sp: Int,
    val variant_status: Int,
    val variant_uid: String
)