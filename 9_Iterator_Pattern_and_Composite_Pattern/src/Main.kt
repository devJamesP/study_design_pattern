import composite.Menu
import composite.MenuComponent
import composite.MenuItem
import composite.Waitress


// iterator
//fun main() {
//    val menuList = listOf(PancakeHouseMenu(), DinerMenu(), CafeMenu())
//    val w = Waitress(menuList)
//    w.printMenu()
//}

// composite
fun main() {
    val pancakeHouseMenu: MenuComponent = Menu("팬케이크 하우스 메뉴", "아침 메뉴")
    val dinerMenu: MenuComponent = Menu("객체마을 식당 메뉴", "점심 메뉴")
    val cafeMenu: MenuComponent = Menu("카페 메뉴", "저녁 메뉴")
    val dessertMenu: MenuComponent = Menu("디저트 메뉴", "디저트를 즐겨 보세요!")

    val allMenus: MenuComponent = Menu("전체 메뉴", "전체 메뉴")

    allMenus.add(pancakeHouseMenu)
    pancakeHouseMenu.apply {
        add(MenuItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크", true, 2.99))
        add(MenuItem("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 곁들여진 팬케이크", false, 2.99))
        add(MenuItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49))
        add(MenuItem("와플", "스크램블 에그와 토스트가 곁들여진 팬케이크", true, 3.59))
    }

    allMenus.add(dinerMenu)
    dinerMenu.apply {
        add(MenuItem("채식주의자용 BLT", "통밀 위에 (식물성)베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99))
        add(MenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99))
        add(MenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29))
        add(MenuItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05))
    }

    allMenus.add(cafeMenu)
    cafeMenu.apply {
        add(MenuItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자튀김이 첨가된 베지 버거", true, 3.99))
        add(MenuItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69))
        add(MenuItem("베리또", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 베리또", true, 4.29))
    }

    dinerMenu.add(dessertMenu)

    dessertMenu.apply {
        add(MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이", true, 1.59))
    }


    val w: Waitress = Waitress(allMenus)

    w.printVegetarianMenu()
}