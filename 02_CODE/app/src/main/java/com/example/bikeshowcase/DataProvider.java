package com.example.bikeshowcase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {

    //Creates the data map for our app. More items can be added following the same format as below.
    private static Map<Item, Integer> itemVisits = new LinkedHashMap<>();
    static {
        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("Rockhopper Sport 29")
                        .setDescription("All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.")
                        .setColour("Satin Slate / Cool Grey")
                        .setPrice(1000)
                        .setImageFileNameList(new String[]{"rh_grey_1", "rh_grey_2", "rh_grey_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("Rockhopper Sport 29")
                        .setDescription("All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.")
                        .setColour("Satin Forest Green / Oasis")
                        .setPrice(1000)
                        .setImageFileNameList(new String[]{"rh_grn_1", "rh_grn_2", "rh_grn_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("Rockhopper Sport 29")
                        .setDescription("All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.")
                        .setColour("Gloss Cobalt / Cast Blue")
                        .setPrice(1000)
                        .setImageFileNameList(new String[]{"rh_blue_1", "rh_blue_2", "rh_blue_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("Rockhopper Sport 29")
                        .setDescription("All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.")
                        .setColour("Gloss Blaze / Ice Papaya")
                        .setPrice(1000)
                        .setImageFileNameList(new String[]{"rh_org_1", "rh_org_2", "rh_org_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("Rockhopper Sport 29")
                        .setDescription("All barn-burner and no benchwarmer, the Rockhopper Sport throws out the playbook when it comes to putting performance points on the board while playing some serious defense on behalf of your wallet.")
                        .setColour("Gloss White Mountains / Dusty Turqouise")
                        .setPrice(1000)
                        .setImageFileNameList(new String[]{"rh_wht_1", "rh_wht_2", "rh_wht_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("Demo Expert")
                        .setDescription("Pair an irrational appreciation for speed with the unmatched versatility of being able to run a traction-loving 29-inch front wheel and a snappy 27.5-inch rear, and you have the fastest, most capable Demo to date. The Demo Expert adds planted, confident control to the mix with an assist from RockShox’s BoXXer Select 29 fork featuring their DH DebonAir spring and a Super Deluxe Select Coil shock offering external rebound adjustment. Should your riding style or terrain require, the Demo's adjustable rear end means 29-inch rear wheel compatibiity is on deck, ready to deliver.")
                        .setColour("Gloss Smoke / Black / Cool Grey")
                        .setPrice(9400)
                        .setImageFileNameList(new String[]{"demo_1", "demo_2", "demo_3", "demo_4", "demo_5"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("Stumpjumper Comp")
                        .setDescription("Metal fans rejoice! The Stumpjumper Comp Alloy rocks on, with one of the most advanced alloy frames ever developed. From the frame’s asymmetrical design, taking in the refined suspension kinematics and all-new geometry, to a build kit that strikes the optimal combination of performance and value, it’s metal, but it ain’t heavy metal. And it’s ready to slay some dirt.")
                        .setColour("Satin Cast Umber / Clay")
                        .setPrice(5700)
                        .setImageFileNameList(new String[]{"sj_pur_1", "sj_pur_2", "sj_pur_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("Stumpjumper Comp")
                        .setDescription("Metal fans rejoice! The Stumpjumper Comp Alloy rocks on, with one of the most advanced alloy frames ever developed. From the frame’s asymmetrical design, taking in the refined suspension kinematics and all-new geometry, to a build kit that strikes the optimal combination of performance and value, it’s metal, but it ain’t heavy metal. And it’s ready to slay some dirt.")
                        .setColour("Gloss Sage Green / Forest Green")
                        .setPrice(5700)
                        .setImageFileNameList(new String[]{"sj_grn_1", "sj_grn_2", "sj_grn_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("S-Works Epic")
                        .setDescription("Hey you, yeah, you...the one with the scale out seeing which of the six identical tires on the shelf is the lightest. Sure, some might call you a bit obsessive, but no worries, here, the S-Works Epic is speaking exactly the same language. Countless design hours, endless test laps, terabytes of telemetry data—all of it to make sure not a single ounce of speed was left on the table.")
                        .setColour("Gloss Red Tint Fade Over Brushed Silver / Tarmac Black / White with Gold Pearl")
                        .setPrice(20500)
                        .setImageFileNameList(new String[]{"epic_red_1", "epic_red_2", "epic_red_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Mountain Bikes")
                        .setItemTitle("S-Works Epic")
                        .setDescription("Hey you, yeah, you...the one with the scale out seeing which of the six identical tires on the shelf is the lightest. Sure, some might call you a bit obsessive, but no worries, here, the S-Works Epic is speaking exactly the same language. Countless design hours, endless test laps, terabytes of telemetry data—all of it to make sure not a single ounce of speed was left on the table.")
                        .setColour("Satin / Gloss Carbon / Colour Run Silver - Green Chameleon")
                        .setPrice(20500)
                        .setImageFileNameList(new String[]{"epic_blk_1", "epic_blk_2", "epic_blk_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("S-Works Aethos - Founders Edition")
                        .setDescription("Limited to 300 bikes globally, the Aethos Founder’s Edition is the lightest build on offer.When compared to the S-Works Aethos, this limited Founder’s Edition S-Works Aethos may seem like it just features a different handlebar—and while the Roval Alpinist, At 255 grams (110mm x 420mm) is one of the lightest out there, the Founder’s Edition S-Works Aethos features much, much more.")
                        .setColour("Satin Brushed Liquid Silver / Holographic")
                        .setPrice(25400)
                        .setImageFileNameList(new String[]{"sw_aethos_founder_1", "sw_aethos_founder_2", "sw_aethos_founder_3", "sw_aethos_founder_4", "sw_aethos_founder_5", "sw_aethos_founder_6", "sw_aethos_founder_7"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("S-Works Tarmac SL7")
                        .setDescription("Why should you be forced to choose between aerodynamics and weight, between ride quality and speed? It's simple, you shouldn't. Enter the new Tarmac—climb on the lightest bike the UCI allows, then descend on the fastest. We've utilized our most advanced technologies, from our FreeFoil Shape Library to an all-new Rider-First Engineered™ frame, to deliver a race bike that is truly without compromise. The days of making sacrifices between \"aero\" and \"lightweight\" bikes are over—the all-new Tarmac is the fastest race bike, ever. One bike to rule them all.")
                        .setColour("Flo Red / Red Tint / Tarmac Black / White")
                        .setPrice(20500)
                        .setImageFileNameList(new String[]{"sw_tarmac_red_1", "sw_tarmac_red_2", "sw_tarmac_red_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("S-Works Turbo Creo SL")
                        .setDescription("We have a long history of developing the world's highest performing road bikes. Tarmac, Venge, Roubaix, Allez, Diverge—each one dominates their respective category, featuring the best technologies in the industry. And while that's a tough palmarès to follow, the Turbo Creo SL redefines e-road bike performance. It's lightweight, smooth, capable, and lively—all with the power to flatten mountains, laugh at headwinds, and go farther than you ever thought possible. It's you, only faster.")
                        .setColour("Gloss Supernova Chameleon / Raw Carbon")
                        .setPrice(20000)
                        .setImageFileNameList(new String[]{"sw_creo_1", "sw_creo_2", "sw_creo_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("Tarmac SL7 Expert")
                        .setDescription("The new Tarmac is designed to go fast, there's no if's, and's, or but's about that—but it represents so much more than just aerodynamic prowess. With a light-weight, Rider-First Engineered™ frame, it delivers the best-possible ride characteristics, no matter the size. So no matter what you have planned for your new Tarmac, its ready to help you achieve your goals—PRs, KOMs, or podium top-steps. One bike to rule them all.")
                        .setColour("Light Silver / Smoke Fade / Black")
                        .setPrice(8800)
                        .setImageFileNameList(new String[]{"tarmac_expert_1", "tarmac_expert_2", "tarmac_expert_3", "tarmac_expert_4", "tarmac_expert_5"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("Roubaix Expert")
                        .setDescription("With seven wins at Paris-Roubaix, our Roubaix has proven that Smoother is Faster. Until this moment, however, smooth has admittedly come with some compromises. But not anymore. The all-new Roubaix Expert now delivers compliance without compromise by introducing a radical new Future Shock 2.0 that gives you more control and damping options, a new Pavé seatpost that creates our most balanced Roubaix to date, aerodynamics that equal the Tarmac, and a Rider-First Engineered™ frame that's shed some serious weight. Is it still comfortable? Sure, but don't call it a comfort bike, because performance was behind every engineering decision we made. This is the new Roubaix.")
                        .setColour("Gloss Dusty Turquoise / Cast Blue / Charcoal / Hyper")
                        .setPrice(9500)
                        .setImageFileNameList(new String[]{"roubaix_expert_1", "roubaix_expert_2", "roubaix_expert_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("Tarmac SL7 Pro")
                        .setDescription("We designed the new Tarmac to have the perfect blend of aerodynamics, light weight, and ride quality to deliver the ride of your life. From using our FreeFoil Shape Library to find the best tube shapes, to developing our next generation of Rider-First Engineered™ design, the new Tarmac is the culmination of our ever-longing pursuit of speed. It's a pure-bred race machine with no compromises. One bike to rule them all.")
                        .setColour("Blue Tint Fade / Smoke / Metallic White Silver")
                        .setPrice(9500)
                        .setImageFileNameList(new String[]{"tarmac_pro_1", "tarmac_pro_2", "tarmac_pro_3", "tarmac_pro_4", "tarmac_pro_5", "tarmac_pro_6", "tarmac_pro_7"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("Roubaix Comp")
                        .setDescription("With six wins at Paris-Roubaix, our Roubaix has proven that Smoother is Faster. Until this moment, however, smooth has admittedly come with some compromises. But not anymore. The all-new Roubaix Comp now delivers compliance without compromise by introducing a radical new Future Shock 1.5 that gives you more control on rough roads, a new Pavé seatpost that creates our most balanced Roubaix to date, aerodynamics that equal the Tarmac, and a Rider-First Engineered™ frame that’s shed some serious weight. Is it still comfortable? Sure, but don’t call it a comfort bike, because performance was behind every engineering decision we made. This is the new Roubaix.")
                        .setColour("Gloss UV Lilac / Black")
                        .setPrice(7300)
                        .setImageFileNameList(new String[]{"roubaix_comp_1", "roubaix_comp_2", "roubaix_comp_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("Tarmac SL6 Disc Comp")
                        .setDescription("When we developed the Tarmac Disc, we didn't just want it to be fast. We wanted it to be fast everywhere. Long climbs, windy flats, Grand Tour stages, local fondos—we built a race bike to be the most complete out there. How'd we do it? We started with our Rider-First Engineered™ frame with a perfectly-tuned ride quality for every size, added in some serious aero tech that makes it 30 seconds faster over 40 kilometers than the Tarmac SL5, and then made it 20% lighter. Nothing is lighter, faster, and better handling. This Tarmac comes with a no-fuss spec that includes Shimano Ultegra mechanical shifting and quick-stopping hydraulic disc brakes, durable DT R470 Disc wheels, and our fan-favorite Power saddle.")
                        .setColour("Satin Carbon / Black / Black Reflective")
                        .setPrice(5000)
                        .setImageFileNameList(new String[]{"tarmac_comp_1", "tarmac_comp_2", "tarmac_comp_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("Allez")
                        .setDescription("All too often, corners are cut to meet price-points in the entry-level road bike market, but the Allez redefines what it means to be \"entry level.\" Focusing on weight, refinement, and reliability like nothing else in its class, the Allez is the first to make these technologies accessible to everyone. Whether you're just getting into road cycling, commuting, or looking for a new bike, the Allez is just as performance-packed as it is versatile.")
                        .setColour("Gloss Raspberry / Metallic White Silver")
                        .setPrice(1500)
                        .setImageFileNameList(new String[]{"allez_1", "allez_2", "allez_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Road Bikes")
                        .setItemTitle("S-Works Shiv Disc")
                        .setDescription("We've never been ones for dogmatic rules. And with a little defiance of the UCI's rule book, the Shiv sets the new standard for speed—again. It keeps its aero, fuel, and fit focus, but does so in an entirely new and novel way. Yes, it has disc brakes. Yes, it's easy to travel with. And yes, it takes aero to unheard of heights using storage and fit features that also make you faster. There's only one bike that's going to help get you to the top of the podium this season and that's the Shiv Disc.")
                        .setColour("Gloss Golden Yellow / Vivid Pink / Satin Black")
                        .setPrice(19000)
                        .setImageFileNameList(new String[]{"sw_shiv_1", "sw_shiv_2", "sw_shiv_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("S-Works Diverge")
                        .setDescription("Whether your goal is to escape on gravel back roads, far from cars and crowds, or drop the hammer at the front of your favorite gravel race, no bike does it better than the new Diverge. It’s quite simply the fastest, most capable - and just maybe the most fun - bike we’ve ever made, delivering a ride that’s quick and lively under power, but stable and confidence inspiring when the terrain gets rough. From Future Shock 2.0 and all-new gravel geometry, to internal storage and category leading tire clearance, the new Diverge represents everything we’ve learned over more than 40 years of riding road, gravel and dirt. The Diverge writes an entirely new chapter in the gravel bike category, so you can dream up entirely new rides. It’s the ultimate getaway vehicle.")
                        .setColour("Satin Carbon / Color Run Pearl / Chrome / Clean")
                        .setPrice(18600)
                        .setImageFileNameList(new String[]{"sw_diverge_1", "sw_diverge_2", "sw_diverge_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Diverge Comp Carbon")
                        .setDescription("Whether your goal is to escape on gravel back roads, far from cars and crowds, or drop the hammer at the front of your favorite gravel race, no bike does it better than the new Diverge. It’s quite simply the fastest, most capable - and just maybe the most fun - bike we’ve ever made, delivering a ride that’s quick and lively under power, but stable and confidence inspiring when the terrain gets rough. From Future Shock 2.0 and all-new gravel geometry, to internal storage and category leading tire clearance, the new Diverge represents everything we’ve learned over more than 40 years of riding road, gravel and dirt. The Diverge writes an entirely new chapter in the gravel bike category, so you can dream up entirely new rides. It’s the ultimate getaway vehicle.")
                        .setColour("Satin Carbon / Smoke / Chrome / Clean")
                        .setPrice(7000)
                        .setImageFileNameList(new String[]{"diverge_comp_carbon_1", "diverge_comp_carbon_2", "diverge_comp_carbon_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Diverge Comp E5")
                        .setDescription("Whether your goal is to escape on gravel back roads, far from cars and crowds, or drop the hammer at the front of your favorite gravel race, no bike does it better than the new Diverge. It’s quite simply the fastest, most capable - and just maybe the most fun - bike we’ve ever made, delivering a ride that’s quick and lively under power, but stable and confidence inspiring when the terrain gets rough. From Future Shock 2.0 and all-new gravel geometry, to internal storage and category leading tire clearance, the new Diverge represents everything we’ve learned over more than 40 years of riding road, gravel and dirt. The Diverge writes an entirely new chapter in the gravel bike category, so you can dream up entirely new rides. It’s the ultimate getaway vehicle.")
                        .setColour("Gloss Tarmac Black / Satin Maroon / Chrome / Clean")
                        .setPrice(3700)
                        .setImageFileNameList(new String[]{"diverge_comp_1", "diverge_comp_2", "diverge_comp_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Diverge Expert Carbon")
                        .setDescription("Whether your goal is to escape on gravel back roads, far from cars and crowds, or drop the hammer at the front of your favorite gravel race, no bike does it better than the new Diverge. It’s quite simply the fastest, most capable - and just maybe the most fun - bike we’ve ever made, delivering a ride that’s quick and lively under power, but stable and confidence inspiring when the terrain gets rough. From Future Shock 2.0 and all-new gravel geometry, to internal storage and category leading tire clearance, the new Diverge represents everything we’ve learned over more than 40 years of riding road, gravel and dirt. The Diverge writes an entirely new chapter in the gravel bike category, so you can dream up entirely new rides. It’s the ultimate getaway vehicle.")
                        .setColour("Satin Oak Green Metallic / Gloss White / Chrome / Clean")
                        .setPrice(8800)
                        .setImageFileNameList(new String[]{"diverge_expert_1", "diverge_expert_2", "diverge_expert_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Diverge base Carbon")
                        .setDescription("Whether your goal is to escape on gravel back roads, far from cars and crowds, or drop the hammer at the front of your favorite gravel race, no bike does it better than the new Diverge. It’s quite simply the fastest, most capable - and just maybe the most fun - bike we’ve ever made, delivering a ride that’s quick and lively under power, but stable and confidence inspiring when the terrain gets rough. From Future Shock 2.0 and all-new gravel geometry, to internal storage and category leading tire clearance, the new Diverge represents everything we’ve learned over more than 40 years of riding road, gravel and dirt. The Diverge writes an entirely new chapter in the gravel bike category, so you can dream up entirely new rides. It’s the ultimate getaway vehicle.")
                        .setColour("Gloss Smoke / Redwood / Chrome / Clean")
                        .setPrice(4500)
                        .setImageFileNameList(new String[]{"diverge_base_carbon_1", "diverge_base_carbon_2", "diverge_base_carbon_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Sirrus X 2.0")
                        .setDescription("Sirrus X is your ticket to riding more, and to places you never imagined possible. It's a comfortable, capable, \"let's do stuff\" kind of bike that will inspire you to ride more than you ever have before. With bigger, confidence inspiring tires, a slightly more upright riding position, a super intuitive one-by drivetrain, and plenty of mounts for racks and fenders —it's more than just a solid partner on pavement. Sirrus X is a dialed option when it's time to hit some gravel. We've also equipped every Sirrus X with next-level comfort from our scientifically tested and ergonomically engineered Shared Platform Body Geometry saddle, handgrips, and pedals.")
                        .setColour("Black / Satin Charcoal Reflective")
                        .setPrice(1100)
                        .setImageFileNameList(new String[]{"sirrus_x_blk_1", "sirrus_x_blk_2", "sirrus_x_blk_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Sirrus X 2.0")
                        .setDescription("Sirrus X is your ticket to riding more, and to places you never imagined possible. It's a comfortable, capable, \"let's do stuff\" kind of bike that will inspire you to ride more than you ever have before. With bigger, confidence inspiring tires, a slightly more upright riding position, a super intuitive one-by drivetrain, and plenty of mounts for racks and fenders —it's more than just a solid partner on pavement. Sirrus X is a dialed option when it's time to hit some gravel. We've also equipped every Sirrus X with next-level comfort from our scientifically tested and ergonomically engineered Shared Platform Body Geometry saddle, handgrips, and pedals.")
                        .setColour("Dusty Turquoise / Black / Rocket Red")
                        .setPrice(1100)
                        .setImageFileNameList(new String[]{"sirrus_x_turq_1", "sirrus_x_turq_2", "sirrus_x_turq_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Sirrus X 4.0")
                        .setDescription("Sirrus X is your ticket to riding more, and to places you never imagined possible. It's a comfortable, capable, \"let's do stuff\" kind of bike that will inspire you to ride more than you ever have before. With bigger, confidence inspiring tires, a slightly more upright riding position, a super intuitive one-by drivetrain, and plenty of mounts for racks and fenders —it's more than just a solid partner on pavement. Sirrus X is a dialed option when it's time to hit some gravel. We've also equipped every Sirrus X with next-level comfort from our scientifically tested and ergonomically engineered Shared Platform Body Geometry saddle, handgrips, and pedals. We also equipped Sirrus X with the revolutionary Future Shock to take the sting out of bumps and potholes. Here's to your life on two wheels.")
                        .setColour("Navy / Satin White Mountains / Black Reflective")
                        .setPrice(2200)
                        .setImageFileNameList(new String[]{"sirrus_x_nvy_1", "sirrus_x_nvy_2", "sirrus_x_nvy_3", "sirrus_x_nvy_4", "sirrus_x_nvy_5"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Turbo Vado 3.0 Step-Through")
                        .setDescription("If you can characterize your life as on-the-go, busy, or not having enough time, we made a bike for you—the Turbo Vado 3.0 Step-Through. It's made to accommodate busy lives that are always in movement, which is why we took our award-winning pedal-assist technology and accelerated it well into the future.\n" + "\n" + "Beginning with the integrated Specialized 1.2 E motor, the Turbo Vado proves itself as the ultimate city bike. The 1.2 E uses the same hardware as our 1.2 motor, but it features a tune that prioritizes efficiency. This means less peak torque and maximum output. Of course, it still features a near-silent operating design with our Custom Rx Street Tune that takes the output and makes it the most usable for an urban environment. Think of it this way: The more power you put out, the more power the motor puts out, and this makes accelerations from a standstill at, say, a traffic light both quick and efficient. The belt driven motor is also smooth, silent, and free of annoying vibrations.")
                        .setColour("Clay / Black / Liquid Silver")
                        .setPrice(5100)
                        .setImageFileNameList(new String[]{"vado_1", "vado_2", "vado_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Adventure Bikes")
                        .setItemTitle("Turbo Como 3.0")
                        .setDescription("It's cool to go fast, but it's only fun if you're comfortable. Sadly, speed and comfort rarely come together, but the Turbo Como 3.0 650b is out to change that. With a comfortable geometry, a sleek, stylish design, and our exclusive, award-winning technology, you'll get an extra jolt of power that'll make riding just as fun as it is functional.\n" + "\n" + "Beginning with the integrated Specialized 1.2 E motor, the Turbo Como proves itself as the ultimate city bike. The 1.2 E uses the same hardware as our 1.2 motor, but it features a tune that prioritizes efficiency. This means less peak torque and maximum output. Of course, it still features a near-silent operating design with our Custom Rx Street Tune that takes the output and makes it the most usable for an urban environment. Think of it this way: The more power you put out, the more power the motor puts out, and this makes accelerations from a standstill at, say, a traffic light both quick and efficient. The belt driven motor is also smooth, silent, and free of annoying vibrations. And the max speed? 20mph.")
                        .setColour("Metallic Crimson / Black / Chrome")
                        .setPrice(5200)
                        .setImageFileNameList(new String[]{"como_1", "como_2", "como_3", "como_4", "como_5", "como_6", "como_7", "como_8", "como_9"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Hotwalk Carbon")
                        .setDescription("If we want to inspire the next generation of riders, kids deserve better bikes. That’s why we took the same tech behind our world championship-winning bikes and combined it with proportional design to build the ultimate balance bike.\n" + "\n" + "We poured over every detail in order to achieve a ride quality that’s unprecedented in such a small size. We’re talking precision at every touchpoint—from 38% smaller diameter handlebar grips to a solid carbon layup. All aligned to create the ultimate first ride.\n" + "\n" + "Why? We believe the best ride starts with the same standards we have as adults: Proportional fit, quality materials, and the same tech we use for pros.")
                        .setColour("Satin Chameleon / Carbon")
                        .setPrice(1700)
                        .setImageFileNameList(new String[]{"hotwalk_carbon_1", "hotwalk_carbon_2", "hotwalk_carbon_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Riprock Comp 24")
                        .setDescription("Big tires make for big fun, let alone a boost in confidence, control, and traction. And with our Riprock Comp 24, your kid is going to get all of the above at the hands of super fun 2.8-inch tires.\n" + "\n" + "This means that they'll be able to rip around and get their feet wet, trail riding with ease. And with powerful hydraulic disc brakes, they'll be able to do it safely, too. Add to this a full deck of Shimano shift components, plus a custom air-sprung fork, and you have the perfect mountain bike to get your little ones started on a lifetime of shredding.")
                        .setColour("Plum Purple / Acid Lava / Ice Lava")
                        .setPrice(1100)
                        .setImageFileNameList(new String[]{"riprock_purp_1", "riprock_purp_2", "riprock_purp_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Jett 24")
                        .setDescription("Kids move fast, and grow faster. At times, it can seem like there’s a small window for the perfect bike fit. The right bike for a young rider is a delicate balance between too small, too big, and a short-lived just right. If we’re going to inspire the next generation of riders, we need to keep kids comfortably riding longer.\n" + "\n" + "The Jett is designed so that you’ll never fear the growth spurts. We did our homework to understand how kids grow—spoiler alert, kids’ arms and legs grow more rapidly than their torso. We took to the books and designed a bike with child-specific touch points that withstand the development of young riders. The Jett is uniquely adjustable, perfectly proportional, and child-liftable—they’ll always be set to Jett.\n" + "\n" + "The Jett Multispeed features an adjustable handlebar that allows kids to fine tune reach as their arms grow. The 2-hole position cranks combined with longer seat tubes give plenty of flexibility to dial-in the optimal pedaling position. And whats more, we designed the frame and reviewed every component to make the Jett one of the lightest bikes on the market. You’re going to have to beg them to get off this bike.")
                        .setColour("Gloss Teal Tint / Flake Silver")
                        .setPrice(800)
                        .setImageFileNameList(new String[]{"jett_turq_1", "jett_turq_2", "jett_turq_3"}), 0);


        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Jett 24")
                        .setDescription("Kids move fast, and grow faster. At times, it can seem like there’s a small window for the perfect bike fit. The right bike for a young rider is a delicate balance between too small, too big, and a short-lived just right. If we’re going to inspire the next generation of riders, we need to keep kids comfortably riding longer.\n" + "\n" + "The Jett is designed so that you’ll never fear the growth spurts. We did our homework to understand how kids grow—spoiler alert, kids’ arms and legs grow more rapidly than their torso. We took to the books and designed a bike with child-specific touch points that withstand the development of young riders. The Jett is uniquely adjustable, perfectly proportional, and child-liftable—they’ll always be set to Jett.\n" + "\n" + "The Jett Multispeed features an adjustable handlebar that allows kids to fine tune reach as their arms grow. The 2-hole position cranks combined with longer seat tubes give plenty of flexibility to dial-in the optimal pedaling position. And whats more, we designed the frame and reviewed every component to make the Jett one of the lightest bikes on the market. You’re going to have to beg them to get off this bike.")
                        .setColour("Gloss Flo Red / Black")
                        .setPrice(800)
                        .setImageFileNameList(new String[]{"jett_red_1", "jett_red_2", "jett_red_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Jett 24")
                        .setDescription("Kids move fast, and grow faster. At times, it can seem like there’s a small window for the perfect bike fit. The right bike for a young rider is a delicate balance between too small, too big, and a short-lived just right. If we’re going to inspire the next generation of riders, we need to keep kids comfortably riding longer.\n" + "\n" + "The Jett is designed so that you’ll never fear the growth spurts. We did our homework to understand how kids grow—spoiler alert, kids’ arms and legs grow more rapidly than their torso. We took to the books and designed a bike with child-specific touch points that withstand the development of young riders. The Jett is uniquely adjustable, perfectly proportional, and child-liftable—they’ll always be set to Jett.\n" + "\n" + "The Jett Multispeed features an adjustable handlebar that allows kids to fine tune reach as their arms grow. The 2-hole position cranks combined with longer seat tubes give plenty of flexibility to dial-in the optimal pedaling position. And whats more, we designed the frame and reviewed every component to make the Jett one of the lightest bikes on the market. You’re going to have to beg them to get off this bike.")
                        .setColour("Satin Smoke / Flake Silver")
                        .setPrice(800)
                        .setImageFileNameList(new String[]{"jett_grey_1", "jett_grey_2", "jett_grey_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Jett 24")
                        .setDescription("Kids move fast, and grow faster. At times, it can seem like there’s a small window for the perfect bike fit. The right bike for a young rider is a delicate balance between too small, too big, and a short-lived just right. If we’re going to inspire the next generation of riders, we need to keep kids comfortably riding longer.\n" + "\n" + "The Jett is designed so that you’ll never fear the growth spurts. We did our homework to understand how kids grow—spoiler alert, kids’ arms and legs grow more rapidly than their torso. We took to the books and designed a bike with child-specific touch points that withstand the development of young riders. The Jett is uniquely adjustable, perfectly proportional, and child-liftable—they’ll always be set to Jett.\n" + "\n" + "The Jett Multispeed features an adjustable handlebar that allows kids to fine tune reach as their arms grow. The 2-hole position cranks combined with longer seat tubes give plenty of flexibility to dial-in the optimal pedaling position. And whats more, we designed the frame and reviewed every component to make the Jett one of the lightest bikes on the market. You’re going to have to beg them to get off this bike.")
                        .setColour("Satin Redwood / White")
                        .setPrice(800)
                        .setImageFileNameList(new String[]{"jett_redwood_1", "jett_redwood_2", "jett_redwood_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Jett 20")
                        .setDescription("Kids move fast, and grow faster. At times, it can seem like there’s a small window for the perfect bike fit. The right bike for a young rider is a delicate balance between too small, too big, and a short-lived just right. If we’re going to inspire the next generation of riders, we need to keep kids comfortably riding longer.\n" + "\n" + "The Jett is designed so that you’ll never fear the growth spurts. We did our homework to understand how kids grow—spoiler alert, kids’ arms and legs grow more rapidly than their torso. We took to the books and designed a bike with child-specific touch points that withstand the development of young riders. The Jett is uniquely adjustable, perfectly proportional, and child-liftable—they’ll always be set to Jett.\n" + "\n" + "The Jett Multispeed features an adjustable handlebar that allows kids to fine tune reach as their arms grow. The 2-hole position cranks combined with longer seat tubes give plenty of flexibility to dial-in the optimal pedaling position. And whats more, we designed the frame and reviewed every component to make the Jett one of the lightest bikes on the market. You’re going to have to beg them to get off this bike.")
                        .setColour("Gloss Raspberry / UV Lilac")
                        .setPrice(750)
                        .setImageFileNameList(new String[]{"jett_20_ras_1", "jett_20_ras_2", "jett_20_ras_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Jett 20")
                        .setDescription("Kids move fast, and grow faster. At times, it can seem like there’s a small window for the perfect bike fit. The right bike for a young rider is a delicate balance between too small, too big, and a short-lived just right. If we’re going to inspire the next generation of riders, we need to keep kids comfortably riding longer.\n" + "\n" + "The Jett is designed so that you’ll never fear the growth spurts. We did our homework to understand how kids grow—spoiler alert, kids’ arms and legs grow more rapidly than their torso. We took to the books and designed a bike with child-specific touch points that withstand the development of young riders. The Jett is uniquely adjustable, perfectly proportional, and child-liftable—they’ll always be set to Jett.\n" + "\n" + "The Jett Multispeed features an adjustable handlebar that allows kids to fine tune reach as their arms grow. The 2-hole position cranks combined with longer seat tubes give plenty of flexibility to dial-in the optimal pedaling position. And whats more, we designed the frame and reviewed every component to make the Jett one of the lightest bikes on the market. You’re going to have to beg them to get off this bike.")
                        .setColour("Gloss Cobalt / Ice Blue")
                        .setPrice(750)
                        .setImageFileNameList(new String[]{"jett_20_blu_1", "jett_20_blu_2", "jett_20_blu_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Jett 20")
                        .setDescription("Kids move fast, and grow faster. At times, it can seem like there’s a small window for the perfect bike fit. The right bike for a young rider is a delicate balance between too small, too big, and a short-lived just right. If we’re going to inspire the next generation of riders, we need to keep kids comfortably riding longer.\n" + "\n" + "The Jett is designed so that you’ll never fear the growth spurts. We did our homework to understand how kids grow—spoiler alert, kids’ arms and legs grow more rapidly than their torso. We took to the books and designed a bike with child-specific touch points that withstand the development of young riders. The Jett is uniquely adjustable, perfectly proportional, and child-liftable—they’ll always be set to Jett.\n" + "\n" + "The Jett Multispeed features an adjustable handlebar that allows kids to fine tune reach as their arms grow. The 2-hole position cranks combined with longer seat tubes give plenty of flexibility to dial-in the optimal pedaling position. And whats more, we designed the frame and reviewed every component to make the Jett one of the lightest bikes on the market. You’re going to have to beg them to get off this bike.")
                        .setColour("Gloss Cast Black / Smoke")
                        .setPrice(750)
                        .setImageFileNameList(new String[]{"jett_20_blk_1", "jett_20_blk_2", "jett_20_blk_3"}), 0);

        itemVisits.put(
                new Item()
                        .setCategory("Kids Bikes")
                        .setItemTitle("Jett 16 Single Speed")
                        .setDescription("Kids move fast, and grow faster. At times, it can seem like there’s a small window for the perfect bike fit. The right bike for a young rider is a delicate balance between too small, too big, and a short-lived just right. If we’re going to inspire the next generation of riders, we need to keep kids comfortably riding longer.\n" + "\n" + "The Jett is designed so that you’ll never fear the growth spurts. We did our homework to understand how kids grow—spoiler alert, kids’ arms and legs grow more rapidly than their torso. We took to the books and designed a bike with child-specific touch points that withstand the development of young riders. The Jett is uniquely adjustable, perfectly proportional, and child-liftable—you’ll always be set to Jett.\n" + "\n" + "The Jett Single Speed features an adjustable handlebar that allows kids to fine tune reach as their arms grow. The narrower saddle and grips were informed by a Retül study on kids to be the appropriately size—with handbrakes on both the 16” and 20”. And what’s more, we designed the frame and reviewed every component to make the Jett one of the lightest bikes on the market. You’re going to have to beg them to get off this bike.")
                        .setColour("Gloss Blaze / Black")
                        .setPrice(625)
                        .setImageFileNameList(new String[]{"jett_16_1", "jett_16_2", "jett_16_3"}), 0);

    }

    public static void incrementItemViewCount(Item item) {
        Integer counter = itemVisits.get(item);
        if (counter == null) {
            counter = 0;
        }
        counter++;
        itemVisits.put(item, counter);
    }

    // This method sorts map entries in descending order based on their key
    // (representing number of visits) and then returns the sorted list of items
    public static List<Item> getItemsOrderedByVisits() {
        List<Map.Entry<Item, Integer>> entries = new ArrayList<>(itemVisits.entrySet());
        // Sort in ascending order with custom comparator, then reverse to get descending order
        Collections.sort(entries, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));
        Collections.reverse(entries);

        List<Item> items = new ArrayList<>(entries.size());
        for (Map.Entry<Item, Integer> entry : entries.subList(0, 10)) {     // Extract keys (items) from each entry
            items.add(entry.getKey());
        }
        return items;
    }

    public static List<Item> getCategoryItems(String category) {
        //System.out.println("Category = " + category);
        List<Item> items = new ArrayList<>();
        for(Map.Entry<Item,Integer> entry : itemVisits.entrySet()){

            //System.out.println("Item category = " + entry.getKey().getCategory());
            if(entry.getKey().getCategory().equals(category)){
                items.add(entry.getKey());
            }
        }
        return items;
    }

    public static List<Item> getSearchItems(String searchQuery) {
        List<Item> items = new ArrayList<>();

        for (Map.Entry<Item, Integer> entry: itemVisits.entrySet()) {
            Item currentItem = entry.getKey();

            if ((currentItem.getCategory().toLowerCase()).contains(searchQuery.toLowerCase())) {
                items.add(entry.getKey());
            } else if ((currentItem.getItemTitle().toLowerCase()).contains(searchQuery.toLowerCase())) {
                items.add(entry.getKey());
            } else if ((currentItem.getDescription().toLowerCase()).contains(searchQuery.toLowerCase())) {
                items.add(entry.getKey());
            } else if ((currentItem.getColour().toLowerCase()).contains(searchQuery.toLowerCase()))
                items.add(entry.getKey());
        }
        return items;
    }
}
