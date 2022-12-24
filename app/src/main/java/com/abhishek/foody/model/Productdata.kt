package com.abhishek.foody.model

data class Productdata(
    val addon_data: List<AddonData>,
    val food_type: Int,
    val id: Int,
    val item_description: String,
    val item_limit: Int,
    val item_mrp: Int,
    val item_name: String,
    val item_sp: Int,
    val offer_end_time: Any,
    val offer_name: Any,
    val offer_percentage: String,
    val offer_status: Int,
    val primary_image: String,
    val stock_message: String,
    val stock_status: Int,
    val variant_add_status: Int,
    val variant_data: List<VariantData>
)