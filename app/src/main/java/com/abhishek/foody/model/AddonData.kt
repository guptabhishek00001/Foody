package com.abhishek.foody.model

data class AddonData(
    val addon_cat_description: String,
    val addon_cat_name: String,
    val addon_id: Int,
    val addon_item_list: List<AddonItem>,
    val addon_uid: String,
    val can_select: Int,
    val required_custom: Int,
    val required_status: Int,
    val variant_id: Any,
    val variant_name: Any
)