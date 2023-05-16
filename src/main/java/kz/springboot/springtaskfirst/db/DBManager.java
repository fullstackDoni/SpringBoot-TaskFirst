package kz.springboot.springtaskfirst.db;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Items> items = new ArrayList<>();
    private static Long id = 5L;

    static {
        items.add(new Items(1L,"Asus TUF Gaming F17","https://static.shop.kz/upload/resize_cache/iblock/880/oudcm88uwk7li0b2axitya7gjyofnxbs/450_450_1/169875_1_min.jpg","Amd Ryzen 7,RAM 16 GB,512 SSD",499.990));
        items.add(new Items(2L,"Hp Victus 16","https://static.shop.kz/upload/resize_cache/iblock/47f/dlpe94mwdr7h8irha73623khbp3kz9b9/450_450_1/169888_01.jpg","Amd Ryzen 5,RAM 16 GB,512 SSD",509.990));
        items.add(new Items(3L,"Lenovo Legion 5 Pro 16","https://static.shop.kz/upload/resize_cache/iblock/ac9/5zba0l7jg3euwq3stq3ju14ece57lr5b/450_450_1/169750x1.jpg","Amd Ryzen 5,RAM 16 GB,512 SSD",589.990));
        items.add(new Items(4L,"Hp 15","https://static.shop.kz/upload/resize_cache/iblock/fc9/ii6vtsror2ngxtn0vyob20dek25qnofr/450_450_1/169965x1.jpg","Amd Ryzen 5,RAM 8 GB,512 SSD",269.990));

    }
    public static ArrayList<Items> getItems(){
        return items;
    }
    public static void AddItem(Items item){
        item.setId(id);
        id++;
        items.add(item);
    }
}
