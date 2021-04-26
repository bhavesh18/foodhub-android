package com.example.foodhub;

import android.content.Context;

import com.example.foodhub.model.FoodData;
import com.example.foodhub.model.RestaurantData;

import java.util.ArrayList;

public class Constants {

    public static ArrayList<FoodData> leCircue(Context context) {
        ArrayList<FoodData> foodList = new ArrayList<>();
        FoodData foodData = new FoodData();
        foodData.setImg(R.drawable.redsauce);
        foodData.setName("Red Sauce Pasta");
        foodData.setCalories("260");
        foodData.setPrice(12.50f);
        foodData.setDetails("Pasta is a type of food typically made from an unleavened dough of wheat flour mixed with water or eggs, and formed into sheets or other shapes, then cooked by boiling or baking.");
        foodList.add(foodData);

        FoodData foodData1 = new FoodData();
        foodData1.setImg(R.drawable.pizza2);
        foodData1.setName("Pizza");
        foodData1.setCalories("1200");
        foodData1.setPrice(15.99f);
        foodData1.setDetails("Pizza is a type of food typically made from an unleavened dough of wheat flour mixed with water or eggs, and formed into sheets or other shapes, then cooked by boiling or baking.");
        foodList.add(foodData1);

        FoodData foodData2 = new FoodData();
        foodData2.setImg(R.drawable.white_sauce_pasta);
        foodData2.setName("White Sauce Pasta");
        foodData2.setCalories("400");
        foodData2.setPrice(4.97f);
        foodData2.setDetails("This white sauce is also known as béchamel sauce and has it's origin in French cuisine. Classic béchamel sauce is made with butter, flour and milk. For this pasta, I add cream and this pasta is super cheesy and creamy, just like my family likes it. So this sauce is kind of a mix between alfredo and béchamel.");
        foodList.add(foodData2);

        FoodData foodData3 = new FoodData();
        foodData3.setImg(R.drawable.noodles);
        foodData3.setName("Noodles");
        foodData3.setCalories("219");
        foodData3.setPrice(5.25f);
        foodData3.setDetails("Noodles are a type of food made from unleavened dough which is rolled flat and cut, stretched or extruded, into long strips or strings.");
        foodList.add(foodData3);

        FoodData foodData4 = new FoodData();
        foodData4.setImg(R.drawable.sandwich);
        foodData4.setName("Sandwich");
        foodData4.setCalories("266");
        foodData4.setPrice(4.29f);
        foodData4.setDetails("A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type.");
        foodList.add(foodData4);

        FoodData foodData5 = new FoodData();
        foodData5.setImg(R.drawable.sushi);
        foodData5.setName("Sushi");
        foodData5.setCalories("250");
        foodData5.setPrice(12.99f);
        foodData5.setDetails("Sushi (すし, 寿司, 鮨, pronounced [sɯɕiꜜ] or [sɯꜜɕi]) is a traditional Japanese dish of prepared vinegared rice (鮨飯, sushi-meshi), usually with some sugar and salt, accompanying a variety of ingredients (ネタ, neta), such as seafood, often raw, and vegetables.");
        foodList.add(foodData5);

        FoodData foodData6 = new FoodData();
        foodData6.setImg(R.drawable.hotdog);
        foodData6.setName("Hot dog");
        foodData6.setCalories("290");
        foodData6.setPrice(25f);
        foodData6.setDetails("A hot dog (also spelled hotdog) is a food consisting of a grilled or steamed sausage served in the slit of a partially sliced bun. It can also refer to the sausage itself. The sausage used is a wiener (Vienna sausage) or a frankfurter (Frankfurter Würstchen, also just called frank).");
        foodList.add(foodData6);

        FoodData foodData7 = new FoodData();
        foodData7.setImg(R.drawable.tomato_and_basil_bruschetta);
        foodData7.setName("Tomato and Basil bruschetta");
        foodData7.setCalories("17");
        foodData7.setPrice(70f);
        foodData7.setDetails("Tomato bruschetta is one of the best Italian appetizers. Its recipe includes just bread, tomato, olive oil, basil and garlic: their tastes and colors bring to the mind the Classical Age, a time of long past when Roman merchant ships crossed the Mediterranean sea, carrying jars full of wheat and wine.");
        foodList.add(foodData7);

        FoodData foodData8 = new FoodData();
        foodData8.setImg(R.drawable.poutine);
        foodData8.setName("Poutine");
        foodData8.setCalories("513");
        foodData8.setPrice(3.99f);
        foodData8.setDetails("Poutine, a Canadian dish made of french fries topped with cheese curds and gravy. It first appeared in 1950s rural Québec snack bars and was widely popularized across Canada and beyond in the 1990s. It has become a symbol of Québécois and Canadian cuisine and culture.");
        foodList.add(foodData8);

        FoodData foodData9 = new FoodData();
        foodData9.setImg(R.drawable.bannock);
        foodData9.setName("Bannock");
        foodData9.setCalories("309");
        foodData9.setPrice(15f);
        foodData9.setDetails("Delicious and versatile, bannock is a simple bread that was once a key staple in the diets of Canada’s Aboriginal people. Modern takes on bannock include baked versions (which are heavy/dense) and fried versions (which are crispy and fluffy on the inside). In recent years, bannock has seen a surge in popularity, with new twists and variations popping up in bakeries and cafes nationwide – you have to try it!");
        foodList.add(foodData9);

        FoodData foodData10 = new FoodData();
        foodData10.setImg(R.drawable.nova_scotian_lobster_rolls);
        foodData10.setName("Nova Scotian Lobster Rolls");
        foodData10.setCalories("600");
        foodData10.setPrice(20f);
        foodData10.setDetails("Canada is a massive country, with spectacular seafood from coast to coast. Not-to-be-missed experiences include Atlantic and Pacific salmon, smoked salmon, arctic char, and of course, East Coast lobsters. Nova Scotian lobster rolls are a Canadian favourite.!");
        foodList.add(foodData10);

        FoodData foodData11 = new FoodData();
        foodData11.setImg(R.drawable.saskatoon_berry_pie);
        foodData11.setName("Saskatoon berry pie");
        foodData11.setCalories("85");
        foodData11.setPrice(18f);
        foodData11.setDetails("The Saskatoon berry is often described as having a sweet and almondy flavour, which makes it an ideal candidate for the perfect pie. Truly, a slice of this will change your life. It’s no wonder the city of Saskatoon was actually named after it, rather than the other way around.");
        foodList.add(foodData11);

        FoodData foodData12 = new FoodData();
        foodData12.setImg(R.drawable.peameal_bacon);
        foodData12.setName("Peameal Bacon");
        foodData12.setCalories("157");
        foodData12.setPrice(13.25f);
        foodData12.setDetails("This special Canadian twist on bacon is made from lean boneless pork loin, which is trimmed, wet-cured and then rolled in cornmeal, giving it its distinctive yellow crust. It’s juicier than American-style bacon, but also leaner and, some might say, more delicious.");
        foodList.add(foodData12);

        FoodData foodData13 = new FoodData();
        foodData13.setImg(R.drawable.split_pea_soup);
        foodData13.setName("Split Pea Soup");
        foodData13.setCalories("61");
        foodData13.setPrice(5f);
        foodData13.setDetails("Ah, comfort food at its finest. With Québécois origins, split pea soup is traditionally composed of peas, pork and herbs blended together for pure, creamy deliciousness. A bowl of this will get you through the tough Canadian winters!");
        foodList.add(foodData13);
        return foodList;
    }
    public static ArrayList<FoodData> timHorton(Context context) {
        ArrayList<FoodData> foodList = new ArrayList<>();
        FoodData foodData = new FoodData();
        foodData.setImg(R.drawable.originalblendcoffee);
        foodData.setName("Original Blend Coffee");
        foodData.setCalories("120");
        foodData.setPrice(5.50f);
        foodData.setDetails("A true classic - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData);

        FoodData foodData1 = new FoodData();
        foodData1.setImg(R.drawable.specialitytea);
        foodData1.setName("Tea");
        foodData1.setCalories("100");
        foodData1.setPrice(3.5f);
        foodData1.setDetails("A true classic Tea - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData1);

        FoodData foodData2 = new FoodData();
        foodData2.setImg(R.drawable.originalbreakfastwrap);
        foodData2.setName("Wrap");
        foodData2.setCalories("400");
        foodData2.setPrice(9.5f);
        foodData2.setDetails("A true classic Wrap - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData2);

        FoodData foodData3 = new FoodData();
        foodData3.setImg(R.drawable.hotchoclate);
        foodData3.setName("Hot Chocolate");
        foodData3.setCalories("500");
        foodData3.setPrice(5.5f);
        foodData3.setDetails("A hot choclate - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData3);

        FoodData foodData4 = new FoodData();
        foodData4.setImg(R.drawable.latte);
        foodData4.setName("Latte");
        foodData4.setCalories("300");
        foodData4.setPrice(10.5f);
        foodData4.setDetails("Latte true classic Coffee - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData4);

        FoodData foodData5 = new FoodData();
        foodData5.setImg(R.drawable.baconroll);
        foodData5.setName("Bacon Roll");
        foodData5.setCalories("600");
        foodData5.setPrice(20.5f);
        foodData5.setDetails("A true classic Wrap - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData5);

        FoodData foodData6 = new FoodData();
        foodData6.setImg(R.drawable.caramelmacchiato);
        foodData6.setName("Caramel Macchiato");
        foodData6.setCalories("220");
        foodData6.setPrice(9.5f);
        foodData6.setDetails("Caramel macchiato - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData6);

        FoodData foodData7 = new FoodData();
        foodData7.setImg(R.drawable.darkroastcoffee);
        foodData7.setName("Dark Roast Coffee");
        foodData7.setCalories("350");
        foodData7.setPrice(11.5f);
        foodData7.setDetails("Dark roast coffee A true classic Coffee - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData7);

        return foodList;
    }
    public static ArrayList<FoodData> ZenCourtYard(Context context) {
        ArrayList<FoodData> foodList = new ArrayList<>();
        FoodData foodData = new FoodData();
        foodData.setImg(R.drawable.goong);
        foodData.setName("Goong Hom Sabai");
        foodData.setCalories("120");
        foodData.setPrice(35.50f);
        foodData.setDetails("Deep fried noodles wrapped prawns.");
        foodList.add(foodData);

        FoodData foodData1 = new FoodData();
        foodData1.setImg(R.drawable.tord);
        foodData1.setName("Tord Man Pla");
        foodData1.setCalories("300");
        foodData1.setPrice(43.5f);
        foodData1.setDetails("Thai fish cake, fresh fish on the table.");
        foodList.add(foodData1);

        FoodData foodData2 = new FoodData();
        foodData2.setImg(R.drawable.gai);
        foodData2.setName("Gai Sai Takrai");
        foodData2.setCalories("400");
        foodData2.setPrice(39.5f);
        foodData2.setDetails("Crisp fried chicken with lemon grass.");
        foodList.add(foodData2);

        FoodData foodData3 = new FoodData();
        foodData3.setImg(R.drawable.sambal);
        foodData3.setName("Sambal Balado");
        foodData3.setCalories("500");
        foodData3.setPrice(5.5f);
        foodData3.setDetails("Indonesian crisp fried beef.");
        foodList.add(foodData3);

        FoodData foodData4 = new FoodData();
        foodData4.setImg(R.drawable.kae);
        foodData4.setName("Kae Phad Prik");
        foodData4.setCalories("300");
        foodData4.setPrice(10.5f);
        foodData4.setDetails("Lamb with oyster sauce and chili.");
        foodList.add(foodData4);

        FoodData foodData5 = new FoodData();
        foodData5.setImg(R.drawable.latte);
        foodData5.setName("Latte");
        foodData5.setCalories("300");
        foodData5.setPrice(10.5f);
        foodData5.setDetails("Latte true classic Coffee - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer.");
        foodList.add(foodData5);

        return foodList;
    }
    public static ArrayList<FoodData> piazza(Context context) {
        ArrayList<FoodData> foodList = new ArrayList<>();
        FoodData foodData = new FoodData();
        foodData.setImg(R.drawable.originallapiazapizza);
        foodData.setName("The Original La Piazza Pizza");
        foodData.setCalories("450");
        foodData.setPrice(10.99f);
        foodData.setDetails("Tomato, mozzarella, sun dried tomato, basil pesto, roasted garlic, goats cheese, oregano.");
        foodList.add(foodData);

        FoodData foodData1 = new FoodData();
        foodData1.setImg(R.drawable.pepproni);
        foodData1.setName("Pepperoni Pizza");
        foodData1.setCalories("500");
        foodData1.setPrice(12.99f);
        foodData1.setDetails("Pork, tomato, mozzarella, pepperoni, chilli oil, oregano.");
        foodList.add(foodData1);

        FoodData foodData2 = new FoodData();
        foodData2.setImg(R.drawable.pennyarrabiataa);
        foodData2.setName("Penne Arrabiata");
        foodData2.setCalories("300");
        foodData2.setPrice(9.99f);
        foodData2.setDetails("Tomato sauce, garlic, chilli, parsley.");
        foodList.add(foodData2);

        FoodData foodData3 = new FoodData();
        foodData3.setImg(R.drawable.spaghetti);
        foodData3.setName("Spaghetti Aglio Olio E Peperoncino");
        foodData3.setCalories("150");
        foodData3.setPrice(7.99f);
        foodData3.setDetails("[Vegan] Garlic, extra virgin olive oil, chilli, parsley.");
        foodList.add(foodData3);

        FoodData foodData4 = new FoodData();
        foodData4.setImg(R.drawable.lasagna);
        foodData4.setName("Lasagna Di Pasta Fresca Al Ragu Di Agnello");
        foodData4.setCalories("200");
        foodData4.setPrice(8.99f);
        foodData4.setDetails("Lamb Lasagne.");
        foodList.add(foodData4);

        FoodData foodData5 = new FoodData();
        foodData5.setImg(R.drawable.pennybascila);
        foodData5.setName("Penne Al Pomodoro Fresco E Basilica");
        foodData5.setCalories("100");
        foodData5.setPrice(10.99f);
        foodData5.setDetails("Lamb Lasagne.");
        foodList.add(foodData5);

        return foodList;
    }
    public static ArrayList<FoodData> cakery(Context context) {
        ArrayList<FoodData> foodList = new ArrayList<>();
        FoodData foodData = new FoodData();
        foodData.setImg(R.drawable.frostbrownie);
        foodData.setName("Froast Brownie");
        foodData.setCalories("150");
        foodData.setPrice(4.5f);
        foodData.setDetails("Pair it with the Best Brownie Recipe and you will be in heaven! The Perfect.");
        foodList.add(foodData);

        FoodData foodData1 = new FoodData();
        foodData1.setImg(R.drawable.whoopie);
        foodData1.setName("Chocolate Chip Whoopie Pie");
        foodData1.setCalories("386");
        foodData1.setPrice(5.99f);
        foodData1.setDetails("These sweet treats combine the cream-filled goodness of whoopie pies with the classic flavors of chocolate chip cookies.");
        foodList.add(foodData1);

        FoodData foodData2 = new FoodData();
        foodData2.setImg(R.drawable.saltedcaramel);
        foodData2.setName("Salted Caramel Brownie");
        foodData2.setCalories("386");
        foodData2.setPrice(4.99f);
        foodData2.setDetails("These salted caramel brownies feature a homemade caramel sauce and are insanely fudgy.");
        foodList.add(foodData2);

        FoodData foodData3 = new FoodData();
        foodData3.setImg(R.drawable.sandwich);
        foodData3.setName("Sandwich");
        foodData3.setCalories("266");
        foodData3.setPrice(4.29f);
        foodData3.setDetails("A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type.");
        foodList.add(foodData3);

        return foodList;
    }

//    static let le_circue:[FoodData]=
//            [

//    FoodData(img:"redsauce", name:"Red Sauce Pasta", calories:"260", price:12.5, detail:"Pasta is a type of food typically made from an unleavened dough of wheat flour mixed with water or eggs, and formed into sheets or other shapes, then cooked by boiling or baking."),
//
//    FoodData(img:"pizza2", name:"Pizza", calories:"1200", price:15.99, detail:"Pizza is a type of food typically made from an unleavened dough of wheat flour mixed with water or eggs, and formed into sheets or other shapes, then cooked by boiling or baking."),

//    FoodData(img:"white-sauce-pasta", name:"White Sauce Pasta", calories:"400", price:4.97, detail:"This white sauce is also known as béchamel sauce and has it's origin in French cuisine. Classic béchamel sauce is made with butter, flour and milk. For this pasta, I add cream and this pasta is super cheesy and creamy, just like my family likes it. So this sauce is kind of a mix between alfredo and béchamel."),

//    FoodData(img:"noodles", name:"Noodles", calories:"219", price:5.25, detail:"Noodles are a type of food made from unleavened dough which is rolled flat and cut, stretched or extruded, into long strips or strings."),

//    FoodData(img:"sandwich", name:"Sandwich", calories:"266", price:4.29, detail:"A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type."),

//    FoodData(img:"sushi", name:"Sushi", calories:"250 ", price:12.99, detail:"Sushi (すし, 寿司, 鮨, pronounced [sɯɕiꜜ] or [sɯꜜɕi]) is a traditional Japanese dish of prepared vinegared rice (鮨飯, sushi-meshi), usually with some sugar and salt, accompanying a variety of ingredients (ネタ, neta), such as seafood, often raw, and vegetables."),

//    FoodData(img:"hotdog", name:"Hot dog", calories:"290 ", price:25, detail:"A hot dog (also spelled hotdog) is a food consisting of a grilled or steamed sausage served in the slit of a partially sliced bun. It can also refer to the sausage itself. The sausage used is a wiener (Vienna sausage) or a frankfurter (Frankfurter Würstchen, also just called frank)."),

//    FoodData(img:"tomato-and-basil-bruschetta", name:"Tomato and Basil bruschetta", calories:"17", price:70, detail:"Tomato bruschetta is one of the best Italian appetizers. Its recipe includes just bread, tomato, olive oil, basil and garlic: their tastes and colors bring to the mind the Classical Age, a time of long past when Roman merchant ships crossed the Mediterranean sea, carrying jars full of wheat and wine."),

//    FoodData(img:"poutine", name:"Poutine", calories:"513", price:3.99, detail:"Poutine, a Canadian dish made of french fries topped with cheese curds and gravy. It first appeared in 1950s rural Québec snack bars and was widely popularized across Canada and beyond in the 1990s. It has become a symbol of Québécois and Canadian cuisine and culture."),

//    FoodData(img:"bannock", name:"Bannock", calories:"309", price:15, detail:"Delicious and versatile, bannock is a simple bread that was once a key staple in the diets of Canada’s Aboriginal people. Modern takes on bannock include baked versions (which are heavy/dense) and fried versions (which are crispy and fluffy on the inside). In recent years, bannock has seen a surge in popularity, with new twists and variations popping up in bakeries and cafes nationwide – you have to try it!"),

//    FoodData(img:"Nova Scotian Lobster Rolls", name:"Nova Scotian Lobster Rolls", calories:"600", price:20, detail:"Canada is a massive country, with spectacular seafood from coast to coast. Not-to-be-missed experiences include Atlantic and Pacific salmon, smoked salmon, arctic char, and of course, East Coast lobsters. Nova Scotian lobster rolls are a Canadian favourite.!"),

//    FoodData(img:"Saskatoon berry pie", name:"Saskatoon berry pie", calories:"85", price:18, detail:"The Saskatoon berry is often described as having a sweet and almondy flavour, which makes it an ideal candidate for the perfect pie. Truly, a slice of this will change your life. It’s no wonder the city of Saskatoon was actually named after it, rather than the other way around."),

//    FoodData(img:"Peameal Bacon", name:"Peameal Bacon", calories:"157", price:13.25, detail:"This special Canadian twist on bacon is made from lean boneless pork loin, which is trimmed, wet-cured and then rolled in cornmeal, giving it its distinctive yellow crust. It’s juicier than American-style bacon, but also leaner and, some might say, more delicious."),

//    FoodData(img:"Split Pea Soup", name:"Split Pea Soup", calories:"61", price:5, detail:"Ah, comfort food at its finest. With Québécois origins, split pea soup is traditionally composed of peas, pork and herbs blended together for pure, creamy deliciousness. A bowl of this will get you through the tough Canadian winters!"),
//        ]


//    static let timHortan = [

//    FoodData(img:"originalblendcoffee", name:"Original Blend Coffee", calories:"120", price:5.5, detail:"A true classic - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),

//    FoodData(img:"specialitytea", name:"Tea", calories:"100", price:3.5, detail:"A true classic Tea - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),


//    FoodData(img:"originalbreakfastwrap", name:"Wrap", calories:"400", price:9.5, detail:"A true classic Wrap - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),

//    FoodData(img:"hotchoclate", name:"Hot Choclate", calories:"500", price:5.5, detail:"A hot choclate - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),

//    FoodData(img:"latte", name:"Latte", calories:"300", price:10.5, detail:"Latte true classic Coffee - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),

//    FoodData(img:"baconroll", name:"baconroll", calories:"600", price:20.5, detail:"A true classic Wrap - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),

//    FoodData(img:"caramelmacchiato", name:"Caramel macchiato", calories:"220", price:9.5, detail:"Caramel macchiato - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),

//    FoodData(img:"darkroastcoffee", name:"Dark roast coffee", calories:"350", price:11.5, detail:"Dark roast coffee A true classic Coffee - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),
//    ]

//    static let ZenCourtyard = [

//    FoodData(img:"goong", name:"Goong Hom Sabai", calories:"120", price:35.5, detail:"Deep fried noodles wrapped prawns."),

//    FoodData(img:"tord", name:"Tord Man Pla", calories:"300", price:43.5, detail:"Thai fish cake, fresh fish on the table."),

//    FoodData(img:"gai", name:"Gai Sai Takrai", calories:"400", price:39.5, detail:"Crisp fried chicken with lemon grass."),

//    FoodData(img:"sambal", name:"Sambal balado", calories:"500", price:5.5, detail:"Indonesian crisp fried beef."),

//    FoodData(img:"kae", name:"Kae phad prik", calories:"300", price:10.5, detail:"Lamb with oyster sauce and chili."),

//    FoodData(img:"latte", name:"Latte", calories:"300", price:10.5, detail:"Latte true classic Coffee - our Original Blend is rich, smooth, delicious and ready to brew in convenient K-Cup® pods for your Keurig® brewer."),
//    ]

//    static let piazza = [

//    FoodData(img:"originallapiazapizza", name:"The Original La Piazza Pizza", calories:"450", price:10.99, detail:"Tomato, mozzarella, sun dried tomato, basil pesto, roasted garlic, goats cheese, oregano."),

//    FoodData(img:"pepproni", name:"Pepperoni Pizza", calories:"500", price:12.99, detail:"Pork, tomato, mozzarella, pepperoni, chilli oil, oregano."),

//    FoodData(img:"pennyarrabiataa", name:"Penne Arrabiata", calories:"300", price:9.99, detail:"Tomato sauce, garlic, chilli, parsley."),

//    FoodData(img:"spaghetti", name:"Spaghetti Aglio Olio E Peperoncino", calories:"150", price:7.99, detail:"[Vegan] Garlic, extra virgin olive oil, chilli, parsley."),

//    FoodData(img:"lasagna", name:"Lasagna Di Pasta Fresca Al Ragu Di Agnello", calories:"200", price:8.99, detail:"Lamb Lasagne."),

//    FoodData(img:"pennybascila", name:"Penne Al Pomodoro Fresco E Basilica", calories:"100", price:10.99, detail:"Lamb Lasagne."),
//    ]

//    static let cakery = [

//    FoodData(img:"frostbrownie", name:"Froast Brownie", calories:"150", price:4.5, detail:"Pair it with the Best Brownie Recipe and you will be in heaven! The Perfect."),

//    FoodData(img:"whoopie", name:"Chocolate Chip Whoopie Pie", calories:"386", price:5.99, detail:"These sweet treats combine the cream-filled goodness of whoopie pies with the classic flavors of chocolate chip cookies."),

//    FoodData(img:"saltedcaramel", name:"Salted Caramel Brownie", calories:"386", price:4.99, detail:"These salted caramel brownies feature a homemade caramel sauce and are insanely fudgy."),

//    FoodData(img:"sandwich", name:"Sandwich", calories:"266", price:4.29, detail:"A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type."),
//     ]

//    static let resaturantList:[RestaurantData]=[
//
//    RestaurantData(img:"tim", name:"Tim Horton", rating:"4.2", dishes:"Canadian", foodList:timHortan),
//
//    RestaurantData(img:"la-piazza", name:"La Piazza", rating:"3.8", dishes:"Italian", foodList:piazza),
//
//    RestaurantData(img:"red-zen", name:"Red ZenCourtyard", rating:"4.8", dishes:"Thai ,Indonesian", foodList:ZenCourtyard),
//
//    RestaurantData(img:"baton", name:"Baton Rouge", rating:"5.0", dishes:"Indian, Italian", foodList:foodList.shuffled()),
//
//    RestaurantData(img:"cakery", name:"The bill chill cakery", rating:"3.2", dishes:"Indian, German", foodList:cakery),
//
//    RestaurantData(img:"le-cirque", name:"Le cirque", rating:"4.1", dishes:"Indian, Thai, Chinese", foodList:foodList),
//    ]
//
//    static let LOCAL_DATA = "LOCAL_DATA"

    public static ArrayList<RestaurantData> getRestaurantList(Context context) {
        ArrayList<RestaurantData> restaurantList = new ArrayList<>();
        RestaurantData data = new RestaurantData();
        data.setImg(context.getResources().getDrawable(R.drawable.tim));
        data.setName("Tim Horton");
        data.setRating("4.2");
        data.setDishes("Canadian");
        data.setFoodList(timHorton(context));
        restaurantList.add(data);

        RestaurantData data1 = new RestaurantData();
        data1.setImg(context.getResources().getDrawable(R.drawable.la_piazza));
        data1.setName("La Piazza");
        data1.setRating("3.8");
        data1.setDishes("Italian");
        data1.setFoodList(piazza(context));
        restaurantList.add(data1);

        RestaurantData data2 = new RestaurantData();
        data2.setImg(context.getResources().getDrawable(R.drawable.red_zen));
        data2.setName("Red Zen Courtyard");
        data2.setRating("4.8");
        data2.setDishes("Thai ,Indonesian");
        data2.setFoodList(ZenCourtYard(context));
        restaurantList.add(data2);

        RestaurantData data3 = new RestaurantData();
        data3.setImg(context.getResources().getDrawable(R.drawable.baton));
        data3.setName("Baton Rouge");
        data3.setRating("5.0");
        data3.setDishes("Indian, Italian");
        data3.setFoodList(leCircue(context));
        restaurantList.add(data3);

        RestaurantData data4 = new RestaurantData();
        data4.setImg(context.getResources().getDrawable(R.drawable.cakery));
        data4.setName("The bill chill cakery");
        data4.setRating("3.2");
        data4.setDishes("Indian, German");
        data4.setFoodList(cakery(context));
        restaurantList.add(data4);

        RestaurantData data5 = new RestaurantData();
        data5.setImg(context.getResources().getDrawable(R.drawable.le_cirque));
        data5.setName("Le cirque");
        data5.setRating("4.1");
        data5.setDishes("Indian, Thai, Chinese");
        data5.setFoodList(leCircue(context));
        restaurantList.add(data5);
        return restaurantList;
    }

}
