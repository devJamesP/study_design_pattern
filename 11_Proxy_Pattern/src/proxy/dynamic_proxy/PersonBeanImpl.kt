package proxy.dynamic_proxy

class PersonBeanImpl: PersonBean {
    private var ratingCount = 0
    private var _name: String = ""
    val name :String get() = _name

    private var _gender: String = ""
    val gender: String get() = _gender

    private var _interests: Int = 0
    val interests: Int get() = _interests

    private var _rating: Int = 0
    val rating : Int get() = if (ratingCount == 0) 0 else _rating / ratingCount

    override fun setName(name: String) {
        _name = name
    }

    override fun setGender(gender: String) {
        _gender = gender
    }

    override fun setInterests(interests: Int) {
        _interests = interests
    }

    override fun setHotOrNotRating(rating: Int) {
        _rating = rating
        ++ratingCount
    }
}