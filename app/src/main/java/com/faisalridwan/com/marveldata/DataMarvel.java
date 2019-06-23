package com.faisalridwan.com.marveldata;

import java.util.ArrayList;

public class DataMarvel {
    public static String[][] data = new String[][]{
            {"Iron Man",
                    "Tony Stark",
                    "Robert Downey, Jr.",
                    "https://1.bp.blogspot.com/-ApZSGB8mrFs/Wwl6LehHycI/AAAAAAAASe8/PdldY1ni0swf1NTpPyb3DKYaiS9D9prIgCLcBGAs/s1600/anggota%2Bavengers%2Biron%2Bman.jpg",
                    "Tony Stark atau Iron-Man menjadi karakter superhero pertama yang diperkenalkan dalam timeline Marvel's Cinematic Universe. Ia merupakan seorang jenius, billionaire, playboy dan pengusaha sukses. Ia mengembangkan teknologi armor senjata dan kemudian dikenal sebagai Iron Man"
            },

            {"Captain America",
                    "Steve Rogers",
                    "Chris Evans",
                    "https://2.bp.blogspot.com/-Nq_s3x96PRs/Wwl57gvbEuI/AAAAAAAASe0/PPQ1kjRNwfYrY9FHNN4Prln7IMcXMzySQCLcBGAs/s400/anggota%2Bavengers%2Bcaptain%2Bamerica.jpg",
                    "Steve Rogers atau dikenal sebagai Captain America merupakan anggota Avengers pertama. Dalam timeline MCU, ia merupakan veteran Perang Dunia II dan menjadi superhero pertama hasil eksperimen. Ia sempat terjebak dalam es dan membeku selama hampir 70 tahun sebelum kembali terbangun di era modern."
            },
            {"The Hulk",
                    "Bruce Banner",
                    "Mark Ruffalo",
                    "https://4.bp.blogspot.com/-NedtebV81xI/Wwl6VCOfKuI/AAAAAAAASfA/B5Xya9WF9c4iZI3qlrJAAkptURUVsdtSgCLcBGAs/s400/anggota%2Bavengers%2Bthe%2Bhulk.jpg",
                    "Bruce Banner merupakan dokter dan ilmuwan jenius yang bisa berubah menjadi monster hijau raksasa karena pengaruh radiasi sinar gamma. Ia bisa berubah menjadi Hulk saat marah. Kekuatannya sebagai Hulk sangatlah besar dan menyeramkan."
            },
            {"Thor",
                    "Thor Odinson",
                    "Chris Hemsworth",
                    "https://3.bp.blogspot.com/-fcirmmbsThQ/Wwl6jkvEtOI/AAAAAAAASfI/ECwRXO1yRdEGAInP_L60Fses8hrr6lw0ACLcBGAs/s400/anggota%2Bavengers%2Bthor.jpg",
                    "Thor merupakan dewa Asgaard, anak dari Odin serta saudara dari Loki dan Hela. Ia menjadi penerus tahta raja Asgaard. Ia bergabung dengan Avengers saat saudaranya, Loki, berupaya untuk menghancurkan pasukan Bumi."
            },
            {"Black Widow",
                    "Natasha Romanoff",
                    "Scarlett Johansson",
                    "https://2.bp.blogspot.com/-ixwVy8ckR-k/Wwl61u8TOTI/AAAAAAAASfU/XlwfvgipkWIGIZP2boUWqon8a_TcOeR6wCLcBGAs/s400/anggota%2Bavengers%2Bblack%2Bwidow.jpg",
                    "Natasha Romanoff, lebih dikenal dengan nama aliasnya, Black Widow, merupakan mata-mata dan pembunuh berbakat yang merupakan anggota S.H.I.E.L.D. Ia dikenal memiliki kemampuan mata-mata, espionase, penyamaran, pengelabuan, penyelundupan, skill senjata dan teknologi serta kemampuan bertarung akrobatik."
            },
            {"Hawkeye",
                    "Clint Barton",
                    "Jeremy Renner",
                    "https://2.bp.blogspot.com/-fo46aUAU00Q/Wwl64ac6qYI/AAAAAAAASg4/vhbFzFYOmiA8Dych2Qf5ujI7DfH7ZXyFACEwYBhgL/s1600/anggota%2Bavengers%2Bhawkeye.jpg",
                    "Clint Barton, lebih dikenal dengan nama aliasnya, Hawkeye, merupakan seorang agent elit dari S.H.I.E.L.D. Hawkeye dikenal sebagai seorang pemanah dimana panahannya selalu mengenai target sehingga ia sering menjadi penyerang jarak jauh saja."
            },
            {"Falcon",
                    "Sam Wilson",
                    "Anthony Mackie",
                    "https://1.bp.blogspot.com/-HBEiEFYl6r8/Wwl9sy4E-PI/AAAAAAAAShI/hYz11KR3axMs9DUFi9jeaP6RwKjTfoCGwCLcBGAs/s400/anggota%2Bavengers%2Bfalcon.jpg",
                    "Sam Wilson merupakan veteran militer Angkatan Udara. Ia kemudian berteman dengan Captain America. Wilson menggunakan perangkat EXO-7 Falcon, sebuah perangkat teknologi berupa sayap dan senjata. Ia pun menggunakan kode nama Falcon."
            },
            {"Scarlet Witch",
                    "Wanda Maximoff",
                    "Elizabeth Olsen",
                    "https://1.bp.blogspot.com/-nHvEKe8aGVY/Wwl9tS3tXVI/AAAAAAAAShQ/9pOVcL5z3R0R6FBAghQyp3iI3yQw_olvgCLcBGAs/s400/anggota%2Bavengers%2Bscarlett%2Bwitch.jpg",
                    "Wanda Maximoff berasal dari Sokovia dan meruapakn saudara kembar dari Pietro Maximoff. Ia mendapat kekuatan super dari eksperimen HYDRA yang dipimpin oleh Wolfgang von Strucker dengan menggunakan kekuatan scepter Loki dan kemudian dikenal dengan nama Scarlet Witch."
            },
            {"Vision",
                    "Vision",
                    "Paul Bettany",
                    "https://1.bp.blogspot.com/-pjoaoEi4jHk/Wwl9uYmN2fI/AAAAAAAAShU/dHmRSX0VCkEjeur_OeDjWTs_SaN2m5AOACLcBGAs/s400/anggota%2Bavengers%2Bvision.jpg",
                    "Vision merupakan artificial intelligence yang terbentuk lewat energi dari Mind Stone yang ada pada scepter Loki yang merupakan hasil eksperimen dari Tony Stark dan Bruce Banner dengan bantuan Dr. Helen Cho."
            },
            {"Star-Lord",
                    "Peter Quill",
                    "Chris Pratt",
                    "https://3.bp.blogspot.com/-Ac17ct8u4mI/Wwl7AgwfUJI/AAAAAAAASg0/bjpMb1T1nMU2LE1LyQeq7FtgARBIT1IZACEwYBhgL/s400/anggota%2Bavengers%2Bstar%2Blord.jpeg",
                    "Peter Quill, dikenal dengan nama aliasnya, Star-Lord, adalah anggota Guardians of the Galaxy yang merupakan setengah manusia dan setengah Celestial. Ia merupakan seorang kriminal intergalaksi yang dikenal dengan nama Star-Lord."
            },
            {"War Machine",
                    "James Rhodes",
                    "Don Cheadle",
                    "https://1.bp.blogspot.com/-9bN8tfoRXH4/Wwl9u4k8YaI/AAAAAAAAShY/souaHNGgzYsNTX7vDDZ65BoiHW1dfN1cgCLcBGAs/s320/anggota%2Bavengers%2Bwar%2Bmachine.jpg",
                    "James Rhodes merupakan kolonel militer Amerika Serikat dan teman dekat Tony Stark. Ia diberi armor khusus oleh Stark dan sering membantu Stark saat menghadapi musuh. Rhodes kemudian memilih kode nama War Machine."
            }
    };

    public static ArrayList<Marvel> getListData(){
        Marvel marvel = null;
        ArrayList<Marvel> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            marvel = new Marvel();
            marvel.setHero(data[i][0]);
            marvel.setNama(data[i][1]);
            marvel.setAktor(data[i][2]);
            marvel.setPhoto(data[i][3]);
            marvel.setDeskripsi(data[i][4]);

            list.add(marvel);
        }

        return list;
    }
}
