package com.example.project5;
import java.util.ArrayList;

public class HeroDataSource {
    private static String[] heroNames = {
            "My Beautiful Gong Shim",
            "Vincenzo",
            "Sisyphus : The Myth",
            "Hymn of Death",
            "High Society",
            "DodoSolsolLalaSol",
            "PentHouse",
            "True Beauty",
            "18 Again",
            "The School Nurse"
    };

    private static String[] heroDetails = {
            "Gong Shim (Bang Minah) always feels over-shadowed by her older sister Gong Mi (Seo Hyo-rim) due to the way the people around her treat the siblings. The beautiful Gong Mi, who works at a top-notch law firm, becomes the breadwinner of the family, while Gong Shim, considered to be ugly and awkward, is jobless. Gong Shim had to use all of her money to rent a room on the roof top of the rented-house her family is living in, as her previous bedroom is being used as Gong Mi's walk-in closet.\n" + "\n" + "Having a plan to gather money for moving to Italy to pursue her dream of becoming an artist, Gong Shim decides to rent her rooftop room for $250 a month. This is when she meets Ahn Dan-tae (Namkoong Min), a lawyer who works voluntarily for those in need, despite his delinquent personality. After much misunderstanding, Dan-tae finally moves into the rooftop room and he becomes friendly with the son of a wealthy family, Joon-soo, through helping him out. Joon-soo's grandmother is grieving over the loss of her real blood-related grandson, Joon-pyo, who was kidnapped as a child.",
            "At the age of 8, Park Joo-Hyeong went to Italy after he was adopted. He is now an adult and has the name of Vincenzo Cassano (Song Joong-Ki). He is a lawyer, who works for the Mafia as a consigliere. Because of a war between mafia groups, he flees to South Korea. In South Korea, he gets involved with Lawyer Hong Cha-Young (Jeon Yeo-Bin). She is the type of attorney who will do anything to win a case. Vincenzo Cassano falls in love with her. He also achieves social justice by his own way",
            "A time travel story between a genius engineer Han Tae-Sul (Cho Seung-Woo) and his savior from the future Gang Seo-Hae (Park Shin-Hye).\n" + "\n" + "Han Tae-Sul is a genius engineer and the co-founder of Quantum and Time Company. He is handsome and he produces innovative results. Thanks to his efforts, Quantum and Time has become a world-class enterprise. He is known as a miracle worker and a hero in Korea, but reality is a little different. After his older brother's death 10 years ago, he has exhibited eccentric behavior. The company's stock price has fluctuated accordingly. One day, Han Tae-Sul learns of an unreliable truth behind his brother's death. His dangerous journey begins.\n" + "\n" + "Gang Seo-Hae is an elite warrior. She can take down the biggest men with just her bare hands. She is also a sharpshooter and able to make bombs. She learned these skills to survive in a world that is dominated by gangsters and military cliques. One day, after a long and dangerous journey, she comes to Han Tae-Sul to save him.",
            "Based on the true story of Kim Woo-Jin and Yun Sim-Deok. Kim Woo-Jin is a stage drama writer while Korea is under Japanese occupation. He is already married, but he falls in love with Yun Sim-Deok. Yun Sim-Deok is the first Korean soprano. She records the song “Praise of Death” which becomes the first Korean pop song in 1926. Kim Woo-Jin and Yun Sim-Deok's fate ends tragically.",
            "Jang Yoon-ha (Uee) is the youngest daughter of a chaebol family. Her family is a mess. Hated by her mother, she wants to live a normal life like a normal person. She is arranged to marry a young chaebol Yoo Chang-soo (Park Hyung-sik). She hides her identity and works as a part-time sales woman in a supermarket and befriends with Lee Ji-yi (Lim Ji-yeon) who wants to marry a rich man and starts dreaming about it. Poor girl Lee Ji-yi has a crush on Choi Joon-ki (Sung Joon), a brilliant and hard-working friend of Yoo Chang-soo, who comes from a poor family and wants to become rich by marrying a rich girl. Joon-ki catches Yoon-ha's attention and he proposes to her. Yoo Chang-soo flirts with Lee Ji-yi and they become a couple. Yoon-ha starts a relationship with Joon-ki and it goes well. Yoon-ha and her brother who is the only hope of the top management of the company, goes to Mexico in flight and she departed early. Before reaching Mexico, the flight crashes and her brother also dies.",
            "Goo Ra-Ra (Go Ara) is a pianist. She has bright personality. Something happened that caused her to become bankrupt. She doesn't have anything now and she is frustrated with her situation.\n" +"\n" + "Sunwoo Joon (Lee Jae-Wook) doesn't care what other people think about him, but he has a warm heart. He is free spirited and doesn't have a specific dream or goal for his life. He makes ends meet by working part-time jobs.\n" + "\n" + "Goo Ra-Ra and Sunwoo Joon meet at the small private piano academy LaLa Land in a country village.",
            "Set around the luxury Penthouse Apartment with 100 floors.\n" + "\n" + "Shim Su-Ryeon (Lee Ji-Ah) was born into wealth. She is now an elegant woman of the upper class and she is like the queen of the Penthouse Apartment. Her husband is Joo Dan-Tae (Uhm Ki-Joon). He is successful in business and real estate.\n" + "\n" + "Cheon Seo-Jin (Kim So-Yeon) was born into a wealthy family. She is arrogant. Her husband is Ha Yoon-Cheol (Yoon Jong-Hoon). He is a chief surgeon at a general hospital and an ambitious man.\n" + "\n" + "Oh Yoon-Hee (Eugene) comes from a poor family background. She works hard for her children's success. She wants to belong to the upper class for her children.",
            "Im Ju-Kyung is a high school student. Since she was little, she has had a complex about her appearance. To hide her bare face, Im Ju-Kyung always wears make-up. Her excellent make-up skills makes her pretty and she hides her bare face in front others. She gets involved with 2 men; Lee Soo-Ho and Han Seo-Joon.",
            "Jung Da-Jung (Kim Ha-Neul) is married to 37-year-old Hong Dae-Young (Yoon Sang-Hyun). They have have 18-year-old son and daughter. Jung Da-Jung works hard as a rookie announcer and she has a warm heart. She becomes completely fed up with her husband and is unable to deal with him anymore. Hong Dae-Young got fired from his job and he is looked down upon by his family. Jung Da-Jung hands him divorce papers.\n" + "\n" + "Meanwhile, Hong Dae-Young looks at himself as an ordinary jobless middle-aged man. He regrets his life. At that moment, his body changes into that of an 18-year-old year old person, while his mind is still that of his 37-year-old self. Back in his teenage days, Hong Dae-Young (Lee Do-Hyun) was an excellent basketball player and also popular. Now, with his regained 18-year-old body, he changes his name to Ko Woo-Young and begins to live a new life.",
            "Ahn Eun-Youngg (Jung Yu-Mi) is a new nurse teacher at school. She has a special ability to see jelly like monsters that are made from residue of human desire and she can also eradicate these jellies. She uses a toy knife and a BB gun to take out the jellies. She senses that a mysterious event takes place at her school\n" + "\n" + "Hong In-Pyo (Nam Joo-Hyuk) is a Chinese language teacher at the same school. Hong In-Pyo has a special energy. In order to protect the students, Ahn Eun-Young and Hong In-Pyo work together to eradicate these jellies."
    };

    private static int[] heroesImages = {
            R.drawable.gongshim,
            R.drawable.vincenzo,
            R.drawable.sisyphus,
            R.drawable.hymnofdeath,
            R.drawable.highsociety,
            R.drawable.dodo,
            R.drawable.thepenthouse,
            R.drawable.truebeauty,
            R.drawable.again,
            R.drawable.theschoolnurse
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}

