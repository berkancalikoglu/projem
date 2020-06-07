package com.berkancalikoglu.projem.model

import com.google.gson.annotations.SerializedName

data class Otel(
@SerializedName("name")
val countryName: String?,
@SerializedName("region")
val countryRegion: String?,
@SerializedName("capital")
val countryCapital: String?,
@SerializedName("currency")
val countryCurrency: String?,
@SerializedName("language")
val countryLanguage: String?,
@SerializedName("flag")
val imageUrl: String?) {
}
/*

@SerializedName("errors")
val errors: Any,
@SerializedName("message")
val message: Any,
@SerializedName("responseCode")
val responseCode: Int,
@SerializedName("result")
val result: Result
) {
data class Result(
@SerializedName("filters")
val filters: Filters,
@SerializedName("offers")
val offers: Offers,
@SerializedName("requestId")
val requestId: String,
@SerializedName("sortingMethods")
val sortingMethods: List<SortingMethod>
) {
data class Filters(
@SerializedName("center_point_distance")
val centerPointDistance: List<CenterPointDistance>,
@SerializedName("children")
val children: List<Children>,
@SerializedName("concept")
val concept: List<Concept>,
@SerializedName("facility")
val facility: List<Facility>,
@SerializedName("hotel_chain")
val hotelChain: List<Any>,
@SerializedName("price")
val price: Price,
@SerializedName("region")
val region: List<Region>,
@SerializedName("reservation_policy")
val reservationPolicy: List<ReservationPolicy>,
@SerializedName("score")
val score: List<Score>,
@SerializedName("suitability")
val suitability: List<Suitability>
) {
data class CenterPointDistance(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Boolean
)

data class Children(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Boolean
)

data class Concept(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Boolean
)

data class Facility(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Boolean
)

data class Price(
@SerializedName("max")
val max: Max,
@SerializedName("min")
val min: Min
) {
data class Max(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Any
)

data class Min(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Any
)
}

data class Region(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Boolean
)

data class ReservationPolicy(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Boolean
)

data class Score(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Boolean
)

data class Suitability(
@SerializedName("code")
val code: String,
@SerializedName("count")
val count: Int,
@SerializedName("name")
val name: String,
@SerializedName("position")
val position: Int,
@SerializedName("type")
val type: String,
@SerializedName("value")
val value: Boolean
)
}

data class Offers(
@SerializedName("availableCount")
val availableCount: Int,
@SerializedName("hotels")
val hotels: List<Hotel>,
@SerializedName("totalCount")
val totalCount: Int
) {
data class Hotel(
@SerializedName("cached")
val cached: Boolean,
@SerializedName("details")
val details: Details,
@SerializedName("df")
val df: Boolean,
@SerializedName("fc")
val fc: Boolean,
@SerializedName("id")
val id: Int,
@SerializedName("rooms")
val rooms: List<Room>
) {
data class Details(
@SerializedName("address")
val address: Address,
@SerializedName("checkInTime")
val checkInTime: Any,
@SerializedName("checkOutTime")
val checkOutTime: Any,
@SerializedName("cityCenterPointDistance")
val cityCenterPointDistance: Int,
@SerializedName("cityCenterPointDistanceName")
val cityCenterPointDistanceName: String,
@SerializedName("coordinate")
val coordinate: Coordinate,
@SerializedName("description")
val description: String,
@SerializedName("domestic")
val domestic: Boolean,
@SerializedName("extra")
val extra: Extra,
@SerializedName("facilitiesGroup")
val facilitiesGroup: List<Any>,
@SerializedName("hotelConcept")
val hotelConcept: List<Any>,
@SerializedName("hotelInfoDescription")
val hotelInfoDescription: Any,
@SerializedName("id")
val id: Any,
@SerializedName("images")
val images: List<Any>,
@SerializedName("name")
val name: String,
@SerializedName("nearByHotels")
val nearByHotels: Any,
@SerializedName("reviewScore")
val reviewScore: Double,
@SerializedName("reviewScoreLocalized")
val reviewScoreLocalized: String,
@SerializedName("reviews")
val reviews: List<Any>,
@SerializedName("reviewsTotalCount")
val reviewsTotalCount: Any,
@SerializedName("slug")
val slug: String,
@SerializedName("starRating")
val starRating: Int,
@SerializedName("suitabilities")
val suitabilities: List<Suitability>,
@SerializedName("tripAdvisorReviewCount")
val tripAdvisorReviewCount: Any,
@SerializedName("tripAdvisorScore")
val tripAdvisorScore: Any,
@SerializedName("tripAdvisorScoreLocalize")
val tripAdvisorScoreLocalize: Any
) {
data class Address(
@SerializedName("address")
val address: String,
@SerializedName("city")
val city: City,
@SerializedName("country")
val country: Country,
@SerializedName("countryCode")
val countryCode: String,
@SerializedName("town")
val town: Town,
@SerializedName("zipCode")
val zipCode: Any
) {
data class City(
@SerializedName("id")
val id: Any,
@SerializedName("name")
val name: String
)

data class Country(
@SerializedName("code")
val code: String,
@SerializedName("name")
val name: String
)

data class Town(
@SerializedName("id")
val id: Any,
@SerializedName("name")
val name: String
)
}

data class Coordinate(
@SerializedName("latitude")
val latitude: Double,
@SerializedName("longitude")
val longitude: Double
)

data class Extra(
@SerializedName("image_count")
val imageCount: Int,
@SerializedName("thumbnailImage")
val thumbnailImage: String
)

data class Suitability(
@SerializedName("code")
val code: String,
@SerializedName("description")
val description: Any,
@SerializedName("name")
val name: String
)
}

data class Room(
@SerializedName("alerts")
val alerts: List<Any>,
@SerializedName("description")
val description: Any,
@SerializedName("facilities")
val facilities: List<Any>,
@SerializedName("images")
val images: List<Any>,
@SerializedName("information")
val information: List<Any>,
@SerializedName("offers")
val offers: List<Offer>,
@SerializedName("reference")
val reference: String,
@SerializedName("type")
val type: Type
) {
data class Offer(
@SerializedName("alerts")
val alerts: List<Any>,
@SerializedName("allotment")
val allotment: Int,
@SerializedName("buttonMessages")
val buttonMessages: List<Any>,
@SerializedName("cancellationRules")
val cancellationRules: List<String>,
@SerializedName("concept")
val concept: Concept,
@SerializedName("discountFrom")
val discountFrom: Double,
@SerializedName("discountTags")
val discountTags: List<DiscountTag>,
@SerializedName("displayedCurrency")
val displayedCurrency: String,
@SerializedName("freeChildAgeHotelDetail")
val freeChildAgeHotelDetail: List<String>,
@SerializedName("freeChildAgeRange")
val freeChildAgeRange: Any,
@SerializedName("guest")
val guest: Guest,
@SerializedName("hasCancellationRule")
val hasCancellationRule: Boolean,
@SerializedName("hash")
val hash: String,
@SerializedName("information")
val information: List<String>,
@SerializedName("isCheapestOffer")
val isCheapestOffer: Boolean,
@SerializedName("isRefundable")
val isRefundable: Boolean,
@SerializedName("isSaleable")
val isSaleable: Boolean,
@SerializedName("needsCheck")
val needsCheck: Boolean,
@SerializedName("needsCheckBeforeBooking")
val needsCheckBeforeBooking: Boolean,
@SerializedName("offerType")
val offerType: String,
@SerializedName("price")
val price: Double,
@SerializedName("provider")
val provider: Int,
@SerializedName("refundableExpireDate")
val refundableExpireDate: RefundableExpireDate,
@SerializedName("roomClass")
val roomClass: RoomClass,
@SerializedName("sourceOfferType")
val sourceOfferType: String
) {
data class Concept(
@SerializedName("code")
val code: String,
@SerializedName("conceptIcon")
val conceptIcon: String,
@SerializedName("conceptIconColorCode")
val conceptIconColorCode: String,
@SerializedName("description")
val description: String,
@SerializedName("parentCode")
val parentCode: Any
)

data class DiscountTag(
@SerializedName("amount")
val amount: Double,
@SerializedName("discountString")
val discountString: String,
@SerializedName("label")
val label: String,
@SerializedName("tag")
val tag: String
)

data class Guest(
@SerializedName("adults")
val adults: Int,
@SerializedName("children")
val children: Int
)

data class RefundableExpireDate(
@SerializedName("date")
val date: String,
@SerializedName("timezone")
val timezone: String,
@SerializedName("timezone_type")
val timezoneType: Int
)

data class RoomClass(
@SerializedName("code")
val code: String,
@SerializedName("description")
val description: String,
@SerializedName("offer")
val offer: Boolean,
@SerializedName("package")
val packageX: Boolean,
@SerializedName("promotion")
val promotion: Boolean,
@SerializedName("refundable")
val refundable: Boolean
)
}

data class Type(
@SerializedName("characteristicCode")
val characteristicCode: String,
@SerializedName("id")
val id: Any,
@SerializedName("name")
val name: String,
@SerializedName("typeCode")
val typeCode: String
)
}
}
}

data class SortingMethod(
@SerializedName("default")
val default: Boolean,
@SerializedName("text")
val text: String,
@SerializedName("value")
val value: Int
)
}
}

 */

