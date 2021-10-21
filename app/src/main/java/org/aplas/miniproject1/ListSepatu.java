package org.aplas.miniproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class ListSepatu extends AppCompatActivity {

    private ArrayList<String> fotoSepatu = new ArrayList<>();
    private ArrayList<String> namaSepatu = new ArrayList<>();
    private ArrayList<String> detaiLSepatu = new ArrayList<>();
    private ArrayList<String> warnaSepatu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sepatu);

        getDataSepatu();
    }

    private void prosesRecyclerViewAdapter (){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ListSepatuAdapter adapter = new ListSepatuAdapter(fotoSepatu, namaSepatu, detaiLSepatu, warnaSepatu,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataSepatu(){
        namaSepatu.add("Nike Kyrie 7");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/4388ffde1eb4b521202a90f31ed8210183e916a3-1100x701.jpg/Concepts-Nike-Kyrie-7-CT1137-right.jpeg?fm=webp");
        detaiLSepatu.add("The Brooklyn Nets’ Kyrie Irving continues to produce some of the most inspiring signature sneakers on the hardwood, the latest Nike Kyrie 7 already a fan-favourite silhouette of the 2020-21 NBA season.\n" +
                "\n" +
                "While the NBA All-Star game remains contentious, we can still expect plenty of heat on the footwear front, the latest Nike Kyrie 7 ‘All-Star’ colourway another neck-craning design.\n" +
                "\n" +
                "Joining Nike’s regrind initiative, the Nike Kyrie 7 is manufactured in an ‘Atomic Orange’ colourway, the mesh overlays subtly covering a wild, vibrant pattern beneath. Accented by turquoise highlights throughout (on the soles, tongues and eyelets), Nike’s Grind recycled materials occupy the Swoosh and forefoot moulds.\n" );
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");


        namaSepatu.add("Nike Cosmic Unity");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/837e4b6ab69d426325d6b8d40a0a628983964035-1100x745.jpg/nike-cosmic-unity-space-hippie-medial.jpg?fm=webp");
        detaiLSepatu.add("The Nike Cosmic Unity continues to make waves in the sneaker scene, the performance baller playing a starring role in Beaverton’s ongoing ‘Move to Zero’ mission. After officially launching earlier this year, the Cosmic Unity has emerged in a variety of colourways, including the earthy ‘Natural’, the vibrant ‘Amalgam’, and the extraterrestrial ‘Green Glow’. For its next trick, the eco-conscious model will rock some red because, you know, it goes faster.\n" +
                "\n" +
                "Featuring a build that’s made with at least 25 percent recycled content (by weight), and containing a full-length Zoom Air Strobel unit, the Cosmic Unity is a basketball shoe for players that believe in making a difference both on and off the court. According to Ross Klein, Nike’s Senior Creative Director for Performance Footwear, the design aims to answer the question of whether a product that makes the world better can also improve an athlete’s performance. When the Cosmic Unity launched, Klein said, ‘We wanted to create a synergy between making the world better by what we do, but also leave an impact for athletes so that they can perform at a higher level’.");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");

        namaSepatu.add("Nike Kobe V Protro");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/2ca04922e940385d57f289a4f9b5eaf5883a79a9-900x572.jpg/Nike-Kobe-5-Protro-Bruce-Lee-right.jpg?fm=webp");
        detaiLSepatu.add("Originally releasing in 2009, the Nike Kobe 5 Protro is still a certified classic from Kobe Bryant’s sneaker catalogue. Shedding the skin (read: weight) from its predecessor, the Kobe 5 expanded the creative use of colourways even further, bringing in some of the most sought-after basketball sneakers on earth. Case in point: the Kobe 5 Protro ‘Bruce Lee’.\n" +
                "\n" +
                "Taking cues from two legendary Bruce Lee films, the black and yellow composition pays homage to the iconic jumpsuit worn in Game of Death, while the red scratch marks celebrate the final fight scene in Enter the Dragon. Laced by Kobe Bryant and his Lakers teammates during their historic 2010 championship run, the Kobe 5 is built with Flywire uppers, snake-like overlays along the silhouette’s throat, and plastic heel counters.");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Nike Kyrie 7 EP");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/90e1d646dab548da807058f79b94faa9ae1dd0d5-1100x720.jpg/Nike-Kyrie-7-Chinese-New-Year_right_.jpg?fm=webp");
        detaiLSepatu.add("Following an exclusive drop last week, news has now arrived for a wider release of the alluring Concepts x Nike Kyrie 7 ‘Horus’. The latest in a long line of detailed colabs between Concepts and Kyrie Irving, the ‘Horus’ again looks towards Egyptian iconography for aesthetic inspiration to deliver a super detailed build. Taking design language from the sand and sky in the desert before nightfall, the release also features the Winged Sun, a symbol associated with divinity, royalty and power.g.\n" +

                "Debuting late last year, the Kyrie 7 is naturally designed for the kind of quick-cutting player that Irving is on the NBA stage. According to Nike, ‘Irving’s creativity might include flashy, impossible dribbling, but his dance-like sequences always have a point. He’s working to either get to the basket or set up his teammates (or make a defender look silly). Similarly, the way in which Irving’s signature line taps into other Nike disciplines is a matter of intention. New technologies and tools are meaningless unless they drive new futures.’");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Nike PG 5");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/2147061e6dc378db0560d99771e07d2e40b9a7b8-1100x745.jpg/nike-pg-5-black-white-medial.jpg?fm=webp");
        detaiLSepatu.add("The Nike PG 5 has received an official unveiling, confirming the next chapter in Paul George’s signature line. After leaks and whispers circulated earlier this month, Beaverton have shared official images of the new silhouette, as well as an insight into the design specifications. \n" +
                "\n" +
                "The central premise for the PG 5 is that comfort is the first step towards controlling pace when you’re on the basketball court. That’s why, according to Nike, ‘the full-length Nike Air Dot Weld Strobel cushioning of the PG 4 returns, now paired to a new lightweight, low-top profile. It’s all in service of silky-smooth movement across the floor, exemplified by the shoe’s namesake.’\n" +
                "\n" +
                "Elsewhere, the PG 5 is built to cater for George’s dynamic two-way needs. Nike said, ‘The lacing system keeps the foot locked in and stable over the footbed, and the outsole features a multi-directional tread pattern to help provide stop-and-go traction during play’.");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Nike KD 14 EP");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/20f926670286482f027cb91d26874db652214c07-1100x743.jpg/nike_kd_12_right.jpeg?fm=webp");
        detaiLSepatu.add("Although it’s been a while since we’ve seen Kevin Durant on the court for the Brooklyn Nets, you can rest assured he’ll be ready to make an impact this postseason. Durant’s signature shoes have also been making an impact on the hardwood for quite some time, the NBA champion now up to his 14th signature sneaker with Nike.\n" +
                "\n" +
                "With official images now released by Nike, we can take a closer look at the all-new rendition. Manufactured with a Presto-like medial cage, the sneaker also comes through a midfoot strap (the first time it’s been seen since the KD4 and KD7). Digressing significantly from the KD13, the mid-cut silhouette is presented in a dual-layered design, built with synthetic underlays and floral overlays.\n" +
                "\n" +
                "A vibrant orange hue sits beneath the overlays, while a punch of sunny yellow hits the cushioning system. KD’s signature branding appears on the tongue, while the wavy heel counters and pale blue outsoles imbue the colourway with sea-like textures.");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Nike Lebron 18");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/2aa2b148bfab3d9034c35e837f879c3b05f4b65e-1100x745.jpg/nike-lebron-18-los-angeles-by-day-medial.jpg?fm=webp");
        detaiLSepatu.add("Official images of an early colourway on the Nike LeBron 18 have emerged, giving fans of The King a good opportunity to celebrate the NBA championship recently secured by the LA Lakers. The Larry O’Brien Trophy hasn’t even had time to start collecting dust in a cabinet at Lakers HQ, but Nike are already paying homage to the City of Angels with a scheme dubbed ‘Los Angeles By Day’. \n" +
                "\n" +
                "The colourway features a sandy Knitposite 2.0 upper, before blue with hits of pink land on the heel unit. It’s a light and breezy aesthetic for the latest instalment of the LeBron James signature line, a model that combines both Zoom Air and Max Air to deliver a shoe that neatly blends speed and power into one dynamic on-court flex. The LeBron 18 also boasts multiple references to previous LeBron editions, all of which you can see on the visual break down of the new model here. ");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Nike Lebron 18 Low");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/a196726219827edc237c224c5075c8ba3a440e38-1100x739.png/image.png?fm=webp");
        detaiLSepatu.add("Following recent ‘Viotech’ and ‘Sakura’ link-ups with atmos, LeBron James is partnering with Ghanaian designer Mimi Plange for a four-strong collection of Nike LeBron 18 Lows. And the first model in the pack, dubbed the ‘Higher Learning’, drops next week.\n" +
                "\n" +
                "Plange, the second female designer to collaborate with King James, was born in Ghana and moved to Southern California when she was five. Using her diverse experiences to inform her creative approach, it is a quintessential American high school icon, the Letterman jacket, that inspires this first release.\n" +
                "\n" +
                "A symbol of status and cultural identity, as well as of sporting excellence, the Letterman jacket’s DNA manifests in the burgundy and gold scheme, while the chenille Swoosh and lion heel patch drive home the theme. Of the shoes inspiration, Plange says:\n" +
                "\n" +
                "‘Growing up, something I always loved while going through school was varsity style. The varsity jacket was this ultimate attempt to explore identity. You could tell the story of everything you did in high school because you won your letters – for basketball, for track, for performing arts, for anything.’");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Nike Kyrie Flytrap");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/3bf795299f09d69d7720e4ea239fcb2025197515-700x468.jpg/nike-kyrie-flytrap-2-wolf-grey-geode-2.jpg?fm=webp");
        detaiLSepatu.add("The Nike Kyrie Flytrap 2 is about to get a whole lot wilder, set to rock some ‘Wolf Grey’ in a new slick colourway that will look great on the hardwood. Added to the ‘Wolf Grey’ is a neat combo of ‘Geode’, Black and Dark Grey, delivering an understated baller that gets the job done.\n" +
                "We’re waiting to hear an official drop date from the Swoosh, so keep it dialled to Sneaker Freaker and we’ll keep you updated.");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Nike PG 4");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/c8225ed35cee59d7d3d13115ffc686c3a15bd33a-1100x735.jpg/nike-pg-4-pickled-pepper-medial.jpg?fm=webp");
        detaiLSepatu.add("Nike have unveiled a luxurious PG 4 that’s made especially for the Silly Season, adding to the Swoosh stable’s growing list of Christmas-themed kicks for this year. Hit with the traditional Christmas colours of green, white and red, the undoubted star of this show is the red velvet that covers the toes and lateral sides of each shoe. Perfect for when you’ve got a game at 7pm, but then have to deliver presents to every single person on earth from 9pm onwards, Santa won’t be slipping in these bona fide ballers. \n" +
                "\n" +
                "Paul George’s signature sneakers are no stranger to a thematic build, with this year already delivering a Gatorade lick, an NBA 2K20 ‘Digi-Camo’ colourway, and an ACG-inspired look.");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Adidas D.O.N Issue 2");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/50fa0c27663c5ae9aff0d21f306df1597a8b7574-700x468.jpg/adidas-don-issue-1-solar-red-core-black-lateral.jpg?fm=webp");
        detaiLSepatu.add("Donovan Mitchell’s first signature sneak, the adidas D.O.N. Issue #1, is preparing to sizzle in ‘Solar Red’ and ‘Core Black’. Standing for ‘Determination Over Negativity’, the D.O.N. is designed to celebrate the Utah Jazz guard’s ‘spider-like stealth and dexterity on the hardwood’.\n" +
                "\n" +
                "The silhouette has been blessed with a variety of colourways since its initial release last year, and this makeup brings the heat. While a solid case could be made for saying the ‘Solar Red’ is more of an orange hue, adi have a decent track record of splashing the fiery shade on their shoes.");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");
//
        namaSepatu.add("Adidas Harden Vol 2");
        fotoSepatu.add("https://cdn.sanity.io/images/c1chvb1i/production/43666c621119348d2a0d414bd93558a1ca279431-700x468.jpg/ADIDAS-HARDEN-VOL-2-MAROON-6.jpg?fm=webp");
        detaiLSepatu.add("The bearded baller was recently bestowed with a second signature sneaker from adidas. The Harden Vol. 2 was confirmed after a series of leaked images peaked out interest early. Now the brand have unveiled a clean maroon colourway, which pairs varying shades of red with some serene white BOOST. The simple construction has been broken up using textural contrast and pattern, which works perfectly to emphasise the streamlined silhouette.");
        warnaSepatu.add("- Red\n"+
                "- Blue\n"+
                "- Green\n"+
                "- Navy\n"+
                "- Yellow");

        prosesRecyclerViewAdapter();
    }
}