package com.example.bikeshowcase;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {
    public static Map<Integer, String> generateItemTitles(){
        Map<Integer, String> itemTitles = new LinkedHashMap<>();
        itemTitles.put(1, "Rockhopper Sport 29");
        itemTitles.put(2, "Rockhopper Sport 29");
        itemTitles.put(3, "Rockhopper Sport 29");
        itemTitles.put(4, "Rockhopper Sport 29");
        itemTitles.put(5, "Rockhopper Sport 29");
        itemTitles.put(6, "Demo Expert");
        itemTitles.put(7, "Stumpjumper Comp");
        itemTitles.put(8, "Stumpjumper Comp");
        itemTitles.put(9, "S-Works Epic");
        itemTitles.put(10, "S-Works Epic");
        return itemTitles;
    }

    public static Map<Integer, String> generateItemDescriptions(){
        Map<Integer, String> itemDescriptions = new LinkedHashMap<>();
        itemDescriptions.put(1, "All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.");
        itemDescriptions.put(2, "All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.");
        itemDescriptions.put(3, "All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.");
        itemDescriptions.put(4, "All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.");
        itemDescriptions.put(5, "All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.");
        itemDescriptions.put(6, "Pair an irrational appreciation for speed with the unmatched versatility of being able to run a traction-loving 29-inch front wheel and a snappy 27.5-inch rear, and you have the fastest, most capable Demo to date. The Demo Expert adds planted, confident control to the mix with an assist from RockShox’s BoXXer Select 29 fork featuring their DH DebonAir spring and a Super Deluxe Select Coil shock offering external rebound adjustment. Should your riding style or terrain require, the Demo's adjustable rear end means 29-inch rear wheel compatibiity is on deck, ready to deliver.");
        itemDescriptions.put(7, "Metal fans rejoice! The Stumpjumper Comp Alloy rocks on, with one of the most advanced alloy frames ever developed. From the frame’s asymmetrical design, taking in the refined suspension kinematics and all-new geometry, to a build kit that strikes the optimal combination of performance and value, it’s metal, but it ain’t heavy metal. And it’s ready to slay some dirt.");
        itemDescriptions.put(8, "Metal fans rejoice! The Stumpjumper Comp Alloy rocks on, with one of the most advanced alloy frames ever developed. From the frame’s asymmetrical design, taking in the refined suspension kinematics and all-new geometry, to a build kit that strikes the optimal combination of performance and value, it’s metal, but it ain’t heavy metal. And it’s ready to slay some dirt.");
        itemDescriptions.put(9, "Hey you, yeah, you...the one with the scale out seeing which of the six identical tires on the shelf is the lightest. Sure, some might call you a bit obsessive, but no worries, here, the S-Works Epic is speaking exactly the same language. Countless design hours, endless test laps, terabytes of telemetry data—all of it to make sure not a single ounce of speed was left on the table.");
        itemDescriptions.put(10, "Hey you, yeah, you...the one with the scale out seeing which of the six identical tires on the shelf is the lightest. Sure, some might call you a bit obsessive, but no worries, here, the S-Works Epic is speaking exactly the same language. Countless design hours, endless test laps, terabytes of telemetry data—all of it to make sure not a single ounce of speed was left on the table.");
        return itemDescriptions;
    }

    public static Map<Integer, String> generateItemColours(){
        Map<Integer, String> itemColours = new LinkedHashMap<>();
        itemColours.put(1, "Satin Slate / Cool Grey");
        itemColours.put(2, "Satin Forest Green / Oasis");
        itemColours.put(3, "Gloss Cobalt / Cast Blue");
        itemColours.put(4, "Gloss Blaze / Ice Papaya");
        itemColours.put(5, "Gloss White Mountains / Dusty Turqouise");
        itemColours.put(6, "Gloss Smoke / Black / Cool Grey");
        itemColours.put(7, "Satin Cast Umber / Clay");
        itemColours.put(8, "Gloss Sage Green / Forest Green");
        itemColours.put(9, "Gloss Red Tint Fade Over Brushed Silver / Tarmac Black / White with Gold Pearl");
        itemColours.put(10, "Satin / Gloss Carbon / Colour Run Silver - Green Chameleon");
        return itemColours;
    }

    public static Map<Integer, String[]> generateItemImages() {
        Map<Integer, String[]> itemImages = new LinkedHashMap<>();
        itemImages.put(1, new String[]{"rh_grey_1", "rh_grey_2", "rh_grey_3"});
        itemImages.put(2, new String[]{"rh_grn_1", "rh_grn_2", "rh_grn_3"});
        itemImages.put(3, new String[]{"rh_blue_1", "rh_blue_2", "rh_blue_3"});
        itemImages.put(4, new String[]{"rh_org_1", "rh_org_2", "rh_org_3"});
        itemImages.put(5, new String[]{"rh_wht_1", "rh_wht_2", "rh_wht_3"});
        itemImages.put(6, new String[]{"demo_1", "demo_2", "demo_3", "demo_4", "demo_5"});
        itemImages.put(7, new String[]{"sj_pur_1", "sj_pur_2", "sj_pur_3"});
        itemImages.put(8, new String[]{"sj_grn_1", "sj_grn_2", "sj_grn_3"});
        itemImages.put(9, new String[]{"epic_red_1", "epic_red_2", "epic_red_3"});
        itemImages.put(10, new String[]{"epic_blk_1", "epic_blk_2", "epic_blk_3"});
        return itemImages;
    }

    public static Map<Integer, Integer> generateItemPrices() {
        Map<Integer, Integer> itemPrices = new LinkedHashMap<>();
        itemPrices.put(1, 1000);
        itemPrices.put(2, 1000);
        itemPrices.put(3, 1000);
        itemPrices.put(4, 1000);
        itemPrices.put(5, 1000);
        itemPrices.put(6, 9400);
        itemPrices.put(7, 5700);
        itemPrices.put(8, 5700);
        itemPrices.put(9, 20500);
        itemPrices.put(10, 20500);
        return itemPrices;
    }

    public static List<Item> getItems() {
        List<Item> numbersList = new ArrayList<>();
        Map<Integer, String> titles = generateItemTitles();
        Map<Integer, String> descriptions = generateItemDescriptions();
        Map<Integer, String> colours = generateItemColours();
        Map<Integer, String[]> images = generateItemImages();
        Map<Integer, Integer> prices = generateItemPrices();
        for (Integer key : titles.keySet()) {
            String title = titles.get(key);
            String description = descriptions.get(key);
            String colour = colours.get(key);
            String[] image = images.get(key);
            Integer price = prices.get(key);
            Item i = new Item(title, description, colour, image, price);
            numbersList.add(i);
        }
        return numbersList;
    }

}
