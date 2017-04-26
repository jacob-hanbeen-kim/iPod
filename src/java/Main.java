public class Main {
    public static void main(String args[]) {
        Artist annie = new Artist("Annie Kim", 23, "Female");
        Artist hanbeen = new Artist("Hanbeenn Kim", 22, "Male");
        Artist SJ = new Artist("Seungjun Lee", 20, "Male");
        Artist eddie = new Artist("Eddie Jeoung", 22, "Male");
        Artist Pumba = new Artist("J.PUMBAA", 25, "Male");
        Artist IU = new Artist("Jieun Lee", 25, "Female");
        Artist ioi = new Artist("Somi Jeon", 16, "Female");

        Artist[] artists = new Artist[] {annie, hanbeen, SJ, eddie, Pumba, IU, ioi};

        /*
        for(int i = 0; i < artists.length; i++) {
            System.out.println(artists[i].getName());
        }
        */

        Music olc = new Music(annie, "One Last Cry", "POP", 200);
        olc.play();
    }
}
